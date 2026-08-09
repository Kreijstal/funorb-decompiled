/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk {
    int field_g;
    rf[] field_X;
    int[] field_P;
    int field_zb;
    private int field_o;
    String field_vb;
    private int field_wb;
    sa field_W;
    private int field_M;
    int field_gb;
    private boolean field_r;
    private int field_p;
    int field_k;
    private int field_Cb;
    static String field_i;
    private int field_E;
    private int[] field_T;
    private int field_Ab;
    int field_j;
    private int[] field_b;
    int field_eb;
    boolean field_Bb;
    static int field_I;
    int field_Q;
    private int[] field_N;
    int field_K;
    int field_O;
    int field_q;
    int field_n;
    int field_lb;
    private int field_mb;
    private int field_V;
    private boolean field_Y;
    int field_U;
    int field_sb;
    private int field_e;
    int field_f;
    int field_t;
    int field_x;
    int[] field_w;
    int field_ib;
    private int field_G;
    private int field_db;
    int field_xb;
    int field_c;
    boolean field_S;
    int field_R;
    int field_z;
    vj field_cb;
    int field_J;
    int field_hb;
    private int[] field_tb;
    private boolean field_y;
    int field_m;
    int field_d;
    int field_qb;
    private int field_ob;
    boolean field_kb;
    int field_jb;
    private int field_l;
    int field_L;
    int field_D;
    ee field_u;
    static boolean field_F;
    int field_Z;
    private boolean field_v;
    private int field_ab;
    private int[] field_B;
    private boolean field_s;
    int field_fb;
    vj field_rb;
    int field_yb;
    int field_ub;
    int field_a;
    private int field_h;
    int field_nb;
    private int field_A;
    int field_H;
    int field_bb;
    int field_C;
    int field_pb;

    final int f(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_11_0 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var2 = -1;
          var3 = this.field_C * this.field_zb;
          if (param0 <= -36) {
            break L0;
          } else {
            this.k(5);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= var3) {
              break L2;
            } else {
              var5 = this.field_T[var4];
              stackIn_11_0 = -25;

              if (var6 != 0) {
                return stackIn_11_0;
              } else {
                L3: {
                  if (stackIn_11_0 == (var5 & 24 ^ -1)) {
                    var5 = var5 & 7;
                    if ((var5 ^ -1) >= (var2 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var5;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var2;
        }
    }

    private final boolean q(int param0) {
        int[] array$0 = null;
        int incrementValue$1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int statePc = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    var11 = this.field_B;
                    var10 = var11;
                    var9 = var10;
                    var2 = var9;
                    if (var9 == null) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var11.length >= this.field_C * this.field_zb) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    array$0 = new int[this.field_C * this.field_zb];
                    var2 = array$0;
                    this.field_B = array$0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    if (param0 == 21200) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_vb = (String) null;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var4 ^ -1) <= (this.field_zb ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = -var4 + (-1 + this.field_zb);
                    stackIn_17_0 = 0;
                    stackIn_9_0 = stackIn_17_0;
                    if (var8 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = stackIn_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((this.field_C ^ -1) >= (var6 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    incrementValue$1 = var3;
                    var3++;
                    this.field_B[var5] = this.field_T[incrementValue$1];
                    var5 = var5 + this.field_zb;
                    var6++;
                    if (var8 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var8 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var4 = this.field_db + -this.field_zb + this.field_C - -this.field_o >> 2027132385;
                    var5 = this.field_o + (this.field_zb + (-this.field_C - this.field_db)) >> 1485015713;
                    this.field_q = this.field_q + var4;
                    var3 = this.field_C;
                    this.field_L = this.field_L + var5;
                    this.field_C = this.field_zb;
                    this.field_B = this.field_T;
                    this.field_zb = var3;
                    this.field_T = var2;
                    stackIn_17_0 = this.c((byte) -117) ? 1 : 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_ab = this.field_ab + 1;
                    var3 = this.field_db;
                    this.field_db = -this.field_o;
                    this.field_o = var3;
                    this.d(30968);
                    var3 = 0;
                    this.h(-1);
                    var6 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((var6 ^ -1) <= (this.field_zb ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_30_0 = 0;
                    stackIn_21_0 = stackIn_30_0;
                    if (var8 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7 = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var7 ^ -1) <= (this.field_C ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_tb[var3] = 0;
                    this.field_b[var3] = (-1 + (this.field_C + this.field_db - var7 * 2)) * -8 / this.field_C;
                    var3++;
                    var7++;
                    if (var8 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var6++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var8 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
                    return true;
                }
                case 29: {
                    this.field_T = this.field_B;
                    this.field_B = var2;
                    this.field_zb = this.field_C;
                    this.field_L = this.field_L - var5;
                    this.field_C = var3;
                    this.field_q = this.field_q - var4;
                    return false;
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    if (param0 <= -88) {
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
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((this.field_a * this.field_O ^ -1) >= (var6 ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = this.field_P[var6];
                    stackIn_37_0 = 1879048192 & var7 ^ -1;
                    stackIn_5_0 = stackIn_37_0;
                    stackIn_37_1 = -1;
                    stackIn_5_1 = stackIn_37_1;
                    if (var9 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 == stackIn_5_1) {
                        statePc = 24;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (8 == (var7 & 24)) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (16 == (var7 & 24)) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = (1879048192 & var7) / 268435456;
                    if (8 != (var7 & 24)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var8 ^ -1) >= (mk.field_e ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    mk.field_e = var8;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    this.field_ib = param2;
                    if (-24 != (-1879048193 & var7 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var8 > fk.field_H) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    fk.field_H = var8;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param1) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_P[var6] = de.b(32, lb.a(var7, 268435455));
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_P[var6] = 56;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var9 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_P[var6] = lb.a(2147483647, var7);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (param1) {
                        statePc = 36;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (-1 <= (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var6 = ((int)((double)this.field_k * Math.sqrt((double)var4)) - -1) / 2;
                    if (this.field_k >= var6) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6 = this.field_k;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ge.a(this.field_lb, var6, (byte) 127, wd.field_c);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (0 < var5) {
                        statePc = 33;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var6 = (2 + (int)((double)this.field_k * Math.sqrt((double)var5))) / 4;
                    if ((var6 ^ -1) >= (this.field_k ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var6 = this.field_k;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    ge.a(this.field_lb, var6, (byte) 127, sa.field_w);
                    if (var9 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var6 = ((int)((double)this.field_k * Math.sqrt((double)(var4 + (16 - -var5)))) + 8) / 16;
                    stackIn_37_0 = this.field_k;
                    stackIn_37_1 = var6;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 >= stackIn_37_1) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var6 = this.field_k;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    ge.a(this.field_lb, var6, (byte) 127, ee.field_g);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int l(int param0) {
        int var2 = 95 % ((param0 - 43) / 54);
        return 80 + this.field_g * this.field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4 = 0;
        if (param0 >= 0 && -1 >= (param2 ^ -1) && (param0 ^ -1) > (this.field_O ^ -1) && this.field_a > param2) {
            var4 = this.field_P[param0 + this.field_O * param2];
        }
        int var5 = 101 / ((param1 - 24) / 52);
        if (this.field_C != 0 && !this.field_S) {
            var6 = -this.field_q + param0;
            var7 = -this.field_L + param2;
            if ((var6 ^ -1) <= -1 && -1 >= (var7 ^ -1) && this.field_C > var6 && this.field_zb > var7) {
                var8 = this.field_T[var7 * this.field_C + var6];
                if (!((var8 ^ -1) == -1)) {
                    var4 = var8;
                }
            }
        }
        return var4;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11) {
        th.a(16777215, param2, param6, param7, param10, param11, param1, 16777215, param0, param4, param3, (byte) 103, param5, param8);
        if (!param9) {
            lk.g(-50);
        }
    }

    private final void h(int param0) {
        if (param0 == -1) {
          L0: {
            if (this.field_y) {
              L1: {
                if (this.a((byte) -93, true)) {
                  break L1;
                } else {
                  this.field_y = false;
                  this.c(30000, this.field_g, 1);
                  if (!client.field_A) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_e = 20;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(boolean param0, int param1, int param2, lk param3, boolean param4, int param5, int param6, int param7, oi param8, boolean param9, byte param10) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        Object stackIn_79_0 = null;
        lk stackIn_79_1 = null;
        oi stackIn_79_2 = null;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        Object stackIn_80_0 = null;
        lk stackIn_80_1 = null;
        oi stackIn_80_2 = null;
        int stackIn_80_3 = 0;
        int stackIn_80_4 = 0;
        Object stackIn_81_0 = null;
        lk stackIn_81_1 = null;
        oi stackIn_81_2 = null;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        int stackIn_87_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var12_int = this.field_P[param6];
                        if (((var12_int & -1879048193) >> -1240422525 ^ -1) != (param1 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        var13 = 0;
                        if (param5 >= 0) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var12_int & -1879048193 ^ -1) == -24) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-2 != param5) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-8 >= (var14 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
                        stackIn_12_0 = stackIn_14_0;
                        if (var22 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var13 = stackIn_12_0;
                        var14++;
                        if (var22 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = var13;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        if (this.field_v) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param7 = 3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = 0;
                        this.field_w[0] = param6;
                        var15 = 1;
                        this.field_P[param6] = de.b(-2147483648, var12_int);
                        var16 = 0;
                        if (param5 < 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var16 = 1;
                        var12_int = (-1879048200 & var12_int) + param5;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param9) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17 = 23;
                        if (var22 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var17 = 24 ^ var12_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var14 >= var15) {
                            statePc = 44;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        incrementValue$0 = var14;
                        var14++;
                        var18 = this.field_w[incrementValue$0];
                        stackIn_45_0 = var16;
                        stackIn_28_0 = stackIn_45_0;
                        if (var22 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (23 != (this.field_P[var18] & 268435455)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 < var18 % this.field_O) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var15 = this.a(-1 + var18, 124, var17, var15, var12_int);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_O + -1 <= var18 % this.field_O) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var15 = this.a(1 + var18, 126, var17, var15, var12_int);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var18 ^ -1) <= (this.field_O ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var15 = this.a(-this.field_O + var18, 126, var17, var15, var12_int);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((-1 + this.field_a) * this.field_O > var18) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var15 = this.a(var18 - -this.field_O, 125, var17, var15, var12_int);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var22 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var17 = -119 / ((param10 - 7) / 60);
                        stackIn_45_0 = var16;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var15 < param2) {
                            statePc = 82;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var12_int = 8 | var12_int & 7;
                        var14 = 0;
                        var18 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var18 >= var15) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var19 = this.field_w[var18];
                        var20 = this.field_P[var19];
                        stackIn_76_0 = 1879048192;
                        stackIn_50_0 = stackIn_76_0;
                        stackIn_76_1 = 1879048192 & var20;
                        stackIn_50_1 = stackIn_76_1;
                        if (var22 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 <= stackIn_50_1) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_P[var19] = var20 - -268435456;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var18++;
                        if (var22 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var18 = var15;
                        if (!param4) {
                            statePc = 66;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var15 <= var14) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        incrementValue$1 = var14;
                        var14++;
                        var19 = this.field_w[incrementValue$1];
                        stackIn_76_0 = var19 % this.field_O ^ -1;
                        stackIn_56_0 = stackIn_76_0;
                        stackIn_76_1 = -1;
                        stackIn_56_1 = stackIn_76_1;
                        if (var22 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 >= stackIn_56_1) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var15 = this.a(var15, var19 + -1, (byte) -44, var12_int);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var19 % this.field_O >= -1 + this.field_O) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var15 = this.a(var15, var19 - -1, (byte) -44, var12_int);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((this.field_O ^ -1) >= (var19 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var15 = this.a(var15, -this.field_O + var19, (byte) -44, var12_int);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var19 ^ -1) <= ((this.field_a + -1) * this.field_O ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var15 = this.a(var15, this.field_O + var19, (byte) -44, var12_int);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var22 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (param9) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (null == this.field_rb) {
                            statePc = 75;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((param7 ^ -1) != -4) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (null == this.field_rb) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var19 = gg.b(var15, 27935);
                        var20 = var19;
                        he.field_ab = he.field_ab + var20;
                        fb.field_e = fb.field_e + var20;
                        this.field_hb = this.field_hb + var19;
                        this.field_rb.a(new sa(false, this.b(0, var15, 81), this.a(true, var15, 0), var19, a.field_u, -1 + var15, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15), " = <b>", Integer.toString(var19)}), 2777);
                        if (var22 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (this.field_rb == null) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var19 = pa.b(var18, 65);
                        var20 = gg.b(var15 + -var18, 27935);
                        this.field_f = this.field_f + var19;
                        var21 = var19;
                        he.field_ab = he.field_ab + var21;
                        fb.field_e = fb.field_e + var21;
                        this.field_hb = this.field_hb + var20;
                        var21 = var20;
                        fb.field_e = fb.field_e + var21;
                        he.field_ab = he.field_ab + var21;
                        if (0 >= var20) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.field_rb.a(new sa(false, this.b(var18, var15, 65), this.a(true, var15, var18), var20, a.field_u, var15 + -var18 - 1, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15 + -var18), " = <b>", Integer.toString(var20)}), 2777);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_rb.a(new sa(false, this.b(0, var18, 112), this.a(true, var18, 0), var19, bc.field_J, -4 + var18, 16 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var18), " = <b>", Integer.toString(var19)}), 2777);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var13 = var15;
                        stackIn_76_0 = this.field_D;
                        stackIn_76_1 = param7;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 >= stackIn_76_1) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_80_0 = this;
                        stackIn_79_0 = stackIn_80_0;
                        stackIn_80_1 = (lk) (param3);
                        stackIn_79_1 = stackIn_80_1;
                        stackIn_80_2 = (oi) (param8);
                        stackIn_79_2 = stackIn_80_2;
                        stackIn_80_3 = var12_int;
                        stackIn_79_3 = stackIn_80_3;
                        stackIn_80_4 = 0;
                        stackIn_79_4 = stackIn_80_4;
                        if (-3 < (this.field_D ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_81_0 = this;
                        stackIn_81_1 = (lk) ((Object) stackIn_79_1);
                        stackIn_81_2 = (oi) ((Object) stackIn_79_2);
                        stackIn_81_3 = stackIn_79_3;
                        stackIn_81_4 = stackIn_79_4;
                        stackIn_81_5 = var15;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = this;
                        stackIn_81_1 = (lk) ((Object) stackIn_80_1);
                        stackIn_81_2 = (oi) ((Object) stackIn_80_2);
                        stackIn_81_3 = stackIn_80_3;
                        stackIn_81_4 = stackIn_80_4;
                        stackIn_81_5 = var18;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.a(stackIn_81_1, stackIn_81_2, stackIn_81_3, stackIn_81_4, stackIn_81_5);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (!param9) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var18 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((var18 ^ -1) <= (var15 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var19 = this.field_w[var18];
                        var20 = this.field_P[var19];
                        var21 = var20 & 268435455;
                        stackIn_93_0 = 23;
                        stackIn_87_0 = stackIn_93_0;
                        if (var22 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 == var21) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-3 != (var21 >> -536593437 ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var20 = var20 & 2147483647;
                        this.field_P[var19] = var20;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var18++;
                        if (var22 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackIn_93_0 = var13;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    return stackIn_93_0;
                }
                case 94: {
                    var12 = (RuntimeException) ((Object) caughtException);
                    stackIn_96_0 = (RuntimeException) (var12);
                    stackIn_95_0 = stackIn_96_0;
                    stackIn_96_1 = new StringBuilder().append("lk.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_95_1 = stackIn_96_1;
                    if (param3 == null) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_97_0 = (RuntimeException) ((Object) stackIn_95_0);
                    stackIn_97_1 = (StringBuilder) ((Object) stackIn_95_1);
                    stackIn_97_2 = "{...}";
                    statePc = 97;
                    continue stateLoop;
                }
                case 96: {
                    stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
                    stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
                    stackIn_97_2 = "null";
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_99_0 = (RuntimeException) ((Object) stackIn_97_0);
                    stackIn_98_0 = stackIn_99_0;
                    stackIn_99_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                    stackIn_98_1 = stackIn_99_1;
                    if (param8 == null) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackIn_100_0 = (RuntimeException) ((Object) stackIn_98_0);
                    stackIn_100_1 = (StringBuilder) ((Object) stackIn_98_1);
                    stackIn_100_2 = "{...}";
                    statePc = 100;
                    continue stateLoop;
                }
                case 99: {
                    stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                    stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                    stackIn_100_2 = "null";
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    throw dh.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param9 + ',' + param10 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (0 == this.field_C) {
          throw new IllegalStateException();
        } else {
          L0: {
            L1: {
              var3 = (this.field_A ^ -1) & param0;
              this.field_A = param0;
              var4 = 0;
              if (-1 <= (this.field_Ab ^ -1)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Ab = this.field_Ab - 1;
                    if (0 != (1 & var3)) {
                      break L3;
                    } else {
                      if ((var3 & 2 ^ -1) != -1) {
                        this.j(param1 ^ -1674843003);
                        this.field_Cb = 10;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.b((byte) -116);
                  this.field_Cb = -10;
                  break L2;
                }
                L4: {
                  L5: {
                    if (0 > this.field_Cb) {
                      break L5;
                    } else {
                      if (this.field_Cb > 0) {
                        L6: {
                          if ((param0 & 2 ^ -1) == -1) {
                            break L6;
                          } else {
                            fieldTemp$0 = this.field_Cb - 1;
                            this.field_Cb = this.field_Cb - 1;
                            if ((fieldTemp$0 ^ -1) == -1) {
                              this.j(4);
                              this.field_Cb = 3;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        this.field_Cb = 0;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if ((param0 & 1) != 0) {
                      break L7;
                    } else {
                      this.field_Cb = 0;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  fieldTemp$1 = this.field_Cb + 1;
                  this.field_Cb = this.field_Cb + 1;
                  if (fieldTemp$1 != 0) {
                    break L4;
                  } else {
                    this.b((byte) -116);
                    this.field_Cb = -3;
                    break L4;
                  }
                }
                L8: {
                  if (0 != (var3 & 4)) {
                    this.c(false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (0 != (16 & param0)) {
                    var4 = 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 == (8 & var3 ^ -1)) {
                  break L0;
                } else {
                  this.i(0);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var4 = 1;
            break L0;
          }
          L10: {
            if (param1 == -1674843007) {
              break L10;
            } else {
              lk.a(50, -101, 127, 94, false, 20, 66);
              break L10;
            }
          }
          L11: {
            if (var4 != 0) {
              L12: {
                if (0 == this.field_Ab) {
                  break L12;
                } else {
                  if ((param0 & 16 ^ -1) != -1) {
                    break L12;
                  } else {
                    var4 = 0;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              if (this.field_e <= 2) {
                break L11;
              } else {
                L13: {
                  if (this.field_y) {
                    break L13;
                  } else {
                    if (-1 <= (this.field_Ab ^ -1)) {
                      break L13;
                    } else {
                      if ((this.field_g ^ -1) != (this.field_e ^ -1)) {
                        break L13;
                      } else {
                        if (this.o(32) != this.field_M) {
                          break L13;
                        } else {
                          if (null != this.field_rb) {
                            this.field_H = this.field_H + 5;
                            he.field_ab = he.field_ab + 5;
                            fb.field_e = fb.field_e + 5;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_e = 2;
                break L11;
              }
            } else {
              break L11;
            }
          }
          L14: {
            if (-1 > (this.field_e ^ -1)) {
              this.c(30000, -1 + this.field_e, 0);
              break L14;
            } else {
              break L14;
            }
          }
          return;
        }
    }

    final rf b(int param0) {
        int var2;
        rf var3;
        int var4;
        int stackIn_7_0 = 0;
        var4 = client.field_A ? 1 : 0;
        this.c(0);
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_t ^ -1) >= (var2 ^ -1)) {
                break L2;
              } else {
                stackIn_7_0 = this.field_X[var2].field_e;

                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_7_0 == 0) {
                    break L2;
                  } else {
                    var2++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = this.field_t ^ -1;
            break L1;
          }
          if (stackIn_7_0 < (var2 ^ -1)) {
            if (param0 == -19939) {
              var3 = this.field_X[var2];
              var3.field_e = var3.field_e + 1;
              return var3;
            } else {
              return (rf) null;
            }
          } else {
            throw new IllegalStateException();
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int[] array$0 = null;
        int incrementValue$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int statePc = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    this.field_L = param5;
                    this.field_q = param4;
                    param2 = param0 & -this.field_ab + param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 <= (param2 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var15 = this.field_B;
                    var14 = var15;
                    var13 = var14;
                    var7 = var13;
                    if (var12 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var13 == null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_zb * this.field_C ^ -1) >= (var15.length ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    array$0 = new int[this.field_C * this.field_zb];
                    var7 = array$0;
                    this.field_B = array$0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var8 = 0;
                    var9 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_zb <= var9) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10 = -1 + this.field_zb - var9;
                    stackIn_18_0 = 0;
                    stackIn_10_0 = stackIn_18_0;
                    if (var12 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var11 = stackIn_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_C <= var11) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    incrementValue$1 = var8;
                    var8++;
                    this.field_B[var10] = this.field_T[incrementValue$1];
                    var10 = var10 + this.field_zb;
                    var11++;
                    if (var12 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var12 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = this.field_C;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var8 = stackIn_18_0;
                    this.field_C = this.field_zb;
                    this.field_B = this.field_T;
                    this.field_zb = var8;
                    this.field_T = var7;
                    param2--;
                    if (var12 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(param1, (byte) 126, param3);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, rf param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_zb = param2.field_n;
                        this.field_U = this.field_U + 1;
                        this.field_C = param2.field_b;
                        this.field_b = new int[this.field_C * this.field_zb];
                        this.field_T = new int[this.field_C * this.field_zb];
                        if (param0 > 73) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_tb = new int[this.field_C * this.field_zb];
                        var4_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_zb * this.field_C <= var4_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_T[var4_int] = lb.a(255, (int) param2.field_c[var4_int]);
                        var4_int++;
                        if (var10 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_C * this.field_zb <= var4_int) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_b[var4_int] = 8;
                        var4_int++;
                        if (var10 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var10 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_o = 0;
                        this.field_db = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-1 == (1 & (this.field_C ^ this.field_zb) ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = var8 ^ -1;
                        stackIn_18_1 = this.field_zb ^ -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 <= stackIn_18_1) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_28_0 = 0;
                        stackIn_20_0 = stackIn_28_0;
                        if (var10 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = stackIn_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 >= this.field_C) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_18_0 = 0;
                        stackIn_23_0 = stackIn_18_0;
                        stackIn_18_1 = this.field_T[var7];
                        stackIn_23_1 = stackIn_18_1;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == stackIn_23_1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = var5 + var8;
                        var6++;
                        var4_int = var4_int + var9;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        var9++;
                        if (var10 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = (-1 + this.field_C) * var6 >> 1653217089;
                        stackIn_28_0 = var6 * (this.field_zb - 1) >> 847858401;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = stackIn_28_0;
                        if (-var9 + var5 <= var4_int + -var8) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var5 - var9 > var8 + -var4_int) {
                            statePc = 40;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var5 - var9 ^ -1) <= (-var8 + var4_int ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-var9 + var5 >= -var4_int + var8) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_o = -1;
                        if (var10 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var4_int < var8) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_db = 1;
                        if (var10 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_db = -1;
                        if (var10 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_o = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_Cb = 0;
                        this.field_q = -this.field_C + this.field_O >> -433015551;
                        this.field_A = 0;
                        this.field_L = -this.field_zb + 1 + this.field_z;
                        this.field_yb = param1;
                        this.field_ab = 0;
                        stackIn_43_0 = this;
                        stackIn_42_0 = stackIn_43_0;
                        if (-3 >= (this.field_g ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_44_0 = this;
                        stackIn_44_1 = 2;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = this;
                        stackIn_44_1 = this.field_g;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((lk) (this)).field_e = stackIn_44_1;
                        this.field_y = false;
                        this.field_Ab = this.l(123);
                        this.field_M = this.o(32);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_48_0 = (RuntimeException) (var4);
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = new StringBuilder().append("lk.AA(").append(param0).append(',').append(param1).append(',');
                    stackIn_47_1 = stackIn_48_1;
                    if (param2 == null) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(rf param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        rf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        rf[] var6 = null;
        rf[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
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
                    var5 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_t < this.field_X.length) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6 = new rf[2 * this.field_X.length];
                        var7 = var6;
                        var3 = var7;
                        var4 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var4 ^ -1) <= (this.field_X.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6[var4] = this.field_X[var4];
                        var4++;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_X = var7;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1 <= -116) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_o = 45;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.field_l = this.field_wb;
                        this.field_wb = this.field_wb + 3;
                        fieldTemp$1 = this.field_t;
                        this.field_t = this.field_t + 1;
                        this.field_X[fieldTemp$1] = param0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("lk.O(");
                    stackIn_13_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
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
                    throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean c(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_42_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    if (param0 == 5) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    if (param1 == -15303) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_Bb = false;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (-6 >= (var3 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = this.field_w[var3];
                    var5 = var4 % this.field_O;
                    var6 = var4 / this.field_O;
                    var7 = 15;
                    stackIn_42_0 = 0;
                    stackIn_7_0 = stackIn_42_0;
                    if (var12 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (5 <= var8) {
                        statePc = 37;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_38_0 = var8;
                    stackIn_10_0 = stackIn_38_0;
                    stackIn_38_1 = var3;
                    stackIn_10_1 = stackIn_38_1;
                    if (var12 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 == stackIn_10_1) {
                        statePc = 36;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9 = this.field_w[var8];
                    var10 = var9 % this.field_O;
                    var10 = var10 - var5;
                    var11 = var9 / this.field_O;
                    var11 = var11 - var6;
                    if (-1 != (var11 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (0 == (var10 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var10 == 1) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = var7 & 3;
                    if (var12 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((var10 ^ -1) != -1) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var11 == -1) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((var11 ^ -1) != -2) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7 = var7 & 12;
                    if (var12 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-1 != var10) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if ((var11 ^ -1) != 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 = var7 & 5;
                    if (var12 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-2 != (var10 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var11 == -1) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = var7 & 9;
                    if (var12 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (0 != (var10 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-2 == (var11 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var7 = var7 & 6;
                    if (var12 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var10 ^ -1) != -2) {
                        statePc = 40;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((var11 ^ -1) == -2) {
                        statePc = 35;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var7 = var7 & 10;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = -1;
                    stackIn_38_1 = var7 ^ -1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (stackIn_38_0 == stackIn_38_1) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return true;
                }
                case 40: {
                    var3++;
                    if (var12 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return false;
                }
                case 42: {
                    return stackIn_42_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void k(int param0) {
        if (param0 != -9897) {
            this.field_V = 92;
        }
        if (-1 > (this.field_C ^ -1) && !this.field_S) {
            this.field_V = this.field_C;
            this.field_E = this.field_L;
            this.field_mb = 1;
            this.field_h = this.field_zb;
            this.field_ob = this.field_q;
            this.field_N = this.field_T;
            ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
            this.field_S = true;
            this.field_K = 0;
            this.field_p = 0;
            this.field_Bb = false;
            this.field_nb = 0;
        }
        this.field_C = 0;
    }

    private final void b(boolean param0) {
        int var2 = -300 + ka.a((byte) 122, 601, tf.field_cb);
        var2 = var2 * (var2 * var2) / 90000;
        a.a(var2, this.field_J / 4, ak.field_b, this.field_sb, 256);
        if (param0) {
            this.field_M = -21;
        }
    }

    private final void i(int param0) {
        if (this.q(21200)) {
            return;
        }
        if ((this.field_db | this.field_o) != param0) {
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
            if (this.q(param0 ^ 21200)) {
                return;
            }
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
        }
    }

    private final int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_C * this.field_zb;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                var4 = this.field_T[var3];
                stackIn_8_0 = 0;

                stackIn_8_1 = var4;

                if (var5 != 0) {
                  break L1;
                } else {
                  if (stackIn_8_0 != stackIn_8_1) {
                    return (var4 & 24) >> 1983512195;
                  } else {
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            stackIn_8_1 = 35;
            break L1;
          }
          if (stackIn_8_0 >= stackIn_8_1) {
            return 0;
          } else {
            this.field_T = (int[]) null;
            return 0;
          }
        }
    }

    final boolean n(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_O * this.field_a;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                var4 = this.field_P[var3];
                stackIn_9_0 = 24 & var4;

                stackIn_9_1 = 24;

                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_9_0 != stackIn_9_1) {
                      break L3;
                    } else {
                      var4 = var4 & 7;
                      if (1 == var4) {
                        break L3;
                      } else {
                        if (-4 == (var4 ^ -1)) {
                          break L3;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_9_0 = param0;
            stackIn_9_1 = -22477;
            break L1;
          }
          L4: {
            if (stackIn_9_0 == stackIn_9_1) {
              break L4;
            } else {
              this.a((oi) null, 112, true, (lk) null);
              break L4;
            }
          }
          return false;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = -122 / ((param1 - -36) / 55);
        if (!(!ea.d((byte) 69))) {
            im.a(-93, param6, param4, param5);
            if (w.field_H != null && w.field_H.a(param4, param3, param0, 0, param5)) {
                param4 = false;
                tf.i((byte) -78);
            }
            ll.a(param4, 0, param5);
            ji.a(param2, 0, param4);
            param4 = false;
        }
        return param4;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        this.field_nb = 0;
        this.field_p = 0;
        this.field_S = true;
        this.field_K = 0;
    }

    final void a(oi param0, int param1, boolean param2, lk param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_71_0 = 0;
        ud stackIn_74_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_243_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_281_0 = 0;
        int stackIn_281_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_294_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_297_1 = 0;
        int stackIn_302_0 = 0;
        RuntimeException stackIn_317_0 = null;
        StringBuilder stackIn_317_1 = null;
        RuntimeException stackIn_318_0 = null;
        StringBuilder stackIn_318_1 = null;
        RuntimeException stackIn_319_0 = null;
        StringBuilder stackIn_319_1 = null;
        String stackIn_319_2 = null;
        RuntimeException stackIn_320_0 = null;
        StringBuilder stackIn_320_1 = null;
        RuntimeException stackIn_321_0 = null;
        StringBuilder stackIn_321_1 = null;
        RuntimeException stackIn_322_0 = null;
        StringBuilder stackIn_322_1 = null;
        String stackIn_322_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var9_ref_ud = null;
        int var10 = 0;
        ei var10_ref_ei = null;
        int var11 = 0;
        ei var11_ref_ei = null;
        ei[] var11_ref_ei__ = null;
        int var12 = 0;
        ei var13 = null;
        int var14 = 0;
        ei var15 = null;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    mk.field_e = 0;
                    if (param1 > 124) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    dn.field_i = false;
                    fk.field_H = 0;
                    bj.field_a = false;
                    pn.field_db = false;
                    var5_int = 0;
                    if (1 != this.field_ib) {
                        statePc = 17;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = 1;
                    var7 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_a * this.field_O <= var7) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var8 = this.field_P[var7];
                    stackIn_281_0 = -33;
                    stackIn_7_0 = stackIn_281_0;
                    stackIn_281_1 = var8 ^ -1;
                    stackIn_7_1 = stackIn_281_1;
                    if (var14 != 0) {
                        statePc = 281;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 < stackIn_7_1) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 += 32;
                    if ((var8 ^ -1) > -417) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8 = 0;
                    if (var14 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var6 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5_int = 1;
                    this.field_P[var7] = var8;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var6 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_ib = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var14 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == (this.field_ib ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = 0;
                    var7 = 0;
                    var8 = -1 + this.field_a * this.field_O;
                    var9 = this.field_a + -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = -1;
                    stackIn_21_1 = var9 ^ -1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 < stackIn_21_1) {
                        statePc = 70;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_71_0 = -1 + this.field_O;
                    stackIn_23_0 = stackIn_71_0;
                    if (var14 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var10 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-1 < (var10 ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var11 = this.field_P[var8];
                    stackIn_21_0 = var11 ^ -1;
                    stackIn_26_0 = stackIn_21_0;
                    stackIn_21_1 = -1;
                    stackIn_26_1 = stackIn_21_1;
                    if (var14 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == stackIn_26_1) {
                        statePc = 68;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (param2) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (16 == (var11 & 24)) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-25 != (var11 & 24 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((var9 ^ -1) <= (-1 + this.field_a ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (this.field_P[var8 - -this.field_O] == 0) {
                        statePc = 67;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (param2) {
                        statePc = 44;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((var11 & 24 ^ -1) == -17) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((24 & var11) != 24) {
                        statePc = 44;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (this.field_a + -1 <= var9) {
                        statePc = 44;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var10 - -this.field_l < 0) {
                        statePc = 44;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((var10 + this.field_l ^ -1) <= (this.field_O ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((this.field_P[this.field_l + var8] ^ -1) != -1) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((this.field_P[this.field_O + var8 + this.field_l] ^ -1) != -1) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_P[this.field_l + var8] = de.b(lb.a(31, var11), 32);
                    this.field_P[var8] = 0;
                    var5_int = 1;
                    var6++;
                    if (var14 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (param2) {
                        statePc = 54;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var11 & 24 ^ -1) == -17) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((var11 & 24 ^ -1) != -25) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if ((this.field_a + -1 ^ -1) >= (var9 ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((-this.field_l + var10 ^ -1) > -1) {
                        statePc = 54;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((this.field_O ^ -1) >= (-this.field_l + var10 ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if ((this.field_P[-this.field_l + var8] ^ -1) != -1) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-1 != (this.field_P[-this.field_l + (var8 + this.field_O)] ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_P[-this.field_l + var8] = de.b(lb.a(31, var11), 32);
                    var5_int = 1;
                    this.field_P[var8] = 0;
                    var6++;
                    if (var14 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (32 <= var11) {
                        statePc = 56;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (!param2) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var11 < 64) {
                        statePc = 65;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var11 < 64) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var7++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var11 += 32;
                    if (-449 >= (var11 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var11 = var11 & 31;
                    if (var14 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var11 = var11 & 31;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    this.field_P[var8] = var11;
                    var5_int = 1;
                    if (var14 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_P[var8 + this.field_O] = de.b(lb.a(var11, 31), 32);
                    this.field_P[var8] = 0;
                    var6++;
                    var5_int = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var8--;
                    var10--;
                    if (var14 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var9--;
                    if (var14 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = this.field_l ^ -1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 != -1) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = bf.field_u;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = rc.field_i;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var9_ref_ud = stackIn_74_0;
                    if ((var6 ^ -1) < -1) {
                        statePc = 79;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var10_ref_ei = wf.field_l[this.field_Q];
                    if (var10_ref_ei != null) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var10_ref_ei.g(en.field_o / 50);
                    wf.field_l[this.field_Q] = null;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var14 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    pg.field_a[this.field_Q] = true;
                    var10 = (int)(0.5 + (double)this.field_k * Math.sqrt((double)var6));
                    if ((4 * this.field_k ^ -1) <= (var10 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10 = 4 * this.field_k;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var15 = wf.field_l[this.field_Q];
                    var11_ref_ei = var15;
                    if (var11_ref_ei == null) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var15.f(-1);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (var11_ref_ei == null) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (!var15.a((byte) 93)) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var15.field_q == var9_ref_ud) {
                        statePc = 91;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var11_ref_ei != null) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var15.g(en.field_o / 50);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var16 = ei.c(var9_ref_ud, 100, var10 * pb.field_d, this.field_lb << -273244250);
                    var11_ref_ei = var16;
                    var16.f(-1);
                    dg.field_c.a(var16);
                    wf.field_l[this.field_Q] = var16;
                    if (var14 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var11_ref_ei.b(en.field_o / 50, var10 * pb.field_d, this.field_lb << 522231430);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (0 < var7) {
                        statePc = 94;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var10 = (2 + (int)((double)this.field_k * Math.sqrt((double)var7))) / 4;
                    if (this.field_k < var10) {
                        statePc = 96;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var10 = this.field_k;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    ge.a(this.field_lb, var10, (byte) 127, bj.field_e);
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var5_int == 0) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_l = -this.field_l;
                    if (var14 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_ib = 2;
                    this.field_l = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var5_int != 0) {
                        statePc = 144;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (this.field_s) {
                        statePc = 144;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (!param2) {
                        statePc = 106;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 106: {
                    gg.field_B = 2147483647;
                    gi.field_a = 0;
                    var6 = 0;
                    var7 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if ((var7 ^ -1) <= (this.field_a * this.field_O ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                    stackIn_123_0 = var8;
                    stackIn_109_0 = stackIn_123_0;
                    if (var14 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 > 0) {
                        statePc = 111;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (this.field_kb) {
                        statePc = 113;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (this.a(-101, var8)) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    bj.field_a = true;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (!this.c(var8, -15303)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    dn.field_i = true;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (!this.b(var8, -1)) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    pn.field_db = true;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var6++;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.a(-99, false, 1);
                    stackIn_123_0 = var6;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (stackIn_123_0 > 0) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    this.field_s = true;
                    if (var14 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_K = this.field_K + var6;
                    if (-3 < (var6 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 1) / 2;
                    if (this.field_k < var7) {
                        statePc = 129;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var7 = this.field_k;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    ge.a(this.field_lb, var7, (byte) 127, bf.field_w);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    this.field_nb = this.field_nb + 1;
                    if (-3 >= (this.field_nb ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var7 = (this.field_nb + -1) % 4;
                    var8 = (-1 + this.field_nb) / 4 * 3;
                    if (var7 != 3) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var8++;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    ai.a(62, var8, jm.field_v[var7], this.field_lb, this.field_k);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (null == this.field_rb) {
                        statePc = 143;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var7 = ik.a((byte) 126, var6);
                    var8 = var7;
                    fb.field_e = fb.field_e + var8;
                    he.field_ab = he.field_ab + var8;
                    this.field_ub = this.field_ub + var7;
                    if (0 < var7) {
                        statePc = 139;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 139: {
                    fieldTemp$0 = gg.field_B;
                    gg.field_B = gg.field_B - 1;
                    this.field_rb.a(new sa(true, this.field_O * 128, -384 + fieldTemp$0 * 256, var7, jg.field_f, -2 + var6, 0, new String[]{cm.a((byte) 85, on.field_h, new String[]{Integer.toString(var6)}), " = <b>", Integer.toString(var7)}), 2777);
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var8 = le.b(32085, this.field_nb);
                    if (0 < var8) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    fieldTemp$1 = gg.field_B;
                    gg.field_B = gg.field_B - 1;
                    this.field_W = new sa(true, 128 * this.field_O, -384 + fieldTemp$1 * 256, var8, nf.field_f, this.field_nb + -2, 0, new String[]{cm.a((byte) 115, e.field_d, new String[]{Integer.toString(this.field_nb)}), " = <b>", Integer.toString(var8)});
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var5_int = 1;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (var5_int != 0) {
                        statePc = 238;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (param2) {
                        statePc = 238;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var6 = 1;
                    var7 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var7 >= this.field_a * this.field_O) {
                        statePc = 157;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var8 = this.field_P[var7];
                    stackIn_158_0 = var8 ^ -1;
                    stackIn_149_0 = stackIn_158_0;
                    stackIn_158_1 = -33;
                    stackIn_149_1 = stackIn_158_1;
                    if (var14 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 > stackIn_149_1) {
                        statePc = 156;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if ((var8 & 31 ^ -1) == -26) {
                        statePc = 156;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if ((var8 & 31 ^ -1) == -28) {
                        statePc = 156;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var8 += 32;
                    if (var8 < 416) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var8 = 0;
                    if (var14 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var6 = 0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    this.field_P[var7] = var8;
                    var5_int = 1;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var7 = -1 + (-1 + this.field_a) * this.field_O;
                    stackIn_158_0 = this.field_a;
                    stackIn_158_1 = 2;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var8 = stackIn_158_0 - stackIn_158_1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (var8 < 0) {
                        statePc = 172;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackIn_174_0 = -1 + this.field_O;
                    stackIn_161_0 = stackIn_174_0;
                    if (var14 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var9 = stackIn_161_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var9 < 0) {
                        statePc = 171;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var10 = this.field_P[var7];
                    stackIn_173_0 = var10 ^ -1;
                    stackIn_164_0 = stackIn_173_0;
                    stackIn_173_1 = -26;
                    stackIn_164_1 = stackIn_173_1;
                    if (var14 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (stackIn_164_0 == stackIn_164_1) {
                        statePc = 166;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 166: {
                    discarded$2 = this.a(false, 2, 1, param3, false, -2, this.field_O + var7, 3, param0, false, (byte) 109);
                    this.b(-1, this.field_O + var7, false);
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (27 == var10) {
                        statePc = 169;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 169: {
                    discarded$3 = this.a(true, 2, 1, param3, true, -2, this.field_O + var7, 3, param0, false, (byte) -99);
                    this.b(-1, var7 - -this.field_O, false);
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var7--;
                    var9--;
                    if (var14 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var8--;
                    if (var14 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var7 = this.field_O * (-1 + this.field_a) - 1;
                    stackIn_173_0 = -2;
                    stackIn_173_1 = this.field_a;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_174_0 = stackIn_173_0 + stackIn_173_1;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var8 = stackIn_174_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_176_0 = var8 ^ -1;
                    stackIn_176_1 = -1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0 > stackIn_176_1) {
                        statePc = 189;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackIn_190_0 = -1 + this.field_O;
                    stackIn_178_0 = stackIn_190_0;
                    if (var14 != 0) {
                        statePc = 190;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var9 = stackIn_178_0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (-1 < (var9 ^ -1)) {
                        statePc = 188;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var10 = this.field_P[var7];
                    stackIn_176_0 = var10 ^ -1;
                    stackIn_181_0 = stackIn_176_0;
                    stackIn_176_1 = -26;
                    stackIn_181_1 = stackIn_176_1;
                    if (var14 != 0) {
                        statePc = 176;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (stackIn_181_0 != stackIn_181_1) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (-1 != (this.field_P[var7 + this.field_O] & 1879048192 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    discarded$4 = this.a(false, 1, 1, param3, false, -1, var7 - -this.field_O, 3, param0, false, (byte) 123);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if ((var10 ^ -1) != -28) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (0 != (this.field_P[this.field_O + var7] & 1879048192)) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    discarded$5 = this.a(false, 1, 1, param3, true, -1, this.field_O + var7, 3, param0, false, (byte) 72);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var7--;
                    var9--;
                    if (var14 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var8--;
                    if (var14 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    this.a(-121, false, 2);
                    var8 = 0;
                    var7 = -1 + this.field_O * this.field_a;
                    stackIn_190_0 = 0;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    var9 = stackIn_190_0;
                    var10 = -1 + this.field_a;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = -1;
                    stackIn_192_1 = var10 ^ -1;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (stackIn_192_0 < stackIn_192_1) {
                        statePc = 214;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_215_0 = this.field_O + -1;
                    stackIn_194_0 = stackIn_215_0;
                    if (var14 != 0) {
                        statePc = 215;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var11 = stackIn_194_0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (var11 < 0) {
                        statePc = 213;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var12 = this.field_P[var7];
                    stackIn_192_0 = 31 & var12 ^ -1;
                    stackIn_197_0 = stackIn_192_0;
                    stackIn_192_1 = -26;
                    stackIn_197_1 = stackIn_192_1;
                    if (var14 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (stackIn_197_0 == stackIn_197_1) {
                        statePc = 200;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (27 != (var12 & 31)) {
                        statePc = 212;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var5_int = 1;
                    if (32 > var12) {
                        statePc = 205;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var12 += 32;
                    if ((var12 ^ -1) > -417) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var12 = 0;
                    if (var14 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var6 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    this.field_P[var7] = var12;
                    if (var14 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (-1 + this.field_a > var10) {
                        statePc = 207;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 207: {
                    this.field_P[var7 + this.field_O] = var12;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    this.field_P[var7] = var12 - -32;
                    var6 = 0;
                    if ((7 & var12 ^ -1) == -4) {
                        statePc = 211;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var8++;
                    if (var14 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var9++;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var7--;
                    var11--;
                    if (var14 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var10--;
                    if (var14 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackIn_215_0 = 0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 >= var8) {
                        statePc = 225;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var10 = kd.field_s[0][this.field_Q];
                    var11_ref_ei__ = sk.field_a[0];
                    var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var8))) / 2;
                    if (var12 > this.field_k) {
                        statePc = 218;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var12 = this.field_k;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if (var12 >= var10) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var12 = var10;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    kd.field_s[0][this.field_Q] = var12;
                    var13 = var11_ref_ei__[this.field_Q];
                    if (var13 == null) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var13.b(en.field_o / 50, var12 * pb.field_d, this.field_lb << -432303322);
                    if (var14 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var17 = ei.c(ob.field_n, 100, pb.field_d * var12, this.field_lb << -1195698778);
                    var17.f(-1);
                    dg.field_c.a(var17);
                    var11_ref_ei__[this.field_Q] = var17;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (0 < var9) {
                        statePc = 227;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var10 = kd.field_s[1][this.field_Q];
                    var11_ref_ei__ = sk.field_a[1];
                    var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var9))) / 2;
                    if ((this.field_k ^ -1) <= (var12 ^ -1)) {
                        statePc = 229;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    var12 = this.field_k;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (var12 >= var10) {
                        statePc = 231;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var12 = var10;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    kd.field_s[1][this.field_Q] = var12;
                    var13 = var11_ref_ei__[this.field_Q];
                    if (var13 == null) {
                        statePc = 234;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var13.b(en.field_o / 50, pb.field_d * var12, this.field_lb << -59157402);
                    if (var14 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var18 = ei.c(ob.field_n, 120, var12 * pb.field_d, this.field_lb << -297612698);
                    var18.f(-1);
                    dg.field_c.a(var18);
                    var11_ref_ei__[this.field_Q] = var18;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var5_int == 0) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var6 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    this.field_ib = 0;
                    this.field_s = false;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (param2) {
                        statePc = 254;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (this.field_G == 0) {
                        statePc = 254;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var6 = this.field_G;
                    this.field_G = 0;
                    var7 = 0;
                    var8 = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (this.field_a * this.field_O <= var8) {
                        statePc = 249;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var9 = this.field_P[var8];
                    var10 = var9 >> -465067389;
                    stackIn_250_0 = 2;
                    stackIn_243_0 = stackIn_250_0;
                    stackIn_250_1 = var10;
                    stackIn_243_1 = stackIn_250_1;
                    if (var14 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (stackIn_243_0 == stackIn_243_1) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if ((var10 ^ -1) != -2) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var11 = 1 << (7 & var9);
                    if (0 == (var6 & var11)) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var7 = var7 + this.a(true, var10, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    var8++;
                    if (var14 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    this.a(-107, true, this.field_ib);
                    stackIn_250_0 = var7 ^ -1;
                    stackIn_250_1 = -1;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 < stackIn_250_1) {
                        statePc = 252;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var5_int = 1;
                    if (null == this.field_rb) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var8 = gg.b(var7, 27935);
                    var9 = var8;
                    he.field_ab = he.field_ab + var9;
                    fb.field_e = fb.field_e + var9;
                    this.field_hb = this.field_hb + var8;
                    this.field_rb.a(new sa(true, this.field_O * 128, this.field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[]{" = <b>", Integer.toString(var8)}), 2777);
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (param2) {
                        statePc = 278;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (this.field_r) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (this.field_Y) {
                        statePc = 258;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var6 = 0;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if ((this.field_O * this.field_a ^ -1) >= (var6 ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var7 = this.field_P[var6];
                    stackIn_273_0 = -24;
                    stackIn_261_0 = stackIn_273_0;
                    stackIn_273_1 = var7 ^ -1;
                    stackIn_261_1 = stackIn_273_1;
                    if (var14 != 0) {
                        statePc = 273;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (stackIn_261_0 == stackIn_261_1) {
                        statePc = 269;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (!this.field_r) {
                        statePc = 265;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var7 >> 1910143171 == 1) {
                        statePc = 268;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (!this.field_Y) {
                        statePc = 269;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if ((var7 >> 585718723 ^ -1) == -3) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    this.field_P[var6] = qm.b(24, var7);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    var6++;
                    if (var14 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (this.field_r) {
                        statePc = 272;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 272: {
                    this.field_v = true;
                    stackIn_273_0 = this.field_lb;
                    stackIn_273_1 = this.field_k;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    ge.a(stackIn_273_0, stackIn_273_1, (byte) 127, fj.field_k);
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (this.field_Y) {
                        statePc = 276;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 276: {
                    ge.a(this.field_lb, this.field_k, (byte) 127, w.field_Eb);
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    this.field_Y = false;
                    this.field_r = false;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    if (this.field_N != null) {
                        statePc = 280;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 280: {
                    this.field_mb = this.field_mb + 1;
                    stackIn_281_0 = 13;
                    stackIn_281_1 = this.field_mb;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (stackIn_281_0 == stackIn_281_1) {
                        statePc = 283;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 283: {
                    this.field_N = null;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    if (param2) {
                        statePc = 303;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (var5_int != 0) {
                        statePc = 303;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (null != this.field_N) {
                        statePc = 303;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (this.field_jb <= 0) {
                        statePc = 303;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (this.field_Z != this.field_z) {
                        statePc = 290;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 290: {
                    ge.a(this.field_lb, this.field_k, (byte) 127, qa.field_s);
                    var6 = this.field_z;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    stackIn_292_0 = var6 ^ -1;
                    stackIn_292_1 = this.field_Z ^ -1;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (stackIn_292_0 <= stackIn_292_1) {
                        statePc = 301;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    stackIn_302_0 = 0;
                    stackIn_294_0 = stackIn_302_0;
                    if (var14 != 0) {
                        statePc = 302;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var7 = stackIn_294_0;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (var7 >= this.field_O) {
                        statePc = 300;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var8 = this.field_P[var6 * this.field_O + var7];
                    stackIn_292_0 = -1;
                    stackIn_297_0 = stackIn_292_0;
                    stackIn_292_1 = var8 ^ -1;
                    stackIn_297_1 = stackIn_292_1;
                    if (var14 != 0) {
                        statePc = 292;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (stackIn_297_0 == stackIn_297_1) {
                        statePc = 299;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    this.field_P[var6 * this.field_O - -var7] = 32 + var8;
                    this.field_ib = 1;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 295;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var6++;
                    if (var14 == 0) {
                        statePc = 291;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    this.field_L = this.field_L + (this.field_Z - this.field_z);
                    stackIn_302_0 = 1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var5_int = stackIn_302_0;
                    this.field_z = this.field_Z;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (var5_int != 0) {
                        statePc = 323;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (this.field_N != null) {
                        statePc = 323;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (!param2) {
                        statePc = 307;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 307: {
                    this.field_S = false;
                    this.field_s = false;
                    this.field_ib = 0;
                    this.field_v = false;
                    if (this.field_rb == null) {
                        statePc = 311;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (this.field_W != null) {
                        statePc = 310;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 310: {
                    this.field_j = this.field_j + this.field_W.field_t;
                    var6 = this.field_W.field_t;
                    fb.field_e = fb.field_e + var6;
                    he.field_ab = he.field_ab + var6;
                    this.field_rb.a(this.field_W, 2777);
                    this.field_W = null;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if (this.c((byte) -117)) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    this.field_L = this.field_L - 1;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    this.field_M = this.o(32);
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(int param0) {
        if (param0 < 35) {
            lk.a((mm) null, true, (mm) null, -73);
        }
        field_i = null;
    }

    private final void b(byte param0) {
        L0: {
          L1: {
            this.field_q = this.field_q - 1;
            if (!this.c((byte) -117)) {
              break L1;
            } else {
              this.field_q = this.field_q + 1;
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.h(param0 + 115);
          ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
          break L0;
        }
        L2: {
          if (param0 == -116) {
            break L2;
          } else {
            this.field_j = 63;
            break L2;
          }
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
            this.field_pb = -32;
        }
        ge.a(this.field_sb, this.field_J / 8, (byte) 127, ul.field_i);
    }

    private final rf p(int param0) {
        rf var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    if (this.field_t > 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    throw new IllegalStateException();
                }
                case 2: {
                    var2 = this.field_X[0];
                    var3 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((this.field_t ^ -1) >= (var3 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_X[-1 + var3] = this.field_X[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_m = this.field_m + 1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param0 > 121) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return (rf) null;
                }
                case 10: {
                    this.field_t = this.field_t - 1;
                    return var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, wl param1, byte param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.e(3);
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (-1 == (var4_int & 256 ^ -1)) {
                            statePc = 3;
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
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((lk) (this)).field_S = stackIn_4_1 != 0;
                        this.field_ab = (1616 & var4_int) >> 2050439561;
                        this.field_o = (-1073741824 & var4_int << -818043813) >> 627226110;
                        stackIn_6_0 = this;
                        stackIn_5_0 = stackIn_6_0;
                        if (0 == (64 & var4_int)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = this;
                        stackIn_7_1 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = this;
                        stackIn_7_1 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((lk) (this)).field_y = stackIn_7_1 != 0;
                        if ((32 & var4_int) == 0) {
                            statePc = 10;
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
                        this.field_ib = 0;
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_ib = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_db = (-1073741824 & var4_int << 2113050941) >> 1576984158;
                        this.field_jb = param1.d((byte) -74);
                        if (!param0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = this.field_jb;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (3 <= var5) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        rk.field_cb = rk.field_cb + 30000;
                        fh.field_h = fh.field_h + 30000;
                        var5++;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((this.field_a * this.field_O ^ -1) >= (var5 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = param1.d((byte) -40);
                        stackIn_27_0 = -129;
                        stackIn_21_0 = stackIn_27_0;
                        stackIn_27_1 = var6 ^ -1;
                        stackIn_21_1 = stackIn_27_1;
                        if (var8 != 0) {
                            statePc = 27;
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
                        if (stackIn_21_0 >= stackIn_21_1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = param1.d((byte) -102);
                        var6 = 127 & var6 | var7 << 1559143495;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_P[var5] = var6;
                        var5++;
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_U = param1.d((byte) -71);
                        this.field_C = param1.d((byte) -38);
                        this.field_zb = param1.d((byte) -39);
                        this.field_T = new int[this.field_C * this.field_zb];
                        this.field_b = new int[this.field_C * this.field_zb];
                        this.field_tb = new int[this.field_zb * this.field_C];
                        var5 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var5 ^ -1;
                        stackIn_27_1 = this.field_C * this.field_zb ^ -1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 <= stackIn_27_1) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_T[var5] = param1.d((byte) -42);
                        var5++;
                        if (var8 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8 == 0) {
                            statePc = 26;
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
                        var5 = 0;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (this.field_C * this.field_zb <= var5) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_b[var5] = 8;
                        var5++;
                        if (var8 != 0) {
                            statePc = 38;
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
                        if (var8 == 0) {
                            statePc = 33;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_q = param1.g((byte) -123);
                        this.field_L = param1.g((byte) -84);
                        this.field_e = param1.d((byte) -45);
                        this.field_Ab = param1.e(3);
                        this.field_A = param1.d((byte) -104);
                        this.field_Cb = param1.g((byte) -122);
                        this.field_yb = param1.d((byte) -102);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param2 >= 116) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.a(84, false, 99);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_K = param1.d((byte) -52);
                        this.field_z = param1.d((byte) -100);
                        this.field_Bb = false;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_44_0 = (RuntimeException) (var4);
                    stackIn_43_0 = stackIn_44_0;
                    stackIn_44_1 = new StringBuilder().append("lk.JA(").append(param0).append(',');
                    stackIn_43_1 = stackIn_44_1;
                    if (param1 == null) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_45_2 = "{...}";
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_45_2 = "null";
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw dh.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ')');
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int o(int param0) {
        if (param0 != 32) {
            field_i = (String) null;
        }
        return this.field_o + this.field_zb + 2 * this.field_L;
    }

    private final void d(int param0) {
        int var2 = this.o(32);
        if (!(this.field_M >= var2)) {
            this.field_M = var2;
        }
        if (param0 != 30968) {
            this.a((oi) null, -76, false, (lk) null);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        if (param1 <= 123) {
            this.field_pb = -105;
        }
        int var6 = this.field_P[param0];
        if ((-1879048193 & var6 ^ -1) == (param4 ^ -1) || (var6 & -1879048193) == param2) {
            incrementValue$0 = param3;
            param3++;
            this.field_w[incrementValue$0] = param0;
            this.field_P[param0] = var6 + -2147483648;
        }
        return param3;
    }

    private final void b(int param0, int param1, boolean param2) {
        int var4;
        var4 = this.field_P[param1];
        if (!param2) {
          L0: {
            if (24 != (-1879048200 & var4)) {
              break L0;
            } else {
              if (1 == (7 & var4)) {
                return;
              } else {
                if ((7 & var4 ^ -1) != -4) {
                  L1: {
                    if ((var4 & -1879048193) != 24) {
                      break L1;
                    } else {
                      if (0 != this.field_l) {
                        break L1;
                      } else {
                        this.field_l = 1;
                        ge.a(this.field_lb, this.field_k / 2, (byte) 127, pk.field_q);
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if ((var4 & -1879048193) != 29) {
                      break L2;
                    } else {
                      this.field_Y = true;
                      break L2;
                    }
                  }
                  L3: {
                    if ((var4 & -1879048193) != 26) {
                      break L3;
                    } else {
                      if (param0 < 0) {
                        break L3;
                      } else {
                        this.field_G = this.field_G | 1 << param0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((-1879048193 & var4 ^ -1) != -29) {
                      break L4;
                    } else {
                      this.field_r = true;
                      break L4;
                    }
                  }
                  if ((1879048192 & var4) == 0) {
                    this.field_P[param1] = 268435456 + var4;
                    if (this.field_rb != null) {
                      he.field_ab = he.field_ab + 2000;
                      fb.field_e = fb.field_e + 2000;
                      this.field_bb = this.field_bb + 2000;
                      this.field_rb.a(new sa(true, 128 - -(256 * (param1 % this.field_O)), param1 / this.field_O * 256 + 128, 2000, (int[]) null, 13684944, var4, new String[]{" = <b>", Integer.toString(2000)}), 2777);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean t(int param0) {
        int[] array$0 = null;
        int incrementValue$1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int statePc = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    var11 = this.field_B;
                    var10 = var11;
                    var9 = var10;
                    var2 = var9;
                    if (var9 == null) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((var11.length ^ -1) > (this.field_C * this.field_zb ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    array$0 = new int[this.field_C * this.field_zb];
                    var2 = array$0;
                    this.field_B = array$0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = param0;
                    var4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_zb <= var4) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = (-1 + this.field_C) * this.field_zb + var4;
                    stackIn_15_0 = 0;
                    stackIn_7_0 = stackIn_15_0;
                    if (var8 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var6 ^ -1) <= (this.field_C ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    incrementValue$1 = var3;
                    var3++;
                    this.field_B[var5] = this.field_T[incrementValue$1];
                    var5 = var5 - this.field_zb;
                    var6++;
                    if (var8 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var8 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4++;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4 = -this.field_o + -this.field_zb + (this.field_C - -this.field_db) >> -1674843007;
                    this.field_q = this.field_q + var4;
                    var5 = this.field_o + this.field_db + (-this.field_C + this.field_zb) >> -212989087;
                    this.field_L = this.field_L + var5;
                    var3 = this.field_C;
                    this.field_C = this.field_zb;
                    this.field_zb = var3;
                    this.field_B = this.field_T;
                    this.field_T = var2;
                    stackIn_15_0 = this.c((byte) -117) ? 1 : 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_ab = this.field_ab - 1;
                    var3 = this.field_db;
                    this.field_db = this.field_o;
                    this.field_o = -var3;
                    this.d(30968);
                    var3 = 0;
                    this.h(param0 ^ -1);
                    var6 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_zb <= var6) {
                        statePc = 26;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_28_0 = 0;
                    stackIn_19_0 = stackIn_28_0;
                    if (var8 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7 = stackIn_19_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var7 >= this.field_C) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_tb[var3] = 0;
                    this.field_b[var3] = 8 * (-1 + -(var7 * 2) + this.field_db + this.field_C) / this.field_C;
                    var3++;
                    var7++;
                    if (var8 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var8 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var6++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
                    return true;
                }
                case 27: {
                    this.field_T = this.field_B;
                    this.field_zb = this.field_C;
                    this.field_B = var2;
                    this.field_L = this.field_L - var5;
                    this.field_q = this.field_q - var4;
                    this.field_C = var3;
                    return false;
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        if (0 != this.field_C) {
            if (!(this.field_S)) {
                var4 = param2 + -this.field_q;
                var5 = -this.field_L + param0;
                if (-1 >= (var4 ^ -1) && -1 >= (var5 ^ -1) && (this.field_C ^ -1) < (var4 ^ -1)) {
                    if ((var5 ^ -1) <= (this.field_zb ^ -1)) {
                        var4 = 119 / ((45 - param1) / 37);
                        return 0;
                    }
                    var6 = var5 * this.field_C + var4;
                    if (this.field_T[var6] != 0) {
                        return this.field_tb[var6];
                    }
                }
            }
        }
        var4 = 119 / ((45 - param1) / 37);
        return 0;
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    var4 = 0;
                    var5 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var5 >= param1) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6 = this.field_w[var5];
                    var4 = var4 + var6 % this.field_O;
                    var5++;
                    if (var7 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param2 > 49) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    discarded$1 = this.a((byte) -117);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return 128 + var4 * 256 / (-param0 + param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int r(int param0) {
        if (param0 != 3837) {
            return -4;
        }
        if (0 > this.field_L) {
            return this.field_L;
        }
        return 0;
    }

    private final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    this.field_L = this.field_L + 1;
                    if (this.c((byte) -117)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_L = this.field_L - 1;
                    return true;
                }
                case 3: {
                    this.d(30968);
                    if (!param1) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = this.a((byte) 103);
                    if (var3 == 1) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ge.a(this.field_lb, this.field_k / 4, (byte) 127, pg.field_d);
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ge.a(this.field_lb, this.field_k / 8, (byte) 127, client.field_F);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_zb * this.field_C <= var3) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_tb[var3] = 0;
                    this.field_b[var3] = 8;
                    var3++;
                    if (var4 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param0 < -27) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.a(-71, (byte) 28, false);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    var2 = 0;
                    var3 = this.field_q + this.field_L * this.field_O;
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var4 ^ -1) <= (this.field_zb ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_22_0 = 0;
                    stackIn_3_0 = stackIn_22_0;
                    if (var6 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_C ^ -1) >= (var5 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_20_0 = this.field_T[var2];
                    stackIn_6_0 = stackIn_20_0;
                    if (var6 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((this.field_q - -var5 ^ -1) > -1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((this.field_O ^ -1) >= (this.field_q + var5 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return true;
                }
                case 12: {
                    if (this.field_L + var4 < this.field_a) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return true;
                }
                case 14: {
                    if ((var4 + this.field_L ^ -1) > -1) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 != (this.field_P[var3] ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return true;
                }
                case 18: {
                    var2++;
                    var3++;
                    var5++;
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = var3 + (this.field_O - this.field_C);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var3 = stackIn_20_0;
                    var4++;
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = param0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 == -117) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return true;
                }
                case 24: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        if (param1 <= 102) {
            return -33;
        }
        if (this.field_N != null) {
            var5 = -this.field_ob + param0;
            var6 = -this.field_E + param2;
            if ((var5 ^ -1) <= -1 && (var6 ^ -1) <= -1 && var5 < this.field_V && var6 < this.field_h) {
                var7 = this.field_N[var6 * this.field_V + var5];
                if (!(-1 == (var7 ^ -1))) {
                    var4 = this.field_mb;
                }
            }
        }
        return var4;
    }

    final void a(int param0, byte param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    var4 = 0;
                    var5 = -97 % ((83 - param1) / 37);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_C * this.field_zb ^ -1) >= (var4 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_7_0 = -1;
                    stackIn_3_0 = stackIn_7_0;
                    stackIn_7_1 = this.field_T[var4] ^ -1;
                    stackIn_3_1 = stackIn_7_1;
                    if (var10 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_qb = this.field_qb + 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4++;
                    if (var10 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_Z = param0;
                    stackIn_7_0 = this.field_z;
                    stackIn_7_1 = this.field_L;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 <= stackIn_7_1) {
                        statePc = 35;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_jb = this.field_jb - 1;
                    if (!param2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_jb > 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.k(-9897);
                    return;
                }
                case 12: {
                    this.field_E = this.field_L;
                    this.field_V = this.field_C;
                    this.field_ob = this.field_q;
                    this.field_h = this.field_zb;
                    var4 = this.field_V * this.field_h;
                    this.field_N = new int[var4];
                    var5 = var4;
                    var6 = -1 + (this.field_L + this.field_zb);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = this.field_L;
                    stackIn_14_1 = var6;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 > stackIn_14_1) {
                        statePc = 33;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_34_0 = -1 + (this.field_q - -this.field_C);
                    stackIn_16_0 = stackIn_34_0;
                    if (var10 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((this.field_q ^ -1) < (var7 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5--;
                    var8 = this.field_T[var5];
                    stackIn_14_0 = 24 & var8;
                    stackIn_19_0 = stackIn_14_0;
                    stackIn_14_1 = 16;
                    stackIn_19_1 = stackIn_14_1;
                    if (var10 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 == stackIn_19_1) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (24 == (var8 & 24)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_N[var5] = var8;
                    statePc = 31;
                    continue stateLoop;
                }
                case 22: {
                    var9 = var6;
                    if (var9 >= this.field_z) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var9 = this.field_z;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((this.field_a ^ -1) >= (var9 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (-1 != (this.field_P[var7 + this.field_O * var9] ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_P[var7 + this.field_O * var9] = 32 + var8;
                    if (16 != (var8 & 24)) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (this.field_rb == null) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    fb.field_e = fb.field_e + 25;
                    he.field_ab = he.field_ab + 25;
                    this.field_x = this.field_x + 25;
                    if (var10 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_N[var5] = var8;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var7--;
                    if (var10 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var6--;
                    if (var10 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_mb = 1;
                    stackIn_34_0 = this.field_lb;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    ge.a(stackIn_34_0, this.field_k / 2, (byte) 127, ul.field_i);
                    if (var10 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var4 = 0;
                    var5 = this.field_L * this.field_O + this.field_q;
                    var6 = 0;
                    var7 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((var7 ^ -1) <= (this.field_zb ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_59_0 = 0;
                    stackIn_38_0 = stackIn_59_0;
                    if (var10 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var8 = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if ((var8 ^ -1) <= (this.field_C ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = this.field_T[var4];
                    stackIn_57_0 = -1;
                    stackIn_41_0 = stackIn_57_0;
                    stackIn_57_1 = var9 ^ -1;
                    stackIn_41_1 = stackIn_57_1;
                    if (var10 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 != stackIn_41_1) {
                        statePc = 43;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((24 & var9) == 16) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var7 ^ -1) == -1) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (-1 == (this.field_T[-this.field_C + var4] ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var9 = var9 | 32;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    this.field_P[var5] = var9;
                    if ((24 & var9) != 16) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (this.field_rb != null) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_x = this.field_x + 25;
                    fb.field_e = fb.field_e + 25;
                    he.field_ab = he.field_ab + 25;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (8 == (24 & var9)) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var6++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var5++;
                    var4++;
                    var8++;
                    if (var10 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = var5;
                    stackIn_57_1 = this.field_O - this.field_C;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var5 = stackIn_57_0 + stackIn_57_1;
                    var7++;
                    if (var10 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 < var6) {
                        statePc = 61;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 4) / 8;
                    if ((var7 ^ -1) >= (this.field_k ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var7 = this.field_k;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    ge.a(this.field_lb, var7, (byte) 127, fh.field_c);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    this.field_p = 0;
                    this.field_S = true;
                    this.field_Bb = false;
                    this.field_nb = 0;
                    this.field_K = 0;
                    this.field_C = 0;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(mm param0, boolean param1, mm param2, int param3) {
        try {
            rk.field_R = param2;
            om.field_a = param3;
            bg.field_g = param0;
            pj.a(31004, hk.field_j / 2, hk.field_i / 2);
            s.a(param2.field_C, param0.field_K + param0.field_C, (byte) -91, param0.field_C, param2.field_C + param2.field_K);
            if (!param1) {
                field_i = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "lk.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= param0) {
                break L2;
              } else {
                var6 = this.field_w[var5];
                stackIn_11_0 = var6 ^ -1;

                stackIn_11_1 = this.field_O ^ -1;

                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_11_0 > stackIn_11_1) {
                      var3 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((this.field_O * (this.field_a - 1) ^ -1) >= (var6 ^ -1)) {
                      var4 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_11_0 = param1;
            stackIn_11_1 = -1;
            break L1;
          }
          if (stackIn_11_0 == stackIn_11_1) {
            L5: {
              L6: {
                if (var3 == 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    break L6;
                  } else {
                    stackIn_17_0 = 1;
                    break L5;
                  }
                }
              }
              stackIn_17_0 = 0;
              break L5;
            }
            return stackIn_17_0 != 0;
          } else {
            return true;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_5_0 = false;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        boolean stackOut_4_0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0 == 30000) {
            break L0;
          } else {
            this.field_O = -79;
            break L0;
          }
        }
        this.field_e = param1;
        L1: while (true) {
          L2: {
            L3: {
              if ((param1 ^ -1) != -1) {
                break L3;
              } else {
                stackOut_4_0 = this.field_y;
                stackIn_14_0 = stackOut_4_0 ? 1 : 0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0) {
                      break L4;
                    } else {
                      L5: {
                        stackIn_8_0 = this;

                        stackIn_8_1 = -126;

                        if (0 != param2) {
                          stackIn_9_0 = this;
                          stackIn_9_1 = stackIn_8_1;
                          stackIn_9_2 = 0;
                          break L5;
                        } else {
                          stackIn_9_0 = this;
                          stackIn_9_1 = stackIn_8_1;
                          stackIn_9_2 = 1;
                          break L5;
                        }
                      }
                      L6: {
                        if (this.a((byte) stackIn_9_1, stackIn_9_2 != 0)) {
                          break L6;
                        } else {
                          param2++;
                          param1 = this.field_g;
                          this.field_e = this.field_g;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_e = 20;
                      this.field_y = true;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_Bb = true;
                  break L3;
                }
              }
            }
            stackIn_14_0 = this.field_g ^ -1;
            break L2;
          }
          L7: {
            if (stackIn_14_0 != -1) {
              break L7;
            } else {
              if (-1 > (param2 ^ -1)) {
                L8: {
                  var4 = ((int)((double)this.field_k * Math.sqrt((double)(this.field_a - -param2) / ((double)this.field_a * 2.0))) + 4) / 8;
                  if (var4 > this.field_k) {
                    var4 = this.field_k;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ge.a(this.field_lb, var4, (byte) 127, fh.field_c);
                break L7;
              } else {
                break L7;
              }
            }
          }
          return;
        }
    }

    final boolean e(int param0) {
        int var2 = -106 % ((param0 - -22) / 51);
        if (this.field_t > 0) {
            if (!(-1 != (this.field_X[0].field_l ^ -1))) {
                return true;
            }
        }
        if (this.field_pb >= 18) {
            return true;
        }
        return false;
    }

    private final boolean a(int param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_26_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    if (4 == param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    if (param0 < -45) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    discarded$1 = this.a(-31, -66, (byte) 71, -102);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) <= -5) {
                        statePc = 25;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = this.field_w[var3];
                    var5 = var4 % this.field_O;
                    var6 = var4 / this.field_O;
                    stackIn_26_0 = 0;
                    stackIn_7_0 = stackIn_26_0;
                    if (var11 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var7 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (4 <= var7) {
                        statePc = 23;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_26_0 = var3 ^ -1;
                    stackIn_10_0 = stackIn_26_0;
                    if (var11 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 != (var7 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8 = this.field_w[var7];
                    var9 = var8 % this.field_O;
                    var10 = var8 / this.field_O;
                    var9 = var9 - var5;
                    var10 = var10 - var6;
                    if (0 != var9) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var10 == -1) {
                        statePc = 22;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var10 != 1) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (0 != var10) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == -1) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-2 != (var9 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var7++;
                    if (var11 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return true;
                }
                case 24: {
                    var3++;
                    if (var11 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(lk param0, oi param1, int param2, int param3, int param4) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        rf var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != null) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var6_int = -1 + this.field_O;
                        var7 = -1 + this.field_a;
                        var8 = param3;
                        var9 = 0;
                        var10 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param4 <= var10) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var11 = this.field_w[var10];
                        var12 = var11 % this.field_O;
                        var13 = var11 / this.field_O;
                        stackIn_21_0 = var12;
                        stackIn_8_0 = stackIn_21_0;
                        stackIn_21_1 = var6_int;
                        stackIn_8_1 = stackIn_21_1;
                        if (var19 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 < stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6_int = var12;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var12 ^ -1) < (var8 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = var12;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 >= var13) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = var13;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 < var7) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = var13;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10++;
                        if (var19 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = -var6_int + 1 + var8;
                        var11 = var9 - -1 - var7;
                        stackIn_21_0 = var10;
                        stackIn_21_1 = var11;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = stackIn_21_0 * stackIn_21_1;
                        fieldTemp$0 = this.field_fb;
                        this.field_fb = this.field_fb + 1;
                        var13 = fieldTemp$0;
                        var14 = null;
                        if (param1 == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var14 = param1.a(false, var13);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var14 != null) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var20 = new rf(var13);
                        var14 = var20;
                        fieldTemp$1 = this.field_p;
                        this.field_p = this.field_p + 1;
                        var20.field_m = fieldTemp$1;
                        if (param1 != null) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param1.a(var20, 0);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((rf) (var14)).field_b = var10;
                        ((rf) (var14)).field_c = new byte[var12];
                        ((rf) (var14)).field_n = var11;
                        var15 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var15 ^ -1) <= (var12 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((rf) (var14)).field_c[var15] = (byte) 0;
                        var15++;
                        if (var19 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var19 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var15 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var15 >= param4) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var16 = this.field_w[var15];
                        var17 = -var6_int + var16 % this.field_O;
                        var18 = var16 / this.field_O - var7;
                        ((rf) (var14)).field_c[var17 + var18 * var10] = (byte)param2;
                        var15++;
                        if (var19 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var19 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param0 == null) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param0.a((rf) (var14), (byte) -128);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var6);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("lk.T(");
                    stackIn_42_1 = stackIn_43_1;
                    if (param0 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
                    stackIn_45_1 = stackIn_46_1;
                    if (param1 == null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    throw dh.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int discarded$1 = 0;
        L0: {
          if (param1 == 2113050941) {
            break L0;
          } else {
            discarded$1 = this.a(80, 86, (byte) -26, -11);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2) {
              break L2;
            } else {
              this.field_g = mn.field_b[param0];
              if (!client.field_A) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_g = pn.field_eb[param0];
          break L1;
        }
    }

    private final void c(boolean param0) {
        boolean discarded$0 = false;
        if (!(!this.t(0))) {
            return;
        }
        if (param0) {
            discarded$0 = this.c(61, 75);
        }
        if (!(-1 == ((this.field_db | this.field_o) ^ -1))) {
            this.field_db = -this.field_db;
            this.field_o = -this.field_o;
            if (!(!this.t(0))) {
                return;
            }
            this.field_db = -this.field_db;
            this.field_o = -this.field_o;
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int incrementValue$2 = 0;
        int discarded$3 = 0;
        int var5;
        L0: {
          L1: {
            var5 = this.field_P[param1];
            if ((param3 ^ -1) == (-1879048193 & var5 ^ -1)) {
              break L1;
            } else {
              this.b(7 & param3, param1, false);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-1879048193 >= (var5 & 1879048192 ^ -1)) {
              break L2;
            } else {
              var5 = var5 + 268435456;
              break L2;
            }
          }
          incrementValue$2 = param0;
          param0++;
          this.field_w[incrementValue$2] = param1;
          this.field_P[param1] = var5 + -2147483648;
          break L0;
        }
        L3: {
          if (param2 == -44) {
            break L3;
          } else {
            discarded$3 = this.a(true, 26, -7, (lk) null, true, 84, -39, 24, (oi) null, false, (byte) -94);
            break L3;
          }
        }
        return param0;
    }

    private final void j(int param0) {
        L0: {
          L1: {
            this.field_q = this.field_q + 1;
            if (this.c((byte) -117)) {
              break L1;
            } else {
              this.h(-1);
              ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_q = this.field_q - 1;
          break L0;
        }
        L2: {
          if (param0 == 4) {
            break L2;
          } else {
            this.field_mb = -42;
            break L2;
          }
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var4 = 0;
          var5 = param2;
          if (param0) {
            break L0;
          } else {
            this.field_N = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if ((var5 ^ -1) <= (param1 ^ -1)) {
                break L3;
              } else {
                var6 = this.field_w[var5];
                var7 = var6 / this.field_O;
                stackIn_10_0 = gg.field_B ^ -1;

                stackIn_10_1 = var7 ^ -1;

                if (var8 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_10_0 >= stackIn_10_1) {
                      break L4;
                    } else {
                      gg.field_B = var7;
                      break L4;
                    }
                  }
                  L5: {
                    if (gi.field_a >= var7) {
                      break L5;
                    } else {
                      gi.field_a = var7;
                      break L5;
                    }
                  }
                  var4 = var4 + var7;
                  var5++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackIn_10_0 = 128;
            stackIn_10_1 = -(var4 * 256 / (param1 + -param2));
            break L2;
          }
          return stackIn_10_0 - stackIn_10_1;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            this.field_A = -70;
        }
        return this.field_j + (this.field_ub + this.field_hb) + (this.field_H + this.field_x) - (-this.field_bb - this.field_f);
    }

    final int m(int param0) {
        int var2 = 0;
        if (1 <= this.field_c) {
            var2++;
        }
        int var3 = this.field_u.a(79, var2 + this.field_d);
        int var4 = this.field_u.a(107, this.field_d - -var2);
        if (param0 != 26580) {
            return -69;
        }
        if (this.field_d == var3) {
            var3 = 7;
        }
        if (this.field_d == var4) {
            var4 = 7;
        }
        return var4 + (var3 << -793988540);
    }

    final void s(int param0) {
        rf discarded$0 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_126_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rf var4_ref_rf = null;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ei var11 = null;
        ei var13 = null;
        int[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    if (this.field_S) {
                        statePc = 75;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = 0;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_zb ^ -1;
                    stackIn_3_1 = var3 ^ -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_17_0 = 0;
                    stackIn_5_0 = stackIn_17_0;
                    if (var10 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_C <= var4) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5_int = this.field_tb[var2];
                    var6 = this.field_b[var2];
                    stackIn_3_0 = var5_int ^ -1;
                    stackIn_8_0 = stackIn_3_0;
                    stackIn_3_1 = -1;
                    stackIn_8_1 = stackIn_3_1;
                    if (var10 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > stackIn_8_1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = var6 + (-var5_int >> 1589558273);
                    if (var10 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var6 = var6 - (var5_int >> -2057940319);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5_int = var5_int + var6;
                    if (0 <= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5_int = var5_int - (var5_int >> -1962291932);
                    if (var10 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5_int = var5_int + (-var5_int >> 521635204);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    this.field_tb[var2] = var5_int;
                    this.field_b[var2] = var6;
                    var2++;
                    var4++;
                    if (var10 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3++;
                    if (var10 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3 = stackIn_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = var3 ^ -1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 <= (this.field_C ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var4 = -1073741824;
                    stackIn_78_0 = 0;
                    stackIn_21_0 = stackIn_78_0;
                    if (var10 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5_int = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var5_int ^ -1) <= (this.field_zb ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = var3 + var5_int * this.field_C;
                    var6 = this.field_q + var3;
                    stackIn_48_0 = var6 ^ -1;
                    stackIn_24_0 = stackIn_48_0;
                    stackIn_48_1 = -1;
                    stackIn_24_1 = stackIn_48_1;
                    if (var10 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 > stackIn_24_1) {
                        statePc = 37;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((this.field_O ^ -1) < (var6 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = this.field_L - (-var5_int + 1);
                    var8 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (-1 < (var7 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_38_0 = var4;
                    stackIn_30_0 = stackIn_38_0;
                    stackIn_38_1 = var8;
                    stackIn_30_1 = stackIn_38_1;
                    if (var10 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 >= stackIn_30_1) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var7 >= this.field_a) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (0 != this.field_P[var6 + var7 * this.field_O]) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var4 = var8;
                    if (var10 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var7--;
                    var8 -= 80;
                    if (var10 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var7 = this.field_tb[var2];
                    var8 = this.field_b[var2];
                    stackIn_38_0 = var7 ^ -1;
                    stackIn_38_1 = var4 ^ -1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (stackIn_38_0 > stackIn_38_1) {
                        statePc = 40;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var7 = var4;
                    if (0 > var8) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var8 = -var8;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    this.field_tb[var2] = var7;
                    this.field_b[var2] = var8;
                    var4 -= 80;
                    if (-1 == (this.field_T[var2] ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var4 ^ -1) <= (var7 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var4 = var7;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var5_int++;
                    if (var10 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var5_int = 1073741823;
                    stackIn_48_0 = -1;
                    stackIn_48_1 = this.field_zb;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var6 = stackIn_48_0 + stackIn_48_1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (0 > var6) {
                        statePc = 74;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var2 = this.field_C * var6 - -var3;
                    var7 = var3 + this.field_q;
                    stackIn_19_0 = var7;
                    stackIn_51_0 = stackIn_19_0;
                    if (var10 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 < 0) {
                        statePc = 64;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((this.field_O ^ -1) < (var7 ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var8 = this.field_L - -var6 - -1;
                    var9 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var5_int ^ -1) >= (var9 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_65_0 = var8 ^ -1;
                    stackIn_57_0 = stackIn_65_0;
                    stackIn_65_1 = this.field_a ^ -1;
                    stackIn_57_1 = stackIn_65_1;
                    if (var10 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 <= stackIn_57_1) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (-1 < (var8 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (this.field_P[var7 + this.field_O * var8] != 0) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var5_int = var9;
                    if (var10 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var9 += 80;
                    var8++;
                    if (var10 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var8 = this.field_tb[var2];
                    var9 = this.field_b[var2];
                    stackIn_65_0 = var8 ^ -1;
                    stackIn_65_1 = var5_int ^ -1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 < stackIn_65_1) {
                        statePc = 67;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (-1 <= (var9 ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var9 = -var9;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var8 = var5_int;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    this.field_tb[var2] = var8;
                    this.field_b[var2] = var9;
                    var5_int += 80;
                    if ((this.field_T[var2] ^ -1) == -1) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var5_int <= var8) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var5_int = var8;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var6--;
                    if (var10 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var3++;
                    if (var10 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (this.field_vb != null) {
                        statePc = 77;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 77: {
                    this.field_R = this.field_R + 1;
                    stackIn_78_0 = 100;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0 > this.field_R) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    this.field_vb = null;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var2 = 1;
                    var3 = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if ((this.field_t ^ -1) >= (var3 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var4_ref_rf = this.field_X[var3];
                    if (var10 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (null != var4_ref_rf.field_c) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var4_ref_rf.field_l <= 18) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var2 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (var2 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (0 >= var4_ref_rf.field_l) {
                        statePc = 98;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (18 != var4_ref_rf.field_l) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    this.b(false);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var4_ref_rf.field_l = var4_ref_rf.field_l - 1;
                    var5_int = var4_ref_rf.field_m - -1;
                    if (var4_ref_rf.field_l != 12) {
                        statePc = 98;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (-6 >= (var5_int ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_vb = cm.a((byte) 105, uj.field_b, new String[]{Integer.toString(var5_int)});
                    this.field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
                    this.field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
                    this.field_R = 0;
                    var16 = vl.field_G;
                    var7 = var5_int / 10;
                    if ((var16.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var7 = var16.length + -1;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    this.field_xb = var16[var7];
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if ((var4_ref_rf.field_e ^ -1) >= -1) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var4_ref_rf.field_e = var4_ref_rf.field_e + 1;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var3++;
                    if (var10 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (param0 == -21142) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.h(13);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (!this.e(-124)) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = 1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var3 = stackIn_106_0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (this.field_t <= 0) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_115_0 = -14;
                    stackIn_109_0 = stackIn_115_0;
                    stackIn_115_1 = this.field_X[0].field_e ^ -1;
                    stackIn_109_1 = stackIn_115_1;
                    if (var10 != 0) {
                        statePc = 115;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 < stackIn_109_1) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    discarded$0 = this.p(127);
                    if (var10 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (this.field_cb == null) {
                        statePc = 123;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (this.field_cb.c((byte) 70) == null) {
                        statePc = 123;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = -1;
                    stackIn_115_1 = this.field_pb ^ -1;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (stackIn_115_0 == stackIn_115_1) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.b(false);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (-323 != (this.field_pb ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.c(0);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    this.field_pb = this.field_pb + 1;
                    if (335 == this.field_pb) {
                        statePc = 122;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_pb = 0;
                    this.field_cb.a(param0 + 21146);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (!this.e(param0 ^ 21190)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = 1;
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var4 = stackIn_126_0;
                    if (var2 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (18 >= this.field_wb) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.field_wb = this.field_wb - 1;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (var3 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (var4 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var4 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 134: {
                    ah.field_b[this.field_Q] = true;
                    var5 = ik.field_c[this.field_Q];
                    if (var5 == null) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var5.b(en.field_o / 50, pb.field_d * this.field_J, this.field_sb << -2127177498);
                    if (var10 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var6 = 100 + rd.a((byte) 16, 4, this.field_Q);
                    var11 = ei.c(kf.field_P, var6, pb.field_d * this.field_J, this.field_sb << 1719062758);
                    var13 = var11;
                    var13.f(-1);
                    dg.field_c.a(var11);
                    ik.field_c[this.field_Q] = var11;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lk(boolean param0, int param1, int param2, int param3, int param4) {
        L0: {
          L1: {
            this.field_k = 128;
            this.field_r = false;
            this.field_j = 0;
            this.field_wb = 18;
            this.field_U = -1;
            this.field_K = 0;
            this.field_vb = null;
            this.field_X = new rf[1];
            this.field_sb = 48;
            this.field_G = 0;
            this.field_lb = 128;
            this.field_Y = false;
            this.field_R = 0;
            this.field_S = false;
            this.field_x = 0;
            this.field_f = 0;
            this.field_l = 0;
            this.field_ib = 0;
            this.field_u = null;
            this.field_Q = -1;
            this.field_v = false;
            this.field_J = 128;
            this.field_hb = 0;
            this.field_ub = 0;
            this.field_s = false;
            this.field_Bb = false;
            this.field_bb = 0;
            this.field_H = 0;
            this.field_jb = 3;
            this.field_pb = 0;
            if (!param0) {
              break L1;
            } else {
              this.field_O = 12;
              this.field_a = 27;
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_a = 18;
          this.field_O = 8;
          break L0;
        }
        this.field_d = param3;
        this.field_w = new int[this.field_O * this.field_a];
        this.field_D = param2;
        this.field_c = param4;
        this.field_P = new int[this.field_O * this.field_a];
        this.a(param1, 2113050941, false);
        this.field_t = 0;
        this.field_m = 0;
    }

    static {
        field_I = 3;
        field_i = "There are no valid types of game that match your preferences.";
    }
}
