/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfa extends ha {
    private int field_j;
    private ija field_T;
    private int field_m;
    private int field_O;
    private boolean field_E;
    private java.awt.Canvas field_t;
    private ji field_G;
    private boolean field_z;
    private boolean field_e;
    int field_g;
    private bf field_D;
    int field_d;
    int field_p;
    private int field_s;
    int field_l;
    int field_w;
    int field_S;
    private int field_B;
    int field_K;
    private float[] field_H;
    int[] field_r;
    int field_k;
    private dd field_F;
    int field_u;
    private int field_y;
    pna field_A;
    int field_Q;
    int field_o;
    int field_I;
    int field_f;
    private int field_i;
    int field_C;
    int field_U;
    int field_J;
    int field_x;
    private tw[] field_Y;
    int field_L;
    int field_P;
    int field_V;
    int field_M;
    int field_W;
    int field_q;
    private int field_h;
    float[] field_n;
    private dd field_X;
    private int field_v;
    private nh field_R;

    final tw a(Runnable param0) {
        int var2 = 0;
        for (var2 = 0; var2 < this.field_u; var2++) {
          if (this.field_Y[var2].field_b == param0) {
            return this.field_Y[var2];
          }
        }
        return null;
    }

    final boolean d(int param0) {
        return this.field_c.a((byte) -56, param0).field_b || this.field_c.a((byte) 125, param0).field_n;
    }

    final void ya() {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int var8 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field_J == 0 &&
          this.field_W == this.field_K &&
          this.field_d == 0 &&
          this.field_P == this.field_h) {
          var1 = this.field_n.length;
          var2 = var1 - (var1 & 7);
          var3 = 0;
          while (var3 < var2) {
            incrementValue$1 = var3;
            var3++;
            this.field_n[incrementValue$1] = 2147483648.0f;
            incrementValue$2 = var3;
            var3++;
            this.field_n[incrementValue$2] = 2147483648.0f;
            incrementValue$3 = var3;
            var3++;
            this.field_n[incrementValue$3] = 2147483648.0f;
            incrementValue$4 = var3;
            var3++;
            this.field_n[incrementValue$4] = 2147483648.0f;
            incrementValue$5 = var3;
            var3++;
            this.field_n[incrementValue$5] = 2147483648.0f;
            incrementValue$6 = var3;
            var3++;
            this.field_n[incrementValue$6] = 2147483648.0f;
            incrementValue$7 = var3;
            var3++;
            this.field_n[incrementValue$7] = 2147483648.0f;
            incrementValue$8 = var3;
            var3++;
            this.field_n[incrementValue$8] = 2147483648.0f;
          }
          while (var3 < var1) {
            incrementValue$0 = var3;
            var3++;
            this.field_n[incrementValue$0] = 2147483648.0f;
          }
          return;
        }
        var1 = this.field_W - this.field_J;
        var2 = this.field_P - this.field_d;
        var3 = this.field_K - var1;
        var4 = this.field_J + this.field_d * this.field_K;
        var5 = var1 >> 3;
        var6 = var1 & 7;
        var1 = var4 - 1;
        for (var8 = -var2; var8 < 0; var8++) {
          if (var5 > 0) {
            var7 = var5;
            do {
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var7--;
            } while (var7 > 0);
          }
          if (var6 > 0) {
            var7 = var6;
            do {
              var1++;
              this.field_n[var1] = 2147483648.0f;
              var7--;
            } while (var7 > 0);
          }
          var1 = var1 + var3;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        this.field_u = param0;
        this.field_Y = new tw[this.field_u];
        for (var2 = 0; var2 < this.field_u; var2++) {
          this.field_Y[var2] = new tw(this);
        }
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        float var5;
        int[] var6_ref_int__;
        int var6;
        int[] var7_ref_int__;
        int var7;
        int[] var8;
        int[] var9;
        var5 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        if (!(var5 < (float)this.field_g) &&
          !(var5 > (float)this.field_U)) {
          var6 = (int)((float)this.field_Q * (this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2)) / var5);
          var7 = (int)((float)this.field_C * (this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2)) / var5);
          if (var6 >= this.field_p &&
            var6 <= this.field_l &&
            var7 >= this.field_k &&
            var7 <= this.field_o) {
            param3[0] = var6 - this.field_p;
            param3[1] = var7 - this.field_k;
            param3[2] = (int)var5;
            return;
          }
          var8 = param3;
          var9 = param3;
          param3[2] = -1;
          var9[1] = -1;
          var8[0] = -1;
          return;
        }
        var6_ref_int__ = param3;
        var7_ref_int__ = param3;
        param3[2] = -1;
        var7_ref_int__[1] = -1;
        var6_ref_int__[0] = -1;
    }

    final void f(int param0, int param1) {
        tw var3 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_g = param0;
        this.field_U = param1;
        var3.field_B = this.field_U - 255;
    }

    final void c(int param0) {
        qq var4 = null;
        int var5 = 0;
        dw var6 = null;
        int var2 = param0 - this.field_j;
        Object var3 = this.field_F.b((byte) 85);
        while (var3 != null) {
          var4 = (qq) (var3);
          if (var4.field_g) {
            var4.field_j = var4.field_j + var2;
            var5 = var4.field_j / 20;
            if (var5 > 0) {
              var6 = this.field_c.a((byte) -53, var4.field_f);
              var4.a(var6.field_s * var2 * 50 / 1000, var6.field_o * var2 * 50 / 1000);
              var4.field_j = var4.field_j - var5 * 20;
            }
            var4.field_g = false;
          }
          var3 = this.field_F.a((byte) 60);
        }
        this.field_j = param0;
        this.field_X.b(72, 5);
        this.field_F.b(119, 5);
    }

    final void GA(int param0) {
        this.aa(0, 0, this.field_K, this.field_h, param0, 0);
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.U(param0, param1, param2, param4, param5);
        this.U(param0, param1 + param3 - 1, param2, param4, param5);
        this.c(param0, param1 + 1, param3 - 2, param4, param5);
        this.c(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        ija var7 = null;
        java.awt.Dimension var5 = null;
        float[] array$0 = null;
        ija var6 = (ija) (this.field_G.a((byte) -112, (long)param0.hashCode()));
        if (var6 != null) {
          var6.p(30);
          var7 = tfa.a(param2, param1, param0, 0);
          this.field_G.a((long)param0.hashCode(), 116, var7);
          if (this.field_t == param0 &&
            this.field_D == null) {
            var5 = param0.getSize();
            this.field_m = var5.width;
            this.field_O = var5.height;
            this.field_T = var7;
            this.field_r = var7.field_g;
            this.field_K = var7.field_h;
            this.field_h = var7.field_f;
            if (this.field_K != this.field_y ||
              this.field_h != this.field_s) {
              this.field_y = this.field_K;
              this.field_i = this.field_K;
              this.field_s = this.field_h;
              this.field_B = this.field_h;
              array$0 = new float[this.field_y * this.field_s];
              this.field_n = array$0;
              this.field_H = array$0;
            }
            this.m();
          }
          return;
        }
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1Lifetime1;
        if (param0 >= this.field_J) {
          if (param0 >= this.field_W) {
            return;
          }
          if (param1 < this.field_d) {
            param2 = param2 - (this.field_d - param1);
            param1 = this.field_d;
          }
          if (param1 + param2 > this.field_P) {
            param2 = this.field_P - param1;
          }
          var6 = param0 + param1 * this.field_K;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = var6 + var9 * this.field_K;
                var11 = this.field_r[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.field_r[var10] = param3 + var11;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = var6 + var8Lifetime2 * this.field_K;
              var10Lifetime1 = this.field_r[var9Lifetime1];
              var11Lifetime1 = param3 + var10Lifetime1;
              var12 = (param3 & 16711935) + (var10Lifetime1 & 16711935);
              var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.field_r[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_r[var6 + var8Lifetime1 * this.field_K] = param3;
          }
        }
    }

    private final void g(int param0) {
        this.field_Y[param0].a((Runnable) ((Object) Thread.currentThread()), (byte) 100);
    }

    final void a(gda param0) {
        this.field_A = (pna) (param0);
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var15 = 0.0f;
        float var9 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        float var10 = this.field_A.field_m + (this.field_A.field_r * (float)param3 + this.field_A.field_o * (float)param4 + this.field_A.field_f * (float)param5);
        float var15Lifetime1;
        if (var9 < (float)this.field_g &&
          var10 < (float)this.field_g) {
          return;
        }
        float var11 = this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2);
        float var12 = this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2);
        float var13 = this.field_A.field_l + (this.field_A.field_g * (float)param3 + this.field_A.field_i * (float)param4 + this.field_A.field_n * (float)param5);
        float var14 = this.field_A.field_e + (this.field_A.field_h * (float)param3 + this.field_A.field_s * (float)param4 + this.field_A.field_j * (float)param5);
        if (var9 < (float)this.field_g) {
          var15 = ((float)this.field_g - var10) / (var9 - var10);
          var11 = var13 + (var11 - var13) * var15;
          var12 = var14 + (var12 - var14) * var15;
          var9 = (float)this.field_g;
        }
        if (var10 < (float)this.field_g) {
          var15Lifetime1 = ((float)this.field_g - var9) / (var10 - var9);
          var13 = var11 + (var13 - var11) * var15Lifetime1;
          var14 = var12 + (var14 - var12) * var15Lifetime1;
          var10 = (float)this.field_g;
        }
        this.a(this.field_L + (int)((float)this.field_Q * var11 / var9), this.field_w + (int)((float)this.field_C * var12 / var9), this.field_L + (int)((float)this.field_Q * var13 / var10), this.field_w + (int)((float)this.field_C * var14 / var10), param6, param7);
    }

    final void a(za param0) {
    }

    final boolean j(int param0) {
        if (this.field_e) {
          return true;
        }
        if (!this.field_c.a((byte) -17, param0).field_g) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1) throws qva {
        java.awt.Graphics var3 = null;
        if (this.field_t == null ||
          this.field_T == null) {
          throw new IllegalStateException("off");
        }
        try {
          var3 = this.field_t.getGraphics();
          this.field_T.a(this.field_O, 0, param0, 108, param1, 0, var3, this.field_m);
        } catch (Exception exception) {
          this.field_t.repaint();
        }
    }

    final boolean f() {
        return false;
    }

    final void a(float param0, float param1, float param2) {
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_L = param0;
        this.field_w = param1;
        this.field_Q = param2;
        this.field_C = param3;
        this.g();
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final int[] h(int param0) {
        qq var2 = null;
        Object var3 = null;
        dw var4 = null;
        Object stackIn_4_0 = null;
        int stackIn_10_0 = 0;
        qq stackIn_12_0;
        qq stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        int[] stackIn_12_4;
        qq stackIn_13_0;
        qq stackIn_13_1;
        boolean stackIn_13_5;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        var3 = this.field_F;
        synchronized (var3) {
          var2 = (qq) (this.field_F.a((byte) 92, (long)param0 | -9223372036854775808L));
          if (var2 == null) {
            if (!this.field_c.a(param0, (byte) 41)) {
              stackIn_4_0 = null;
              return (int[]) (stackIn_4_0);
            }
            var4 = this.field_c.a((byte) -124, param0);
            if (!var4.field_g &&
              !this.field_e) {
              stackIn_10_0 = this.field_I;
            } else {
              stackIn_10_0 = 64;
            }
            var5 = stackIn_10_0;
            stackIn_12_0 = null;
            stackIn_12_1 = null;
            stackIn_12_2 = param0;
            stackIn_12_3 = var5;
            stackIn_12_4 = this.field_c.a((byte) 40, var5, 0.699999988079071f, param0, true, var5);
            if (var4.field_d == 1) {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_5 = false;
            } else {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_5 = true;
            }
            var2 = new qq(stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_13_5);
            this.field_F.a(29166, var2, (long)param0 | -9223372036854775808L);
          }
        }
        var2.field_g = true;
        return var2.b();
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > this.field_K) {
          param2 = this.field_K;
        }
        if (param3 > this.field_h) {
          param3 = this.field_h;
        }
        this.field_J = param0;
        this.field_W = param2;
        this.field_d = param1;
        this.field_P = param3;
        this.g();
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        return (ka) ((Object) new ww(this, param0, param1, param3, param4, param2));
    }

    final boolean n() {
        return this.field_z;
    }

    final boolean j() {
        return false;
    }

    final gda e() {
        tw var1 = this.a((Runnable) ((Object) Thread.currentThread()));
        return (gda) ((Object) var1.field_u);
    }

    final void d() {
        if (this.field_t != null) {
          this.field_r = this.field_T.field_g;
          this.field_K = this.field_T.field_h;
          this.field_h = this.field_T.field_f;
          this.field_n = this.field_H;
          this.field_y = this.field_i;
          this.field_s = this.field_B;
        } else {
          this.field_K = 1;
          this.field_h = 1;
          this.field_r = null;
          this.field_y = 1;
          this.field_s = 1;
          this.field_n = null;
        }
        this.field_D = null;
        this.m();
    }

    final void k() {
        if (this.field_E) {
          rpa.a(false, true, true);
          this.field_E = false;
        }
        this.field_T = null;
        this.field_t = null;
        this.field_m = 0;
        this.field_O = 0;
        this.field_G = null;
        this.field_z = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var9Lifetime3;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var9Lifetime4;
        int var11Lifetime2Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            this.U(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            this.U(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            this.c(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            this.c(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < this.field_d) {
            param0 = param0 + var7 * (this.field_d - param1);
            param1 = this.field_d;
          }
          if (param3 >= this.field_P) {
            param3 = this.field_P - 1;
          }
          var8 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
              var9 = 256 - var8;
              while (param1 <= param3) {
                var10 = param0 >> 16;
                if (var10 >= this.field_J &&
                  var10 < this.field_W) {
                  var11 = var10 + param1 * this.field_K;
                  var12 = this.field_r[var11];
                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field_r[var10 + param1 * this.field_K] = param4 + var12;
                }
                param0 = param0 + var7;
                param1++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param1 <= param3) {
                var9Lifetime4 = param0 >> 16;
                if (var9Lifetime4 >= this.field_J &&
                  var9Lifetime4 < this.field_W) {
                  var10Lifetime2 = var9Lifetime4 + param1 * this.field_K;
                  var11Lifetime2 = this.field_r[var10Lifetime2];
                  var12Lifetime2 = param4 + var11Lifetime2;
                  var13 = (param4 & 16711935) + (var11Lifetime2 & 16711935);
                  var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                  this.field_r[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
                }
                param0 = param0 + var7;
                param1++;
              }
            }
          } else {
            while (param1 <= param3) {
              var9Lifetime3 = param0 >> 16;
              if (var9Lifetime3 >= this.field_J &&
                var9Lifetime3 < this.field_W) {
                this.field_r[var9Lifetime3 + param1 * this.field_K] = param4;
              }
              param0 = param0 + var7;
              param1++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          param1 = param1 << 16;
          param1 = param1 + 32768;
          param3 = param3 << 16;
          var7Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
          param2 = param2 + param0;
          if (param0 < this.field_J) {
            param1 = param1 + var7Lifetime1 * (this.field_J - param0);
            param0 = this.field_J;
          }
          if (param2 >= this.field_W) {
            param2 = this.field_W - 1;
          }
          var8Lifetime1 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8Lifetime1 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((param4 & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (param0 <= param2) {
                var10Lifetime1 = param1 >> 16;
                if (var10Lifetime1 >= this.field_d &&
                  var10Lifetime1 < this.field_P) {
                  var11Lifetime1 = param0 + var10Lifetime1 * this.field_K;
                  var12Lifetime1 = this.field_r[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.field_r[var11Lifetime1] = param4 + var12Lifetime1;
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param0 <= param2) {
                var9Lifetime1 = param1 >> 16;
                if (var9Lifetime1 >= this.field_d &&
                  var9Lifetime1 < this.field_P) {
                  var10Lifetime1 = param0 + var9Lifetime1 * this.field_K;
                  var11Lifetime1 = this.field_r[var10Lifetime1];
                  var12Lifetime1 = param4 + var11Lifetime1;
                  var13Lifetime1 = (param4 & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.field_r[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            while (param0 <= param2) {
              var9Lifetime2 = param1 >> 16;
              if (var9Lifetime2 >= this.field_d &&
                var9Lifetime2 < this.field_P) {
                this.field_r[param0 + var9Lifetime2 * this.field_K] = param4;
              }
              param1 = param1 + var7Lifetime1;
              param0++;
            }
          }
        }

    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        float var6;
        int[] var7_ref_int__;
        int var7;
        int[] var8_ref_int__;
        int var8;
        int[] var9;
        int[] var10;
        var6 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        if (!(var6 < (float)this.field_g) &&
          !(var6 > (float)this.field_U)) {
          var7 = (int)((float)this.field_Q * (this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2)) / (float)param3);
          var8 = (int)((float)this.field_C * (this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2)) / (float)param3);
          if (var7 >= this.field_p &&
            var7 <= this.field_l &&
            var8 >= this.field_k &&
            var8 <= this.field_o) {
            param4[0] = var7 - this.field_p;
            param4[1] = var8 - this.field_k;
            param4[2] = (int)var6;
            return;
          }
          var9 = param4;
          var10 = param4;
          param4[2] = -1;
          var10[1] = -1;
          var9[0] = -1;
          return;
        }
        var7_ref_int__ = param4;
        var8_ref_int__ = param4;
        param4[2] = -1;
        var8_ref_int__[1] = -1;
        var7_ref_int__[0] = -1;
    }

    private final void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var22Lifetime1;
        if (param3 < 0) {
          param3 = -param3;
        }
        var7 = param1 - param3;
        if (var7 < this.field_d) {
          var7 = this.field_d;
        }
        var8 = param1 + param3 + 1;
        if (var8 > this.field_P) {
          var8 = this.field_P;
        }
        var9 = var7;
        var10 = param3 * param3;
        var11 = 0;
        var12 = param1 - var9;
        var13 = var12 * var12;
        var14 = var13 - var12;
        if (param1 > var8) {
          param1 = var8;
        }
        var15 = param4 >>> 24;
        if (param5 != 0 && (param5 != 1 ||
          var15 != 255)) {
          if (param5 != 1) {
            if (param5 != 2) {
              throw new IllegalArgumentException();
            }
            while (var9 < param1) {
              while (true) {
                if (var14 > var10 &&
                  var13 > var10) {
                  var16 = param0 - var11 + 1;
                  if (var16 < this.field_J) {
                    var16 = this.field_J;
                  }
                  var17 = param0 + var11;
                  if (var17 > this.field_W) {
                    var17 = this.field_W;
                  }
                  var18 = var16 + var9 * this.field_K;
                  for (var19 = var16; var19 < var17; var19++) {
                    if ((float)param2 < this.field_n[var18]) {
                      var20 = this.field_r[var18];
                      var21 = param4 + var20;
                      var22 = (param4 & 16711935) + (var20 & 16711935);
                      var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                      this.field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
                    }
                    var18++;
                  }
                  var9++;
                  incrementValue$2 = var12;
                  var12--;
                  var13 = var13 - (incrementValue$2 + var12);
                  var14 = var14 - (var12 + var12);
                  break;
                }
                var13 = var13 + (var11 + var11);
                incrementValue$3 = var11;
                var11++;
                var14 = var14 + (incrementValue$3 + var11);
              }
            }
            var11 = param3;
            var12 = -var12;
            var14 = var12 * var12 + var10;
            var13 = var14 - var11;
            var14 = var14 - var12;
            while (var9 < var8) {
              while (var14 > var10) {
                if (var13 > var10) {
                  incrementValue$0 = var11;
                  var11--;
                  var14 = var14 - (incrementValue$0 + var11);
                  var13 = var13 - (var11 + var11);
                  continue;
                }
                break;
              }
              var16 = param0 - var11;
              if (var16 < this.field_J) {
                var16 = this.field_J;
              }
              var17 = param0 + var11;
              if (var17 > this.field_W - 1) {
                var17 = this.field_W - 1;
              }
              var18 = var16 + var9 * this.field_K;
              for (var19 = var16; var19 <= var17; var19++) {
                if ((float)param2 < this.field_n[var18]) {
                  var20 = this.field_r[var18];
                  var21 = param4 + var20;
                  var22Lifetime1 = (param4 & 16711935) + (var20 & 16711935);
                  var20 = (var22Lifetime1 & 16777472) + (var21 - var22Lifetime1 & 65536);
                  this.field_r[var18] = var21 - var20 | var20 - (var20 >>> 8);
                }
                var18++;
              }
              var9++;
              var14 = var14 + (var12 + var12);
              incrementValue$1 = var12;
              var12++;
              var13 = var13 + (incrementValue$1 + var12);
            }
            return;
          } else {
            param4 = ((param4 & 16711935) * var15 >> 8 & 16711935) + ((param4 & 65280) * var15 >> 8 & 65280) + (var15 << 24);
            var16 = 256 - var15;
            while (var9 < param1) {
              while (true) {
                if (var14 > var10 &&
                  var13 > var10) {
                  var17 = param0 - var11 + 1;
                  if (var17 < this.field_J) {
                    var17 = this.field_J;
                  }
                  var18 = param0 + var11;
                  if (var18 > this.field_W) {
                    var18 = this.field_W;
                  }
                  var19 = var17 + var9 * this.field_K;
                  for (var20 = var17; var20 < var18; var20++) {
                    if ((float)param2 < this.field_n[var19]) {
                      var21 = this.field_r[var19];
                      var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                      this.field_r[var19] = param4 + var21;
                    }
                    var19++;
                  }
                  var9++;
                  incrementValue$6 = var12;
                  var12--;
                  var13 = var13 - (incrementValue$6 + var12);
                  var14 = var14 - (var12 + var12);
                  break;
                }
                var13 = var13 + (var11 + var11);
                incrementValue$7 = var11;
                var11++;
                var14 = var14 + (incrementValue$7 + var11);
              }
            }
            var11 = param3;
            var12 = -var12;
            var14 = var12 * var12 + var10;
            var13 = var14 - var11;
            var14 = var14 - var12;
            while (var9 < var8) {
              while (var14 > var10) {
                if (var13 > var10) {
                  incrementValue$4 = var11;
                  var11--;
                  var14 = var14 - (incrementValue$4 + var11);
                  var13 = var13 - (var11 + var11);
                  continue;
                }
                break;
              }
              var17 = param0 - var11;
              if (var17 < this.field_J) {
                var17 = this.field_J;
              }
              var18 = param0 + var11;
              if (var18 > this.field_W - 1) {
                var18 = this.field_W - 1;
              }
              var19 = var17 + var9 * this.field_K;
              for (var20 = var17; var20 <= var18; var20++) {
                if ((float)param2 < this.field_n[var19]) {
                  var21 = this.field_r[var19];
                  var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                  this.field_r[var19] = param4 + var21;
                }
                var19++;
              }
              var9++;
              var14 = var14 + (var12 + var12);
              incrementValue$5 = var12;
              var12++;
              var13 = var13 + (incrementValue$5 + var12);
            }
            return;
          }
        }
        while (var9 < param1) {
          while (true) {
            if (var14 > var10 &&
              var13 > var10) {
              var16Lifetime1 = param0 - var11 + 1;
              if (var16Lifetime1 < this.field_J) {
                var16Lifetime1 = this.field_J;
              }
              var17Lifetime1 = param0 + var11;
              if (var17Lifetime1 > this.field_W) {
                var17Lifetime1 = this.field_W;
              }
              var18Lifetime1 = var16Lifetime1 + var9 * this.field_K;
              for (var19Lifetime1 = var16Lifetime1; var19Lifetime1 < var17Lifetime1; var19Lifetime1++) {
                if ((float)param2 < this.field_n[var18Lifetime1]) {
                  this.field_r[var18Lifetime1] = param4;
                }
                var18Lifetime1++;
              }
              var9++;
              incrementValue$10 = var12;
              var12--;
              var13 = var13 - (incrementValue$10 + var12);
              var14 = var14 - (var12 + var12);
              break;
            }
            var13 = var13 + (var11 + var11);
            incrementValue$11 = var11;
            var11++;
            var14 = var14 + (incrementValue$11 + var11);
          }
        }
        var11Lifetime1 = param3;
        var12Lifetime1 = var9 - param1;
        var14Lifetime1 = var12Lifetime1 * var12Lifetime1 + var10;
        var13Lifetime1 = var14Lifetime1 - var11Lifetime1;
        var14Lifetime1 = var14Lifetime1 - var12Lifetime1;
        while (var9 < var8) {
          while (var14Lifetime1 > var10) {
            if (var13Lifetime1 > var10) {
              incrementValue$8 = var11Lifetime1;
              var11Lifetime1--;
              var14Lifetime1 = var14Lifetime1 - (incrementValue$8 + var11Lifetime1);
              var13Lifetime1 = var13Lifetime1 - (var11Lifetime1 + var11Lifetime1);
              continue;
            }
            break;
          }
          var16Lifetime2 = param0 - var11Lifetime1;
          if (var16Lifetime2 < this.field_J) {
            var16Lifetime2 = this.field_J;
          }
          var17Lifetime2 = param0 + var11Lifetime1;
          if (var17Lifetime2 > this.field_W - 1) {
            var17Lifetime2 = this.field_W - 1;
          }
          var18Lifetime2 = var16Lifetime2 + var9 * this.field_K;
          for (var19Lifetime2 = var16Lifetime2; var19Lifetime2 <= var17Lifetime2; var19Lifetime2++) {
            if ((float)param2 < this.field_n[var18Lifetime2]) {
              this.field_r[var18Lifetime2] = param4;
            }
            var18Lifetime2++;
          }
          var9++;
          var14Lifetime1 = var14Lifetime1 + (var12Lifetime1 + var12Lifetime1);
          incrementValue$9 = var12Lifetime1;
          var12Lifetime1++;
          var13Lifetime1 = var13Lifetime1 + (incrementValue$9 + var12Lifetime1);
        }
        return;
    }

    final jca a(nha param0, mw param1) {
        return (jca) ((Object) new bf(this, (nh) (param0), (ita) (param1)));
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11;
        int[] var12;
        int var13;
        int[] var14;
        nh var15;
        int[] var16;
        int stackIn_12_0 = 0;
        if (param3 == 0) {
          return;
        }
        if (param4 == 0) {
          return;
        }
        if (param6 != 65535 &&
          !this.field_c.a((byte) -7, param6).field_p) {
          if (this.field_v != param6) {
            var11 = (nh) (this.field_X.a((byte) 75, (long)param6));
            if (var11 == null) {
              var16 = this.h(param6);
              var14 = var16;
              var12 = var14;
              if (var12 == null) {
                return;
              }
              if (!this.j(param6)) {
                stackIn_12_0 = this.field_I;
              } else {
                stackIn_12_0 = 64;
              }
              var13 = stackIn_12_0;
              var15 = this.a(var16, var13, 79, var13, var13, 0);
              var11 = var15;
              this.field_X.a(29166, var15, (long)param6);
            }
            this.field_v = param6;
            this.field_R = var11;
          }
          ((pf) (this.field_R)).b(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
        } else {
          this.e(param0, param1, param2, param3, param7, param9);
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        nh var11;
        int[] var12;
        int var13;
        int[] var14;
        nh var15;
        int[] var16;
        int stackIn_12_0 = 0;
        if (param3 == 0) {
          return;
        }
        if (param4 == 0) {
          return;
        }
        if (param6 != 65535 &&
          !this.field_c.a((byte) 5, param6).field_p) {
          if (this.field_v != param6) {
            var11 = (nh) (this.field_X.a((byte) 55, (long)param6));
            if (var11 == null) {
              var16 = this.h(param6);
              var14 = var16;
              var12 = var14;
              if (var12 == null) {
                return;
              }
              if (!this.j(param6)) {
                stackIn_12_0 = this.field_I;
              } else {
                stackIn_12_0 = 64;
              }
              var13 = stackIn_12_0;
              var15 = this.a(var16, var13, 80, var13, var13, 0);
              var11 = var15;
              this.field_X.a(29166, var15, (long)param6);
            }
            this.field_v = param6;
            this.field_R = var11;
          }
          ((pf) (this.field_R)).a(param0 - param3, param1 - param4, param2, param3 << 1, param4 << 1, param8, param7, param9, 1);
        } else {
          this.e(param0, param1, param2, param3, param7, param9);
        }
    }

    final mw b(int param0, int param1) {
        return (mw) ((Object) new ita(param0, param1));
    }

    final void la() {
        this.field_J = 0;
        this.field_d = 0;
        this.field_W = this.field_K;
        this.field_P = this.field_h;
        this.g();
    }

    final gda b() {
        return (gda) ((Object) new pna());
    }

    final void xa(float param0) {
        this.field_f = (int)(param0 * 65535.0f);
    }

    final int i() {
        return this.field_g;
    }

    final void a(jca param0) {
        bf var2 = (bf) (param0);
        this.field_K = var2.field_c;
        this.field_h = var2.field_d;
        this.field_r = var2.field_g;
        this.field_D = var2;
        this.field_y = var2.field_c;
        this.field_s = var2.field_d;
        this.field_n = var2.field_e;
        this.m();
    }

    final void L(int param0, int param1, int param2) {
        int var4 = 0;
        tw var5;
        int var6;
        int var7;
        int var8;
        for (var4 = 0; var4 < this.field_Y.length; var4++) {
          var5 = this.field_Y[var4];
          var5.field_D = param0 & 16777215;
          var6 = var5.field_D >>> 16 & 255;
          if (var6 < 2) {
            var6 = 2;
          }
          var7 = var5.field_D >> 8 & 255;
          if (var7 < 2) {
            var7 = 2;
          }
          var8 = var5.field_D & 255;
          if (var8 < 2) {
            var8 = 2;
          }
          var5.field_D = var6 << 16 | var7 << 8 | var8;
          if (param1 >= 0) {
            var5.field_J = true;
          } else {
            var5.field_J = false;
          }
        }
    }

    final za a(int param0) {
        return null;
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return null;
    }

    private final void m() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_u; var1++) {
          this.field_Y[var1].a(-39);
        }
        this.la();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_J < param0) {
          this.field_J = param0;
        }
        if (this.field_d < param1) {
          this.field_d = param1;
        }
        if (this.field_W > param2) {
          this.field_W = param2;
        }
        if (this.field_P > param3) {
          this.field_P = param3;
        }
        this.g();
    }

    sfa(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
          this.a(param0, param2, param3);
          this.a(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(true);
          throw new RuntimeException("");
        }
    }

    final void c() {
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        ija var4;
        var4 = (ija) (this.field_G.a((byte) -104, (long)param0.hashCode()));
        if (var4 != null) {
          if (var4.field_h == param1 &&
            var4.field_f == param2) {
            return;
          }
          this.b(param0, param1, param2);
        } else {
          var4 = tfa.a(param2, param1, param0, 0);
          this.field_G.a((long)param0.hashCode(), 125, var4);
        }
    }

    final void a(int param0, ob[] param1) {
    }

    final nh a(jpa param0, boolean param1) {
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
        var20 = param0.field_g;
        var16 = var20;
        var3 = var16;
        var4 = param0.field_f;
        var5 = param0.field_i;
        var6 = param0.field_a;
        if (param1 &&
          param0.field_h == null) {
          var22 = new int[var20.length];
          var18 = var22;
          var8 = var18;
          var21 = new byte[var5 * var6];
          var17 = var21;
          var14 = var17;
          var9 = var14;
          for (var10 = 0; var10 < var6; var10++) {
            var11 = var10 * var5;
            for (var12 = 0; var12 < var5; var12++) {
              var14[var11 + var12] = var4[var11 + var12];
            }
          }
          for (var10 = 0; var10 < var20.length; var10++) {
            var8[var10] = var20[var10];
          }
          var7 = new kf(this, var21, var22, var5, var6);
        } else {
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_h;
          if (var9 != null) {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
              }
            }
            var7 = new vqa(this, var23, var5, var6);
          } else {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var13 = var3[var4[var11 + var12] & 255];
                stackIn_26_0 = var15;
                stackIn_26_1 = var11 + var12;
                if (var13 == 0) {
                  stackIn_27_2 = 0;
                } else {
                  stackIn_27_2 = -16777216 | var13;
                }
                stackIn_26_0[stackIn_26_1] = stackIn_27_2;
              }
            }
            var7 = new raa(this, var23, var5, var6);
          }
        }
        ((nh) (var7)).b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
        return (nh) (var7);
    }

    private sfa(d param0) {
        super(param0);
        this.field_E = false;
        this.field_z = false;
        this.field_G = new ji(4);
        this.field_g = 50;
        this.field_f = 75518;
        this.field_Q = 512;
        this.field_d = 0;
        this.field_I = 128;
        this.field_J = 0;
        this.field_M = 78642;
        this.field_W = 0;
        this.field_q = 45823;
        this.field_P = 0;
        this.field_e = false;
        this.field_U = 3500;
        this.field_C = 512;
        this.field_X = new dd(16);
        this.field_v = -1;
        try {
          this.field_F = new dd(256);
          this.field_A = new pna();
          this.i(1);
          this.g(0);
          ija.a(true, (byte) 100, true);
          this.field_E = true;
          this.field_j = (int)bva.b((byte) -107);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(true);
          throw new RuntimeException("");
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        float var16 = 0.0f;
        float var10 = this.field_A.field_m + (this.field_A.field_r * (float)param0 + this.field_A.field_o * (float)param1 + this.field_A.field_f * (float)param2);
        float var11 = this.field_A.field_m + (this.field_A.field_r * (float)param3 + this.field_A.field_o * (float)param4 + this.field_A.field_f * (float)param5);
        float var16Lifetime1;
        if (var10 < (float)this.field_g &&
          var11 < (float)this.field_g) {
          return;
        }
        float var12 = this.field_A.field_l + (this.field_A.field_g * (float)param0 + this.field_A.field_i * (float)param1 + this.field_A.field_n * (float)param2);
        float var13 = this.field_A.field_e + (this.field_A.field_h * (float)param0 + this.field_A.field_s * (float)param1 + this.field_A.field_j * (float)param2);
        float var14 = this.field_A.field_l + (this.field_A.field_g * (float)param3 + this.field_A.field_i * (float)param4 + this.field_A.field_n * (float)param5);
        float var15 = this.field_A.field_e + (this.field_A.field_h * (float)param3 + this.field_A.field_s * (float)param4 + this.field_A.field_j * (float)param5);
        if (var10 < (float)this.field_g) {
          var16 = ((float)this.field_g - var11) / (var10 - var11);
          var12 = var14 + (var12 - var14) * var16;
          var13 = var15 + (var13 - var15) * var16;
          var10 = (float)this.field_g;
        }
        if (var11 < (float)this.field_g) {
          var16Lifetime1 = ((float)this.field_g - var10) / (var11 - var10);
          var14 = var12 + (var14 - var12) * var16Lifetime1;
          var15 = var13 + (var15 - var13) * var16Lifetime1;
          var11 = (float)this.field_g;
        }
        this.a(this.field_L + (int)((float)this.field_Q * var12 / (float)param6), this.field_w + (int)((float)this.field_C * var13 / (float)param6), this.field_L + (int)((float)this.field_Q * var14 / (float)param6), this.field_w + (int)((float)this.field_C * var15 / (float)param6), param7, param8);
    }

    final int[] Y() {
        return new int[]{this.field_L, this.field_w, this.field_Q, this.field_C};
    }

    final void K(int[] param0) {
        param0[0] = this.field_J;
        param0[1] = this.field_d;
        param0[2] = this.field_W;
        param0[3] = this.field_P;
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        this.field_q = (int)(param1 * 65535.0f);
        this.field_M = (int)(param2 * 65535.0f);
        float var7 = (float)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        this.field_x = (int)(param3 * 65535.0f / var7);
        this.field_V = (int)(param4 * 65535.0f / var7);
        this.field_S = (int)(param5 * 65535.0f / var7);
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1Lifetime1;
        if (param1 >= this.field_d) {
          if (param1 >= this.field_P) {
            return;
          }
          if (param0 < this.field_J) {
            param2 = param2 - (this.field_J - param0);
            param0 = this.field_J;
          }
          if (param0 + param2 > this.field_W) {
            param2 = this.field_W - param0;
          }
          var6 = param0 + param1 * this.field_K;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = this.field_r[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.field_r[var6 + var9] = param3 + var10;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = this.field_r[var6 + var8Lifetime2];
              var10Lifetime1 = param3 + var9Lifetime1;
              var11 = (param3 & 16711935) + (var9Lifetime1 & 16711935);
              var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.field_r[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_r[var6 + var8Lifetime1] = param3;
          }
        }
    }

    final int XA() {
        return this.field_U;
    }

    private final void g() {
        iua var2_ref_iua = null;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        int var1Lifetime1;
        this.field_p = this.field_J - this.field_L;
        this.field_l = this.field_W - this.field_L;
        this.field_k = this.field_d - this.field_w;
        this.field_o = this.field_P - this.field_w;
        for (var1 = 0; var1 < this.field_u; var1++) {
          var2_ref_iua = this.field_Y[var1].field_v;
          var2_ref_iua.field_e = this.field_L - this.field_J;
          var2_ref_iua.field_n = this.field_w - this.field_d;
          var2_ref_iua.field_h = this.field_W - this.field_J;
          var2_ref_iua.field_v = this.field_P - this.field_d;
        }
        var1Lifetime1 = this.field_d * this.field_K + this.field_J;
        for (var2 = this.field_d; var2 < this.field_P; var2++) {
          for (var3 = 0; var3 < this.field_u; var3++) {
            this.field_Y[var3].field_v.field_p[var2 - this.field_d] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.field_K;
        }
    }

    final da a(qla param0, jpa[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].field_i;
          var5[var7] = param1[var7].field_a;
          if (param1[var7].field_h != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (da) ((Object) new sn(this, param0, param1, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (var6 == 0) {
          return (da) ((Object) new le(this, param0, param1, var4, var5));
        }
        return (da) ((Object) new nu(this, param0, param1, var4, var5));
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = (param1 + var8) * this.field_K + param0;
          for (var10 = 0; var10 < param2; var10++) {
            incrementValue$0 = param5;
            param5++;
            this.field_r[var9 + var10] = param4[incrementValue$0];
          }
          param5 = param5 + param6;
        }
    }

    final void a() {
    }

    private final void a(java.awt.Canvas param0) {
        float[] array$1 = null;
        ija var2;
        java.awt.Dimension var3;
        if (param0 == null) {
          this.field_t = null;
          this.field_T = null;
          if (this.field_D == null) {
            this.field_r = null;
            this.field_h = 1;
            this.field_K = 1;
            this.field_s = 1;
            this.field_y = 1;
            this.m();
          }
        } else {
          var2 = (ija) (this.field_G.a((byte) -116, (long)param0.hashCode()));
          if (var2 != null) {
            this.field_t = param0;
            var3 = param0.getSize();
            this.field_m = var3.width;
            this.field_O = var3.height;
            this.field_T = var2;
            if (this.field_D == null) {
              this.field_r = var2.field_g;
              this.field_K = var2.field_h;
              this.field_h = var2.field_f;
              if (this.field_K != this.field_y ||
                this.field_h != this.field_s) {
                this.field_y = this.field_K;
                this.field_i = this.field_K;
                this.field_s = this.field_h;
                this.field_B = this.field_h;
                array$1 = new float[this.field_y * this.field_s];
                this.field_n = array$1;
                this.field_H = array$1;
              }
              this.m();
            }
          }
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime2;
        int var12Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var15Lifetime5;
        int var15Lifetime6;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var16Lifetime6;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var17Lifetime6;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var18Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var14Lifetime9;
        int var14Lifetime10;
        int var14Lifetime11;
        int var15Lifetime7;
        int var15Lifetime8;
        int var15Lifetime9;
        int var15Lifetime10;
        int var15Lifetime11;
        int var16Lifetime7;
        int var16Lifetime8;
        int var16Lifetime9;
        int var16Lifetime10;
        int var16Lifetime11;
        int var17Lifetime7;
        int var17Lifetime8;
        int var17Lifetime9;
        int var17Lifetime10;
        int var17Lifetime11;
        int var18Lifetime7;
        int var18Lifetime8;
        int var18Lifetime9;
        int var18Lifetime10;
        int var18Lifetime11;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        int var14Lifetime1Lifetime4;
        int var14Lifetime6Lifetime1;
        int var14Lifetime6Lifetime2;
        int var14Lifetime6Lifetime3;
        int var14Lifetime6Lifetime4;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        int var15Lifetime1Lifetime4;
        int var15Lifetime6Lifetime1;
        int var15Lifetime6Lifetime2;
        int var15Lifetime6Lifetime3;
        int var15Lifetime6Lifetime4;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var16Lifetime1Lifetime3;
        int var16Lifetime1Lifetime4;
        int var16Lifetime6Lifetime1;
        int var16Lifetime6Lifetime2;
        int var16Lifetime6Lifetime3;
        int var16Lifetime6Lifetime4;
        int var17Lifetime1Lifetime1;
        int var17Lifetime1Lifetime2;
        int var17Lifetime1Lifetime3;
        int var17Lifetime1Lifetime4;
        int var17Lifetime6Lifetime1;
        int var17Lifetime6Lifetime2;
        int var17Lifetime6Lifetime3;
        int var17Lifetime6Lifetime4;
        int var18Lifetime1Lifetime1;
        int var18Lifetime1Lifetime2;
        int var18Lifetime1Lifetime3;
        int var18Lifetime1Lifetime4;
        int var18Lifetime6Lifetime1;
        int var18Lifetime6Lifetime2;
        int var18Lifetime6Lifetime3;
        int var18Lifetime6Lifetime4;
        int var14Lifetime12;
        int var14Lifetime13;
        int var14Lifetime14;
        int var14Lifetime15;
        int var15Lifetime12;
        int var15Lifetime13;
        int var15Lifetime14;
        int var15Lifetime15;
        int var16Lifetime12;
        int var16Lifetime13;
        int var16Lifetime14;
        int var16Lifetime15;
        int var16Lifetime16;
        int var16Lifetime17;
        int var16Lifetime18;
        int var16Lifetime19;
        int var17Lifetime12;
        int var17Lifetime13;
        int var17Lifetime14;
        int var17Lifetime15;
        int var18Lifetime12;
        int var18Lifetime13;
        int var18Lifetime14;
        int var18Lifetime15;
        int var14Lifetime6Lifetime5;
        int var15Lifetime6Lifetime5;
        int var16Lifetime6Lifetime5;
        int var17Lifetime6Lifetime5;
        int var18Lifetime6Lifetime5;
        int var14Lifetime11Lifetime1;
        int var14Lifetime11Lifetime2;
        int var14Lifetime11Lifetime3;
        int var14Lifetime11Lifetime4;
        int var15Lifetime11Lifetime1;
        int var15Lifetime11Lifetime2;
        int var15Lifetime11Lifetime3;
        int var15Lifetime11Lifetime4;
        int var16Lifetime7Lifetime1;
        int var16Lifetime8Lifetime1;
        int var16Lifetime9Lifetime1;
        int var16Lifetime10Lifetime1;
        int var16Lifetime11Lifetime1;
        int var16Lifetime11Lifetime2;
        int var16Lifetime11Lifetime3;
        int var16Lifetime11Lifetime4;
        int var16Lifetime11Lifetime5;
        int var17Lifetime11Lifetime1;
        int var17Lifetime11Lifetime2;
        int var17Lifetime11Lifetime3;
        int var17Lifetime11Lifetime4;
        int var18Lifetime11Lifetime1;
        int var18Lifetime11Lifetime2;
        int var18Lifetime11Lifetime3;
        int var18Lifetime11Lifetime4;
        int var14Lifetime1Lifetime4Lifetime1;
        int var14Lifetime1Lifetime4Lifetime2;
        int var14Lifetime1Lifetime4Lifetime3;
        int var14Lifetime1Lifetime4Lifetime4;
        int var14Lifetime1Lifetime4Lifetime5;
        int var14Lifetime1Lifetime4Lifetime6;
        int var14Lifetime1Lifetime4Lifetime7;
        int var14Lifetime6Lifetime1Lifetime1;
        int var14Lifetime6Lifetime2Lifetime1;
        int var15Lifetime1Lifetime4Lifetime1;
        int var15Lifetime1Lifetime4Lifetime2;
        int var15Lifetime1Lifetime4Lifetime3;
        int var15Lifetime1Lifetime4Lifetime4;
        int var15Lifetime1Lifetime4Lifetime5;
        int var15Lifetime1Lifetime4Lifetime6;
        int var15Lifetime1Lifetime4Lifetime7;
        int var15Lifetime6Lifetime1Lifetime1;
        int var15Lifetime6Lifetime2Lifetime1;
        int var16Lifetime1Lifetime4Lifetime1;
        int var16Lifetime1Lifetime4Lifetime2;
        int var16Lifetime1Lifetime4Lifetime3;
        int var16Lifetime1Lifetime4Lifetime4;
        int var16Lifetime1Lifetime4Lifetime5;
        int var16Lifetime1Lifetime4Lifetime6;
        int var16Lifetime1Lifetime4Lifetime7;
        int var16Lifetime6Lifetime1Lifetime1;
        int var16Lifetime6Lifetime2Lifetime1;
        int var17Lifetime1Lifetime4Lifetime1;
        int var17Lifetime1Lifetime4Lifetime2;
        int var17Lifetime1Lifetime4Lifetime3;
        int var17Lifetime1Lifetime4Lifetime4;
        int var17Lifetime1Lifetime4Lifetime5;
        int var17Lifetime1Lifetime4Lifetime6;
        int var17Lifetime1Lifetime4Lifetime7;
        int var17Lifetime6Lifetime1Lifetime1;
        int var17Lifetime6Lifetime2Lifetime1;
        int var18Lifetime1Lifetime4Lifetime1;
        int var18Lifetime1Lifetime4Lifetime2;
        int var18Lifetime1Lifetime4Lifetime3;
        int var18Lifetime1Lifetime4Lifetime4;
        int var18Lifetime1Lifetime4Lifetime5;
        int var18Lifetime1Lifetime4Lifetime6;
        int var18Lifetime1Lifetime4Lifetime7;
        int var18Lifetime6Lifetime1Lifetime1;
        int var18Lifetime6Lifetime2Lifetime1;
        if (param2 == 0) {
          if (param0 >= this.field_J) {
            if (param1 >= this.field_d &&
              param0 < this.field_W &&
              param1 < this.field_P) {
              var6 = param3 >>> 24;
              var7 = param0 + param1 * this.field_K;
              if (param4 != 0 && (param4 != 1 ||
                var6 != 255)) {
                if (param4 == 1) {
                  var8 = var7;
                  var9 = param3;
                  var10 = var6;
                  var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                  var11 = 256 - var10;
                  var12 = this.field_r[var8];
                  var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                  this.field_r[var8] = var9 + var12;
                  return;
                }
                if (param4 != 2) {
                  return;
                }
                var8Lifetime2 = var7;
                var9Lifetime2 = param3;
                var10Lifetime2 = this.field_r[var8Lifetime2];
                var11Lifetime2 = var9Lifetime2 + var10Lifetime2;
                var12Lifetime2 = (var9Lifetime2 & 16711935) + (var10Lifetime2 & 16711935);
                var10Lifetime3 = (var12Lifetime2 & 16777472) + (var11Lifetime2 - var12Lifetime2 & 65536);
                this.field_r[var8Lifetime2] = var11Lifetime2 - var10Lifetime3 | var10Lifetime3 - (var10Lifetime3 >>> 8);
                return;
              }
              this.field_r[var7] = param3;
              return;
            }
            return;
          }
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        if (this.field_W > this.field_J) {
          if (this.field_P <= this.field_d) {
            return;
          }
          if (param0 + param2 >= this.field_J) {
            if (param0 - param2 < this.field_W &&
              param1 + param2 >= this.field_d &&
              param1 - param2 < this.field_P) {
              var6Lifetime1 = param0 + param1 * this.field_K;
              var7Lifetime1 = var6Lifetime1;
              var8Lifetime1 = var6Lifetime1 - param2 * this.field_K;
              var9Lifetime1 = var6Lifetime1 + param2 * this.field_K;
              var10Lifetime1 = param2;
              var11Lifetime1 = 0;
              param2 = param2 * param2;
              var12Lifetime1 = param2 - var10Lifetime1;
              var13 = param3 >>> 24;
              if (param4 != 0 && (param4 != 1 ||
                var13 != 255)) {
                if (param4 != 1) {
                  if (param4 != 2) {
                    return;
                  }
                  if (param0 - var10Lifetime1 >= this.field_J &&
                    param0 + var10Lifetime1 < this.field_W &&
                    param1 - var10Lifetime1 >= this.field_d &&
                    param1 + var10Lifetime1 < this.field_P) {
                    var14 = var6Lifetime1 - var10Lifetime1;
                    var15 = param3;
                    var16 = this.field_r[var14];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16Lifetime12 = (var18 & 16777472) + (var17 - var18 & 65536);
                    this.field_r[var14] = var17 - var16Lifetime12 | var16Lifetime12 - (var16Lifetime12 >>> 8);
                    var14Lifetime12 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime12 = param3;
                    var16Lifetime13 = this.field_r[var14Lifetime12];
                    var17Lifetime12 = var15Lifetime12 + var16Lifetime13;
                    var18Lifetime12 = (var15Lifetime12 & 16711935) + (var16Lifetime13 & 16711935);
                    var16Lifetime14 = (var18Lifetime12 & 16777472) + (var17Lifetime12 - var18Lifetime12 & 65536);
                    this.field_r[var14Lifetime12] = var17Lifetime12 - var16Lifetime14 | var16Lifetime14 - (var16Lifetime14 >>> 8);
                    var14Lifetime13 = var8Lifetime1;
                    var15Lifetime13 = param3;
                    var16Lifetime15 = this.field_r[var14Lifetime13];
                    var17Lifetime13 = var15Lifetime13 + var16Lifetime15;
                    var18Lifetime13 = (var15Lifetime13 & 16711935) + (var16Lifetime15 & 16711935);
                    var16Lifetime16 = (var18Lifetime13 & 16777472) + (var17Lifetime13 - var18Lifetime13 & 65536);
                    this.field_r[var14Lifetime13] = var17Lifetime13 - var16Lifetime16 | var16Lifetime16 - (var16Lifetime16 >>> 8);
                    var14Lifetime14 = var9Lifetime1;
                    var15Lifetime14 = param3;
                    var16Lifetime17 = this.field_r[var14Lifetime14];
                    var17Lifetime14 = var15Lifetime14 + var16Lifetime17;
                    var18Lifetime14 = (var15Lifetime14 & 16711935) + (var16Lifetime17 & 16711935);
                    var16Lifetime18 = (var18Lifetime14 & 16777472) + (var17Lifetime14 - var18Lifetime14 & 65536);
                    this.field_r[var14Lifetime14] = var17Lifetime14 - var16Lifetime18 | var16Lifetime18 - (var16Lifetime18 >>> 8);
                    while (true) {
                      incrementValue$0 = var11Lifetime1;
                      var11Lifetime1++;
                      var12Lifetime1 = var12Lifetime1 + (incrementValue$0 + var11Lifetime1);
                      var6Lifetime1 = var6Lifetime1 - this.field_K;
                      var7Lifetime1 = var7Lifetime1 + this.field_K;
                      if (var12Lifetime1 > param2) {
                        var10Lifetime1--;
                        var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                        var8Lifetime1 = var8Lifetime1 + this.field_K;
                        var9Lifetime1 = var9Lifetime1 - this.field_K;
                      }
                      if (var10Lifetime1 < var11Lifetime1) {
                        return;
                      }
                      var14Lifetime15 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_r[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_r[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                    }
                  }
                  if (param0 - var10Lifetime1 >= this.field_J &&
                    param1 >= this.field_d &&
                    param1 < this.field_P) {
                    var14Lifetime7 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime7 = param3;
                    var16Lifetime7 = this.field_r[var14Lifetime7];
                    var17Lifetime7 = var15Lifetime7 + var16Lifetime7;
                    var18Lifetime7 = (var15Lifetime7 & 16711935) + (var16Lifetime7 & 16711935);
                    var16Lifetime7Lifetime1 = (var18Lifetime7 & 16777472) + (var17Lifetime7 - var18Lifetime7 & 65536);
                    this.field_r[var14Lifetime7] = var17Lifetime7 - var16Lifetime7Lifetime1 | var16Lifetime7Lifetime1 - (var16Lifetime7Lifetime1 >>> 8);
                  }
                  if (param0 + var10Lifetime1 < this.field_W &&
                    param1 >= this.field_d &&
                    param1 < this.field_P) {
                    var14Lifetime8 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime8 = param3;
                    var16Lifetime8 = this.field_r[var14Lifetime8];
                    var17Lifetime8 = var15Lifetime8 + var16Lifetime8;
                    var18Lifetime8 = (var15Lifetime8 & 16711935) + (var16Lifetime8 & 16711935);
                    var16Lifetime8Lifetime1 = (var18Lifetime8 & 16777472) + (var17Lifetime8 - var18Lifetime8 & 65536);
                    this.field_r[var14Lifetime8] = var17Lifetime8 - var16Lifetime8Lifetime1 | var16Lifetime8Lifetime1 - (var16Lifetime8Lifetime1 >>> 8);
                  }
                  if (param1 - var10Lifetime1 >= this.field_d &&
                    param0 >= this.field_J &&
                    param0 < this.field_W) {
                    var14Lifetime9 = var8Lifetime1;
                    var15Lifetime9 = param3;
                    var16Lifetime9 = this.field_r[var14Lifetime9];
                    var17Lifetime9 = var15Lifetime9 + var16Lifetime9;
                    var18Lifetime9 = (var15Lifetime9 & 16711935) + (var16Lifetime9 & 16711935);
                    var16Lifetime9Lifetime1 = (var18Lifetime9 & 16777472) + (var17Lifetime9 - var18Lifetime9 & 65536);
                    this.field_r[var14Lifetime9] = var17Lifetime9 - var16Lifetime9Lifetime1 | var16Lifetime9Lifetime1 - (var16Lifetime9Lifetime1 >>> 8);
                  }
                  if (param1 + var10Lifetime1 < this.field_P &&
                    param0 >= this.field_J &&
                    param0 < this.field_W) {
                    var14Lifetime10 = var9Lifetime1;
                    var15Lifetime10 = param3;
                    var16Lifetime10 = this.field_r[var14Lifetime10];
                    var17Lifetime10 = var15Lifetime10 + var16Lifetime10;
                    var18Lifetime10 = (var15Lifetime10 & 16711935) + (var16Lifetime10 & 16711935);
                    var16Lifetime10Lifetime1 = (var18Lifetime10 & 16777472) + (var17Lifetime10 - var18Lifetime10 & 65536);
                    this.field_r[var14Lifetime10] = var17Lifetime10 - var16Lifetime10Lifetime1 | var16Lifetime10Lifetime1 - (var16Lifetime10Lifetime1 >>> 8);
                  }
                  while (true) {
                    incrementValue$1 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$1 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.field_K;
                    var7Lifetime1 = var7Lifetime1 + this.field_K;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.field_K;
                      var9Lifetime1 = var9Lifetime1 - this.field_K;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    if (param1 - var10Lifetime1 >= this.field_d &&
                      param1 - var10Lifetime1 < this.field_P) {
                      if (param0 - var11Lifetime1 >= this.field_J &&
                        param0 - var11Lifetime1 < this.field_W) {
                        var14Lifetime11 = var8Lifetime1 - var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.field_r[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.field_r[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                      if (param0 + var11Lifetime1 >= this.field_J &&
                        param0 + var11Lifetime1 < this.field_W) {
                        var14Lifetime11 = var8Lifetime1 + var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.field_r[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.field_r[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                    }
                    if (param1 - var11Lifetime1 >= this.field_d &&
                      param1 - var11Lifetime1 < this.field_P) {
                      if (param0 - var10Lifetime1 >= this.field_J &&
                        param0 - var10Lifetime1 < this.field_W) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.field_r[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.field_r[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.field_J &&
                        param0 + var10Lifetime1 < this.field_W) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.field_r[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.field_r[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                    }
                    if (param1 + var11Lifetime1 >= this.field_d &&
                      param1 + var11Lifetime1 < this.field_P) {
                      if (param0 - var10Lifetime1 >= this.field_J &&
                        param0 - var10Lifetime1 < this.field_W) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.field_r[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.field_r[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.field_J &&
                        param0 + var10Lifetime1 < this.field_W) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.field_r[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.field_r[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                    }
                    if (param1 + var10Lifetime1 < this.field_d) {
                      continue;
                    }
                    if (param1 + var10Lifetime1 >= this.field_P) {
                      continue;
                    }
                    if (param0 - var11Lifetime1 >= this.field_J &&
                      param0 - var11Lifetime1 < this.field_W) {
                      var14Lifetime11Lifetime3 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime11Lifetime3 = param3;
                      var16Lifetime11Lifetime3 = this.field_r[var14Lifetime11Lifetime3];
                      var17Lifetime11Lifetime3 = var15Lifetime11Lifetime3 + var16Lifetime11Lifetime3;
                      var18Lifetime11Lifetime3 = (var15Lifetime11Lifetime3 & 16711935) + (var16Lifetime11Lifetime3 & 16711935);
                      var16Lifetime11Lifetime3 = (var18Lifetime11Lifetime3 & 16777472) + (var17Lifetime11Lifetime3 - var18Lifetime11Lifetime3 & 65536);
                      this.field_r[var14Lifetime11Lifetime3] = var17Lifetime11Lifetime3 - var16Lifetime11Lifetime3 | var16Lifetime11Lifetime3 - (var16Lifetime11Lifetime3 >>> 8);
                    }
                    if (param0 + var11Lifetime1 < this.field_J) {
                      continue;
                    }
                    if (param0 + var11Lifetime1 >= this.field_W) {
                      continue;
                    }
                    var14Lifetime11Lifetime4 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime11Lifetime4 = param3;
                    var16Lifetime11Lifetime4 = this.field_r[var14Lifetime11Lifetime4];
                    var17Lifetime11Lifetime4 = var15Lifetime11Lifetime4 + var16Lifetime11Lifetime4;
                    var18Lifetime11Lifetime4 = (var15Lifetime11Lifetime4 & 16711935) + (var16Lifetime11Lifetime4 & 16711935);
                    var16Lifetime11Lifetime5 = (var18Lifetime11Lifetime4 & 16777472) + (var17Lifetime11Lifetime4 - var18Lifetime11Lifetime4 & 65536);
                    this.field_r[var14Lifetime11Lifetime4] = var17Lifetime11Lifetime4 - var16Lifetime11Lifetime5 | var16Lifetime11Lifetime5 - (var16Lifetime11Lifetime5 >>> 8);
                  }
                }
                if (param0 - var10Lifetime1 >= this.field_J &&
                  param0 + var10Lifetime1 < this.field_W &&
                  param1 - var10Lifetime1 >= this.field_d &&
                  param1 + var10Lifetime1 < this.field_P) {
                  var14Lifetime1 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime1 = param3;
                  var16Lifetime1 = var13;
                  var15Lifetime1 = ((var15Lifetime1 & 16711935) * var16Lifetime1 >> 8 & 16711935) + ((var15Lifetime1 & 65280) * var16Lifetime1 >> 8 & 65280) + (var16Lifetime1 << 24);
                  var17Lifetime1 = 256 - var16Lifetime1;
                  var18Lifetime1 = this.field_r[var14Lifetime1];
                  var18Lifetime1 = ((var18Lifetime1 & 16711935) * var17Lifetime1 >> 8 & 16711935) + ((var18Lifetime1 & 65280) * var17Lifetime1 >> 8 & 65280);
                  this.field_r[var14Lifetime1] = var15Lifetime1 + var18Lifetime1;
                  var14Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime1Lifetime1 = param3;
                  var16Lifetime1Lifetime1 = var13;
                  var15Lifetime1Lifetime1 = ((var15Lifetime1Lifetime1 & 16711935) * var16Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime1 & 65280) * var16Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime1 << 24);
                  var17Lifetime1Lifetime1 = 256 - var16Lifetime1Lifetime1;
                  var18Lifetime1Lifetime1 = this.field_r[var14Lifetime1Lifetime1];
                  var18Lifetime1Lifetime1 = ((var18Lifetime1Lifetime1 & 16711935) * var17Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime1 & 65280) * var17Lifetime1Lifetime1 >> 8 & 65280);
                  this.field_r[var14Lifetime1Lifetime1] = var15Lifetime1Lifetime1 + var18Lifetime1Lifetime1;
                  var14Lifetime1Lifetime2 = var8Lifetime1;
                  var15Lifetime1Lifetime2 = param3;
                  var16Lifetime1Lifetime2 = var13;
                  var15Lifetime1Lifetime2 = ((var15Lifetime1Lifetime2 & 16711935) * var16Lifetime1Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime2 & 65280) * var16Lifetime1Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime2 << 24);
                  var17Lifetime1Lifetime2 = 256 - var16Lifetime1Lifetime2;
                  var18Lifetime1Lifetime2 = this.field_r[var14Lifetime1Lifetime2];
                  var18Lifetime1Lifetime2 = ((var18Lifetime1Lifetime2 & 16711935) * var17Lifetime1Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime2 & 65280) * var17Lifetime1Lifetime2 >> 8 & 65280);
                  this.field_r[var14Lifetime1Lifetime2] = var15Lifetime1Lifetime2 + var18Lifetime1Lifetime2;
                  var14Lifetime1Lifetime3 = var9Lifetime1;
                  var15Lifetime1Lifetime3 = param3;
                  var16Lifetime1Lifetime3 = var13;
                  var15Lifetime1Lifetime3 = ((var15Lifetime1Lifetime3 & 16711935) * var16Lifetime1Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime3 & 65280) * var16Lifetime1Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime3 << 24);
                  var17Lifetime1Lifetime3 = 256 - var16Lifetime1Lifetime3;
                  var18Lifetime1Lifetime3 = this.field_r[var14Lifetime1Lifetime3];
                  var18Lifetime1Lifetime3 = ((var18Lifetime1Lifetime3 & 16711935) * var17Lifetime1Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime3 & 65280) * var17Lifetime1Lifetime3 >> 8 & 65280);
                  this.field_r[var14Lifetime1Lifetime3] = var15Lifetime1Lifetime3 + var18Lifetime1Lifetime3;
                  while (true) {
                    incrementValue$2 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$2 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.field_K;
                    var7Lifetime1 = var7Lifetime1 + this.field_K;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.field_K;
                      var9Lifetime1 = var9Lifetime1 - this.field_K;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    var14Lifetime1Lifetime4 = var8Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4 = param3;
                    var16Lifetime1Lifetime4 = var13;
                    var15Lifetime1Lifetime4 = ((var15Lifetime1Lifetime4 & 16711935) * var16Lifetime1Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4 & 65280) * var16Lifetime1Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4 << 24);
                    var17Lifetime1Lifetime4 = 256 - var16Lifetime1Lifetime4;
                    var18Lifetime1Lifetime4 = this.field_r[var14Lifetime1Lifetime4];
                    var18Lifetime1Lifetime4 = ((var18Lifetime1Lifetime4 & 16711935) * var17Lifetime1Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4 & 65280) * var17Lifetime1Lifetime4 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4] = var15Lifetime1Lifetime4 + var18Lifetime1Lifetime4;
                    var14Lifetime1Lifetime4Lifetime1 = var8Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime1 = param3;
                    var16Lifetime1Lifetime4Lifetime1 = var13;
                    var15Lifetime1Lifetime4Lifetime1 = ((var15Lifetime1Lifetime4Lifetime1 & 16711935) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime1 & 65280) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime1 << 24);
                    var17Lifetime1Lifetime4Lifetime1 = 256 - var16Lifetime1Lifetime4Lifetime1;
                    var18Lifetime1Lifetime4Lifetime1 = this.field_r[var14Lifetime1Lifetime4Lifetime1];
                    var18Lifetime1Lifetime4Lifetime1 = ((var18Lifetime1Lifetime4Lifetime1 & 16711935) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime1 & 65280) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime1] = var15Lifetime1Lifetime4Lifetime1 + var18Lifetime1Lifetime4Lifetime1;
                    var14Lifetime1Lifetime4Lifetime2 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime2 = param3;
                    var16Lifetime1Lifetime4Lifetime2 = var13;
                    var15Lifetime1Lifetime4Lifetime2 = ((var15Lifetime1Lifetime4Lifetime2 & 16711935) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime2 & 65280) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime2 << 24);
                    var17Lifetime1Lifetime4Lifetime2 = 256 - var16Lifetime1Lifetime4Lifetime2;
                    var18Lifetime1Lifetime4Lifetime2 = this.field_r[var14Lifetime1Lifetime4Lifetime2];
                    var18Lifetime1Lifetime4Lifetime2 = ((var18Lifetime1Lifetime4Lifetime2 & 16711935) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime2 & 65280) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime2] = var15Lifetime1Lifetime4Lifetime2 + var18Lifetime1Lifetime4Lifetime2;
                    var14Lifetime1Lifetime4Lifetime3 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime3 = param3;
                    var16Lifetime1Lifetime4Lifetime3 = var13;
                    var15Lifetime1Lifetime4Lifetime3 = ((var15Lifetime1Lifetime4Lifetime3 & 16711935) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime3 & 65280) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime3 << 24);
                    var17Lifetime1Lifetime4Lifetime3 = 256 - var16Lifetime1Lifetime4Lifetime3;
                    var18Lifetime1Lifetime4Lifetime3 = this.field_r[var14Lifetime1Lifetime4Lifetime3];
                    var18Lifetime1Lifetime4Lifetime3 = ((var18Lifetime1Lifetime4Lifetime3 & 16711935) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime3 & 65280) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime3] = var15Lifetime1Lifetime4Lifetime3 + var18Lifetime1Lifetime4Lifetime3;
                    var14Lifetime1Lifetime4Lifetime4 = var7Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime4 = param3;
                    var16Lifetime1Lifetime4Lifetime4 = var13;
                    var15Lifetime1Lifetime4Lifetime4 = ((var15Lifetime1Lifetime4Lifetime4 & 16711935) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime4 & 65280) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime4 << 24);
                    var17Lifetime1Lifetime4Lifetime4 = 256 - var16Lifetime1Lifetime4Lifetime4;
                    var18Lifetime1Lifetime4Lifetime4 = this.field_r[var14Lifetime1Lifetime4Lifetime4];
                    var18Lifetime1Lifetime4Lifetime4 = ((var18Lifetime1Lifetime4Lifetime4 & 16711935) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime4 & 65280) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime4] = var15Lifetime1Lifetime4Lifetime4 + var18Lifetime1Lifetime4Lifetime4;
                    var14Lifetime1Lifetime4Lifetime5 = var7Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime5 = param3;
                    var16Lifetime1Lifetime4Lifetime5 = var13;
                    var15Lifetime1Lifetime4Lifetime5 = ((var15Lifetime1Lifetime4Lifetime5 & 16711935) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime5 & 65280) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime5 << 24);
                    var17Lifetime1Lifetime4Lifetime5 = 256 - var16Lifetime1Lifetime4Lifetime5;
                    var18Lifetime1Lifetime4Lifetime5 = this.field_r[var14Lifetime1Lifetime4Lifetime5];
                    var18Lifetime1Lifetime4Lifetime5 = ((var18Lifetime1Lifetime4Lifetime5 & 16711935) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime5 & 65280) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime5] = var15Lifetime1Lifetime4Lifetime5 + var18Lifetime1Lifetime4Lifetime5;
                    var14Lifetime1Lifetime4Lifetime6 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime6 = param3;
                    var16Lifetime1Lifetime4Lifetime6 = var13;
                    var15Lifetime1Lifetime4Lifetime6 = ((var15Lifetime1Lifetime4Lifetime6 & 16711935) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime6 & 65280) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime6 << 24);
                    var17Lifetime1Lifetime4Lifetime6 = 256 - var16Lifetime1Lifetime4Lifetime6;
                    var18Lifetime1Lifetime4Lifetime6 = this.field_r[var14Lifetime1Lifetime4Lifetime6];
                    var18Lifetime1Lifetime4Lifetime6 = ((var18Lifetime1Lifetime4Lifetime6 & 16711935) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime6 & 65280) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime6] = var15Lifetime1Lifetime4Lifetime6 + var18Lifetime1Lifetime4Lifetime6;
                    var14Lifetime1Lifetime4Lifetime7 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime7 = param3;
                    var16Lifetime1Lifetime4Lifetime7 = var13;
                    var15Lifetime1Lifetime4Lifetime7 = ((var15Lifetime1Lifetime4Lifetime7 & 16711935) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime7 & 65280) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime7 << 24);
                    var17Lifetime1Lifetime4Lifetime7 = 256 - var16Lifetime1Lifetime4Lifetime7;
                    var18Lifetime1Lifetime4Lifetime7 = this.field_r[var14Lifetime1Lifetime4Lifetime7];
                    var18Lifetime1Lifetime4Lifetime7 = ((var18Lifetime1Lifetime4Lifetime7 & 16711935) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime7 & 65280) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 65280);
                    this.field_r[var14Lifetime1Lifetime4Lifetime7] = var15Lifetime1Lifetime4Lifetime7 + var18Lifetime1Lifetime4Lifetime7;
                  }
                }
                if (param0 - var10Lifetime1 >= this.field_J &&
                  param1 >= this.field_d &&
                  param1 < this.field_P) {
                  var14Lifetime2 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime2 = param3;
                  var16Lifetime2 = var13;
                  var15Lifetime2 = ((var15Lifetime2 & 16711935) * var16Lifetime2 >> 8 & 16711935) + ((var15Lifetime2 & 65280) * var16Lifetime2 >> 8 & 65280) + (var16Lifetime2 << 24);
                  var17Lifetime2 = 256 - var16Lifetime2;
                  var18Lifetime2 = this.field_r[var14Lifetime2];
                  var18Lifetime2 = ((var18Lifetime2 & 16711935) * var17Lifetime2 >> 8 & 16711935) + ((var18Lifetime2 & 65280) * var17Lifetime2 >> 8 & 65280);
                  this.field_r[var14Lifetime2] = var15Lifetime2 + var18Lifetime2;
                }
                if (param0 + var10Lifetime1 < this.field_W &&
                  param1 >= this.field_d &&
                  param1 < this.field_P) {
                  var14Lifetime3 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime3 = param3;
                  var16Lifetime3 = var13;
                  var15Lifetime3 = ((var15Lifetime3 & 16711935) * var16Lifetime3 >> 8 & 16711935) + ((var15Lifetime3 & 65280) * var16Lifetime3 >> 8 & 65280) + (var16Lifetime3 << 24);
                  var17Lifetime3 = 256 - var16Lifetime3;
                  var18Lifetime3 = this.field_r[var14Lifetime3];
                  var18Lifetime3 = ((var18Lifetime3 & 16711935) * var17Lifetime3 >> 8 & 16711935) + ((var18Lifetime3 & 65280) * var17Lifetime3 >> 8 & 65280);
                  this.field_r[var14Lifetime3] = var15Lifetime3 + var18Lifetime3;
                }
                if (param1 - var10Lifetime1 >= this.field_d &&
                  param0 >= this.field_J &&
                  param0 < this.field_W) {
                  var14Lifetime4 = var8Lifetime1;
                  var15Lifetime4 = param3;
                  var16Lifetime4 = var13;
                  var15Lifetime4 = ((var15Lifetime4 & 16711935) * var16Lifetime4 >> 8 & 16711935) + ((var15Lifetime4 & 65280) * var16Lifetime4 >> 8 & 65280) + (var16Lifetime4 << 24);
                  var17Lifetime4 = 256 - var16Lifetime4;
                  var18Lifetime4 = this.field_r[var14Lifetime4];
                  var18Lifetime4 = ((var18Lifetime4 & 16711935) * var17Lifetime4 >> 8 & 16711935) + ((var18Lifetime4 & 65280) * var17Lifetime4 >> 8 & 65280);
                  this.field_r[var14Lifetime4] = var15Lifetime4 + var18Lifetime4;
                }
                if (param1 + var10Lifetime1 < this.field_P &&
                  param0 >= this.field_J &&
                  param0 < this.field_W) {
                  var14Lifetime5 = var9Lifetime1;
                  var15Lifetime5 = param3;
                  var16Lifetime5 = var13;
                  var15Lifetime5 = ((var15Lifetime5 & 16711935) * var16Lifetime5 >> 8 & 16711935) + ((var15Lifetime5 & 65280) * var16Lifetime5 >> 8 & 65280) + (var16Lifetime5 << 24);
                  var17Lifetime5 = 256 - var16Lifetime5;
                  var18Lifetime5 = this.field_r[var14Lifetime5];
                  var18Lifetime5 = ((var18Lifetime5 & 16711935) * var17Lifetime5 >> 8 & 16711935) + ((var18Lifetime5 & 65280) * var17Lifetime5 >> 8 & 65280);
                  this.field_r[var14Lifetime5] = var15Lifetime5 + var18Lifetime5;
                }
                while (true) {
                  incrementValue$3 = var11Lifetime1;
                  var11Lifetime1++;
                  var12Lifetime1 = var12Lifetime1 + (incrementValue$3 + var11Lifetime1);
                  var6Lifetime1 = var6Lifetime1 - this.field_K;
                  var7Lifetime1 = var7Lifetime1 + this.field_K;
                  if (var12Lifetime1 > param2) {
                    var10Lifetime1--;
                    var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                    var8Lifetime1 = var8Lifetime1 + this.field_K;
                    var9Lifetime1 = var9Lifetime1 - this.field_K;
                  }
                  if (var10Lifetime1 < var11Lifetime1) {
                    return;
                  }
                  if (param1 - var10Lifetime1 >= this.field_d &&
                    param1 - var10Lifetime1 < this.field_P) {
                    if (param0 - var11Lifetime1 >= this.field_J &&
                      param0 - var11Lifetime1 < this.field_W) {
                      var14Lifetime6 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime6 = param3;
                      var16Lifetime6 = var13;
                      var15Lifetime6 = ((var15Lifetime6 & 16711935) * var16Lifetime6 >> 8 & 16711935) + ((var15Lifetime6 & 65280) * var16Lifetime6 >> 8 & 65280) + (var16Lifetime6 << 24);
                      var17Lifetime6 = 256 - var16Lifetime6;
                      var18Lifetime6 = this.field_r[var14Lifetime6];
                      var18Lifetime6 = ((var18Lifetime6 & 16711935) * var17Lifetime6 >> 8 & 16711935) + ((var18Lifetime6 & 65280) * var17Lifetime6 >> 8 & 65280);
                      this.field_r[var14Lifetime6] = var15Lifetime6 + var18Lifetime6;
                    }
                    if (param0 + var11Lifetime1 >= this.field_J &&
                      param0 + var11Lifetime1 < this.field_W) {
                      var14Lifetime6Lifetime5 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime6Lifetime5 = param3;
                      var16Lifetime6Lifetime5 = var13;
                      var15Lifetime6Lifetime5 = ((var15Lifetime6Lifetime5 & 16711935) * var16Lifetime6Lifetime5 >> 8 & 16711935) + ((var15Lifetime6Lifetime5 & 65280) * var16Lifetime6Lifetime5 >> 8 & 65280) + (var16Lifetime6Lifetime5 << 24);
                      var17Lifetime6Lifetime5 = 256 - var16Lifetime6Lifetime5;
                      var18Lifetime6Lifetime5 = this.field_r[var14Lifetime6Lifetime5];
                      var18Lifetime6Lifetime5 = ((var18Lifetime6Lifetime5 & 16711935) * var17Lifetime6Lifetime5 >> 8 & 16711935) + ((var18Lifetime6Lifetime5 & 65280) * var17Lifetime6Lifetime5 >> 8 & 65280);
                      this.field_r[var14Lifetime6Lifetime5] = var15Lifetime6Lifetime5 + var18Lifetime6Lifetime5;
                    }
                  }
                  if (param1 - var11Lifetime1 >= this.field_d &&
                    param1 - var11Lifetime1 < this.field_P) {
                    if (param0 - var10Lifetime1 >= this.field_J &&
                      param0 - var10Lifetime1 < this.field_W) {
                      var14Lifetime6Lifetime1 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime1 = param3;
                      var16Lifetime6Lifetime1 = var13;
                      var15Lifetime6Lifetime1 = ((var15Lifetime6Lifetime1 & 16711935) * var16Lifetime6Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1 & 65280) * var16Lifetime6Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1 << 24);
                      var17Lifetime6Lifetime1 = 256 - var16Lifetime6Lifetime1;
                      var18Lifetime6Lifetime1 = this.field_r[var14Lifetime6Lifetime1];
                      var18Lifetime6Lifetime1 = ((var18Lifetime6Lifetime1 & 16711935) * var17Lifetime6Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1 & 65280) * var17Lifetime6Lifetime1 >> 8 & 65280);
                      this.field_r[var14Lifetime6Lifetime1] = var15Lifetime6Lifetime1 + var18Lifetime6Lifetime1;
                    }
                    if (param0 + var10Lifetime1 >= this.field_J &&
                      param0 + var10Lifetime1 < this.field_W) {
                      var14Lifetime6Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime1Lifetime1 = param3;
                      var16Lifetime6Lifetime1Lifetime1 = var13;
                      var15Lifetime6Lifetime1Lifetime1 = ((var15Lifetime6Lifetime1Lifetime1 & 16711935) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1Lifetime1 & 65280) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1Lifetime1 << 24);
                      var17Lifetime6Lifetime1Lifetime1 = 256 - var16Lifetime6Lifetime1Lifetime1;
                      var18Lifetime6Lifetime1Lifetime1 = this.field_r[var14Lifetime6Lifetime1Lifetime1];
                      var18Lifetime6Lifetime1Lifetime1 = ((var18Lifetime6Lifetime1Lifetime1 & 16711935) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1Lifetime1 & 65280) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 65280);
                      this.field_r[var14Lifetime6Lifetime1Lifetime1] = var15Lifetime6Lifetime1Lifetime1 + var18Lifetime6Lifetime1Lifetime1;
                    }
                  }
                  if (param1 + var11Lifetime1 >= this.field_d &&
                    param1 + var11Lifetime1 < this.field_P) {
                    if (param0 - var10Lifetime1 >= this.field_J &&
                      param0 - var10Lifetime1 < this.field_W) {
                      var14Lifetime6Lifetime2 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime2 = param3;
                      var16Lifetime6Lifetime2 = var13;
                      var15Lifetime6Lifetime2 = ((var15Lifetime6Lifetime2 & 16711935) * var16Lifetime6Lifetime2 >> 8 & 16711935) + ((var15Lifetime6Lifetime2 & 65280) * var16Lifetime6Lifetime2 >> 8 & 65280) + (var16Lifetime6Lifetime2 << 24);
                      var17Lifetime6Lifetime2 = 256 - var16Lifetime6Lifetime2;
                      var18Lifetime6Lifetime2 = this.field_r[var14Lifetime6Lifetime2];
                      var18Lifetime6Lifetime2 = ((var18Lifetime6Lifetime2 & 16711935) * var17Lifetime6Lifetime2 >> 8 & 16711935) + ((var18Lifetime6Lifetime2 & 65280) * var17Lifetime6Lifetime2 >> 8 & 65280);
                      this.field_r[var14Lifetime6Lifetime2] = var15Lifetime6Lifetime2 + var18Lifetime6Lifetime2;
                    }
                    if (param0 + var10Lifetime1 >= this.field_J &&
                      param0 + var10Lifetime1 < this.field_W) {
                      var14Lifetime6Lifetime2Lifetime1 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime2Lifetime1 = param3;
                      var16Lifetime6Lifetime2Lifetime1 = var13;
                      var15Lifetime6Lifetime2Lifetime1 = ((var15Lifetime6Lifetime2Lifetime1 & 16711935) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime2Lifetime1 & 65280) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime2Lifetime1 << 24);
                      var17Lifetime6Lifetime2Lifetime1 = 256 - var16Lifetime6Lifetime2Lifetime1;
                      var18Lifetime6Lifetime2Lifetime1 = this.field_r[var14Lifetime6Lifetime2Lifetime1];
                      var18Lifetime6Lifetime2Lifetime1 = ((var18Lifetime6Lifetime2Lifetime1 & 16711935) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime2Lifetime1 & 65280) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 65280);
                      this.field_r[var14Lifetime6Lifetime2Lifetime1] = var15Lifetime6Lifetime2Lifetime1 + var18Lifetime6Lifetime2Lifetime1;
                    }
                  }
                  if (param1 + var10Lifetime1 < this.field_d) {
                    continue;
                  }
                  if (param1 + var10Lifetime1 >= this.field_P) {
                    continue;
                  }
                  if (param0 - var11Lifetime1 >= this.field_J &&
                    param0 - var11Lifetime1 < this.field_W) {
                    var14Lifetime6Lifetime3 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime6Lifetime3 = param3;
                    var16Lifetime6Lifetime3 = var13;
                    var15Lifetime6Lifetime3 = ((var15Lifetime6Lifetime3 & 16711935) * var16Lifetime6Lifetime3 >> 8 & 16711935) + ((var15Lifetime6Lifetime3 & 65280) * var16Lifetime6Lifetime3 >> 8 & 65280) + (var16Lifetime6Lifetime3 << 24);
                    var17Lifetime6Lifetime3 = 256 - var16Lifetime6Lifetime3;
                    var18Lifetime6Lifetime3 = this.field_r[var14Lifetime6Lifetime3];
                    var18Lifetime6Lifetime3 = ((var18Lifetime6Lifetime3 & 16711935) * var17Lifetime6Lifetime3 >> 8 & 16711935) + ((var18Lifetime6Lifetime3 & 65280) * var17Lifetime6Lifetime3 >> 8 & 65280);
                    this.field_r[var14Lifetime6Lifetime3] = var15Lifetime6Lifetime3 + var18Lifetime6Lifetime3;
                  }
                  if (param0 + var11Lifetime1 < this.field_J) {
                    continue;
                  }
                  if (param0 + var11Lifetime1 >= this.field_W) {
                    continue;
                  }
                  var14Lifetime6Lifetime4 = var9Lifetime1 + var11Lifetime1;
                  var15Lifetime6Lifetime4 = param3;
                  var16Lifetime6Lifetime4 = var13;
                  var15Lifetime6Lifetime4 = ((var15Lifetime6Lifetime4 & 16711935) * var16Lifetime6Lifetime4 >> 8 & 16711935) + ((var15Lifetime6Lifetime4 & 65280) * var16Lifetime6Lifetime4 >> 8 & 65280) + (var16Lifetime6Lifetime4 << 24);
                  var17Lifetime6Lifetime4 = 256 - var16Lifetime6Lifetime4;
                  var18Lifetime6Lifetime4 = this.field_r[var14Lifetime6Lifetime4];
                  var18Lifetime6Lifetime4 = ((var18Lifetime6Lifetime4 & 16711935) * var17Lifetime6Lifetime4 >> 8 & 16711935) + ((var18Lifetime6Lifetime4 & 65280) * var17Lifetime6Lifetime4 >> 8 & 65280);
                  this.field_r[var14Lifetime6Lifetime4] = var15Lifetime6Lifetime4 + var18Lifetime6Lifetime4;
                }
              }
              if (param0 - var10Lifetime1 >= this.field_J) {
                if (param0 + var10Lifetime1 < this.field_W) {
                  if (param1 - var10Lifetime1 >= this.field_d) {
                    if (param1 + var10Lifetime1 < this.field_P) {
                      this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                      this.field_r[var6Lifetime1 + var10Lifetime1] = param3;
                      this.field_r[var8Lifetime1] = param3;
                      this.field_r[var9Lifetime1] = param3;
                      while (true) {
                        incrementValue$4 = var11Lifetime1;
                        var11Lifetime1++;
                        var12Lifetime1 = var12Lifetime1 + (incrementValue$4 + var11Lifetime1);
                        var6Lifetime1 = var6Lifetime1 - this.field_K;
                        var7Lifetime1 = var7Lifetime1 + this.field_K;
                        if (var12Lifetime1 > param2) {
                          var10Lifetime1--;
                          var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                          var8Lifetime1 = var8Lifetime1 + this.field_K;
                          var9Lifetime1 = var9Lifetime1 - this.field_K;
                        }
                        if (var10Lifetime1 < var11Lifetime1) {
                          return;
                        }
                        this.field_r[var8Lifetime1 - var11Lifetime1] = param3;
                        this.field_r[var8Lifetime1 + var11Lifetime1] = param3;
                        this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                        this.field_r[var6Lifetime1 + var10Lifetime1] = param3;
                        this.field_r[var7Lifetime1 - var10Lifetime1] = param3;
                        this.field_r[var7Lifetime1 + var10Lifetime1] = param3;
                        this.field_r[var9Lifetime1 - var11Lifetime1] = param3;
                        this.field_r[var9Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                    if (param0 - var10Lifetime1 >= this.field_J &&
                      param1 >= this.field_d &&
                      param1 < this.field_P) {
                      this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  } else {
                    if (param0 - var10Lifetime1 >= this.field_J &&
                      param1 >= this.field_d &&
                      param1 < this.field_P) {
                      this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param0 - var10Lifetime1 >= this.field_J &&
                    param1 >= this.field_d &&
                    param1 < this.field_P) {
                    this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                }
              } else {
                if (param0 - var10Lifetime1 >= this.field_J &&
                  param1 >= this.field_d &&
                  param1 < this.field_P) {
                  this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                }
              }
              if (param0 + var10Lifetime1 < this.field_W) {
                if (param1 >= this.field_d) {
                  if (param1 < this.field_P) {
                    this.field_r[var6Lifetime1 + var10Lifetime1] = param3;
                    if (param1 - var10Lifetime1 >= this.field_d &&
                      param0 >= this.field_J &&
                      param0 < this.field_W) {
                      this.field_r[var8Lifetime1] = param3;
                    }
                  } else {
                    if (param1 - var10Lifetime1 >= this.field_d &&
                      param0 >= this.field_J &&
                      param0 < this.field_W) {
                      this.field_r[var8Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param1 - var10Lifetime1 >= this.field_d &&
                    param0 >= this.field_J &&
                    param0 < this.field_W) {
                    this.field_r[var8Lifetime1] = param3;
                  }
                }
              } else {
                if (param1 - var10Lifetime1 >= this.field_d &&
                  param0 >= this.field_J &&
                  param0 < this.field_W) {
                  this.field_r[var8Lifetime1] = param3;
                }
              }
              if (param1 + var10Lifetime1 < this.field_P &&
                param0 >= this.field_J &&
                param0 < this.field_W) {
                this.field_r[var9Lifetime1] = param3;
              }
              while (true) {
                incrementValue$5 = var11Lifetime1;
                var11Lifetime1++;
                var12Lifetime1 = var12Lifetime1 + (incrementValue$5 + var11Lifetime1);
                var6Lifetime1 = var6Lifetime1 - this.field_K;
                var7Lifetime1 = var7Lifetime1 + this.field_K;
                if (var12Lifetime1 > param2) {
                  var10Lifetime1--;
                  var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                  var8Lifetime1 = var8Lifetime1 + this.field_K;
                  var9Lifetime1 = var9Lifetime1 - this.field_K;
                }
                if (var10Lifetime1 < var11Lifetime1) {
                  return;
                }
                if (param1 - var10Lifetime1 >= this.field_d &&
                  param1 - var10Lifetime1 < this.field_P) {
                  if (param0 - var11Lifetime1 >= this.field_J) {
                    if (param0 - var11Lifetime1 < this.field_W) {
                      this.field_r[var8Lifetime1 - var11Lifetime1] = param3;
                      if (param0 + var11Lifetime1 >= this.field_J &&
                        param0 + var11Lifetime1 < this.field_W) {
                        this.field_r[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    } else {
                      if (param0 + var11Lifetime1 >= this.field_J &&
                        param0 + var11Lifetime1 < this.field_W) {
                        this.field_r[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                  } else {
                    if (param0 + var11Lifetime1 >= this.field_J &&
                      param0 + var11Lifetime1 < this.field_W) {
                      this.field_r[var8Lifetime1 + var11Lifetime1] = param3;
                    }
                  }
                }
                if (param1 - var11Lifetime1 >= this.field_d &&
                  param1 - var11Lifetime1 < this.field_P) {
                  if (param0 - var10Lifetime1 >= this.field_J &&
                    param0 - var10Lifetime1 < this.field_W) {
                    this.field_r[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.field_J &&
                    param0 + var10Lifetime1 < this.field_W) {
                    this.field_r[var6Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var11Lifetime1 >= this.field_d &&
                  param1 + var11Lifetime1 < this.field_P) {
                  if (param0 - var10Lifetime1 >= this.field_J &&
                    param0 - var10Lifetime1 < this.field_W) {
                    this.field_r[var7Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.field_J &&
                    param0 + var10Lifetime1 < this.field_W) {
                    this.field_r[var7Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var10Lifetime1 < this.field_d) {
                  continue;
                }
                if (param1 + var10Lifetime1 >= this.field_P) {
                  continue;
                }
                if (param0 - var11Lifetime1 >= this.field_J &&
                  param0 - var11Lifetime1 < this.field_W) {
                  this.field_r[var9Lifetime1 - var11Lifetime1] = param3;
                }
                if (param0 + var11Lifetime1 < this.field_J) {
                  continue;
                }
                if (param0 + var11Lifetime1 >= this.field_W) {
                  continue;
                }
                this.field_r[var9Lifetime1 + var11Lifetime1] = param3;
              }
            }
            return;
          }
        }
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$10 = 0;
        int incrementValue$9 = 0;
        int incrementValue$11 = 0;
        int incrementValue$6 = 0;
        int incrementValue$8 = 0;
        int incrementValue$7 = 0;
        int incrementValue$16 = 0;
        int incrementValue$15 = 0;
        int incrementValue$17 = 0;
        int incrementValue$12 = 0;
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var21Lifetime1;
        if (param2 < 0) {
          param2 = -param2;
        }
        var6 = param1 - param2;
        if (var6 < this.field_d) {
          var6 = this.field_d;
        }
        var7 = param1 + param2 + 1;
        if (var7 > this.field_P) {
          var7 = this.field_P;
        }
        var8 = var6;
        var9 = param2 * param2;
        var10 = 0;
        var11 = param1 - var8;
        var12 = var11 * var11;
        var13 = var12 - var11;
        if (param1 > var7) {
          param1 = var7;
        }
        var14 = param3 >>> 24;
        if (param4 != 0 && (param4 != 1 ||
          var14 != 255)) {
          if (param4 != 1) {
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            while (var8 < param1) {
              while (true) {
                if (var13 > var9 &&
                  var12 > var9) {
                  var15 = param0 - var10 + 1;
                  if (var15 < this.field_J) {
                    var15 = this.field_J;
                  }
                  var16 = param0 + var10;
                  if (var16 > this.field_W) {
                    var16 = this.field_W;
                  }
                  var17 = var15 + var8 * this.field_K;
                  for (var18 = var15; var18 < var16; var18++) {
                    var19 = this.field_r[var17];
                    var20 = param3 + var19;
                    var21 = (param3 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    incrementValue$4 = var17;
                    var17++;
                    this.field_r[incrementValue$4] = var20 - var19 | var19 - (var19 >>> 8);
                  }
                  var8++;
                  incrementValue$3 = var11;
                  var11--;
                  var12 = var12 - (incrementValue$3 + var11);
                  var13 = var13 - (var11 + var11);
                  break;
                }
                var12 = var12 + (var10 + var10);
                incrementValue$5 = var10;
                var10++;
                var13 = var13 + (incrementValue$5 + var10);
              }
            }
            var10 = param2;
            var11 = -var11;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            while (var8 < var7) {
              while (var13 > var9) {
                if (var12 > var9) {
                  incrementValue$0 = var10;
                  var10--;
                  var13 = var13 - (incrementValue$0 + var10);
                  var12 = var12 - (var10 + var10);
                  continue;
                }
                break;
              }
              var15 = param0 - var10;
              if (var15 < this.field_J) {
                var15 = this.field_J;
              }
              var16 = param0 + var10;
              if (var16 > this.field_W - 1) {
                var16 = this.field_W - 1;
              }
              var17 = var15 + var8 * this.field_K;
              for (var18 = var15; var18 <= var16; var18++) {
                var19 = this.field_r[var17];
                var20 = param3 + var19;
                var21Lifetime1 = (param3 & 16711935) + (var19 & 16711935);
                var19 = (var21Lifetime1 & 16777472) + (var20 - var21Lifetime1 & 65536);
                incrementValue$2 = var17;
                var17++;
                this.field_r[incrementValue$2] = var20 - var19 | var19 - (var19 >>> 8);
              }
              var8++;
              var13 = var13 + (var11 + var11);
              incrementValue$1 = var11;
              var11++;
              var12 = var12 + (incrementValue$1 + var11);
            }
            return;
          } else {
            param3 = ((param3 & 16711935) * var14 >> 8 & 16711935) + ((param3 & 65280) * var14 >> 8 & 65280) + (var14 << 24);
            var15 = 256 - var14;
            while (var8 < param1) {
              while (true) {
                if (var13 > var9 &&
                  var12 > var9) {
                  var16 = param0 - var10 + 1;
                  if (var16 < this.field_J) {
                    var16 = this.field_J;
                  }
                  var17 = param0 + var10;
                  if (var17 > this.field_W) {
                    var17 = this.field_W;
                  }
                  var18 = var16 + var8 * this.field_K;
                  for (var19 = var16; var19 < var17; var19++) {
                    var20 = this.field_r[var18];
                    var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                    incrementValue$10 = var18;
                    var18++;
                    this.field_r[incrementValue$10] = param3 + var20;
                  }
                  var8++;
                  incrementValue$9 = var11;
                  var11--;
                  var12 = var12 - (incrementValue$9 + var11);
                  var13 = var13 - (var11 + var11);
                  break;
                }
                var12 = var12 + (var10 + var10);
                incrementValue$11 = var10;
                var10++;
                var13 = var13 + (incrementValue$11 + var10);
              }
            }
            var10 = param2;
            var11 = -var11;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            while (var8 < var7) {
              while (var13 > var9) {
                if (var12 > var9) {
                  incrementValue$6 = var10;
                  var10--;
                  var13 = var13 - (incrementValue$6 + var10);
                  var12 = var12 - (var10 + var10);
                  continue;
                }
                break;
              }
              var16 = param0 - var10;
              if (var16 < this.field_J) {
                var16 = this.field_J;
              }
              var17 = param0 + var10;
              if (var17 > this.field_W - 1) {
                var17 = this.field_W - 1;
              }
              var18 = var16 + var8 * this.field_K;
              for (var19 = var16; var19 <= var17; var19++) {
                var20 = this.field_r[var18];
                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                incrementValue$8 = var18;
                var18++;
                this.field_r[incrementValue$8] = param3 + var20;
              }
              var8++;
              var13 = var13 + (var11 + var11);
              incrementValue$7 = var11;
              var11++;
              var12 = var12 + (incrementValue$7 + var11);
            }
            return;
          }
        }
        while (var8 < param1) {
          while (true) {
            if (var13 > var9 &&
              var12 > var9) {
              var15Lifetime1 = param0 - var10 + 1;
              if (var15Lifetime1 < this.field_J) {
                var15Lifetime1 = this.field_J;
              }
              var16Lifetime1 = param0 + var10;
              if (var16Lifetime1 > this.field_W) {
                var16Lifetime1 = this.field_W;
              }
              var17Lifetime1 = var15Lifetime1 + var8 * this.field_K;
              for (var18Lifetime1 = var15Lifetime1; var18Lifetime1 < var16Lifetime1; var18Lifetime1++) {
                incrementValue$16 = var17Lifetime1;
                var17Lifetime1++;
                this.field_r[incrementValue$16] = param3;
              }
              var8++;
              incrementValue$15 = var11;
              var11--;
              var12 = var12 - (incrementValue$15 + var11);
              var13 = var13 - (var11 + var11);
              break;
            }
            var12 = var12 + (var10 + var10);
            incrementValue$17 = var10;
            var10++;
            var13 = var13 + (incrementValue$17 + var10);
          }
        }
        var10Lifetime1 = param2;
        var11Lifetime1 = var8 - param1;
        var13Lifetime1 = var11Lifetime1 * var11Lifetime1 + var9;
        var12Lifetime1 = var13Lifetime1 - var10Lifetime1;
        var13Lifetime1 = var13Lifetime1 - var11Lifetime1;
        while (var8 < var7) {
          while (var13Lifetime1 > var9) {
            if (var12Lifetime1 > var9) {
              incrementValue$12 = var10Lifetime1;
              var10Lifetime1--;
              var13Lifetime1 = var13Lifetime1 - (incrementValue$12 + var10Lifetime1);
              var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
              continue;
            }
            break;
          }
          var15Lifetime2 = param0 - var10Lifetime1;
          if (var15Lifetime2 < this.field_J) {
            var15Lifetime2 = this.field_J;
          }
          var16Lifetime2 = param0 + var10Lifetime1;
          if (var16Lifetime2 > this.field_W - 1) {
            var16Lifetime2 = this.field_W - 1;
          }
          var17Lifetime2 = var15Lifetime2 + var8 * this.field_K;
          for (var18Lifetime2 = var15Lifetime2; var18Lifetime2 <= var16Lifetime2; var18Lifetime2++) {
            incrementValue$14 = var17Lifetime2;
            var17Lifetime2++;
            this.field_r[incrementValue$14] = param3;
          }
          var8++;
          var13Lifetime1 = var13Lifetime1 + (var11Lifetime1 + var11Lifetime1);
          incrementValue$13 = var11Lifetime1;
          var11Lifetime1++;
          var12Lifetime1 = var12Lifetime1 + (incrementValue$13 + var11Lifetime1);
        }
        return;
    }

    final void b(int param0) {
        ww.field_q = param0;
        ww.field_G = param0;
        if (this.field_u > 1) {
          throw new IllegalStateException("No MT");
        }
        this.i(this.field_u);
        this.g(0);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        if (param0 < this.field_J) {
          param2 = param2 - (this.field_J - param0);
          param0 = this.field_J;
        }
        if (param1 < this.field_d) {
          param3 = param3 - (this.field_d - param1);
          param1 = this.field_d;
        }
        if (param0 + param2 > this.field_W) {
          param2 = this.field_W - param0;
        }
        if (param1 + param3 > this.field_P) {
          param3 = this.field_P - param1;
        }
        if (param2 > 0) {
          if (param3 > 0 &&
            param0 <= this.field_W &&
            param1 <= this.field_P) {
            var7 = this.field_K - param2;
            var8 = param0 + param1 * this.field_K;
            var9 = param4 >>> 24;
            if (param5 != 0 && (param5 != 1 ||
              var9 != 255)) {
              if (param5 == 1) {
                param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < param3; var11++) {
                  for (var12 = -param2; var12 < 0; var12++) {
                    var13 = this.field_r[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$1 = var8;
                    var8++;
                    this.field_r[incrementValue$1] = param4 + var13;
                  }
                  var8 = var8 + var7;
                }
                return;
              }
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              for (var10 = 0; var10 < param3; var10++) {
                for (var11 = -param2; var11 < 0; var11++) {
                  var12 = this.field_r[var8];
                  var13Lifetime1 = param4 + var12;
                  var14 = (param4 & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  incrementValue$0 = var8;
                  var8++;
                  this.field_r[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
                }
                var8 = var8 + var7;
              }
              return;
            }
            var10 = param2 >> 3;
            var11 = param2 & 7;
            param2 = var8 - 1;
            for (var12 = -param3; var12 < 0; var12++) {
              if (var10 > 0) {
                param0 = var10;
                do {
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param2++;
                  this.field_r[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              if (var11 > 0) {
                param0 = var11;
                do {
                  param2++;
                  this.field_r[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              param2 = param2 + var7;
            }
          } else {
            return;
          }
        }
    }

    final int f(int param0) {
        return this.field_c.a((byte) -5, param0).field_d;
    }

    final boolean h() {
        return false;
    }

    final int l() {
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        iua stackIn_7_0 = null;
        boolean stackIn_9_1 = false;
        tw var11;
        iua var12;
        int var13;
        var11 = this.a((Runnable) ((Object) Thread.currentThread()));
        var12 = var11.field_v;
        var12.field_j = false;
        param0 = param0 - this.field_p;
        param2 = param2 - this.field_p;
        param4 = param4 - this.field_p;
        param1 = param1 - this.field_k;
        param3 = param3 - this.field_k;
        param5 = param5 - this.field_k;
        stackIn_7_0 = var12;
        stackIn_9_1 = !(param0 >= 0) || !(param0 <= var12.field_h) || !(param2 >= 0) || !(param2 <= var12.field_h) || !(param4 >= 0) || !(param4 <= var12.field_h);
        boolean decompiledFrameRemainder0 = true;
        stackIn_7_0.field_q = stackIn_9_1;
        var12.field_m = true;
        var13 = param6 >>> 24;
        if (param9 != 0 && (param9 != 1 ||
          var13 != 255)) {
          if (param9 == 1) {
            var12.field_b = 255 - var13;
            var12.field_g = false;
            var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          } else {
            if (param9 != 2) {
              throw new IllegalArgumentException();
            }
            var12.field_b = 128;
            var12.field_g = true;
            var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          var12.field_b = 0;
          var12.field_g = false;
          var12.b((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
        }
        var12.field_j = true;
        var12.field_m = false;
    }

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var10 = 0;
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L1: while (true) {
          if (var9 < param4) {
            for (var10 = 0; var10 < param3; var10++) {
              incrementValue$4 = var8;
              var8++;
              var11 = param0[incrementValue$4] >>> 24;
              if (var11 != 0 &&
                var11 != 255) {
                var7 = 1;
                break L1;
              }
            }
            var9++;
            continue;
          }
          break;
        }
        if (var7 == 0) {
          return (nh) ((Object) new raa(this, param0, param1, param2, param3, param4, param5));
        }
        return (nh) ((Object) new vqa(this, param0, param1, param2, param3, param4, param5));
    }

    static {
    }
}
