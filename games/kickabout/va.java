/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va extends hs {
    private boolean field_B;
    private int field_z;
    static String[][] field_y;
    private ut[] field_C;
    static hd field_w;
    static long field_o;
    private int field_G;
    private int field_D;
    static String field_K;
    private boolean field_k;
    static int field_J;
    private boolean field_u;
    private byte[] field_t;
    private int[] field_v;
    private boolean field_m;
    private boolean field_L;
    private tf field_r;
    private int field_H;
    static String field_F;
    private int field_s;
    private int field_I;
    boolean field_l;
    private boolean field_j;
    private int field_q;
    private boolean field_E;
    private boolean field_n;
    private boolean field_x;
    private int field_p;

    private final void b(int param0, int param1, int param2) {
        int var8 = 0;
        int var4;
        int var5;
        int var6;
        nl[] var7;
        nl var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = Kickabout.field_G;
        var4 = this.field_a.field_g[this.field_g].field_p;
        var5 = -1;
        var6 = 2147483647;
        var7 = this.field_a.field_P[var4];
        for (var8 = 1; var7.length > var8; var8++) {
          var9 = var7[var8];
          var10 = -param1 + var9.f(-125);
          var11 = -param0 + var9.a(true);
          var12 = var10 * var10 + var11 * var11;
          if (this.field_a.a((byte) 6, var4, var8) >= 0) {
            var12 = var12 << 1;
          }
          if (var12 < var6) {
            var6 = var12;
            var5 = var8;
          }
        }
        this.g(var5 + param2, -1);
    }

    private final int a(byte param0, int param1) {
        if (param0 >= -56) {
          return -33;
        }
        return dq.$cfr$intArgs$a$7f8aad568c81(-61, param1, ru.field_l);
    }

    private final void a(boolean param0, int param1, int param2) {
        boolean stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        boolean stackIn_12_3;
        boolean stackIn_13_4;
        int var5;
        var5 = Kickabout.field_G;
        if (this.field_a.field_X.field_m >= 40) {
          return;
        }
        if (this.field_a.field_V.field_m >= 0 &&
          0 <= this.field_s &&
          this.field_a.field_V.field_m != this.field_s) {
          if (1 == rm.field_C ||
            rm.field_C == 2) {
            stackIn_12_0 = false;
            stackIn_12_1 = -1;
            stackIn_12_2 = -79;
            stackIn_12_3 = param0;
            stackIn_13_4 = !(param0);
            gt.$cfr$intArgs$a$60f25194e713(stackIn_12_0, stackIn_12_1, stackIn_12_2, fd.a(stackIn_12_3, stackIn_13_4, (byte) 97, false, false));
          }
          if (rm.field_C == 1) {
            if (!param0) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, 81, 3);
            } else {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, -111, 4);
            }
          }
          if (rm.field_C == 2) {
            if (!param0) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, -99, 24);
            } else {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, 104, 25);
            }
          }
          if (rm.field_C == 3) {
            if (!param0) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, -70, 30);
            } else {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, 79, 31);
            }
          }
        }
        if (param1 != 3) {
          return;
        }
        if (this.field_s == -1 &&
          1 - param2 == this.field_a.field_V.field_m &&
          param2 == this.field_D) {
          if (rm.field_C == 1) {
            gt.$cfr$intArgs$a$60f25194e713(false, -1, 91, 5);
          }
          if (2 == rm.field_C) {
            gt.$cfr$intArgs$a$60f25194e713(false, -1, 91, 26);
          }
          if (rm.field_C == 3) {
            gt.$cfr$intArgs$a$60f25194e713(false, -1, 96, 32);
          }
        }
    }

    private final int h(int param0) {
        if (param0 != -41) {
          this.field_m = false;
        }
        return this.a((byte) 13) ? this.field_g : this.field_a.b((byte) -69, this.field_h);
    }

    private final void l(int param0) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_1 = 0;
        boolean stackIn_61_1 = false;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_116_0 = 0;
        boolean stackIn_116_1 = false;
        boolean stackIn_116_2 = false;
        boolean stackIn_117_3 = false;
        boolean stackIn_122_0 = false;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_123_3;
        boolean stackIn_128_0 = false;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_129_3;
        boolean stackIn_134_0 = false;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_135_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        if (!this.field_E) {
          gs.a(0);
          this.field_E = true;
        }
        if (40 > this.field_a.field_X.field_m) {
          this.field_p = this.field_p - 1;
        }
        if (this.field_a.field_X.field_m != 0) {
          this.field_B = true;
        } else {
          if (this.field_B) {
            sp.c(34, 75);
            this.field_B = false;
          }
        }
        if (this.field_f &&
          this.field_a.field_v == this.field_a.field_O) {
          sp.c(34, param0 - 2004);
        }
        if (this.field_f &&
          this.field_a.field_v <= 100 &&
          !this.field_j) {
          this.field_j = true;
          sp.c(33, 98);
        }
        if (-2 != this.field_g) {
          stackIn_25_0 = this.field_a.field_g[this.field_g].field_p;
        } else {
          stackIn_25_0 = 0;
        }
        var2 = stackIn_25_0;
        stackIn_28_0 = (this.field_a.field_V.field_m != var2) ? 0 : 1;
        var3 = stackIn_28_0;
        stackIn_30_0 = 44040192;
        stackIn_31_1 = (var2 == 0) ? -655360 : 655360;
        stackIn_34_0 = (stackIn_30_0 + stackIn_31_1 <= this.field_a.field_V.field_p) ? 0 : 1;
        var4 = stackIn_34_0;
        if (var2 == 0 &&
          var4 == 0) {
          stackIn_44_0 = 1;
        } else {
          if (1 == var2) {
            stackIn_44_0 = (var4 != 0) ? 1 : 0;
          } else {
            stackIn_44_0 = 0;
          }
        }
        var5 = stackIn_44_0;
        stackIn_47_0 = (var5 != 0) ? 0 : 1;
        var6 = stackIn_47_0;
        if (param0 != 2115) {
          return;
        }
        stackIn_52_0 = (var6 != 0) ? 0 : 1;
        stackIn_55_1 = (this.field_L) ? 0 : 1;
        if (stackIn_52_0 != stackIn_55_1 &&
          this.field_a.field_X.field_m < 40) {
          stackIn_61_1 = (var6 != 0);
          this.field_L = stackIn_61_1;
          so.a(rm.field_C, vi.field_n, true, this.field_L);
        }
        if (vi.field_n) {
          if (rm.field_C == 1 ||
            2 == rm.field_C) {
            this.a(var3 != 0, 4, var5 != 0);
          }
          if (3 == rm.field_C) {
            this.o(-23079);
          }
        }
        if (this.field_a.field_V.field_m == -1 &&
          this.field_s >= 0 ||
          !(0 > this.field_a.field_V.field_j)) {
          if (Math.abs(this.field_a.field_V.field_n >> 16) <= 4) {
            if (this.field_a.field_V.e(-118) > 6553600) {
              sp.c(37, -113);
            } else {
              sp.c(36, param0 ^ -2087);
            }
          } else {
            sp.c(35, param0 - 2024);
          }
        }
        if (vi.field_n) {
          this.a(var3 != 0, param0 - 2112, var2);
        }
        if (vi.field_n && (this.field_a.field_V.field_y ||
          this.field_a.field_V.field_x)) {
          if (24248320 < this.field_a.field_V.field_t) {
            if (this.field_a.field_V.field_t < 34603008) {
              stackIn_94_0 = (this.field_a.field_V.field_v < 2359296) ? 1 : 0;
            } else {
              stackIn_94_0 = 0;
            }
          } else {
            stackIn_94_0 = 0;
          }
          var7 = stackIn_94_0;
          if (this.field_a.field_V.field_t > 19573418) {
            stackIn_100_0 = (39146837 <= this.field_a.field_V.field_t) ? 0 : 1;
          } else {
            stackIn_100_0 = 0;
          }
          var8 = stackIn_100_0;
          if (var5 == 0 &&
            var8 != 0 &&
            var7 == 0) {
            if (rm.field_C == 1) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, 122, 5);
            }
            if (rm.field_C == 2) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, -106, 26);
            }
            if (rm.field_C == 3) {
              gt.$cfr$intArgs$a$60f25194e713(false, -1, -75, 32);
            }
          }
        }
        if (this.field_a.field_X.field_j[0] != this.field_v[0] ||
          this.field_a.field_X.field_j[1] != this.field_v[1]) {
          ji.k(param0 - 2115);
          stackIn_116_0 = rm.field_C;
          stackIn_116_1 = vi.field_n;
          stackIn_116_2 = true;
          stackIn_117_3 = (var5 == 0);
          so.a(stackIn_116_0, stackIn_116_1, stackIn_116_2, stackIn_117_3);
          if (vi.field_n) {
            if (rm.field_C == 1) {
              stackIn_122_0 = false;
              stackIn_122_1 = -1;
              stackIn_122_2 = -87;
              if (var5 != 0) {
                stackIn_123_3 = 3;
              } else {
                stackIn_123_3 = 23;
              }
              gt.$cfr$intArgs$a$60f25194e713(stackIn_122_0, stackIn_122_1, stackIn_122_2, stackIn_123_3);
            }
            if (2 == rm.field_C) {
              stackIn_128_0 = false;
              stackIn_128_1 = -1;
              stackIn_128_2 = 113;
              if (var5 != 0) {
                stackIn_129_3 = 24;
              } else {
                stackIn_129_3 = 27;
              }
              gt.$cfr$intArgs$a$60f25194e713(stackIn_128_0, stackIn_128_1, stackIn_128_2, stackIn_129_3);
            }
            if (rm.field_C == 3) {
              stackIn_134_0 = false;
              stackIn_134_1 = -1;
              stackIn_134_2 = -100;
              if (var5 != 0) {
                stackIn_135_3 = 30;
              } else {
                stackIn_135_3 = 43;
              }
              gt.$cfr$intArgs$a$60f25194e713(stackIn_134_0, stackIn_134_1, stackIn_134_2, stackIn_135_3);
            }
          }
        }
        this.field_v[0] = this.field_a.field_X.field_j[0];
        this.field_v[1] = this.field_a.field_X.field_j[1];
        if (this.field_a.field_V.field_m == 1 - this.field_D) {
          this.field_D = this.field_a.field_V.field_m;
        }
    }

    final boolean b(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 121 % ((17 - param0) / 35);
        stackIn_5_0 = (this.field_k) || (this.field_m);
        return stackIn_5_0;
    }

    final static ec f(int param0) {
        if (param0 != -1) {
          va.d((byte) -2);
        }
        return new ec(he.a(320), lj.a(false));
    }

    private final void c(int param0, int param1, int param2) {
        int var8;
        int stackIn_10_0 = 0;
        int var4;
        int var5;
        int var6;
        ki var7;
        var8 = Kickabout.field_G;
        while (true) {
          if (127 >= Math.abs(param0) &&
            Math.abs(param1) <= 127) {
            if (param2 != -1) {
              return;
            }
            var4 = (byte)param0;
            var5 = (byte)param1;
            if (this.field_a.c(this.field_g, -111)) {
              stackIn_10_0 = this.field_a.a((byte) 97, this.field_g).field_L;
            } else {
              stackIn_10_0 = 0;
            }
            var6 = stackIn_10_0;
            var7 = hw.a(this.field_g, var6, 85, (byte) var5, (byte) var4);
            this.a(false, var7);
            if (this.field_f) {
              or.field_d.b(71, (byte) 94);
              or.field_d.a(114, var6);
              or.field_d.a(111, var4);
              or.field_d.a(125, var5);
            }
            return;
          }
          param1 = param1 / 2;
          param0 = param0 / 2;
        }
    }

    final void m(int param0) {
        if (param0 > -77) {
          this.g(-34, -31);
        }
        this.a(this.field_a, this.field_f, 370);
        this.a((tf) null, (byte) -126);
    }

    private final void n(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        boolean[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        boolean[] var12;
        var11 = Kickabout.field_G;
        var12 = ne.field_G;
        var2 = var12;
        if (!var12[rb.field_Kb]) {
          stackIn_6_0 = (var12[98]) ? 1 : 0;
        } else {
          stackIn_6_0 = 1;
        }
        var3 = stackIn_6_0;
        if (!var12[uv.field_e]) {
          stackIn_12_0 = (var12[96]) ? 1 : 0;
        } else {
          stackIn_12_0 = 1;
        }
        var4 = stackIn_12_0;
        if (var12[oc.field_e]) {
          stackIn_18_0 = 1;
        } else {
          stackIn_18_0 = (var12[99]) ? 1 : 0;
        }
        var5 = stackIn_18_0;
        if (param0 >= -110) {
          this.field_s = -84;
        }
        if (!var12[pb.field_A]) {
          stackIn_26_0 = (var12[97]) ? 1 : 0;
        } else {
          stackIn_26_0 = 1;
        }
        boolean decompiledFrameRemainder0 = true;
        var6 = stackIn_26_0;
        if (!this.field_f &&
          ja.field_O) {
          if (!var12[rb.field_Kb] &&
            !var12[oc.field_e] &&
            !var12[uv.field_e] &&
            !var12[pb.field_A]) {
            if ((var12[98] ||
              var12[99] ||
              var12[96] ||
              var12[97])) {
              tq.$cfr$intArgs$a$7ffe4b125357(50, false);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            tq.$cfr$intArgs$a$7ffe4b125357(50, true);
          }
        }
        if (this.field_l) {
          if (this.a((byte) 13)) {
            if (ia.field_c) {
              var7 = var3;
              var3 = var5;
              var5 = var7;
              var7 = var4;
              var4 = var6;
              var6 = var7;
            }
            var7 = 0;
            if (var3 != 0) {
              var7 = var7 | 4;
            }
            if (var5 != 0) {
              var7 = var7 | 1;
            }
            if (var4 != 0) {
              var7 = var7 | 2;
            }
            if (var6 != 0) {
              var7 = var7 | 8;
            }
            if (this.field_H != var7 ||
              this.field_a.a((byte) -38, this.field_g).field_G != var7) {
              this.field_H = var7;
              this.b(false);
            }
          }
          if (var2[kq.field_Jb]) {
            this.field_q = this.field_q - 16;
            if (128 > this.field_q) {
              this.field_q = 128;
            }
          }
          if (var2[f.field_a]) {
            this.field_q = this.field_q + 16;
            if (this.field_q > 256) {
              this.field_q = 256;
            }
          }
        } else {
          L16: {
            var7 = 15;
            if ((var4 != 0 ||
              var6 != 0) && (var3 != 0 ||
              var5 != 0)) {
              var7 = var7 * 200;
              break L16;
            }
            var7 = var7 << 8;
          }
          var7 = var7 / hw.field_i;
          var8 = 0;
          var9 = 0;
          if (var4 != 0) {
            var8 = var8 - var7;
          }
          var10 = 0;
          if (var3 != 0) {
            var9 = var9 - var7;
          }
          if (var6 != 0) {
            var8 = var8 + var7;
          }
          if (var5 != 0) {
            var9 = var9 + var7;
          }
          if (var2[kq.field_Jb]) {
            var10 -= 16;
          }
          if (var2[f.field_a]) {
            var10 += 16;
          }
          sj.a((double)var9, (byte) 127, (double)var8, (double)var10);
        }
    }

    private final void i(int param0) {
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        int stackIn_22_0 = 0;
        boolean stackIn_58_1 = false;
        int var2;
        int var3;
        nl var4;
        int var5;
        int var2Lifetime1;
        var5 = Kickabout.field_G;
        if (kl.b(640) &&
          !this.b((byte) -65)) {
          return;
        }
        if (2 == ip.field_a) {
          this.field_m = true;
        }
        if (ip.field_a == 1) {
          this.field_k = true;
        }
        stackIn_10_1 = this.field_k;
        stackIn_11_2 = (vd.field_c == 1);
        this.field_k = stackIn_10_1 & stackIn_11_2;
        stackIn_13_1 = this.field_m;
        stackIn_14_2 = (vd.field_c == 2);
        this.field_m = stackIn_13_1 & stackIn_14_2;
        if (param0 != 16623) {
          this.field_n = true;
        }
        if (!this.a((byte) 13)) {
          if (2 == ip.field_a) {
            stackIn_58_1 = !(this.field_l);
            this.field_l = stackIn_58_1;
          }
        } else {
          if (this.field_l &&
            this.field_a.field_R[this.field_g].d(param0 ^ 19800)) {
            stackIn_22_0 = (!this.field_k) ? 0 : 1;
            var2 = stackIn_22_0;
            var3 = this.field_m ? 1 : 0;
            var4 = this.field_a.a((byte) 122, this.field_g);
            if (0 == this.field_I ||
              var2 != 0) {
              if (wt.field_x == -1 &&
                us.field_j == -1) {
                this.field_z = -1;
                this.field_G = -1;
              } else {
                this.field_z = ai.a(wt.field_x, 6784) - var4.f(-103);
                this.field_G = qj.a(-6779, us.field_j) - var4.a(true);
              }
            }
            if (var4.field_u == 1) {
              if (var2 == 0 &&
                var3 == 0) {
                this.c(this.field_z, this.field_G, -1);
              }
            } else {
              if (-1 != wt.field_x ||
                us.field_j != -1) {
                if (!this.field_a.c(this.field_g, -115)) {
                  if (var2 != 0 &&
                    var4.d((byte) 102)) {
                    this.c(this.field_z, this.field_G, -1);
                    this.field_k = false;
                  }
                  if (this.field_m) {
                    this.b(qj.a(-6779, us.field_j), ai.a(wt.field_x, 6784), 1);
                    this.field_m = false;
                  }
                } else {
                  if (var2 == 0) {
                    if (var3 != 0) {
                      this.g(7, -1);
                    }
                  } else {
                    this.g(6, param0 - 16624);
                  }
                }
                if (var2 == 0) {
                  this.field_I = 0;
                } else {
                  this.field_I = this.field_I + 1;
                }
              }
            }
          }
        }
        var2Lifetime1 = id.field_v;
        if (this.field_l) {
          if (var2Lifetime1 > 0) {
            this.field_q = this.field_q - 16;
            if (this.field_q < 128) {
              this.field_q = 128;
            }
          }
          if (var2Lifetime1 < 0) {
            this.field_q = this.field_q + 16;
            if (this.field_q > 256) {
              this.field_q = 256;
            }
          }
        } else {
          if (0 < var2Lifetime1) {
            sj.a(0.0, (byte) 127, 0.0, -16.0);
          }
          if (var2Lifetime1 < 0) {
            sj.a(0.0, (byte) 127, 0.0, 16.0);
          }
        }
    }

    final void a(tf param0, byte param1) {
        int var4_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ak var4 = null;
        int var5 = 0;
        int var3_intLifetime1;
        var5 = Kickabout.field_G;
        try {
          if (null == this.field_r) {
            this.field_r = new tf();
          } else {
            this.field_r.b(22997);
          }
          for (var3_int = 0; 2 > var3_int; var3_int++) {
            for (var4_int = 0; var4_int < 5; var4_int++) {
              this.field_r.a(lb.a((gm) (this.field_a.field_P[var3_int][var4_int]), 1), 3);
            }
          }
          this.field_r.a(mr.a((ob) (this.field_a.field_V), false), 3);
          this.field_r.a(re.a(true, 115), 3);
          var3_intLifetime1 = -88 / ((4 - param1) / 50);
          this.field_r.a(re.a(false, 92), 3);
          if (param0 != null) {
            var4 = (ak) (param0.g(24009));
            while (var4 != null) {
              var4.c((byte) -109);
              this.field_r.a(var4, 3);
              var4 = (ak) (param0.c(33));
            }
          }
          uc.a(this.field_r, -22488);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("va.NA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        wh var4 = null;
        if (this.field_p <= 0 &&
          this.field_a.field_X.field_m < 40 &&
          !vs.a(90, 28) &&
          !vs.a(117, 29)) {
          var2 = this.a((byte) -97, 2);
          var3 = 1 == var2 ? 1 + this.a((byte) -104, 2) : this.a((byte) -103, 3) + 3;
          var4 = gt.$cfr$intArgs$a$60f25194e713(false, -1, -65, 28 + var2);
          if (var4 != null) {
            var4.a(200, true);
            var4.a(200, (byte) -4);
            var4.a(var3, param0 ^ -23079);
          }
          this.field_p = this.a((byte) -89, 400) + 600;
        }
        if (param0 != -23079) {
          this.field_z = 59;
        }
    }

    private final void a(nu param0, boolean param1, int param2) {
        int var4_int = 0;
        int var8 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        ob stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        int stackIn_22_0 = 0;
        gm stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        up var13_ref_up = null;
        int var13 = 0;
        int var14_int = 0;
        vn var14 = null;
        gm var15 = null;
        int var16 = 0;
        var16 = Kickabout.field_G;
        try {
          if (param2 != 370) {
            field_K = (String) null;
          }
          stackIn_5_0 = param1;
          stackIn_6_1 = !(wp.field_f);
          param1 = stackIn_5_0 & stackIn_6_1;
          param0.field_V = (tj) ((Object) new ob(param0.field_V));
          stackIn_8_0 = (ob) (param0.field_V);
          stackIn_9_1 = (param1);
          stackIn_8_0.field_I = stackIn_9_1;
          for (var4_int = 0; var4_int < 2; var4_int++) {
            var5 = param0.field_H[var4_int];
            var6 = param0.field_d[var4_int];
            var7 = param0.field_Q[var4_int];
            for (var8 = 0; var8 < 5; var8++) {
              if (0 == var8) {
                var9 = 4;
                var10 = 1;
                var11 = 0;
                var12 = 0;
              } else {
                var13_ref_up = param0.field_b[var4_int][var8 - 1];
                var9 = var13_ref_up.field_q;
                var14_int = var13_ref_up.field_j;
                var12 = (var14_int & 15) >> 0;
                var10 = var14_int >> 8 & 15;
                var11 = (var14_int & 245) >> 4;
              }
              if (wn.a((byte) 24)) {
                stackIn_22_0 = (param0.field_P[var4_int][var8].field_N.c((byte) -107, param0.field_P[var4_int][var8].field_y)) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var13 = stackIn_22_0;
              var14 = fp.a(var5, var6, var10, var9, var11, var12, var7, false, this.field_n, var13 != 0);
              var15 = new gm(var14, var9, false, param0.field_P[var4_int][var8]);
              stackIn_24_0 = var15;
              stackIn_25_1 = (param1);
              stackIn_24_0.field_E = stackIn_25_1;
              param0.field_P[var4_int][var8] = (nl) ((Object) var15);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("va.MA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
          tf var4 = (tf) null;
          this.a((tf) null, (byte) -3);
        }
    }

    private final void a(boolean param0, ki param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_a.a(param1, -115);
          if (param0) {
            return;
          }
          if (param1.field_r == 0 ||
            1 == param1.field_r) {
            ((gm) (this.field_a.a((byte) 105, this.field_g))).field_Z = false;
          }
          if (2 == param1.field_r &&
            this.field_a.c(this.field_g, -7) &&
            ei.field_n &&
            !ja.field_O) {
            this.a(hw.a(param1.field_u, param1.field_v, -115, param1.field_p, param1.field_o), -122);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("va.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2;
        gm var3;
        int var4;
        ob var4_ref_ob;
        int var5;
        int var6;
        int var7;
        double var7_double;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        if (!this.field_l) {
          return;
        }
        if (this.field_a.field_X.field_m > 25) {
          mj.a(128.0, 60, 448.0, 672.0);
          return;
        }
        if (ja.field_O) {
          nt.j(13459);
          return;
        }
        if (!param0) {
          this.a(false, 114, -8);
        }
        var2 = this.h(-41);
        var3 = (gm) (this.field_a.a((byte) -70, var2));
        if (this.field_a.c(var2, -67)) {
          var4 = var3.g(1606384336);
          var5 = var3.h(1000);
          var6 = var3.field_j * 0;
          var7 = 50 * var3.field_n;
          mj.a((double)this.field_q, 60, (double)(var6 + var4), (double)(var5 + var7));
        } else {
          var4_ref_ob = (ob) (this.field_a.field_V);
          var5 = var4_ref_ob.field_t >> 16;
          var6 = var4_ref_ob.c(true) + (var4_ref_ob.field_p >> 16) >> 1;
          var7_double = (double)var3.field_kb / 65536.0;
          var9 = (double)var3.field_bb / 65536.0;
          var11 = (double)(this.field_q + 40);
          var13 = (double)(-var5) + var7_double;
          var15 = (double)(-var6) + var9;
          var17 = Math.sqrt(var13 * var13 + var15 * var15);
          if (340.0 < var17) {
            var11 = 340.0 * var11 / var17;
          }
          mj.a(var11, 60, (double)((int)var7_double + var5 >> 1), (double)((int)var9 + var6 >> 1));
        }
        return;
    }

    private final void e(byte param0) {
        int var2;
        int var3;
        gm var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = Kickabout.field_G;
        var2 = this.field_z;
        var3 = this.field_G;
        if (var2 == -1 &&
          var3 == -1) {
          return;
        }
        if (ia.field_c) {
          var2 = -var2;
          var3 = -var3;
        }
        if (param0 <= 102) {
          this.field_L = true;
        }
        var4 = (gm) (this.field_a.a((byte) 93, this.field_g));
        var5 = ug.a(0, var4.field_kb >> 16);
        var6 = lf.a((byte) -110, var4.field_bb >> 16);
        if (this.field_a.c(this.field_g, -50) &&
          var4.field_u != 2) {
          if (this.field_a.field_y) {
            return;
          }
          if (var4.field_u != 1) {
            lo.a(706856675, 128, 256, var2, var3, true);
            ee.a(653278209, var5, var6);
          } else {
            var7 = var4.a(var4.field_L, (byte) -68);
            lo.a(706856675, 256, var7, var2, var3, true);
            ee.a(653278209, var5, var6);
          }
        } else {
          if (this.field_a.field_l) {
            return;
          }
          if (var4.field_u == 3) {
            var7 = vf.field_I[3];
            if (0 == var4.field_J) {
              var7 = var7 << 1;
            }
            var8 = var7 - var4.field_L;
            if (var8 < 0) {
              var8 = 0;
            }
            var9 = (var8 << 8) / var7;
            var9 = 3 * var9 >> 2;
            lo.a(706856675, 256, var9, var2, var3, false);
            ee.a(653278209, var5, var6);
          } else {
            lo.a(706856675, 128, 192, var2, var3, false);
            ee.a(653278209, var5, var6);
          }
        }
    }

    private final void a(ki param0, int param1) {
        int var11 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        tj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nl var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nu var17 = null;
        int var4Lifetime1;
        var16 = Kickabout.field_G;
        try {
          if (ja.field_O) {
            return;
          }
          var17 = new nu(this.field_a);
          if (param0 != null) {
            var17.a(param0, -117);
            var17.a((byte) 120);
          }
          for (var4 = 0; var4 < 50; var4++) {
            if (-1 != var17.field_V.field_m) {
              var17.d(4);
              continue;
            }
            break;
          }
          if (var17.field_V.field_m != -1) {
            return;
          }
          var6 = var17.field_V;
          var6.a((byte) -86, this.field_a.field_t, this.field_a.field_B);
          while (!var6.field_k) {
            if (var6.field_v != 0) {
              var6.a((byte) -106, this.field_a.field_t, this.field_a.field_B);
              continue;
            }
            break;
          }
          var4Lifetime1 = var6.a(true);
          var5 = var6.c(879306160);
          var7 = -89 % ((param1 + 55) / 38);
          while (250000 < var6.e(28)) {
            var6.a((byte) 122, this.field_a.field_t, this.field_a.field_B);
            var6.a((byte) -70, this.field_a.field_t, this.field_a.field_B);
          }
          if (param0 != null) {
            var4Lifetime1 = var4Lifetime1 + var6.a(true) >> 1;
            var5 = var6.c(879306160) + var5 >> 1;
          } else {
            var4Lifetime1 = var6.a(true);
            var5 = var6.c(879306160);
          }
          var8 = this.field_a.field_g[this.field_g].field_p;
          var9 = -1;
          var10 = 2147483647;
          for (var11 = 1; this.field_a.field_P[var8].length > var11; var11++) {
            var12 = this.field_a.field_P[var8][var11];
            var13 = -var4Lifetime1 + (var12.field_M >> 16);
            var14 = -var5 + (var12.field_w >> 16);
            var15 = var13 * var13 + var14 * var14;
            if (var15 < var10) {
              var10 = var15;
              var9 = var11;
            }
          }
          if (this.field_a.a((byte) 6, var8, var9) == -1) {
            this.g(var9 + 1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("va.QA(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void k(int param0) {
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = -this.field_a.field_O + this.field_a.field_v;
        int var6Lifetime1;
        if (param0 != 0) {
          this.f(-113, 91);
        }
        if (var2 < 120) {
          var3 = tb.field_q[var2 / 40 + 1];
          var4 = var3.field_o;
          var5 = var3.field_v;
          var2 = var2 % 40;
          var6 = 256;
          if (var2 > 35) {
            var6Lifetime1 = (-var2 + 40 << 8) / 5;
          } else {
            var5 = var5 * (var2 + 35) / 70;
            var4 = (var2 + 35) * var4 / 70;
            var6Lifetime1 = (var2 << 8) / 35;
          }
          var3.e(-var4 + 640 >> 1, -var5 + 480 >> 1, var4, var5, var6Lifetime1);
        }
    }

    final static java.awt.Container d(byte param0) {
        if (rq.field_A != null) {
          return (java.awt.Container) ((Object) rq.field_A);
        }
        int var1 = 25 % ((46 - param0) / 33);
        return (java.awt.Container) ((Object) so.a(-120));
    }

    va(nu param0, int param1, nu param2, boolean param3, boolean param4) {
        super(param0, param1, param3, (int[]) null);
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        this.field_D = 0;
        this.field_t = new byte[8];
        this.field_s = -2;
        this.field_j = false;
        this.field_l = true;
        this.field_I = 0;
        this.field_B = false;
        this.field_L = false;
        this.field_E = false;
        this.field_n = false;
        try {
          this.field_v = new int[2];
          this.field_j = false;
          stackIn_4_1 = (param4);
          this.field_x = stackIn_4_1;
          stackIn_7_1 = !(param3);
          this.field_B = stackIn_7_1;
          this.a(param0, param3, 370);
          this.a((tf) null, (byte) -97);
          var6_int = this.h(-41);
          this.field_C = uj.a((byte) -97, param0.field_g, param0.field_S, param0.field_g[var6_int].field_p);
          this.field_l = true;
          sf.a(this.field_h, param1, param0, true);
          wt.a(0, param0, var6_int, this.field_C);
          st.a(param0, var6_int, 50);
          ih.a(-3, param0, this.field_h);
          un.a(param0, this.field_h, 101);
          this.field_q = 172;
          stackIn_10_0 = (param0.field_g[var6_int].field_p == 1);
          ia.field_c = stackIn_10_0;
          gu.b(0, (byte) 60, vc.field_E[1]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("va.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        this.a(param0, mg.a(param0, this.field_H, this.field_g));
        if (this.field_f) {
          or.field_d.b(68, (byte) -65);
          or.field_d.a(123, this.field_H);
        }
    }

    private final void g(int param0, int param1) {
        if (param1 != -1) {
          this.field_q = -15;
        }
        this.a(false, ha.b(1, this.field_g, param0));
        if (this.field_f) {
          or.field_d.b(70, (byte) 99);
          or.field_d.a(param1 ^ -107, param0);
        }
    }

    final void g(int param0) {
        ki var3;
        if (-2 != this.field_s ||
          this.field_a.field_V.field_m != -1) {
          this.field_s = this.field_a.field_V.field_m;
        }
        if (param0 != 0) {
          var3 = (ki) null;
          this.a(true, (ki) null);
        }
        if (this.field_a.field_X.field_m >= 40) {
          this.field_s = -2;
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        wh var6 = null;
        if (this.field_p <= 0 &&
          40 > this.field_a.field_X.field_m) {
          var4 = !param0 ? fd.a(false, true, (byte) 97, false, false) : fd.a(true, false, (byte) 97, true, !param2 ? true : false);
          var5 = this.a((byte) -64, 2) == 0 ? 1 : 0;
          var6 = gt.$cfr$intArgs$a$60f25194e713(false, var5 == 0 ? 256 : 0, 65, var4);
          if (var6 != null) {
            var6.a(4, (byte) -4);
          }
          this.field_p = this.a((byte) -78, 100) + 200;
        }
        if (param1 != 4) {
          this.field_q = -116;
        }
    }

    final void e(int param0) {
        int var4 = 0;
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        gm var4_ref_gm;
        int var5;
        ak var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var5 = Kickabout.field_G;
        qa.i(-126);
        if (this.field_u &&
          this.a((byte) 13)) {
          this.e((byte) 107);
        }
        vc.i((byte) 45);
        for (var2 = 0; 2 > var2; var2++) {
          for (var3 = 0; var3 < 5; var3++) {
            fn.a((gm) (this.field_a.field_P[var2][var3]), 100);
          }
        }
        ((ob) (this.field_a.field_V)).l(param0 - 13);
        gs.b(0);
        if (param0 != 1) {
          return;
        }
        var6 = (ak) (this.field_r.g(24009));
        while (var6 != null) {
          var6.b(192);
          var6 = (ak) (this.field_r.c(33));
        }
        if (ja.field_O) {
          i.f(70);
        }
        if (this.field_C != null) {
          stackIn_21_0 = (!this.field_f) ? 12 : 0;
          var2Lifetime1 = stackIn_21_0 + (hw.field_i * 100 >> 8);
          for (var3Lifetime1 = 0; this.field_a.field_I > var3Lifetime1; var3Lifetime1++) {
            if (this.field_a.field_R[var3Lifetime1].d(3511)) {
              var4_ref_gm = (gm) (this.field_a.a((byte) 112, var3Lifetime1));
              this.field_C[var3Lifetime1].c(ug.a(0, var4_ref_gm.g(1606384336)) - (this.field_C[var3Lifetime1].field_o >> 1), lf.a((byte) -85, var4_ref_gm.h(1000)) - var2Lifetime1);
            }
          }
        }
        if (this.field_a.field_X.field_m < 40 &&
          !ja.field_O) {
          ns.a(3585);
          jk.a(16777215);
          if (this.a((byte) 13)) {
            nu.b(false);
          }
        } else {
          ue.a((byte) 70);
        }
        if (this.field_f &&
          this.field_a.field_O < this.field_a.field_v) {
          this.k(0);
        }
        if (this.a((byte) 13) &&
          !this.field_l) {
          un.field_d.d(vb.field_f.toUpperCase(), 320, 30, 16777215, -1);
        }
        if (this.field_a.field_f) {
          un.field_d.a("FB", 5, 17, 16777215, -1);
        }
        if (gs.field_g) {
          var2Lifetime2 = 370;
          var3Lifetime2 = -45;
          on.e(ug.a(0, var2Lifetime2), lf.a((byte) -89, var3Lifetime2), 155 * hw.field_i >> 8, 45 * hw.field_i >> 8, 16711935);
          ev.a(this.field_a, param0 ^ 72, 0);
          ev.a(this.field_a, 48, 1);
        }
        if (wl.field_g &&
          this.field_a.field_u == 4) {
          var2Lifetime3 = pq.field_J / 5;
          var3Lifetime3 = pq.field_J % 5;
          vl.a(this.field_a, (byte) -98);
          if (var3Lifetime3 == 0) {
            for (var4 = 1; var4 < 5; var4++) {
              or.a(this.field_a, var4, var2Lifetime3, (byte) 99);
            }
            return;
          }
          or.a(this.field_a, var3Lifetime3, var2Lifetime3, (byte) 99);
        }
        return;
    }

    public static void c(byte param0) {
        field_w = null;
        field_F = null;
        field_K = null;
        if (param0 != -40) {
          va.c((byte) -12);
        }
        field_y = (String[][]) null;
    }

    final boolean a(char param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_9_1 = false;
        boolean stackIn_17_1 = false;
        int var4;
        int var5;
        int var7;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        if ((83 == param2 ||
          param2 == 82) && (!this.field_f &&
          ja.field_O)) {
          stackIn_8_0 = 50;
          stackIn_9_1 = (83 == param2);
          tq.$cfr$intArgs$a$7ffe4b125357(stackIn_8_0, stackIn_9_1);
        }
        if (fm.a(false) &&
          ne.field_G[81] &&
          param2 == 84) {
          stackIn_17_1 = !(this.field_l);
          this.field_l = stackIn_17_1;
        }
        if (param1 != 1670) {
          this.a('�', 73, -75);
        }
        if (!this.a((byte) 13)) {
          return true;
        }
        if (this.field_a.field_R[this.field_g].d(param1 ^ 2865)) {
          if (param2 == 83 ||
            param2 == 82) {
            this.g(0, param1 - 1671);
          }
          if (!this.field_f ||
            !this.field_x) {
            for (var4 = 0; 7 > var4; var4++) {
              this.field_t[var4] = this.field_t[1 + var4];
            }
            this.field_t[7] = (byte)Character.toLowerCase(param0);
            var4Lifetime1 = er.a(false, 8, this.field_t);
            var5 = -1;
            for (var6 = 0; ti.field_d.length > var6; var6++) {
              if (var4Lifetime1 == ti.field_d[var6]) {
                var5 = var6;
              }
            }
            if (var5 != -1 &&
              null != tu.field_E) {
              if (!this.field_a.a(var5, false, tu.field_E.field_e, this.field_g, tk.field_Ib)) {
                return true;
              }
              if (var5 != 11 &&
                var5 != 10) {
                this.a(false, fu.a(this.field_g, (byte) 8, var5));
              }
              if (this.field_f) {
                or.field_d.b(76, (byte) 98);
                or.field_d.a(0, 8, 1991220144, this.field_t);
              }
            }
          }
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (this.field_u) {
          this.n(-122);
          this.i(16623);
        }
        if (this.field_g == this.field_a.field_V.field_j &&
          ei.field_n) {
          this.a((ki) null, -123);
        }
        this.a(true, this.field_a);
        if (this.field_a.field_G != this.field_n) {
          this.field_n = this.field_a.field_G;
          this.j(-90);
        }
        nl var4 = this.field_a.b((byte) -96);
        if (var4 != null) {
          ((ob) (this.field_a.field_V)).field_E = ((ob) (this.field_a.field_V)).field_E + (var4.field_n << 16);
        }
        if (param0 > -92) {
          return;
        }
        uc.a(this.field_r, -22488);
        is.a(7249);
        this.l(2115);
        de.b(40);
        kl.c(88);
        he.i(0);
        qs.a(false);
    }

    private final void j(int param0) {
        int var6 = 0;
        int stackIn_27_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        up var11_ref_up;
        int var11;
        int var12_int;
        vn var12;
        int var13;
        var13 = Kickabout.field_G;
        var2 = 0;
        if (param0 > -83) {
          return;
        }
        while (var2 < 2) {
          var3 = this.field_a.field_H[var2];
          var4 = this.field_a.field_d[var2];
          var5 = this.field_a.field_Q[var2];
          for (var6 = 0; 5 > var6; var6++) {
            if (0 == var6) {
              var8 = 1;
              var7 = 4;
              var10 = 0;
              var9 = 0;
            } else {
              var11_ref_up = this.field_a.field_b[var2][var6 - 1];
              var7 = var11_ref_up.field_q;
              var12_int = var11_ref_up.field_j;
              var8 = var12_int >> 8 & 15;
              var10 = (var12_int & 15) >> 0;
              var9 = (var12_int & 251) >> 4;
            }
            if (var7 < 0 ||
              var7 >= 5) {
              var7 = 0;
            }
            if (wn.a((byte) -86)) {
              stackIn_27_0 = (this.field_a.field_P[var2][var6].field_N.c((byte) -107, this.field_a.field_P[var2][var6].field_y)) ? 1 : 0;
            } else {
              stackIn_27_0 = 0;
            }
            var11 = stackIn_27_0;
            var12 = fp.a(var3, var4, var8, var7, var9, var10, var5, false, this.field_n, var11 != 0);
            ((gm) (this.field_a.field_P[var2][var6])).a(var12, (byte) -115);
          }
          var2++;
        }
    }

    private final void a(boolean param0, nu param1) {
        int var3_int = 0;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        try {
          if (!param0) {
            this.field_k = false;
          }
          for (var3_int = 0; 2 > var3_int; var3_int++) {
            for (var4 = 0; var4 < 5; var4++) {
              var5 = (gm) (param1.field_P[var3_int][var4]);
              var6 = ~param1.field_X.field_n == ~var3_int ? 1 : 0;
              var7 = param1.a((byte) 6, var3_int, var4);
              var8 = var7 == -1 ? 0 : param1.field_R[var7].field_l;
              var5.a(var6 != 0, false, var8);
            }
          }
          ((ob) (param1.field_V)).a((gm) (param1.b((byte) -96)), (byte) 50);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "va.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          if (10 > hl.field_d) {
            var3_int = 0;
            if (oo.field_f) {
              var3_int = 1;
              oo.field_f = false;
            }
            fo.a(var3_int != 0, -68, ki.g((byte) 60), hm.field_A, pe.a((byte) 92));
          } else {
            if (!nq.i(-86)) {
              on.b();
              rv.a(320, 240, (byte) 122);
              su.a(27744, 0, 0, param0);
            } else {
              if (vj.field_c == 0) {
                vs.a(false, param1, (byte) 39);
                su.a(27744, 0, 0, param0);
              } else {
                wr.a(param0, -14142);
              }
            }
          }
          if (param2 != 0) {
            va.d((byte) -37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("va.PA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_y = new String[][]{new String[]{"Kickabout gives several types of reward at the end of each game:", "<img=0><col=ffff00>Money</col> to both the winner and loser. Characters in higher leagues earn more money per game.", "<img=0><col=ffff00>Experience</col> to all characters used in game. High-level characters earn EXP more slowly.", "<img=0><col=ffff00>League points</col> to help you on your way to the Diamond Division!"}, new String[]{"Rewards are scaled according to the outcome of the game:", "<img=0>Rated Games give ten times the reward of an Unrated Game - but you must defeat your opponent 1-on-1 using your own characters.", "<img=0><col=ffff00>Repeated</col> Rated Games, where you have played the opponent recently, give Unrated rewards.", "<img=0>Playing for only <col=ffff00>4 minutes</col> gives 50% less rewards; playing for <col=ffff00>12 minutes</col> gives 50% more rewards."}};
        field_J = 0;
        field_F = "Invite <%0> to this game";
        field_K = "More suggestions";
    }
}
