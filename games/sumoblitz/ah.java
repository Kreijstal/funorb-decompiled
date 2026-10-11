/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ah {
    int field_l;
    int field_z;
    int field_b;
    static byte[] field_g;
    int field_j;
    private int field_i;
    int field_P;
    private int field_h;
    int field_C;
    private int field_O;
    int field_m;
    int field_v;
    boolean field_R;
    boolean field_f;
    int field_E;
    double field_s;
    private int field_k;
    int field_o;
    private int field_H;
    private int field_B;
    private int field_c;
    int field_u;
    int field_Q;
    int field_t;
    int field_r;
    int field_N;
    int field_G;
    int field_y;
    private int field_M;
    int field_x;
    int field_a;
    double field_L;
    private jn field_q;
    int field_F;
    int field_I;
    private int field_K;
    private boolean field_n;
    int field_d;
    int field_p;
    static ki field_J;
    int field_A;
    int field_e;
    boolean field_D;
    private int field_w;

    private final void b(int param0, int param1) {
        this.field_M = param0;
        this.field_O = 500;
        if (param1 <= 98) {
          this.d((byte) -2);
        }
        this.c((byte) 35);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var7Lifetime1;
        if (this.field_w > 0) {
          return;
        }
        if (!this.g(22)) {
          this.field_s = Math.atan2((double)param0, (double)param1);
          if (param2 >= -43) {
            this.field_Q = -106;
          }
          var4 = this.field_E;
          var5 = this.field_A;
          var6 = 20;
          var6 = var6 + (this.field_y - 1) * 10;
          if (this.field_f) {
            var6 = (int)((double)var6 * 0.4);
          }
          if (this.field_N == 2 &&
            this.field_v > 0) {
            var6 = (int)((double)var6 * 0.4);
          }
          var7 = var6 * (this.field_i * param0 / 256 - this.field_E) >> 8;
          this.field_E = this.field_E + (var7 == 0 ? 1 : var7);
          if (this.field_f) {
            this.field_E = (var4 + this.field_E) / 2;
          }
          var7Lifetime1 = var6 * (-this.field_A + this.field_i * param1 / 256) >> 8;
          this.field_A = this.field_A + (var7Lifetime1 == 0 ? 1 : var7Lifetime1);
          if (this.field_f) {
            this.field_A = (var5 + this.field_A) / 2;
          }
          return;
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_J = null;
        if (param0 != 0) {
          ah.c(-3);
        }
    }

    final int d(byte param0) {
        if (param0 != -106) {
          this.field_R = false;
        }
        return (int)(395.0 * ((double)(-this.field_H + this.field_k) / 1000.0));
    }

    final void b(int param0, int param1, int param2) {
        int var4;
        if (this.field_D) {
          return;
        }
        if (param0 > -59) {
          return;
        }
        var4 = (int)Math.round(Math.sqrt((double)(param1 * param1 + param2 * param2)));
        if (var4 > 0) {
          param2 = (param2 << 8) / var4;
          param1 = (param1 << 8) / var4;
          if (param2 != 0 ||
            0 != param1) {
            this.a(param2, param1, -94);
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          return;
        }
        this.field_l = this.field_l + 1;
    }

    private final void k(int param0) {
        if (param0 != 1261228232) {
          this.field_Q = 4;
        }
        this.field_n = false;
        this.field_m = this.e((byte) -5);
    }

    private final void j(byte param0) {
        this.field_t = this.field_t + 1;
        if (param0 != 98) {
          this.field_G = 29;
        }
        if (10 < this.field_t) {
          this.field_t = 10;
        }
        this.c((byte) 35);
    }

    final void a(byte param0, tl param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_m != 0) {
            this.b(param1.field_n, 120);
          } else {
            this.a(-62, param1.field_n);
          }
          if (param0 <= 83) {
            this.m(17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void e(int param0) {
        if (param0 != 0) {
          this.n(-51);
        }
        this.field_y = this.field_y + 1;
        if (10 < this.field_y) {
          this.field_y = 10;
        }
        this.c((byte) 35);
    }

    final boolean i(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
          discarded$0 = this.e((byte) 53);
        }
        return -this.field_H + this.field_k == 975 ? true : false;
    }

    final boolean i(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 125) {
          this.field_c = 106;
        }
        stackIn_6_0 = (this.field_E != 0) && (this.field_A != 0);
        return stackIn_6_0;
    }

    final boolean a(boolean param0) {
        boolean stackIn_8_0 = false;
        if (!param0) {
          this.field_G = -94;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_Q == 0 && (4 == this.field_M ||
          this.field_k - this.field_H < 50)) {
          stackIn_8_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = false;
        }
        return stackIn_8_0;
    }

    final boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -63) {
          this.field_I = -65;
        }
        stackIn_6_0 = (0 == this.field_b) && (this.field_r >= 0);
        return stackIn_6_0;
    }

    final void h(byte param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -55) {
          return;
        }
        var2 = this.field_N;
        if (var2 != 0 &&
          var2 != 4 &&
          var2 != 5) {
          if (var2 == 1) {
            if (this.field_p > 0) {
              if (this.field_Q != 0) {
                this.field_p = this.field_p - 1;
              }
            } else {
              if (this.field_v <= 0) {
                this.field_v = 200;
              }
            }
          } else {
            if (var2 != 2) {
              if (var2 == 3 &&
                0 >= this.field_v) {
                this.field_v = 500;
              }
            } else {
              if (this.field_v <= 0) {
                this.field_v = 200;
                if (this.field_Q == 0) {
                  this.field_v = 0;
                }
              }
            }
          }
        }
        return;
    }

    void d(int param0) {
        float[] var2;
        int var3;
        nt var4;
        float[] var5;
        float[] var6;
        float[] var7;
        float[] var9;
        float[] var10;
        float[] var13;
        float[] var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (td.field_m) {
          return;
        }
        if (this.field_x > 0) {
          this.field_x = this.field_x - 1;
        }
        if (this.f(62)) {
          this.field_r = this.field_r + 1;
        }
        if (this.field_w > 0) {
          this.field_w = this.field_w - 1;
          return;
        }
        if (this.field_r < 0) {
          return;
        }
        if (this.field_j > -1) {
          this.field_j = this.field_j - 1;
        }
        if (0 == this.field_j) {
          this.m((byte) 116);
        }
        this.field_d = this.field_d + 1;
        if (this.field_Q == 0 &&
          this.field_d * 20 / 1000 >= 30) {
          th.b(24753, 247, 8);
        }
        if (this.field_b > 0) {
          this.field_A = this.field_A >> 1;
          this.field_b = this.field_b + 1;
          this.field_E = this.field_E >> 1;
          if (2 == this.field_b) {
            ts.a(this.field_C, this.field_q, -16240, 20, lr.field_a[this.field_Q], this.field_z);
            var5 = new float[]{0.0f, -3.0f};
            var9 = kt.a((byte) -99, var5, (float)this.field_s);
            var6 = var9;
            var2 = var6;
            this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var9[0] << 8, (int)var9[1] << 8, this.field_Q, 0, this.e((byte) -5) >> 8)), (byte) 39);
            var10 = kt.a((byte) -16, var2, (float)(this.field_s + 2.0943951023931953));
            var7 = var10;
            var2Lifetime1 = var7;
            this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var10[0] << 8, (int)var10[1] << 8, this.field_Q, 1, this.e((byte) -5) >> 8)), (byte) 39);
            var13 = kt.a((byte) -43, var2Lifetime1, (float)(4.1887902047863905 + this.field_s));
            this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var13[0] << 8, (int)var13[1] << 8, this.field_Q, 2, this.e((byte) -5) >> 8)), (byte) 39);
          }
        }
        if (!this.g(73)) {
          this.field_C = this.field_C + this.field_E;
          this.field_z = this.field_z + this.field_A;
        }
        if (param0 > -55) {
          return;
        }
        if (!this.field_f) {
          this.field_A = (-this.field_h + 251) * this.field_A / 256;
          this.field_E = this.field_E * (251 - this.field_h) / 256;
        }
        boolean decompiledFrameRemainder0 = true;
        if (2 == this.field_Q) {
          if (!wn.a(this.field_B, 2048, -128, this.field_C, this.field_K, this.field_z)) {
            if ((!(!this.i(-2))) &&
              ((0 == this.field_Q))) {
              ab.a(lr.field_a[this.field_Q], this.field_q, this, 40, this.field_z, this.field_C, (byte) 121);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_w <= 0) {
              this.field_w = 0;
              this.field_K = -1;
              this.field_B = -1;
              this.field_A = 0;
              this.field_E = 0;
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.i(-2) &&
          0 == this.field_Q)) {
          ab.a(lr.field_a[this.field_Q], this.field_q, this, 40, this.field_z, this.field_C, (byte) 121);
        }
        if (this.field_M != -1) {
          this.field_O = this.field_O - 1;
          if (0 == this.field_O) {
            this.b(677397768);
          }
          if (this.field_k % 2 != 0) {
            this.field_q.a((ms) (new eq(50, this.field_C + (fi.a(2048, he.field_o, (byte) -96) - 1024) >> 8, -1024 + (this.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, this.a(0), this.field_M + 1, true)), (byte) 39);
          } else {
            this.field_q.a((ms) (new eq(50, -1024 + this.field_C + fi.a(2048, he.field_o, (byte) -96) >> 8, -1024 + (this.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, this.a(0), 1 + this.field_M, false)), (byte) 39);
          }
        }
        var4 = (nt) (this.field_q.b(118));
        while (var4 != null) {
          if (var4.a(-2567)) {
            var4.b(false);
          }
          var4 = (nt) (this.field_q.d((byte) 18));
        }
        if (this.g(66)) {
          this.field_m = this.field_m + 2048;
          this.field_c = this.field_c - 1;
          if (this.field_c == 0) {
            this.k(1261228232);
          }
        }
        this.field_f = false;
        if (this.field_G > 0) {
          this.field_G = this.field_G - 1;
        }
        this.field_D = false;
        if (0 < this.field_v) {
          this.field_v = this.field_v - 1;
          if (this.field_v == 0 &&
            this.field_N == 1) {
            this.field_p = 3;
          }
        }
        this.field_k = this.field_k + 1;
        return;
    }

    final void l(byte param0) {
        if (this.field_b != 0) {
          return;
        }
        this.field_b = 1;
        int var2 = 117 % ((74 - param0) / 47);
    }

    private final int a(int param0) {
        int var2;
        var2 = -1414832128;
        if (param0 != 0) {
          this.field_r = 86;
        }
        if (this.field_M == 0) {
          var2 = -1442815829;
        } else {
          if (this.field_M == 1) {
            var2 = -1436548949;
          }
        }
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        if (this.field_Q == 2) {
          if (this.field_K == -1 &&
            -1 == this.field_B) {
            this.field_B = param1;
            this.field_K = param2;
          } else {
            param2 = this.field_K;
            param1 = this.field_B;
          }
        }
        if (param0) {
          this.g((byte) 123);
        }
        this.b(-108, param1 - this.field_z >> 8, -this.field_C + param2 >> 8);
    }

    final boolean g(byte param0) {
        if (param0 == -59) {
          return this.field_k - this.field_H == 980 ? true : false;
        }
        return true;
    }

    final boolean n(int param0) {
        if (param0 <= 54) {
          this.field_P = 112;
        }
        return 36 <= this.field_l ? true : false;
    }

    final boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 110) {
          this.b(true);
        }
        stackIn_6_0 = (0 <= this.field_r) && (this.field_b == 0);
        return stackIn_6_0;
    }

    final boolean h(int param0) {
        if (param0 != -1) {
          this.b(false);
        }
        return this.field_x == 0 ? true : false;
    }

    private final int e(byte param0) {
        if (param0 != -5) {
          return 24;
        }
        if (this.field_M != 1) {
          return 2560;
        }
        return 5120;
    }

    private final void m(byte param0) {
        this.field_c = 12;
        this.field_n = true;
        this.field_q = new jn();
        ts.a(this.field_C, this.field_q, -16240, 40, lr.field_a[this.field_Q], this.field_z);
        int var2 = 111 % ((param0 - 57) / 38);
        gn.a(19 + fi.a(3, he.field_o, (byte) -96), true);
    }

    private final void l(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_Q;
        if (var2 != 1) {
          if (var2 == 2) {
            this.field_o = 40;
            this.field_x = -1;
            this.field_a = -(rl.field_k << 2) + (rl.field_k << 7);
            this.field_i = 2800;
            this.field_L = 1.0;
          } else {
            if (var2 != 3) {
              if (var2 != 4) {
                if (5 == var2) {
                  this.field_L = 0.5;
                  this.field_a = rl.field_k << 7;
                  this.field_i = 1600;
                  this.field_x = -1;
                  this.field_o = 160;
                } else {
                  if (0 == var2) {
                    this.field_x = -1;
                    this.field_o = 128;
                    this.field_i = 1024;
                    this.field_m = 5120;
                  }
                }
              } else {
                this.field_i = 700;
                this.field_a = -(rl.field_k << 2) + (rl.field_k << 7);
                this.field_e = 4;
                this.field_u = 4;
                this.field_x = -1;
                this.field_o = 80;
              }
            } else {
              this.field_o = 80;
              this.field_x = 0;
              this.field_a = rl.field_k << 7;
              this.field_i = 700;
            }
          }
        } else {
          this.field_a = (rl.field_k << 7) - (rl.field_k << 2);
          this.field_o = 60;
          this.field_i = 600;
          this.field_x = -1;
        }
        var2Lifetime1 = this.field_N;
        if (var2Lifetime1 == 0) {
          if (this.field_Q != 0) {
            this.field_m = 5120;
          }
        } else {
          if (1 == var2Lifetime1) {
            this.field_p = 3;
            this.field_m = 5120;
          } else {
            if (var2Lifetime1 != 2) {
              if (3 != var2Lifetime1) {
                if (var2Lifetime1 == 4) {
                  if (this.field_Q == 4) {
                    this.field_e = 4;
                    this.field_u = 1;
                  }
                  this.field_m = 3072;
                  this.field_o = this.field_o >> 1;
                } else {
                  if (5 != var2Lifetime1) {
                    if (6 == var2Lifetime1) {
                      this.field_m = 14336;
                      this.field_u = this.field_Q;
                      this.field_o = this.field_o << 1;
                      this.field_e = 5;
                      this.field_i = this.field_i >> 1;
                    }
                  } else {
                    this.field_o = this.field_o << 1;
                    this.field_m = 7168;
                    if (this.field_Q == 4) {
                      this.field_e = 0;
                      this.field_u = 4;
                    }
                  }
                }
              } else {
                this.field_L = this.field_L / 2.0;
                this.field_m = 5120;
              }
            } else {
              this.field_m = 5120;
            }
          }
        }
        if (rf.a(false) &&
          this.field_Q != 0) {
          this.field_L = this.field_L * 2.0;
          this.field_i = this.field_i << 1;
          this.field_o = this.field_o << 1;
        }
        if (param0 < 89) {
          return;
        }
        this.field_m = this.field_m >> 1;
    }

    private final void b(byte param0) {
        this.field_I = this.field_I + 1;
        if (this.field_I > 10) {
          this.field_I = 10;
        }
        if (param0 != 61) {
          this.field_b = 40;
        }
        this.c((byte) 35);
    }

    final void m(int param0) {
        if (param0 >= -50) {
          this.b(true);
        }
        this.field_l = 0;
    }

    final boolean j(int param0) {
        if (param0 != 20) {
          return false;
        }
        return -this.field_H + this.field_k > 1000 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 <= 17) {
          return true;
        }
        return this.field_n;
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 >= -4) {
          this.field_n = true;
        }
        var3 = param1;
        if (0 != var3) {
          if (1 == var3) {
            this.e(0);
          } else {
            if (var3 == 2) {
              this.j((byte) 98);
            }
          }
        } else {
          this.b((byte) 61);
        }
    }

    private final void b(int param0) {
        if (this.field_m > 2560) {
          this.field_m = 2560;
        }
        this.field_M = -1;
        this.c((byte) 35);
        if (param0 != 677397768) {
          this.f((byte) 38);
        }
    }

    private final boolean f(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ah var7 = aa.field_a[0];
        if (param0 < 53) {
          this.field_N = 4;
        }
        if (var7 == null) {
          return true;
        }
        if (var7.equals(this)) {
          return true;
        }
        int var3 = this.field_m + var7.field_m;
        if (wn.a(var7.field_z, var3, -115, this.field_C, var7.field_C, this.field_z)) {
          var4 = -var7.field_C + this.field_C;
          if (var4 == 0) {
            var4 = -1 + (2 & this.field_k << 1);
          }
          var5 = this.field_z - var7.field_z;
          if (0 == var5) {
            var5 = -1 + ((1 & this.field_k) << 1);
          }
          var6 = (int)Math.round(Math.sqrt((double)((float)var4 * (float)var4 + (float)var5 * (float)var5)));
          return var6 >= var3 ? true : false;
        }
        return true;
    }

    final void a(ha param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        hr stackIn_23_0 = null;
        float stackIn_23_1 = 0.0f;
        float stackIn_23_2 = 0.0f;
        int stackIn_24_3;
        hr stackIn_31_0 = null;
        float stackIn_31_1 = 0.0f;
        float stackIn_31_2 = 0.0f;
        int stackIn_32_3;
        hr stackIn_36_0 = null;
        float stackIn_36_1 = 0.0f;
        float stackIn_36_2 = 0.0f;
        int stackIn_37_3;
        hr stackIn_41_0;
        float stackIn_41_1;
        float stackIn_41_2;
        double stackIn_41_3;
        int stackIn_42_4;
        ha stackIn_45_0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        int stackIn_46_5;
        hr stackIn_49_0 = null;
        float stackIn_49_1 = 0.0f;
        float stackIn_49_2 = 0.0f;
        int stackIn_50_3;
        hr stackIn_53_0 = null;
        float stackIn_53_1 = 0.0f;
        float stackIn_53_2 = 0.0f;
        int stackIn_54_3;
        hr stackIn_66_0;
        float stackIn_66_1;
        float stackIn_66_2;
        double stackIn_66_3;
        int stackIn_67_4;
        hr stackIn_73_0;
        float stackIn_73_1;
        float stackIn_73_2;
        double stackIn_73_3;
        int stackIn_74_4;
        hr stackIn_78_0;
        float stackIn_78_1;
        float stackIn_78_2;
        double stackIn_78_3;
        int stackIn_79_4;
        hr stackIn_83_0;
        float stackIn_83_1;
        float stackIn_83_2;
        double stackIn_83_3;
        int stackIn_84_4;
        hr stackIn_88_0;
        float stackIn_88_1;
        float stackIn_88_2;
        double stackIn_88_3;
        int stackIn_89_4;
        hr stackIn_92_0 = null;
        float stackIn_92_1 = 0.0f;
        float stackIn_92_2 = 0.0f;
        int stackIn_93_3;
        hr stackIn_122_0;
        float stackIn_122_1;
        float stackIn_122_2;
        double stackIn_122_3;
        int stackIn_123_4;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nt var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_b != 0) {
            stackIn_4_0 = this.field_b * this.field_b << 8;
          } else {
            stackIn_4_0 = 0;
          }
          var3_int = stackIn_4_0;
          if (param1 != 19399) {
            this.field_i = -91;
          }
          if (this.field_r >= 0) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.field_r * (this.field_r * this.field_m) / 2500;
          }
          var4 = stackIn_9_0;
          var5 = this.field_m - (-var3_int + var4) >> 8;
          var6 = Math.max(0, 255 - this.field_b * this.field_b) << 24;
          var7 = (nt) (this.field_q.b(-80));
          while (var7 != null) {
            var7.a(param0, -127);
            var7 = (nt) (this.field_q.d((byte) 18));
          }
          if (0 > this.field_r) {
            ts.field_e[this.field_Q].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)(this.field_m >> 8) / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
          }
          if (this.field_b == 0) {
            if (this.field_Q != 0) {
              if (this.field_Q == 1) {
                stackIn_53_0 = dc.field_ab[0];
                stackIn_53_1 = (float)(this.field_C >> 8);
                stackIn_53_2 = (float)(this.field_z >> 8);
                if (!this.g(28)) {
                  stackIn_54_3 = var5;
                } else {
                  stackIn_54_3 = 20;
                }
                ((hr) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, (int)((double)stackIn_54_3 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
              } else {
                if (this.field_Q == 2) {
                  stackIn_49_0 = hv.field_d[0];
                  stackIn_49_1 = (float)(this.field_C >> 8);
                  stackIn_49_2 = (float)(this.field_z >> 8);
                  if (!this.g(37)) {
                    stackIn_50_3 = var5;
                  } else {
                    stackIn_50_3 = 20;
                  }
                  ((hr) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_49_2, (int)((double)stackIn_50_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                } else {
                  if (this.field_Q != 3) {
                    if (this.field_Q != 4) {
                      if (5 != this.field_Q) {
                        stackIn_45_0 = (ha) (param0);
                        stackIn_45_1 = this.field_C >> 8;
                        stackIn_45_2 = this.field_z >> 8;
                        stackIn_45_3 = var5;
                        stackIn_45_4 = var6 + dp.a(-26346, this.field_Q);
                        if (var6 != 255) {
                          stackIn_46_5 = 1;
                        } else {
                          stackIn_46_5 = 0;
                        }
                        ((ha) (Object) stackIn_45_0).s(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_46_5);
                      } else {
                        stackIn_41_0 = mr.field_e[0];
                        stackIn_41_1 = (float)(this.field_C >> 8);
                        stackIn_41_2 = (float)(this.field_z >> 8);
                        stackIn_41_3 = 3072.0;
                        if (this.g(param1 - 19316)) {
                          stackIn_42_4 = 20;
                        } else {
                          stackIn_42_4 = var5;
                        }
                        ((hr) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, (int)(stackIn_41_3 * ((double)stackIn_42_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                      }
                    } else {
                      stackIn_36_0 = ak.field_a[0];
                      stackIn_36_1 = (float)(this.field_C >> 8);
                      stackIn_36_2 = (float)(this.field_z >> 8);
                      if (!this.g(27)) {
                        stackIn_37_3 = var5;
                      } else {
                        stackIn_37_3 = 20;
                      }
                      ((hr) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, (int)((double)stackIn_37_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    }
                  } else {
                    stackIn_31_0 = s.field_n[0];
                    stackIn_31_1 = (float)(this.field_C >> 8);
                    stackIn_31_2 = (float)(this.field_z >> 8);
                    if (this.g(106)) {
                      stackIn_32_3 = 20;
                    } else {
                      stackIn_32_3 = var5;
                    }
                    ((hr) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, (int)((double)stackIn_32_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                  }
                }
              }
            } else {
              if (this.j(20) &&
                0 < this.field_l &&
                ul.field_f == 0) {
                ht.field_e[6 - this.field_l / 7 + 3].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
              } else {
                stackIn_23_0 = ht.field_e[0];
                stackIn_23_1 = (float)(this.field_C >> 8);
                stackIn_23_2 = (float)(this.field_z >> 8);
                if (!this.g(114)) {
                  stackIn_24_3 = var5;
                } else {
                  stackIn_24_3 = 5120;
                }
                ((hr) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, (int)((double)stackIn_24_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
              }
            }
            if (this.g(param1 - 19310) &&
              ul.field_f == 0) {
              kw.field_a.a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)((double)var5 / 28.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
            }
          }
          var8 = this.field_E;
          var9 = this.field_A;
          var10 = var5 >> 1;
          var11 = (int)Math.round(Math.sqrt((double)((float)this.field_A * (float)this.field_A + (float)this.field_E * (float)this.field_E)));
          if (var11 > 1024) {
            var8 = (this.field_E << 10) / var11;
            var9 = (this.field_A << 10) / var11;
          }
          if (this.h(-1)) {
            if (var10 != 0) {
              var12 = var8 + this.field_C >> 8;
              var13 = this.field_z + var9 >> 8;
              param0.a(-var10 + var12, var13, var12 + var10, var13, var6 + tt.a((byte) -128, this.field_Q), 1);
            }
          } else {
            if (this.field_b <= 0) {
              if (this.field_Q != 0) {
                if (1 == this.field_Q) {
                  stackIn_92_0 = dc.field_ab[1];
                  stackIn_92_1 = (float)(var8 + this.field_C >> 8);
                  stackIn_92_2 = (float)(var9 + this.field_z >> 8);
                  if (this.g(111)) {
                    stackIn_93_3 = 10;
                  } else {
                    stackIn_93_3 = var10;
                  }
                  ((hr) (Object) stackIn_92_0).a(stackIn_92_1, stackIn_92_2, (int)((double)stackIn_93_3 / 14.0 * 4096.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                } else {
                  if (2 == this.field_Q) {
                    stackIn_88_0 = hv.field_d[1];
                    stackIn_88_1 = (float)(var8 + this.field_C >> 8);
                    stackIn_88_2 = (float)(this.field_z + var9 >> 8);
                    stackIn_88_3 = 4096.0;
                    if (this.g(18)) {
                      stackIn_89_4 = 10;
                    } else {
                      stackIn_89_4 = var10;
                    }
                    ((hr) (Object) stackIn_88_0).a(stackIn_88_1, stackIn_88_2, (int)(stackIn_88_3 * ((double)stackIn_89_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                  } else {
                    if (this.field_Q != 3) {
                      if (this.field_Q != 4) {
                        if (this.field_Q != 5) {
                          param0.s(this.field_C + var8 >> 8, this.field_z + var9 >> 8, var10, var6 + tt.a((byte) -128, this.field_Q), 1);
                          param0.s(var8 + this.field_C >> 8, var9 + this.field_z >> 8, var10 >> 2, 2236962 + var6, 1);
                        } else {
                          stackIn_83_0 = mr.field_e[1];
                          stackIn_83_1 = (float)(this.field_C + var8 >> 8);
                          stackIn_83_2 = (float)(var9 + this.field_z >> 8);
                          stackIn_83_3 = 4096.0;
                          if (this.g(106)) {
                            stackIn_84_4 = 10;
                          } else {
                            stackIn_84_4 = var10;
                          }
                          ((hr) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, (int)(stackIn_83_3 * ((double)stackIn_84_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        }
                      } else {
                        stackIn_78_0 = ak.field_a[1];
                        stackIn_78_1 = (float)(var8 + this.field_C >> 8);
                        stackIn_78_2 = (float)(this.field_z + var9 >> 8);
                        stackIn_78_3 = 4096.0;
                        if (!this.g(100)) {
                          stackIn_79_4 = var10;
                        } else {
                          stackIn_79_4 = 10;
                        }
                        ((hr) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2, (int)(stackIn_78_3 * ((double)stackIn_79_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                      }
                    } else {
                      stackIn_73_0 = s.field_n[1];
                      stackIn_73_1 = (float)(this.field_C + var8 >> 8);
                      stackIn_73_2 = (float)(var9 + this.field_z >> 8);
                      stackIn_73_3 = 4096.0;
                      if (!this.g(param1 ^ 19425)) {
                        stackIn_74_4 = var10;
                      } else {
                        stackIn_74_4 = 10;
                      }
                      ((hr) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2, (int)(stackIn_73_3 * ((double)stackIn_74_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    }
                  }
                }
              } else {
                stackIn_66_0 = ht.field_e[1];
                stackIn_66_1 = (float)(var8 + this.field_C >> 8);
                stackIn_66_2 = (float)(this.field_z + var9 >> 8);
                stackIn_66_3 = 4096.0;
                if (this.g(78)) {
                  stackIn_67_4 = 10;
                } else {
                  stackIn_67_4 = var10;
                }
                ((hr) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, (int)(stackIn_66_3 * ((double)stackIn_67_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
              }
            }
          }
          if (this.field_N == 1 &&
            this.field_b == 0) {
            if (this.field_v == 0 &&
              this.field_p > 0) {
              hh.field_e[0].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)((3.141592653589793 + this.field_s) * 32768.0 / 3.141592653589793));
            } else {
              hh.field_e[1].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793));
            }
            if (this.field_Q == 0) {
              hh.field_e[0].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793) + 32768);
            }
          } else if (this.field_N == 2 &&
            0 == this.field_b) {
            if (0 == this.field_v) {
              up.field_e[0].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793));
            } else {
              up.field_e[1].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793));
            }
          } else {
            if (this.field_N == 3 &&
              0 == this.field_b) {
              if (this.field_v != 0) {
                ct.field_A[1].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793));
              } else {
                ct.field_A[0].a((float)(this.field_C >> 8), (float)(this.field_z >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793));
              }
            }
          }
          if (this.g(101)) {
          }
          if (2 == this.field_M) {
            stackIn_122_0 = jn.field_d;
            stackIn_122_1 = (float)(this.field_C >> 8);
            stackIn_122_2 = (float)(this.field_z >> 8);
            stackIn_122_3 = 4096.0;
            if (this.g(71)) {
              stackIn_123_4 = 20;
            } else {
              stackIn_123_4 = var10;
            }
            ((hr) (Object) stackIn_122_0).a(stackIn_122_1, stackIn_122_2, (int)(stackIn_122_3 * ((double)stackIn_123_4 / 7.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_127_0 = var3;
          stackIn_127_1 = new StringBuilder().append("ah.W(");
          if (param0 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(param1).append(')').toString());
        }
    }

    final void k(byte param0) {
        if (this.g(22)) {
          return;
        }
        if (this.j(20)) {
          gn.a(28, true);
          this.field_n = true;
          this.field_H = this.field_k;
          if (param0 >= -5) {
            this.field_G = 4;
          }
          this.field_c = 12;
          this.field_q = new jn();
          ts.a(this.field_C, this.field_q, -16240, 50, lr.field_a[this.field_Q], this.field_z);
          this.m(-82);
          return;
        }
    }

    final void c(byte param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 35) {
          this.b(28, -76);
        }
        this.field_i = 1024 + this.field_I * 50 - 50;
        this.field_h = 0 + 3 * (this.field_y - 1);
        if (this.field_m > 2560) {
          this.field_m = 2560;
        }
        this.field_N = 0;
        this.field_L = 0.1 * (double)(-1 + this.field_t) + 1.0;
        if (-1 != this.field_M) {
          if (0 != this.field_M) {
            if (this.field_M == 1) {
              this.field_m = this.field_m << 1;
              this.field_h = this.field_h << 1;
            } else {
              if (2 != this.field_M) {
                if (3 == this.field_M) {
                  this.field_N = 2;
                } else {
                  if (this.field_M == 4) {
                    this.field_p = 1;
                    this.field_N = 1;
                  }
                }
              } else {
                this.field_L = this.field_L * 2.0;
              }
            }
          } else {
            this.field_i = this.field_i << 1;
          }
        }
    }

    ah(int param0, int param1, int param2, int param3) {
        this.field_b = 0;
        this.field_i = 80;
        this.field_j = -1;
        this.field_P = -1;
        this.field_R = false;
        this.field_t = 1;
        this.field_u = -1;
        this.field_B = -1;
        this.field_G = 1500;
        this.field_y = 1;
        this.field_K = -1;
        this.field_n = false;
        this.field_I = 1;
        this.field_r = -50;
        this.field_e = -1;
        this.field_d = 0;
        this.field_w = 0;
        this.field_z = param3;
        this.field_L = 1.0;
        this.field_M = -1;
        this.field_C = param2;
        this.field_N = param1;
        this.field_Q = param0;
        this.l(125);
        this.field_q = new jn();
    }

    static {
    }
}
