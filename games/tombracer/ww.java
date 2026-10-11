/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ww extends ka {
    private tw field_z;
    private ww field_Gb;
    private ww field_u;
    private short[] field_M;
    private int[] field_Ab;
    private short[] field_V;
    private ww field_qb;
    private boolean field_zb;
    private ww field_n;
    private float[][] field_l;
    private ww field_N;
    private int[] field_v;
    private ww field_tb;
    private int[] field_mb;
    private int[] field_E;
    private rga[] field_kb;
    private hna[] field_e;
    private pna field_B;
    private boolean field_ab;
    private ava[] field_i;
    private short field_Bb;
    private int[][] field_Cb;
    private oha[] field_lb;
    private oha[] field_D;
    private short[] field_Eb;
    private int[] field_yb;
    private iua field_w;
    private short[] field_ub;
    private ww field_pb;
    private int field_P;
    private int[] field_C;
    private short field_R;
    private short field_U;
    private int field_Db;
    private int field_gb;
    private short field_O;
    private float[][] field_W;
    private int[] field_T;
    private short[] field_bb;
    private int[] field_xb;
    private short field_cb;
    private int field_Y;
    static int field_G;
    private int field_ib;
    private int[] field_hb;
    private tw field_F;
    private int field_H;
    private int field_eb;
    private short[] field_x;
    private int field_m;
    private int[][] field_sb;
    private byte[] field_k;
    private int[] field_rb;
    private int[] field_s;
    private sfa field_d;
    private gna[] field_I;
    private boolean field_A;
    private short[] field_ob;
    private int[][] field_j;
    private int field_Z;
    private int[] field_o;
    private int[] field_jb;
    private boolean field_L;
    private ww field_K;
    private boolean field_r;
    private boolean field_S;
    private short field_f;
    private nsa[] field_db;
    private byte[] field_h;
    static int field_q;
    private int[] field_Fb;
    private short field_vb;
    private int[] field_nb;
    private int field_p;
    private int[] field_J;
    private short[] field_X;
    private ww field_fb;
    private ww field_Q;
    private int[] field_t;
    private int field_g;
    private int[] field_y;
    private byte[] field_wb;
    private static String field_Hb;

    private final void e() {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (this.field_eb == 0) {
          this.a(false);
        } else {
          if (this.field_d.field_u <= 1) {
            this.h();
          } else {
            var1 = this;
            synchronized (var1) {
              this.h();
            }
          }
        }
    }

    final void wa() {
        int var1 = 0;
        if (this.field_S) {
          for (var1 = 0; var1 < this.field_p; var1++) {
            this.field_xb[var1] = this.field_xb[var1] + 7 >> 4;
            this.field_rb[var1] = this.field_rb[var1] + 7 >> 4;
            this.field_T[var1] = this.field_T[var1] + 7 >> 4;
          }
          this.field_S = false;
        }
        if (this.field_L) {
          this.e();
          this.field_L = false;
        }
        this.field_r = false;
    }

    final void O(int param0, int param1, int param2) {
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        if (param0 != 128 &&
          (this.field_P & 1) != 1) {
          throw new IllegalStateException();
        }
        if (param1 != 128 &&
          (this.field_P & 2) != 2) {
          throw new IllegalStateException();
        }
        if (param2 != 128 &&
          (this.field_P & 4) != 4) {
          throw new IllegalStateException();
        }
        var4 = this;
        synchronized (var4) {
          for (var5 = 0; var5 < this.field_p; var5++) {
            this.field_xb[var5] = this.field_xb[var5] * param0 >> 7;
            this.field_rb[var5] = this.field_rb[var5] * param1 >> 7;
            this.field_T[var5] = this.field_T[var5] * param2 >> 7;
          }
          this.field_r = false;
        }
    }

    private final void c() {
        gna dupTemp$0 = null;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
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
        gna var16;
        oha var17;
        oha var18;
        oha var19;
        int var1Lifetime1;
        this.field_lb = new oha[this.field_Z];
        for (var1 = 0; var1 < this.field_Z; var1++) {
          this.field_lb[var1] = new oha();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_g) {
            return;
          }
          var2 = this.field_M[var1Lifetime1];
          var3 = this.field_bb[var1Lifetime1];
          var4 = this.field_x[var1Lifetime1];
          var5 = this.field_xb[var3] - this.field_xb[var2];
          var6 = this.field_rb[var3] - this.field_rb[var2];
          var7 = this.field_T[var3] - this.field_T[var2];
          var8 = this.field_xb[var4] - this.field_xb[var2];
          var9 = this.field_rb[var4] - this.field_rb[var2];
          var10 = this.field_T[var4] - this.field_T[var2];
          var11 = var6 * var10 - var9 * var7;
          var12 = var7 * var8 - var10 * var5;
          var13 = var5 * var9 - var8 * var6;
          while (true) {
            if (var11 <= 8192 &&
              var12 <= 8192 &&
              var13 <= 8192 &&
              var11 >= -8192 &&
              var12 >= -8192 &&
              var13 >= -8192) {
              var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
              if (var14 <= 0) {
                var14 = 1;
              }
              var11 = var11 * 256 / var14;
              var12 = var12 * 256 / var14;
              var13 = var13 * 256 / var14;
              if (this.field_k != null) {
                var15 = this.field_k[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_I == null) {
                    this.field_I = new gna[this.field_g];
                  }
                  dupTemp$0 = new gna();
                  this.field_I[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_a = var11;
                  var16.field_c = var12;
                  var16.field_b = var13;
                }
              } else {
                var17 = this.field_lb[var2];
                var17.field_a = var17.field_a + var11;
                var17.field_c = var17.field_c + var12;
                var17.field_b = var17.field_b + var13;
                var17.field_d = var17.field_d + 1;
                var18 = this.field_lb[var3];
                var18.field_a = var18.field_a + var11;
                var18.field_c = var18.field_c + var12;
                var18.field_b = var18.field_b + var13;
                var18.field_d = var18.field_d + 1;
                var19 = this.field_lb[var4];
                var19.field_a = var19.field_a + var11;
                var19.field_c = var19.field_c + var12;
                var19.field_b = var19.field_b + var13;
                var19.field_d = var19.field_d + 1;
              }
              var1Lifetime1++;
              break;
            }
            var11 = var11 >> 1;
            var12 = var12 >> 1;
            var13 = var13 >> 1;
          }
        }
    }

    private final int d(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
    }

    final void a() {
        try {
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          InterruptedException var2 = null;
          if (this.field_d.field_u > 1) {
            var1 = this;
            synchronized (var1) {
              while (this.field_a) {
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              this.field_a = true;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var16Lifetime1;
        int var17Lifetime1;
        int var13Lifetime4;
        int var13Lifetime1Lifetime1;
        int var13Lifetime2Lifetime1;
        int var16Lifetime1Lifetime1;
        var2 = 0;
        var3 = this.field_d.field_g;
        var4 = this.field_M[param0];
        var5 = this.field_bb[param0];
        var6 = this.field_x[param0];
        var7 = this.field_Ab[var4];
        var8 = this.field_Ab[var5];
        var9 = this.field_Ab[var6];
        if (this.field_h != null) {
          this.field_w.field_b = this.field_h[param0] & 255;
        } else {
          this.field_w.field_b = 0;
        }
        if (var7 < var3) {
          var10 = this.field_nb[var4];
          var11 = this.field_C[var4];
          var12 = this.field_t[param0] & 65535;
          if (var9 >= var3) {
            var13 = (var3 - var7) * (65536 / (var9 - var7));
            this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$0 = var2;
            var2++;
            this.field_hb[incrementValue$0] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
          }
          if (var8 >= var3) {
            var13Lifetime4 = (var3 - var7) * (65536 / (var8 - var7));
            this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13Lifetime4 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13Lifetime4 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$1 = var2;
            var2++;
            this.field_hb[incrementValue$1] = var12 + (((this.field_o[param0] & 65535) - var12) * var13Lifetime4 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var4];
          this.field_E[var2] = this.field_J[var4];
          this.field_yb[var2] = this.field_mb[var4];
          incrementValue$2 = var2;
          var2++;
          this.field_hb[incrementValue$2] = this.field_t[param0] & 65535;
        }
        if (var8 < var3) {
          var10Lifetime1 = this.field_nb[var5];
          var11Lifetime1 = this.field_C[var5];
          var12Lifetime1 = this.field_o[param0] & 65535;
          if (var7 >= var3) {
            var13Lifetime1 = (var3 - var8) * (65536 / (var7 - var8));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime1 + ((this.field_nb[var4] - var10Lifetime1) * var13Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime1 + ((this.field_C[var4] - var11Lifetime1) * var13Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$3 = var2;
            var2++;
            this.field_hb[incrementValue$3] = var12Lifetime1 + (((this.field_t[param0] & 65535) - var12Lifetime1) * var13Lifetime1 >> 16);
          }
          if (var9 >= var3) {
            var13Lifetime1Lifetime1 = (var3 - var8) * (65536 / (var9 - var8));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime1 + ((this.field_nb[var6] - var10Lifetime1) * var13Lifetime1Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime1 + ((this.field_C[var6] - var11Lifetime1) * var13Lifetime1Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$4 = var2;
            var2++;
            this.field_hb[incrementValue$4] = var12Lifetime1 + (((this.field_Fb[param0] & 65535) - var12Lifetime1) * var13Lifetime1Lifetime1 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var5];
          this.field_E[var2] = this.field_J[var5];
          this.field_yb[var2] = this.field_mb[var5];
          incrementValue$5 = var2;
          var2++;
          this.field_hb[incrementValue$5] = this.field_o[param0] & 65535;
        }
        if (var9 < var3) {
          var10Lifetime2 = this.field_nb[var6];
          var11Lifetime2 = this.field_C[var6];
          var12Lifetime2 = this.field_Fb[param0] & 65535;
          if (var8 >= var3) {
            var13Lifetime2 = (var3 - var9) * (65536 / (var8 - var9));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime2 + ((this.field_nb[var5] - var10Lifetime2) * var13Lifetime2 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime2 + ((this.field_C[var5] - var11Lifetime2) * var13Lifetime2 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$6 = var2;
            var2++;
            this.field_hb[incrementValue$6] = var12Lifetime2 + (((this.field_o[param0] & 65535) - var12Lifetime2) * var13Lifetime2 >> 16);
          }
          if (var7 >= var3) {
            var13Lifetime2Lifetime1 = (var3 - var9) * (65536 / (var7 - var9));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime2 + ((this.field_nb[var4] - var10Lifetime2) * var13Lifetime2Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime2 + ((this.field_C[var4] - var11Lifetime2) * var13Lifetime2Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$7 = var2;
            var2++;
            this.field_hb[incrementValue$7] = var12Lifetime2 + (((this.field_t[param0] & 65535) - var12Lifetime2) * var13Lifetime2Lifetime1 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var6];
          this.field_E[var2] = this.field_J[var6];
          this.field_yb[var2] = this.field_mb[var6];
          incrementValue$8 = var2;
          var2++;
          this.field_hb[incrementValue$8] = this.field_Fb[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var10Lifetime3 = this.field_y[0];
        var11Lifetime3 = this.field_y[1];
        var12Lifetime3 = this.field_y[2];
        var13Lifetime3 = this.field_E[0];
        var14 = this.field_E[1];
        var15 = this.field_E[2];
        var7Lifetime1 = this.field_yb[0];
        var8Lifetime1 = this.field_yb[1];
        var9Lifetime1 = this.field_yb[2];
        this.field_w.field_q = false;
        if (var2 == 3) {
          if (var10Lifetime3 < 0 ||
            var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            !(var10Lifetime3 <= this.field_F.field_y) ||
            !(var11Lifetime3 <= this.field_F.field_y) ||
            !(var12Lifetime3 <= this.field_F.field_y)) {
            this.field_w.field_q = true;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var16 = -16777216;
            if (this.field_h != null) {
              var16 = 255 - (this.field_h[param0] & 255) << 24;
            }
            var17 = var16 | this.field_t[param0] & 16777215;
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
            } else {
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
            } else {
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, bt.field_h[this.field_t[param0] & 65535]);
            }
          }
        }
        L12: {
          if (var2 == 4) {
            if (var10Lifetime3 < 0 ||
              var11Lifetime3 < 0 ||
              var12Lifetime3 < 0 ||
              !(var10Lifetime3 <= this.field_F.field_y) ||
              !(var11Lifetime3 <= this.field_F.field_y) ||
              !(var12Lifetime3 <= this.field_F.field_y) ||
              this.field_y[3] < 0 ||
              !(this.field_y[3] <= this.field_F.field_y)) {
              this.field_w.field_q = true;
            }
            if (this.field_X != null &&
              this.field_X[param0] != -1) {
              var16Lifetime1 = -16777216;
              if (this.field_h != null) {
                var16Lifetime1 = 255 - (this.field_h[param0] & 255) << 24;
              }
              var17Lifetime1 = var16Lifetime1 | this.field_t[param0] & 16777215;
              if (this.field_Fb[param0] != -1) {
                this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                this.field_w.a((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var9Lifetime1, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
              } else {
                this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                this.field_w.a((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var9Lifetime1, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
              }
              break L12;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              this.field_w.a((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var8Lifetime1, (float)this.field_yb[3], (float)this.field_hb[0], (float)this.field_hb[2], (float)this.field_hb[3]);
            } else {
              var16Lifetime1Lifetime1 = bt.field_h[this.field_t[param0] & 65535];
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, var16Lifetime1Lifetime1);
              this.field_w.b((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var8Lifetime1, (float)this.field_yb[3], var16Lifetime1Lifetime1);
            }
          }
        }
    }

    final void a(gda param0, el param1, int param2) {
        this.b(param0, param1, -1, param2);
    }

    private final void f() {
        this.field_lb = null;
        this.field_D = null;
        this.field_I = null;
        this.field_r = false;
    }

    final void H(int param0, int param1, int param2) {
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        if (param0 != 0 &&
          (this.field_P & 1) != 1) {
          throw new IllegalStateException();
        }
        if (param1 != 0 &&
          (this.field_P & 2) != 2) {
          throw new IllegalStateException();
        }
        if (param2 != 0 &&
          (this.field_P & 4) != 4) {
          throw new IllegalStateException();
        }
        var4 = this;
        synchronized (var4) {
          for (var5 = 0; var5 < this.field_p; var5++) {
            this.field_xb[var5] = this.field_xb[var5] + param0;
            this.field_rb[var5] = this.field_rb[var5] + param1;
            this.field_T[var5] = this.field_T[var5] + param2;
          }
        }
    }

    private final void b(int param0, boolean param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        hna var11;
        int var12_int;
        nsa var12;
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
        if (this.field_Fb[param0] == -2) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = this.field_M[param0];
        var5 = this.field_bb[param0];
        var6 = this.field_x[param0];
        var7 = this.field_v[var4];
        var8 = this.field_v[var5];
        var9 = this.field_v[var6];
        if (param1 && (var7 == -5000 ||
          var8 == -5000 ||
          var9 == -5000)) {
          var10 = this.field_nb[var4];
          var11_int = this.field_nb[var5];
          var12_int = this.field_nb[var6];
          var13 = this.field_C[var4];
          var14 = this.field_C[var5];
          var15 = this.field_C[var6];
          var16 = this.field_Ab[var4];
          var17 = this.field_Ab[var5];
          var18 = this.field_Ab[var6];
          var10 = var10 - var11_int;
          var12_int = var12_int - var11_int;
          var13 = var13 - var14;
          var15 = var15 - var14;
          var16 = var16 - var17;
          var18 = var18 - var17;
          var19 = var13 * var18 - var16 * var15;
          var20 = var16 * var12_int - var10 * var18;
          var21 = var10 * var15 - var13 * var12_int;
          if (!(var11_int * var19 + var14 * var20 + var17 * var21 <= 0)) {
            this.b(param0);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_jb[param0] != -1 ||
            (var7 - var8) * (this.field_J[var6] - this.field_J[var5]) - (this.field_J[var4] - this.field_J[var5]) * (var9 - var8) > 0) {
            if (var7 >= 0 &&
              var8 >= 0 &&
              var9 >= 0 &&
              var7 <= this.field_F.field_y &&
              var8 <= this.field_F.field_y &&
              var9 <= this.field_F.field_y) {
              this.field_w.field_q = false;
            } else {
              this.field_w.field_q = true;
            }
            if (!param2) {
              var10Lifetime1 = this.field_jb[param0];
              if (var10Lifetime1 == -1) {
                this.j(param0);
              } else {
                var11 = this.field_e[var10Lifetime1];
                var12 = this.field_db[var10Lifetime1];
                if (!var11.field_d) {
                  this.j(param0);
                }
                this.field_d.b(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
              }
            } else {
              var10Lifetime1 = this.field_jb[param0];
              if (var10Lifetime1 != -1) {
                if (!this.field_e[var10Lifetime1].field_d) {
                  this.g(param0);
                }
              } else {
                this.g(param0);
              }
            }
          }
        }

    }

    private final void j(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var2 = this.field_M[param0];
        var3 = this.field_bb[param0];
        var4 = this.field_x[param0];
        if (this.field_X != null &&
          this.field_X[param0] != -1) {
          var5 = -16777216;
          if (this.field_h != null) {
            var5 = 255 - (this.field_h[param0] & 255) << 24;
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var5 | this.field_t[param0] & 16777215, var5 | this.field_o[param0] & 16777215, var5 | this.field_Fb[param0] & 16777215, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
          } else {
            var6 = var5 | this.field_t[param0] & 16777215;
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var6, var6, var6, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
          }
        } else {
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], (float)(this.field_t[param0] & 65535), (float)(this.field_o[param0] & 65535), (float)(this.field_Fb[param0] & 65535));
          } else {
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], bt.field_h[this.field_t[param0] & 65535]);
          }
        }
    }

    private final boolean c(int param0) {
        if (this.field_h == null) {
          return false;
        }
        if (this.field_h[param0] == 0) {
          return false;
        }
        return true;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5;
        hna var6_ref_hna;
        int var6;
        int var7;
        int var5Lifetime1;
        if (this.field_e != null) {
          for (var5 = 0; var5 < this.field_m; var5++) {
            var6_ref_hna = this.field_e[var5];
            this.field_jb[var6_ref_hna.field_j] = var5;
          }
        }
        if (!this.field_ab &&
          this.field_e == null) {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            this.a(var5Lifetime1, param0, param1);
          }
        } else if ((this.field_P & 256) == 0 &&
          this.field_ub != null) {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            var6 = this.field_ub[var5Lifetime1];
            this.a(var6, param0, param1);
          }
        } else {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            if (!this.c(var5Lifetime1) &&
              !this.h(var5Lifetime1)) {
              this.a(var5Lifetime1, param0, param1);
            }
          }
          if (this.field_wb == null) {
            for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
              if (this.c(var5Lifetime1) ||
                this.h(var5Lifetime1)) {
                this.a(var5Lifetime1, param0, param1);
              }
            }
          } else {
            for (var5Lifetime1 = 0; var5Lifetime1 < 12; var5Lifetime1++) {
              var7 = 0;
              var6 = var7;
              while (var7 < this.field_g) {
                if (this.field_wb[var7] == var5Lifetime1 && (this.c(var7) ||
                  this.h(var7))) {
                  this.a(var7, param0, param1);
                }
                var7++;
              }
            }
          }
        }
    }

    private final int a(int param0, short param1, int param2) {
        int var4;
        dw var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var4 = cla.field_m[this.a(param0, param2)];
        var5 = this.field_d.field_c.a((byte) -52, param1 & 65535);
        var6 = var5.field_c & 255;
        if (var6 != 0) {
          var7 = 131586 * param2;
          if (var6 != 256) {
            var8 = var6;
            var9 = 256 - var6;
            var4 = ((var7 & 16711935) * var8 + (var4 & 16711935) * var9 & -16711936) + ((var7 & 65280) * var8 + (var4 & 65280) * var9 & 16711680) >> 8;
          } else {
            var4 = var7;
          }
        }
        var7Lifetime1 = var5.field_i & 255;
        if (var7Lifetime1 != 0) {
          var7Lifetime1 += 256;
          var8Lifetime1 = ((var4 & 16711680) >> 16) * var7Lifetime1;
          if (var8Lifetime1 > 65535) {
            var8Lifetime1 = 65535;
          }
          var9Lifetime1 = ((var4 & 65280) >> 8) * var7Lifetime1;
          if (var9Lifetime1 > 65535) {
            var9Lifetime1 = 65535;
          }
          var10 = (var4 & 255) * var7Lifetime1;
          if (var10 > 65535) {
            var10 = 65535;
          }
          var4 = (var8Lifetime1 << 8 & 16711680) + (var9Lifetime1 & 65280) + (var10 >> 8);
        }
        return var4;
    }

    private final void g() {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (this.field_eb == 0 &&
          this.field_lb == null) {
          if (this.field_d.field_u <= 1) {
            this.c();
          } else {
            var1 = this;
            synchronized (var1) {
              this.c();
            }
          }
          return;
        }
    }

    final void b() {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (this.field_d.field_u > 1) {
          var1 = this;
          synchronized (var1) {
            this.field_a = false;
            this.notifyAll();
          }
        }
    }

    private final void a(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        if (this.field_d.field_u <= 1) {
          this.b(param0);
        } else {
          var2 = this;
          synchronized (var2) {
            this.b(param0);
          }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        nsa var13;
        int var13_int;
        int var14;
        int var15;
        int var16;
        int var17;
        nsa var23;
        hna var24;
        nsa var26;
        hna var27;
        nsa var29;
        nsa var31;
        nsa var33;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int[] var59;
        int[] var60;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var9Lifetime7;
        int var9Lifetime8;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var13_intLifetime4;
        int var13_intLifetime5;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var16Lifetime1;
        int var9Lifetime9;
        int var9Lifetime1Lifetime1;
        int var9Lifetime4Lifetime1;
        int var9Lifetime5Lifetime1;
        nsa var13Lifetime1;
        var8 = param1.length;
        if (param0 == 0) {
          param2 = param2 << 4;
          param3 = param3 << 4;
          param4 = param4 << 4;
          if (!this.field_S) {
            for (var9 = 0; var9 < this.field_p; var9++) {
              this.field_xb[var9] = this.field_xb[var9] << 4;
              this.field_rb[var9] = this.field_rb[var9] << 4;
              this.field_T[var9] = this.field_T[var9] << 4;
            }
            this.field_S = true;
          }
          var9Lifetime9 = 0;
          this.field_gb = 0;
          this.field_H = 0;
          this.field_Y = 0;
          for (var10 = 0; var10 < var8; var10++) {
            var11 = param1[var10];
            if (var11 < this.field_sb.length) {
              var52 = this.field_sb[var11];
              for (var13_int = 0; var13_int < var52.length; var13_int++) {
                var14 = var52[var13_int];
                this.field_gb = this.field_gb + this.field_xb[var14];
                this.field_H = this.field_H + this.field_rb[var14];
                this.field_Y = this.field_Y + this.field_T[var14];
                var9Lifetime9++;
              }
            }
          }
          if (var9Lifetime9 <= 0) {
            this.field_gb = param2;
            this.field_H = param3;
            this.field_Y = param4;
          } else {
            this.field_gb = this.field_gb / var9Lifetime9 + param2;
            this.field_H = this.field_H / var9Lifetime9 + param3;
            this.field_Y = this.field_Y / var9Lifetime9 + param4;
          }
          return;
        }
        if (param0 == 1) {
          param2 = param2 << 4;
          param3 = param3 << 4;
          param4 = param4 << 4;
          if (!this.field_S) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_p; var9Lifetime1++) {
              this.field_xb[var9Lifetime1] = this.field_xb[var9Lifetime1] << 4;
              this.field_rb[var9Lifetime1] = this.field_rb[var9Lifetime1] << 4;
              this.field_T[var9Lifetime1] = this.field_T[var9Lifetime1] << 4;
            }
            this.field_S = true;
          }
          for (var9Lifetime1Lifetime1 = 0; var9Lifetime1Lifetime1 < var8; var9Lifetime1Lifetime1++) {
            var10Lifetime1 = param1[var9Lifetime1Lifetime1];
            if (var10Lifetime1 < this.field_sb.length) {
              var53 = this.field_sb[var10Lifetime1];
              for (var12 = 0; var12 < var53.length; var12++) {
                var13_intLifetime1 = var53[var12];
                this.field_xb[var13_intLifetime1] = this.field_xb[var13_intLifetime1] + param2;
                this.field_rb[var13_intLifetime1] = this.field_rb[var13_intLifetime1] + param3;
                this.field_T[var13_intLifetime1] = this.field_T[var13_intLifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var9Lifetime2 = 0; var9Lifetime2 < var8; var9Lifetime2++) {
            var10Lifetime2 = param1[var9Lifetime2];
            if (var10Lifetime2 < this.field_sb.length) {
              var54 = this.field_sb[var10Lifetime2];
              if ((param5 & 1) != 0) {
                for (var12Lifetime1 = 0; var12Lifetime1 < var54.length; var12Lifetime1++) {
                  var13_intLifetime2 = var54[var12Lifetime1];
                  this.field_xb[var13_intLifetime2] = this.field_xb[var13_intLifetime2] - this.field_gb;
                  this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] - this.field_H;
                  this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] - this.field_Y;
                  if (param2 != 0) {
                    var14Lifetime1 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = this.field_rb[var13_intLifetime2] * var15 - this.field_T[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_T[var13_intLifetime2] = this.field_rb[var13_intLifetime2] * var14Lifetime1 + this.field_T[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_rb[var13_intLifetime2] = var16;
                  }
                  if (param4 != 0) {
                    var14Lifetime1 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = this.field_rb[var13_intLifetime2] * var14Lifetime1 + this.field_xb[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] * var15 - this.field_xb[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_xb[var13_intLifetime2] = var16;
                  }
                  if (param3 != 0) {
                    var14Lifetime1 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = this.field_T[var13_intLifetime2] * var14Lifetime1 + this.field_xb[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] * var15 - this.field_xb[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_xb[var13_intLifetime2] = var16;
                  }
                  this.field_xb[var13_intLifetime2] = this.field_xb[var13_intLifetime2] + this.field_gb;
                  this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] + this.field_H;
                  this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] + this.field_Y;
                }
              } else {
                for (var12Lifetime1 = 0; var12Lifetime1 < var54.length; var12Lifetime1++) {
                  var13_intLifetime2 = var54[var12Lifetime1];
                  this.field_xb[var13_intLifetime2] = this.field_xb[var13_intLifetime2] - this.field_gb;
                  this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] - this.field_H;
                  this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] - this.field_Y;
                  if (param4 != 0) {
                    var14Lifetime1 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = this.field_rb[var13_intLifetime2] * var14Lifetime1 + this.field_xb[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] * var15 - this.field_xb[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_xb[var13_intLifetime2] = var16;
                  }
                  if (param2 != 0) {
                    var14Lifetime1 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = this.field_rb[var13_intLifetime2] * var15 - this.field_T[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_T[var13_intLifetime2] = this.field_rb[var13_intLifetime2] * var14Lifetime1 + this.field_T[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_rb[var13_intLifetime2] = var16;
                  }
                  if (param3 != 0) {
                    var14Lifetime1 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = this.field_T[var13_intLifetime2] * var14Lifetime1 + this.field_xb[var13_intLifetime2] * var15 + 16383 >> 14;
                    this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] * var15 - this.field_xb[var13_intLifetime2] * var14Lifetime1 + 16383 >> 14;
                    this.field_xb[var13_intLifetime2] = var16;
                  }
                  this.field_xb[var13_intLifetime2] = this.field_xb[var13_intLifetime2] + this.field_gb;
                  this.field_rb[var13_intLifetime2] = this.field_rb[var13_intLifetime2] + this.field_H;
                  this.field_T[var13_intLifetime2] = this.field_T[var13_intLifetime2] + this.field_Y;
                }
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var9Lifetime3 = 0; var9Lifetime3 < var8; var9Lifetime3++) {
            var10Lifetime3 = param1[var9Lifetime3];
            if (var10Lifetime3 < this.field_sb.length) {
              var55 = this.field_sb[var10Lifetime3];
              for (var12Lifetime2 = 0; var12Lifetime2 < var55.length; var12Lifetime2++) {
                var13_intLifetime3 = var55[var12Lifetime2];
                this.field_xb[var13_intLifetime3] = this.field_xb[var13_intLifetime3] - this.field_gb;
                this.field_rb[var13_intLifetime3] = this.field_rb[var13_intLifetime3] - this.field_H;
                this.field_T[var13_intLifetime3] = this.field_T[var13_intLifetime3] - this.field_Y;
                this.field_xb[var13_intLifetime3] = this.field_xb[var13_intLifetime3] * param2 / 128;
                this.field_rb[var13_intLifetime3] = this.field_rb[var13_intLifetime3] * param3 / 128;
                this.field_T[var13_intLifetime3] = this.field_T[var13_intLifetime3] * param4 / 128;
                this.field_xb[var13_intLifetime3] = this.field_xb[var13_intLifetime3] + this.field_gb;
                this.field_rb[var13_intLifetime3] = this.field_rb[var13_intLifetime3] + this.field_H;
                this.field_T[var13_intLifetime3] = this.field_T[var13_intLifetime3] + this.field_Y;
              }
            }
          }
          return;
        }
        if (param0 == 5) {
          if (this.field_Cb != null &&
            this.field_h != null) {
            for (var9Lifetime4 = 0; var9Lifetime4 < var8; var9Lifetime4++) {
              var10Lifetime4 = param1[var9Lifetime4];
              if (var10Lifetime4 < this.field_Cb.length) {
                var56 = this.field_Cb[var10Lifetime4];
                for (var12Lifetime3 = 0; var12Lifetime3 < var56.length; var12Lifetime3++) {
                  var13_intLifetime4 = var56[var12Lifetime3];
                  var14Lifetime2 = (this.field_h[var13_intLifetime4] & 255) + param2 * 8;
                  if (var14Lifetime2 >= 0) {
                    if (var14Lifetime2 > 255) {
                      var14Lifetime2 = 255;
                    }
                  } else {
                    var14Lifetime2 = 0;
                  }
                  this.field_h[var13_intLifetime4] = (byte)var14Lifetime2;
                }
              }
            }
            if (this.field_e == null) {
              return;
            }
            for (var9Lifetime4Lifetime1 = 0; var9Lifetime4Lifetime1 < this.field_m; var9Lifetime4Lifetime1++) {
              var24 = this.field_e[var9Lifetime4Lifetime1];
              var23 = this.field_db[var9Lifetime4Lifetime1];
              var23.field_k = var23.field_k & 16777215 | 255 - (this.field_h[var24.field_j] & 255) << 24;
            }
            return;
          }
          return;
        }
        if (param0 == 7) {
          if (this.field_Cb != null) {
            for (var9Lifetime5 = 0; var9Lifetime5 < var8; var9Lifetime5++) {
              var10Lifetime5 = param1[var9Lifetime5];
              if (var10Lifetime5 < this.field_Cb.length) {
                var57 = this.field_Cb[var10Lifetime5];
                for (var12Lifetime4 = 0; var12Lifetime4 < var57.length; var12Lifetime4++) {
                  var13_intLifetime5 = var57[var12Lifetime4];
                  var14Lifetime3 = this.field_ob[var13_intLifetime5] & 65535;
                  var15Lifetime1 = var14Lifetime3 >> 10 & 63;
                  var16Lifetime1 = var14Lifetime3 >> 7 & 7;
                  var17 = var14Lifetime3 & 127;
                  var15Lifetime1 = var15Lifetime1 + param2 & 63;
                  var16Lifetime1 = var16Lifetime1 + param3;
                  if (var16Lifetime1 >= 0) {
                    if (var16Lifetime1 > 7) {
                      var16Lifetime1 = 7;
                    }
                  } else {
                    var16Lifetime1 = 0;
                  }
                  var17 = var17 + param4;
                  if (var17 >= 0) {
                    if (var17 > 127) {
                      var17 = 127;
                    }
                  } else {
                    var17 = 0;
                  }
                  this.field_ob[var13_intLifetime5] = (short)(var15Lifetime1 << 10 | var16Lifetime1 << 7 | var17);
                }
                this.field_L = true;
              }
            }
            if (this.field_e == null) {
              return;
            }
            for (var9Lifetime5Lifetime1 = 0; var9Lifetime5Lifetime1 < this.field_m; var9Lifetime5Lifetime1++) {
              var27 = this.field_e[var9Lifetime5Lifetime1];
              var26 = this.field_db[var9Lifetime5Lifetime1];
              var26.field_k = var26.field_k & -16777216 | bt.field_h[tg.a((byte) -123, this.field_ob[var27.field_j] & 65535) & 65535] & 16777215;
            }
            return;
          }
          return;
        }
        if (param0 == 8) {
          if (this.field_j != null) {
            for (var9Lifetime6 = 0; var9Lifetime6 < var8; var9Lifetime6++) {
              var10Lifetime6 = param1[var9Lifetime6];
              if (var10Lifetime6 < this.field_j.length) {
                var58 = this.field_j[var10Lifetime6];
                for (var12Lifetime5 = 0; var12Lifetime5 < var58.length; var12Lifetime5++) {
                  var29 = this.field_db[var58[var12Lifetime5]];
                  var29.field_b = var29.field_b + param2;
                  var29.field_a = var29.field_a + param3;
                }
              }
            }
            return;
          }
          return;
        }
        if (param0 == 10) {
          if (this.field_j != null) {
            for (var9Lifetime7 = 0; var9Lifetime7 < var8; var9Lifetime7++) {
              var10Lifetime7 = param1[var9Lifetime7];
              if (var10Lifetime7 < this.field_j.length) {
                var59 = this.field_j[var10Lifetime7];
                for (var12Lifetime6 = 0; var12Lifetime6 < var59.length; var12Lifetime6++) {
                  var31 = this.field_db[var59[var12Lifetime6]];
                  var13 = var31;
                  var13.field_m = var31.field_m * param2 >> 7;
                  var13.field_g = var31.field_g * param3 >> 7;
                }
              }
            }
            return;
          }
          return;
        }
        if (param0 != 9) {
          return;
        }
        if (this.field_j != null) {
          for (var9Lifetime8 = 0; var9Lifetime8 < var8; var9Lifetime8++) {
            var10Lifetime8 = param1[var9Lifetime8];
            if (var10Lifetime8 < this.field_j.length) {
              var60 = this.field_j[var10Lifetime8];
              for (var12Lifetime7 = 0; var12Lifetime7 < var60.length; var12Lifetime7++) {
                var33 = this.field_db[var60[var12Lifetime7]];
                var13Lifetime1 = var33;
                var13Lifetime1.field_j = var33.field_j + param2 & 16383;
              }
            }
          }
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        ww dupTemp$0 = null;
        ww var5 = null;
        ww var4 = null;
        this.a(Thread.currentThread());
        if (param0 == 1) {
          var5 = this.field_n;
          var4 = this.field_pb;
        } else {
          if (param0 == 2) {
            var5 = this.field_qb;
            var4 = this.field_u;
          } else {
            if (param0 == 3) {
              var5 = this.field_K;
              var4 = this.field_Q;
            } else {
              if (param0 == 4) {
                var5 = this.field_tb;
                var4 = this.field_Gb;
              } else {
                if (param0 == 5) {
                  var5 = this.field_fb;
                  var4 = this.field_N;
                } else {
                  dupTemp$0 = new ww(this.field_d);
                  var5 = dupTemp$0;
                  var4 = dupTemp$0;
                }
              }
            }
          }
        }
        return this.a(var4, var5, param1, param0 != 0 ? true : false, param2);
    }

    private final void i(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_F.field_h) {
          var2 = this.field_M[param0];
          var3 = this.field_bb[param0];
          var4 = this.field_x[param0];
          var5 = 0;
          var6 = 0;
          var7 = 0;
          if (this.field_s[var2] <= this.field_F.field_L) {
            if (this.field_s[var2] > this.field_F.field_M) {
              var5 = (this.field_F.field_M - this.field_s[var2]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var5 = 255;
          }
          if (this.field_s[var3] <= this.field_F.field_L) {
            if (this.field_s[var3] > this.field_F.field_M) {
              var6 = (this.field_F.field_M - this.field_s[var3]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var6 = 255;
          }
          if (this.field_s[var4] <= this.field_F.field_L) {
            if (this.field_s[var4] > this.field_F.field_M) {
              var7 = (this.field_F.field_M - this.field_s[var4]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var7 = 255;
          }
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var8 = -16777216;
            if (this.field_h != null) {
              var8 = 255 - (this.field_h[param0] & 255) << 24;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var8 | this.field_t[param0] & 16777215, var8 | this.field_o[param0] & 16777215, var8 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            } else {
              var9 = var8 | this.field_t[param0] & 16777215;
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9, var9, var9, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
            } else {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
            }
          }
        } else {
          var2 = this.field_M[param0];
          var3 = this.field_bb[param0];
          var4 = this.field_x[param0];
          var5 = this.field_mb[var2] - this.field_F.field_B;
          if (var5 <= 255) {
            if (var5 < 0) {
              var5 = 0;
            }
          } else {
            var5 = 255;
          }
          var6 = this.field_mb[var3] - this.field_F.field_B;
          if (var6 <= 255) {
            if (var6 < 0) {
              var6 = 0;
            }
          } else {
            var6 = 255;
          }
          var7 = this.field_mb[var4] - this.field_F.field_B;
          if (var7 <= 255) {
            if (var7 < 0) {
              var7 = 0;
            }
          } else {
            var7 = 255;
          }
          var8 = var5 + var6 + var7;
          if (var8 == 765) {
            return;
          }
          if (var8 == 0) {
            this.f(param0);
            return;
          }
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var9 = -16777216;
            if (this.field_h != null) {
              var9 = 255 - (this.field_h[param0] & 255) << 24;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9 | this.field_t[param0] & 16777215, var9 | this.field_o[param0] & 16777215, var9 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            } else {
              var10 = var9 | this.field_t[param0] & 16777215;
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var10, var10, var10, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
            } else {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
            }
          }
        }

    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        hna var6;
        int var6_int;
        nsa var7;
        int var7_int;
        int var8;
        int var9;
        int var10;
        int var5Lifetime1;
        if ((this.field_P & 524288) != 524288) {
          throw new IllegalStateException(field_Hb);
        }
        for (var5 = 0; var5 < this.field_g; var5++) {
          var6_int = this.field_ob[var5] & 65535;
          var7_int = var6_int >> 10 & 63;
          var8 = var6_int >> 7 & 7;
          var9 = var6_int & 127;
          if (param0 != -1) {
            var7_int = var7_int + ((param0 - var7_int) * param3 >> 7);
          }
          if (param1 != -1) {
            var8 = var8 + ((param1 - var8) * param3 >> 7);
          }
          if (param2 != -1) {
            var9 = var9 + ((param2 - var9) * param3 >> 7);
          }
          this.field_ob[var5] = (short)(var7_int << 10 | var8 << 7 | var9);
        }
        if (this.field_e != null) {
          var10 = 0;
          var5Lifetime1 = var10;
          while (var10 < this.field_m) {
            var6 = this.field_e[var10];
            var7 = this.field_db[var10];
            var7.field_k = var7.field_k & -16777216 | bt.field_h[tg.a((byte) -120, this.field_ob[var6.field_j] & 65535)] & 16777215;
            var10++;
          }
        }
        if (this.field_eb == 2) {
          this.field_eb = 1;
        }
        return;
    }

    private final ka a(ww param0, ww param1, int param2, boolean param3, boolean param4) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        short[] array$3 = null;
        int[] array$4 = null;
        int[] array$5 = null;
        int[] array$6 = null;
        byte[] array$7 = null;
        oha[] array$8 = null;
        gna[] array$9 = null;
        short[] array$10 = null;
        byte[] array$11 = null;
        nsa[] array$12 = null;
        int var11 = 0;
        float[][] dupTemp$13 = null;
        float[][] dupTemp$14 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        gna[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        gna stackIn_132_2 = null;
        int stackIn_158_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_199_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ww var10_ref_ww;
        ww var11_ref_ww;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var10Lifetime9;
        int var10Lifetime10;
        param0.field_r = this.field_r;
        if (this.field_r) {
          param0.field_O = this.field_O;
          param0.field_cb = this.field_cb;
          param0.field_vb = this.field_vb;
          param0.field_R = this.field_R;
          param0.field_f = this.field_f;
          param0.field_Bb = this.field_Bb;
          param0.field_U = this.field_U;
        }
        param0.field_Db = this.field_Db;
        param0.field_ib = this.field_ib;
        param0.field_p = this.field_p;
        param0.field_Z = this.field_Z;
        param0.field_g = this.field_g;
        param0.field_m = this.field_m;
        if ((param2 & 256) == 0) {
          param0.field_ab = this.field_ab;
        } else {
          param0.field_ab = true;
        }
        stackIn_8_0 = ((param2 & 7) != 7) ? 0 : 1;
        stackIn_11_1 = ((param2 & 32) == 0) ? 0 : 1;
        var6 = stackIn_8_0 | stackIn_11_1;
        if (var6 == 0) {
          stackIn_17_0 = ((param2 & 1) != 0) ? 1 : 0;
        } else {
          stackIn_17_0 = 1;
        }
        var7 = stackIn_17_0;
        if (var6 == 0) {
          stackIn_23_0 = ((param2 & 2) != 0) ? 1 : 0;
        } else {
          stackIn_23_0 = 1;
        }
        var8 = stackIn_23_0;
        if (var6 == 0) {
          if ((param2 & 4) == 0) {
            stackIn_31_0 = ((param2 & 16) != 0) ? 1 : 0;
          } else {
            stackIn_31_0 = 1;
          }
        } else {
          stackIn_31_0 = 1;
        }
        var9 = stackIn_31_0;
        if (var7 == 0 &&
          var8 == 0 &&
          var9 == 0) {
          param0.field_xb = this.field_xb;
          param0.field_rb = this.field_rb;
          param0.field_T = this.field_T;
        } else {
          if (var7 != 0) {
            if (param1.field_xb != null &&
              param1.field_xb.length >= this.field_p) {
              param0.field_xb = param1.field_xb;
            } else {
              array$0 = new int[this.field_p];
              param1.field_xb = array$0;
              param0.field_xb = array$0;
            }
            for (var10 = 0; var10 < this.field_p; var10++) {
              param0.field_xb[var10] = this.field_xb[var10];
            }
          } else {
            param0.field_xb = this.field_xb;
          }
          if (var8 != 0) {
            if (param1.field_rb != null &&
              param1.field_rb.length >= this.field_p) {
              param0.field_rb = param1.field_rb;
            } else {
              array$1 = new int[this.field_p];
              param1.field_rb = array$1;
              param0.field_rb = array$1;
            }
            for (var10Lifetime9 = 0; var10Lifetime9 < this.field_p; var10Lifetime9++) {
              param0.field_rb[var10Lifetime9] = this.field_rb[var10Lifetime9];
            }
          } else {
            param0.field_rb = this.field_rb;
          }
          if (var9 != 0) {
            if (param1.field_T != null &&
              param1.field_T.length >= this.field_p) {
              param0.field_T = param1.field_T;
            } else {
              array$2 = new int[this.field_p];
              param1.field_T = array$2;
              param0.field_T = array$2;
            }
            for (var10Lifetime10 = 0; var10Lifetime10 < this.field_p; var10Lifetime10++) {
              param0.field_T[var10Lifetime10] = this.field_T[var10Lifetime10];
            }
          } else {
            param0.field_T = this.field_T;
          }
        }
        if ((param2 & 540800) != 0) {
          if (param1.field_ob != null &&
            param1.field_ob.length >= this.field_g) {
            param0.field_ob = param1.field_ob;
          } else {
            var10Lifetime1 = this.field_g;
            array$3 = new short[var10Lifetime1];
            param1.field_ob = array$3;
            param0.field_ob = array$3;
          }
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_g; var10Lifetime1++) {
            param0.field_ob[var10Lifetime1] = this.field_ob[var10Lifetime1];
          }
        } else {
          param0.field_ob = this.field_ob;
        }
        if ((param2 & 618520) == 0) {
          if ((param2 & 128) == 0) {
            if (param4) {
              this.a(false);
            }
            param0.field_t = this.field_t;
            param0.field_o = this.field_o;
            param0.field_Fb = this.field_Fb;
          } else {
            if (param4) {
              this.a(false);
            }
            if (this.field_t != null) {
              if (param1.field_t != null &&
                param1.field_t.length >= this.field_g) {
                param0.field_t = param1.field_t;
                param0.field_o = param1.field_o;
                param0.field_Fb = param1.field_Fb;
              } else {
                var10Lifetime2 = this.field_g;
                array$4 = new int[var10Lifetime2];
                param1.field_t = array$4;
                param0.field_t = array$4;
                array$5 = new int[var10Lifetime2];
                param1.field_o = array$5;
                param0.field_o = array$5;
                array$6 = new int[var10Lifetime2];
                param1.field_Fb = array$6;
                param0.field_Fb = array$6;
              }
              for (var10Lifetime2 = 0; var10Lifetime2 < this.field_g; var10Lifetime2++) {
                param0.field_t[var10Lifetime2] = this.field_t[var10Lifetime2];
                param0.field_o[var10Lifetime2] = this.field_o[var10Lifetime2];
                param0.field_Fb[var10Lifetime2] = this.field_Fb[var10Lifetime2];
              }
            }
          }
          param0.field_eb = this.field_eb;
        } else {
          param0.field_eb = 0;
          var10_ref_ww = param0;
          var11_ref_ww = param0;
          param0.field_Fb = null;
          var11_ref_ww.field_o = null;
          var10_ref_ww.field_t = null;
        }
        if ((param2 & 256) != 0) {
          if (param1.field_h != null &&
            param1.field_h.length >= this.field_g) {
            param0.field_h = param1.field_h;
          } else {
            var10Lifetime3 = this.field_g;
            array$7 = new byte[var10Lifetime3];
            param1.field_h = array$7;
            param0.field_h = array$7;
          }
          if (this.field_h == null) {
            for (var10Lifetime3 = 0; var10Lifetime3 < this.field_g; var10Lifetime3++) {
              param0.field_h[var10Lifetime3] = (byte) 0;
            }
          } else {
            for (var10Lifetime3 = 0; var10Lifetime3 < this.field_g; var10Lifetime3++) {
              param0.field_h[var10Lifetime3] = this.field_h[var10Lifetime3];
            }
          }
        } else {
          param0.field_h = this.field_h;
        }
        if ((param2 & 8) == 0 &&
          (param2 & 16) == 0) {
          if (param4) {
            this.g();
          }
          param0.field_lb = this.field_lb;
          param0.field_I = this.field_I;
        } else {
          if (param1.field_lb != null &&
            param1.field_lb.length >= this.field_Z) {
            param0.field_lb = param1.field_lb;
          } else {
            var10Lifetime4 = this.field_Z;
            array$8 = new oha[var10Lifetime4];
            param1.field_lb = array$8;
            param0.field_lb = array$8;
          }
          if (this.field_lb != null) {
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_Z; var10Lifetime4++) {
              param0.field_lb[var10Lifetime4] = new oha(this.field_lb[var10Lifetime4]);
            }
          } else {
            param0.field_lb = null;
          }
          if (this.field_I != null) {
            if (param1.field_I != null &&
              param1.field_I.length >= this.field_g) {
              param0.field_I = param1.field_I;
            } else {
              var10Lifetime4 = this.field_g;
              array$9 = new gna[var10Lifetime4];
              param1.field_I = array$9;
              param0.field_I = array$9;
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_g; var10Lifetime4++) {
              stackIn_131_0 = param0.field_I;
              stackIn_131_1 = var10Lifetime4;
              if (this.field_I[var10Lifetime4] == null) {
                stackIn_132_2 = null;
              } else {
                stackIn_132_2 = new gna(this.field_I[var10Lifetime4]);
              }
              stackIn_131_0[stackIn_131_1] = stackIn_132_2;
            }
          } else {
            param0.field_I = null;
          }
        }
        if ((param2 & 32768) == 0) {
          param0.field_X = this.field_X;
        } else {
          if (this.field_X != null) {
            if (param1.field_X != null &&
              param1.field_X.length >= this.field_g) {
              param0.field_X = param1.field_X;
            } else {
              var10Lifetime5 = this.field_g;
              array$10 = new short[var10Lifetime5];
              param1.field_X = array$10;
              param0.field_X = array$10;
            }
            for (var10Lifetime5 = 0; var10Lifetime5 < this.field_g; var10Lifetime5++) {
              param0.field_X[var10Lifetime5] = this.field_X[var10Lifetime5];
            }
          } else {
            param0.field_X = null;
          }
        }
        if ((param2 & 65536) == 0) {
          param0.field_k = this.field_k;
        } else {
          if (this.field_k != null) {
            if (param1.field_k != null &&
              param1.field_k.length >= this.field_g) {
              param0.field_k = param1.field_k;
            } else {
              if (!param3) {
                stackIn_158_0 = this.field_g;
              } else {
                stackIn_158_0 = this.field_g + 100;
              }
              var10Lifetime6 = stackIn_158_0;
              array$11 = new byte[var10Lifetime6];
              param1.field_k = array$11;
              param0.field_k = array$11;
            }
            for (var10Lifetime6 = 0; var10Lifetime6 < this.field_g; var10Lifetime6++) {
              param0.field_k[var10Lifetime6] = this.field_k[var10Lifetime6];
            }
          } else {
            param0.field_k = null;
          }
        }
        if ((param2 & 50560) != 0) {
          if (param1.field_db != null &&
            param1.field_db.length >= this.field_m) {
            param0.field_db = param1.field_db;
            for (var10Lifetime7 = 0; var10Lifetime7 < this.field_m; var10Lifetime7++) {
              param0.field_db[var10Lifetime7].a(this.field_db[var10Lifetime7], (byte) -6);
            }
          } else {
            var10Lifetime7 = this.field_m;
            array$12 = new nsa[var10Lifetime7];
            param1.field_db = array$12;
            param0.field_db = array$12;
            for (var11 = 0; var11 < this.field_m; var11++) {
              param0.field_db[var11] = this.field_db[var11].a(-2707);
            }
          }
        } else {
          param0.field_db = this.field_db;
        }
        if (this.field_W != null &&
          (param2 & 16) != 0) {
          if (param1.field_W != null &&
            param1.field_W.length >= this.field_g) {
            param0.field_W = param1.field_W;
          } else {
            if (!param3) {
              stackIn_183_0 = this.field_g;
            } else {
              stackIn_183_0 = this.field_g + 100;
            }
            var10Lifetime8 = stackIn_183_0;
            dupTemp$13 = new float[var10Lifetime8][3];
            param1.field_W = dupTemp$13;
            param0.field_W = dupTemp$13;
          }
          for (var10Lifetime8 = 0; var10Lifetime8 < this.field_g; var10Lifetime8++) {
            if (this.field_W[var10Lifetime8] != null) {
              param0.field_W[var10Lifetime8][0] = this.field_W[var10Lifetime8][0];
              param0.field_W[var10Lifetime8][1] = this.field_W[var10Lifetime8][1];
              param0.field_W[var10Lifetime8][2] = this.field_W[var10Lifetime8][2];
            }
          }
          if (param1.field_l != null &&
            param1.field_l.length >= this.field_g) {
            param0.field_l = param1.field_l;
          } else {
            if (!param3) {
              stackIn_199_0 = this.field_g;
            } else {
              stackIn_199_0 = this.field_g + 100;
            }
            var10Lifetime8 = stackIn_199_0;
            dupTemp$14 = new float[var10Lifetime8][3];
            param1.field_l = dupTemp$14;
            param0.field_l = dupTemp$14;
          }
          for (var10Lifetime8 = 0; var10Lifetime8 < this.field_g; var10Lifetime8++) {
            if (this.field_l[var10Lifetime8] != null) {
              param0.field_l[var10Lifetime8][0] = this.field_l[var10Lifetime8][0];
              param0.field_l[var10Lifetime8][1] = this.field_l[var10Lifetime8][1];
              param0.field_l[var10Lifetime8][2] = this.field_l[var10Lifetime8][2];
            }
          }
        } else {
          param0.field_W = this.field_W;
          param0.field_l = this.field_l;
        }
        param0.field_sb = this.field_sb;
        param0.field_Cb = this.field_Cb;
        param0.field_j = this.field_j;
        param0.field_Eb = this.field_Eb;
        param0.field_V = this.field_V;
        param0.field_wb = this.field_wb;
        param0.field_M = this.field_M;
        param0.field_bb = this.field_bb;
        param0.field_x = this.field_x;
        param0.field_i = this.field_i;
        param0.field_kb = this.field_kb;
        param0.field_e = this.field_e;
        param0.field_ub = this.field_ub;
        param0.field_P = param2;
        return (ka) ((Object) param0);
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var35_int = 0;
        int var42 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        nsa var14;
        int var14_int;
        int var15;
        int var16;
        int[] var16_ref_int__;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int[] var25;
        int var25_int;
        int var26;
        int var27;
        int var28;
        int[] var29;
        int var29_int;
        int var30;
        int var31;
        int[] var31_ref_int__;
        int var32;
        int var33;
        int var34;
        int[] var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var43;
        int var44;
        int var45;
        int var46;
        int[] var47;
        int[] var50;
        int[] var52;
        int[] var55;
        nsa var58;
        hna var59;
        nsa var61;
        hna var62;
        nsa var64;
        nsa var66;
        nsa var68;
        int[] var71;
        int[] var73;
        int[] var76;
        int[] var94;
        int[] var95;
        int[] var96;
        int[] var97;
        int[] var98;
        int[] var99;
        int[] var100;
        int[] var101;
        int[] var102;
        int[] var103;
        int[] var104;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var13Lifetime6;
        int var13Lifetime7;
        int var14_intLifetime1;
        int var14_intLifetime2;
        int var14_intLifetime3;
        int var14_intLifetime4;
        int var14_intLifetime5;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var30Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var10Lifetime9;
        int var16Lifetime3;
        int var17Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var31Lifetime1;
        int var32Lifetime2;
        int var33Lifetime2;
        int var34Lifetime2;
        int var36Lifetime2;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var10Lifetime2Lifetime1;
        int var10Lifetime2Lifetime2;
        int var10Lifetime3Lifetime1;
        int var10Lifetime3Lifetime2;
        int var10Lifetime4Lifetime1;
        int var10Lifetime5Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var11Lifetime3Lifetime1;
        int var13Lifetime1Lifetime1;
        int var13Lifetime2Lifetime1;
        int var14_intLifetime2Lifetime1;
        int var14_intLifetime3Lifetime1;
        int var15Lifetime1Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var30Lifetime1Lifetime1;
        int var32Lifetime1Lifetime1;
        int var33Lifetime1Lifetime1;
        nsa var14Lifetime1;
        int var16Lifetime4;
        int var16Lifetime5;
        int var17Lifetime5;
        int var17Lifetime6;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        var9 = param1.length;
        if (param0 == 0) {
          param2 = param2 << 4;
          param3 = param3 << 4;
          param4 = param4 << 4;
          if (!this.field_S) {
            for (var10 = 0; var10 < this.field_p; var10++) {
              this.field_xb[var10] = this.field_xb[var10] << 4;
              this.field_rb[var10] = this.field_rb[var10] << 4;
              this.field_T[var10] = this.field_T[var10] << 4;
            }
            this.field_S = true;
          }
          var10Lifetime9 = 0;
          this.field_gb = 0;
          this.field_H = 0;
          this.field_Y = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12 = param1[var11];
            if (var12 < this.field_sb.length) {
              var94 = this.field_sb[var12];
              for (var14_int = 0; var14_int < var94.length; var14_int++) {
                var15 = var94[var14_int];
                if (this.field_Eb == null ||
                  (param6 & this.field_Eb[var15]) != 0) {
                  this.field_gb = this.field_gb + this.field_xb[var15];
                  this.field_H = this.field_H + this.field_rb[var15];
                  this.field_Y = this.field_Y + this.field_T[var15];
                  var10Lifetime9++;
                }
              }
            }
          }
          if (var10Lifetime9 <= 0) {
            this.field_gb = param2;
            this.field_H = param3;
            this.field_Y = param4;
          } else {
            this.field_gb = this.field_gb / var10Lifetime9 + param2;
            this.field_H = this.field_H / var10Lifetime9 + param3;
            this.field_Y = this.field_Y / var10Lifetime9 + param4;
            this.field_A = true;
          }
          return;
        }
        if (param0 == 1) {
          if (param7 != null) {
            var10Lifetime1 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 8192 >> 14;
            var11Lifetime1 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 8192 >> 14;
            var12Lifetime1 = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 8192 >> 14;
            param2 = var10Lifetime1;
            param3 = var11Lifetime1;
            param4 = var12Lifetime1;
          }
          param2 = param2 << 4;
          param3 = param3 << 4;
          param4 = param4 << 4;
          if (!this.field_S) {
            for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_p; var10Lifetime1Lifetime1++) {
              this.field_xb[var10Lifetime1Lifetime1] = this.field_xb[var10Lifetime1Lifetime1] << 4;
              this.field_rb[var10Lifetime1Lifetime1] = this.field_rb[var10Lifetime1Lifetime1] << 4;
              this.field_T[var10Lifetime1Lifetime1] = this.field_T[var10Lifetime1Lifetime1] << 4;
            }
            this.field_S = true;
          }
          for (var10Lifetime1Lifetime2 = 0; var10Lifetime1Lifetime2 < var9; var10Lifetime1Lifetime2++) {
            var11Lifetime1Lifetime1 = param1[var10Lifetime1Lifetime2];
            if (var11Lifetime1Lifetime1 < this.field_sb.length) {
              var95 = this.field_sb[var11Lifetime1Lifetime1];
              for (var13 = 0; var13 < var95.length; var13++) {
                var14_intLifetime1 = var95[var13];
                if (this.field_Eb == null ||
                  (param6 & this.field_Eb[var14_intLifetime1]) != 0) {
                  this.field_xb[var14_intLifetime1] = this.field_xb[var14_intLifetime1] + param2;
                  this.field_rb[var14_intLifetime1] = this.field_rb[var14_intLifetime1] + param3;
                  this.field_T[var14_intLifetime1] = this.field_T[var14_intLifetime1] + param4;
                }
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          if (param7 == null) {
            for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
              var11Lifetime2 = param1[var10Lifetime2];
              if (var11Lifetime2 < this.field_sb.length) {
                var97 = this.field_sb[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var97.length; var13Lifetime1++) {
                  var14_intLifetime2 = var97[var13Lifetime1];
                  if (this.field_Eb == null ||
                    (param6 & this.field_Eb[var14_intLifetime2]) != 0) {
                    this.field_xb[var14_intLifetime2] = this.field_xb[var14_intLifetime2] - this.field_gb;
                    this.field_rb[var14_intLifetime2] = this.field_rb[var14_intLifetime2] - this.field_H;
                    this.field_T[var14_intLifetime2] = this.field_T[var14_intLifetime2] - this.field_Y;
                    if (param4 != 0) {
                      var15Lifetime1 = qu.field_b[param4];
                      var16 = qu.field_d[param4];
                      var17 = this.field_rb[var14_intLifetime2] * var15Lifetime1 + this.field_xb[var14_intLifetime2] * var16 + 16383 >> 14;
                      this.field_rb[var14_intLifetime2] = this.field_rb[var14_intLifetime2] * var16 - this.field_xb[var14_intLifetime2] * var15Lifetime1 + 16383 >> 14;
                      this.field_xb[var14_intLifetime2] = var17;
                    }
                    if (param2 != 0) {
                      var15Lifetime1Lifetime2 = qu.field_b[param2];
                      var16Lifetime4 = qu.field_d[param2];
                      var17Lifetime5 = this.field_rb[var14_intLifetime2] * var16Lifetime4 - this.field_T[var14_intLifetime2] * var15Lifetime1Lifetime2 + 16383 >> 14;
                      this.field_T[var14_intLifetime2] = this.field_rb[var14_intLifetime2] * var15Lifetime1Lifetime2 + this.field_T[var14_intLifetime2] * var16Lifetime4 + 16383 >> 14;
                      this.field_rb[var14_intLifetime2] = var17Lifetime5;
                    }
                    if (param3 != 0) {
                      var15Lifetime1Lifetime3 = qu.field_b[param3];
                      var16Lifetime5 = qu.field_d[param3];
                      var17Lifetime6 = this.field_T[var14_intLifetime2] * var15Lifetime1Lifetime3 + this.field_xb[var14_intLifetime2] * var16Lifetime5 + 16383 >> 14;
                      this.field_T[var14_intLifetime2] = this.field_T[var14_intLifetime2] * var16Lifetime5 - this.field_xb[var14_intLifetime2] * var15Lifetime1Lifetime3 + 16383 >> 14;
                      this.field_xb[var14_intLifetime2] = var17Lifetime6;
                    }
                    this.field_xb[var14_intLifetime2] = this.field_xb[var14_intLifetime2] + this.field_gb;
                    this.field_rb[var14_intLifetime2] = this.field_rb[var14_intLifetime2] + this.field_H;
                    this.field_T[var14_intLifetime2] = this.field_T[var14_intLifetime2] + this.field_Y;
                  }
                }
              }
            }
            return;
          }
          if (!this.field_S) {
            for (var10Lifetime2Lifetime1 = 0; var10Lifetime2Lifetime1 < this.field_p; var10Lifetime2Lifetime1++) {
              this.field_xb[var10Lifetime2Lifetime1] = this.field_xb[var10Lifetime2Lifetime1] << 4;
              this.field_rb[var10Lifetime2Lifetime1] = this.field_rb[var10Lifetime2Lifetime1] << 4;
              this.field_T[var10Lifetime2Lifetime1] = this.field_T[var10Lifetime2Lifetime1] << 4;
            }
            this.field_S = true;
          }
          var10Lifetime2Lifetime2 = param7[9] << 4;
          var11Lifetime2Lifetime1 = param7[10] << 4;
          var12Lifetime2 = param7[11] << 4;
          var13Lifetime1Lifetime1 = param7[12] << 4;
          var14_intLifetime2Lifetime1 = param7[13] << 4;
          var15Lifetime1Lifetime1 = param7[14] << 4;
          if (this.field_A) {
            var16Lifetime3 = param7[0] * this.field_gb + param7[3] * this.field_H + param7[6] * this.field_Y + 8192 >> 14;
            var17Lifetime3 = param7[1] * this.field_gb + param7[4] * this.field_H + param7[7] * this.field_Y + 8192 >> 14;
            var18 = param7[2] * this.field_gb + param7[5] * this.field_H + param7[8] * this.field_Y + 8192 >> 14;
            var16Lifetime3 = var16Lifetime3 + var13Lifetime1Lifetime1;
            var17Lifetime3 = var17Lifetime3 + var14_intLifetime2Lifetime1;
            var18 = var18 + var15Lifetime1Lifetime1;
            this.field_gb = var16Lifetime3;
            this.field_H = var17Lifetime3;
            this.field_Y = var18;
            this.field_A = false;
          }
          var71 = new int[9];
          var50 = var71;
          var16_ref_int__ = var50;
          var17Lifetime4 = qu.field_d[param2];
          var18Lifetime3 = qu.field_b[param2];
          var19 = qu.field_d[param3];
          var20 = qu.field_b[param3];
          var21 = qu.field_d[param4];
          var22 = qu.field_b[param4];
          var23 = var18Lifetime3 * var21 + 8192 >> 14;
          var24 = var18Lifetime3 * var22 + 8192 >> 14;
          var16_ref_int__[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
          var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
          var16_ref_int__[2] = var20 * var17Lifetime4 + 8192 >> 14;
          var16_ref_int__[3] = var17Lifetime4 * var22 + 8192 >> 14;
          var16_ref_int__[4] = var17Lifetime4 * var21 + 8192 >> 14;
          var16_ref_int__[5] = -var18Lifetime3;
          var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
          var16_ref_int__[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
          var16_ref_int__[8] = var19 * var17Lifetime4 + 8192 >> 14;
          var25_int = var71[0] * -this.field_gb + var71[1] * -this.field_H + var71[2] * -this.field_Y + 8192 >> 14;
          var26 = var71[3] * -this.field_gb + var71[4] * -this.field_H + var71[5] * -this.field_Y + 8192 >> 14;
          var27 = var71[6] * -this.field_gb + var71[7] * -this.field_H + var71[8] * -this.field_Y + 8192 >> 14;
          var28 = var25_int + this.field_gb;
          var29_int = var26 + this.field_H;
          var30 = var27 + this.field_Y;
          var31_ref_int__ = new int[9];
          for (var32 = 0; var32 < 3; var32++) {
            for (var33 = 0; var33 < 3; var33++) {
              var34 = 0;
              for (var35_int = 0; var35_int < 3; var35_int++) {
                var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
              }
              var31_ref_int__[var32 * 3 + var33] = var34 + 8192 >> 14;
            }
          }
          var32Lifetime2 = var71[0] * var13Lifetime1Lifetime1 + var71[1] * var14_intLifetime2Lifetime1 + var71[2] * var15Lifetime1Lifetime1 + 8192 >> 14;
          var33Lifetime2 = var71[3] * var13Lifetime1Lifetime1 + var71[4] * var14_intLifetime2Lifetime1 + var71[5] * var15Lifetime1Lifetime1 + 8192 >> 14;
          var34Lifetime2 = var71[6] * var13Lifetime1Lifetime1 + var71[7] * var14_intLifetime2Lifetime1 + var71[8] * var15Lifetime1Lifetime1 + 8192 >> 14;
          var32Lifetime2 = var32Lifetime2 + var28;
          var33Lifetime2 = var33Lifetime2 + var29_int;
          var34Lifetime2 = var34Lifetime2 + var30;
          var73 = new int[9];
          var52 = var73;
          var47 = var52;
          var35 = var47;
          for (var36 = 0; var36 < 3; var36++) {
            for (var37 = 0; var37 < 3; var37++) {
              var38 = 0;
              for (var39 = 0; var39 < 3; var39++) {
                var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
              }
              var35[var36 * 3 + var37] = var38 + 8192 >> 14;
            }
          }
          var36Lifetime2 = param7[0] * var32Lifetime2 + param7[1] * var33Lifetime2 + param7[2] * var34Lifetime2 + 8192 >> 14;
          var37Lifetime2 = param7[3] * var32Lifetime2 + param7[4] * var33Lifetime2 + param7[5] * var34Lifetime2 + 8192 >> 14;
          var38Lifetime2 = param7[6] * var32Lifetime2 + param7[7] * var33Lifetime2 + param7[8] * var34Lifetime2 + 8192 >> 14;
          var36Lifetime2 = var36Lifetime2 + var10Lifetime2Lifetime2;
          var37Lifetime2 = var37Lifetime2 + var11Lifetime2Lifetime1;
          var38Lifetime2 = var38Lifetime2 + var12Lifetime2;
          for (var39Lifetime2 = 0; var39Lifetime2 < var9; var39Lifetime2++) {
            var40 = param1[var39Lifetime2];
            if (var40 < this.field_sb.length) {
              var96 = this.field_sb[var40];
              for (var42 = 0; var42 < var96.length; var42++) {
                var43 = var96[var42];
                if (this.field_Eb == null ||
                  (param6 & this.field_Eb[var43]) != 0) {
                  var44 = var73[0] * this.field_xb[var43] + var73[1] * this.field_rb[var43] + var73[2] * this.field_T[var43] + 8192 >> 14;
                  var45 = var73[3] * this.field_xb[var43] + var73[4] * this.field_rb[var43] + var73[5] * this.field_T[var43] + 8192 >> 14;
                  var46 = var73[6] * this.field_xb[var43] + var73[7] * this.field_rb[var43] + var73[8] * this.field_T[var43] + 8192 >> 14;
                  var44 = var44 + var36Lifetime2;
                  var45 = var45 + var37Lifetime2;
                  var46 = var46 + var38Lifetime2;
                  this.field_xb[var43] = var44;
                  this.field_rb[var43] = var45;
                  this.field_T[var43] = var46;
                }
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          if (param7 == null) {
            for (var10Lifetime3 = 0; var10Lifetime3 < var9; var10Lifetime3++) {
              var11Lifetime3 = param1[var10Lifetime3];
              if (var11Lifetime3 < this.field_sb.length) {
                var99 = this.field_sb[var11Lifetime3];
                for (var13Lifetime2 = 0; var13Lifetime2 < var99.length; var13Lifetime2++) {
                  var14_intLifetime3 = var99[var13Lifetime2];
                  if (this.field_Eb == null ||
                    (param6 & this.field_Eb[var14_intLifetime3]) != 0) {
                    this.field_xb[var14_intLifetime3] = this.field_xb[var14_intLifetime3] - this.field_gb;
                    this.field_rb[var14_intLifetime3] = this.field_rb[var14_intLifetime3] - this.field_H;
                    this.field_T[var14_intLifetime3] = this.field_T[var14_intLifetime3] - this.field_Y;
                    this.field_xb[var14_intLifetime3] = this.field_xb[var14_intLifetime3] * param2 / 128;
                    this.field_rb[var14_intLifetime3] = this.field_rb[var14_intLifetime3] * param3 / 128;
                    this.field_T[var14_intLifetime3] = this.field_T[var14_intLifetime3] * param4 / 128;
                    this.field_xb[var14_intLifetime3] = this.field_xb[var14_intLifetime3] + this.field_gb;
                    this.field_rb[var14_intLifetime3] = this.field_rb[var14_intLifetime3] + this.field_H;
                    this.field_T[var14_intLifetime3] = this.field_T[var14_intLifetime3] + this.field_Y;
                  }
                }
              }
            }
            return;
          }
          if (!this.field_S) {
            for (var10Lifetime3Lifetime1 = 0; var10Lifetime3Lifetime1 < this.field_p; var10Lifetime3Lifetime1++) {
              this.field_xb[var10Lifetime3Lifetime1] = this.field_xb[var10Lifetime3Lifetime1] << 4;
              this.field_rb[var10Lifetime3Lifetime1] = this.field_rb[var10Lifetime3Lifetime1] << 4;
              this.field_T[var10Lifetime3Lifetime1] = this.field_T[var10Lifetime3Lifetime1] << 4;
            }
            this.field_S = true;
          }
          var10Lifetime3Lifetime2 = param7[9] << 4;
          var11Lifetime3Lifetime1 = param7[10] << 4;
          var12Lifetime3 = param7[11] << 4;
          var13Lifetime2Lifetime1 = param7[12] << 4;
          var14_intLifetime3Lifetime1 = param7[13] << 4;
          var15Lifetime2 = param7[14] << 4;
          if (this.field_A) {
            var16Lifetime1 = param7[0] * this.field_gb + param7[3] * this.field_H + param7[6] * this.field_Y + 8192 >> 14;
            var17Lifetime1 = param7[1] * this.field_gb + param7[4] * this.field_H + param7[7] * this.field_Y + 8192 >> 14;
            var18Lifetime1 = param7[2] * this.field_gb + param7[5] * this.field_H + param7[8] * this.field_Y + 8192 >> 14;
            var16Lifetime1 = var16Lifetime1 + var13Lifetime2Lifetime1;
            var17Lifetime1 = var17Lifetime1 + var14_intLifetime3Lifetime1;
            var18Lifetime1 = var18Lifetime1 + var15Lifetime2;
            this.field_gb = var16Lifetime1;
            this.field_H = var17Lifetime1;
            this.field_Y = var18Lifetime1;
            this.field_A = false;
          }
          var16Lifetime1Lifetime1 = param2 << 15 >> 7;
          var17Lifetime1Lifetime1 = param3 << 15 >> 7;
          var18Lifetime1Lifetime1 = param4 << 15 >> 7;
          var19Lifetime1 = var16Lifetime1Lifetime1 * -this.field_gb + 8192 >> 14;
          var20Lifetime1 = var17Lifetime1Lifetime1 * -this.field_H + 8192 >> 14;
          var21Lifetime1 = var18Lifetime1Lifetime1 * -this.field_Y + 8192 >> 14;
          var22Lifetime1 = var19Lifetime1 + this.field_gb;
          var23Lifetime1 = var20Lifetime1 + this.field_H;
          var24Lifetime1 = var21Lifetime1 + this.field_Y;
          var25 = new int[9];
          var25[0] = var16Lifetime1Lifetime1 * param7[0] + 8192 >> 14;
          var25[1] = var16Lifetime1Lifetime1 * param7[3] + 8192 >> 14;
          var25[2] = var16Lifetime1Lifetime1 * param7[6] + 8192 >> 14;
          var25[3] = var17Lifetime1Lifetime1 * param7[1] + 8192 >> 14;
          var25[4] = var17Lifetime1Lifetime1 * param7[4] + 8192 >> 14;
          var25[5] = var17Lifetime1Lifetime1 * param7[7] + 8192 >> 14;
          var25[6] = var18Lifetime1Lifetime1 * param7[2] + 8192 >> 14;
          var25[7] = var18Lifetime1Lifetime1 * param7[5] + 8192 >> 14;
          var25[8] = var18Lifetime1Lifetime1 * param7[8] + 8192 >> 14;
          var26Lifetime1 = var16Lifetime1Lifetime1 * var13Lifetime2Lifetime1 + 8192 >> 14;
          var27Lifetime1 = var17Lifetime1Lifetime1 * var14_intLifetime3Lifetime1 + 8192 >> 14;
          var28Lifetime1 = var18Lifetime1Lifetime1 * var15Lifetime2 + 8192 >> 14;
          var26Lifetime1 = var26Lifetime1 + var22Lifetime1;
          var27Lifetime1 = var27Lifetime1 + var23Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var24Lifetime1;
          var76 = new int[9];
          var55 = var76;
          var29 = var55;
          for (var30Lifetime1 = 0; var30Lifetime1 < 3; var30Lifetime1++) {
            for (var31 = 0; var31 < 3; var31++) {
              var32Lifetime1 = 0;
              for (var33Lifetime1 = 0; var33Lifetime1 < 3; var33Lifetime1++) {
                var32Lifetime1 = var32Lifetime1 + param7[var30Lifetime1 * 3 + var33Lifetime1] * var25[var31 + var33Lifetime1 * 3];
              }
              var29[var30Lifetime1 * 3 + var31] = var32Lifetime1 + 8192 >> 14;
            }
          }
          var30Lifetime1Lifetime1 = param7[0] * var26Lifetime1 + param7[1] * var27Lifetime1 + param7[2] * var28Lifetime1 + 8192 >> 14;
          var31Lifetime1 = param7[3] * var26Lifetime1 + param7[4] * var27Lifetime1 + param7[5] * var28Lifetime1 + 8192 >> 14;
          var32Lifetime1Lifetime1 = param7[6] * var26Lifetime1 + param7[7] * var27Lifetime1 + param7[8] * var28Lifetime1 + 8192 >> 14;
          var30Lifetime1Lifetime1 = var30Lifetime1Lifetime1 + var10Lifetime3Lifetime2;
          var31Lifetime1 = var31Lifetime1 + var11Lifetime3Lifetime1;
          var32Lifetime1Lifetime1 = var32Lifetime1Lifetime1 + var12Lifetime3;
          for (var33Lifetime1Lifetime1 = 0; var33Lifetime1Lifetime1 < var9; var33Lifetime1Lifetime1++) {
            var34Lifetime1 = param1[var33Lifetime1Lifetime1];
            if (var34Lifetime1 < this.field_sb.length) {
              var98 = this.field_sb[var34Lifetime1];
              for (var36Lifetime1 = 0; var36Lifetime1 < var98.length; var36Lifetime1++) {
                var37Lifetime1 = var98[var36Lifetime1];
                if (this.field_Eb == null ||
                  (param6 & this.field_Eb[var37Lifetime1]) != 0) {
                  var38Lifetime1 = var76[0] * this.field_xb[var37Lifetime1] + var76[1] * this.field_rb[var37Lifetime1] + var76[2] * this.field_T[var37Lifetime1] + 8192 >> 14;
                  var39Lifetime1 = var76[3] * this.field_xb[var37Lifetime1] + var76[4] * this.field_rb[var37Lifetime1] + var76[5] * this.field_T[var37Lifetime1] + 8192 >> 14;
                  var40Lifetime1 = var76[6] * this.field_xb[var37Lifetime1] + var76[7] * this.field_rb[var37Lifetime1] + var76[8] * this.field_T[var37Lifetime1] + 8192 >> 14;
                  var38Lifetime1 = var38Lifetime1 + var30Lifetime1Lifetime1;
                  var39Lifetime1 = var39Lifetime1 + var31Lifetime1;
                  var40Lifetime1 = var40Lifetime1 + var32Lifetime1Lifetime1;
                  this.field_xb[var37Lifetime1] = var38Lifetime1;
                  this.field_rb[var37Lifetime1] = var39Lifetime1;
                  this.field_T[var37Lifetime1] = var40Lifetime1;
                }
              }
            }
          }
          return;
        }
        if (param0 == 5) {
          if (this.field_Cb != null &&
            this.field_h != null) {
            for (var10Lifetime4 = 0; var10Lifetime4 < var9; var10Lifetime4++) {
              var11Lifetime4 = param1[var10Lifetime4];
              if (var11Lifetime4 < this.field_Cb.length) {
                var100 = this.field_Cb[var11Lifetime4];
                for (var13Lifetime3 = 0; var13Lifetime3 < var100.length; var13Lifetime3++) {
                  var14_intLifetime4 = var100[var13Lifetime3];
                  if (this.field_V == null ||
                    (param6 & this.field_V[var14_intLifetime4]) != 0) {
                    var15Lifetime3 = (this.field_h[var14_intLifetime4] & 255) + param2 * 8;
                    if (var15Lifetime3 >= 0) {
                      if (var15Lifetime3 > 255) {
                        var15Lifetime3 = 255;
                      }
                    } else {
                      var15Lifetime3 = 0;
                    }
                    this.field_h[var14_intLifetime4] = (byte)var15Lifetime3;
                  }
                }
              }
            }
            if (this.field_e == null) {
              return;
            }
            for (var10Lifetime4Lifetime1 = 0; var10Lifetime4Lifetime1 < this.field_m; var10Lifetime4Lifetime1++) {
              var59 = this.field_e[var10Lifetime4Lifetime1];
              var58 = this.field_db[var10Lifetime4Lifetime1];
              var58.field_k = var58.field_k & 16777215 | 255 - (this.field_h[var59.field_j] & 255) << 24;
            }
            return;
          }
          return;
        }
        if (param0 == 7) {
          if (this.field_Cb != null) {
            for (var10Lifetime5 = 0; var10Lifetime5 < var9; var10Lifetime5++) {
              var11Lifetime5 = param1[var10Lifetime5];
              if (var11Lifetime5 < this.field_Cb.length) {
                var101 = this.field_Cb[var11Lifetime5];
                for (var13Lifetime4 = 0; var13Lifetime4 < var101.length; var13Lifetime4++) {
                  var14_intLifetime5 = var101[var13Lifetime4];
                  if (this.field_V == null ||
                    (param6 & this.field_V[var14_intLifetime5]) != 0) {
                    var15Lifetime4 = this.field_ob[var14_intLifetime5] & 65535;
                    var16Lifetime2 = var15Lifetime4 >> 10 & 63;
                    var17Lifetime2 = var15Lifetime4 >> 7 & 7;
                    var18Lifetime2 = var15Lifetime4 & 127;
                    var16Lifetime2 = var16Lifetime2 + param2 & 63;
                    var17Lifetime2 = var17Lifetime2 + param3;
                    if (var17Lifetime2 >= 0) {
                      if (var17Lifetime2 > 7) {
                        var17Lifetime2 = 7;
                      }
                    } else {
                      var17Lifetime2 = 0;
                    }
                    var18Lifetime2 = var18Lifetime2 + param4;
                    if (var18Lifetime2 >= 0) {
                      if (var18Lifetime2 > 127) {
                        var18Lifetime2 = 127;
                      }
                    } else {
                      var18Lifetime2 = 0;
                    }
                    this.field_ob[var14_intLifetime5] = (short)(var16Lifetime2 << 10 | var17Lifetime2 << 7 | var18Lifetime2);
                  }
                }
                this.field_L = true;
              }
            }
            if (this.field_e == null) {
              return;
            }
            for (var10Lifetime5Lifetime1 = 0; var10Lifetime5Lifetime1 < this.field_m; var10Lifetime5Lifetime1++) {
              var62 = this.field_e[var10Lifetime5Lifetime1];
              var61 = this.field_db[var10Lifetime5Lifetime1];
              var61.field_k = var61.field_k & -16777216 | bt.field_h[tg.a((byte) -114, this.field_ob[var62.field_j] & 65535) & 65535] & 16777215;
            }
            return;
          }
          return;
        }
        if (param0 == 8) {
          if (this.field_j != null) {
            for (var10Lifetime6 = 0; var10Lifetime6 < var9; var10Lifetime6++) {
              var11Lifetime6 = param1[var10Lifetime6];
              if (var11Lifetime6 < this.field_j.length) {
                var102 = this.field_j[var11Lifetime6];
                for (var13Lifetime5 = 0; var13Lifetime5 < var102.length; var13Lifetime5++) {
                  var64 = this.field_db[var102[var13Lifetime5]];
                  var64.field_b = var64.field_b + param2;
                  var64.field_a = var64.field_a + param3;
                }
              }
            }
            return;
          }
          return;
        }
        if (param0 == 10) {
          if (this.field_j != null) {
            for (var10Lifetime7 = 0; var10Lifetime7 < var9; var10Lifetime7++) {
              var11Lifetime7 = param1[var10Lifetime7];
              if (var11Lifetime7 < this.field_j.length) {
                var103 = this.field_j[var11Lifetime7];
                for (var13Lifetime6 = 0; var13Lifetime6 < var103.length; var13Lifetime6++) {
                  var66 = this.field_db[var103[var13Lifetime6]];
                  var14 = var66;
                  var14.field_m = var66.field_m * param2 >> 7;
                  var14.field_g = var66.field_g * param3 >> 7;
                }
              }
            }
            return;
          }
          return;
        }
        if (param0 != 9) {
          return;
        }
        if (this.field_j != null) {
          for (var10Lifetime8 = 0; var10Lifetime8 < var9; var10Lifetime8++) {
            var11Lifetime8 = param1[var10Lifetime8];
            if (var11Lifetime8 < this.field_j.length) {
              var104 = this.field_j[var11Lifetime8];
              for (var13Lifetime7 = 0; var13Lifetime7 < var104.length; var13Lifetime7++) {
                var68 = this.field_db[var104[var13Lifetime7]];
                var14Lifetime1 = var68;
                var14Lifetime1.field_j = var68.field_j + param2 & 16383;
              }
            }
          }
        }
    }

    private final boolean h(int param0) {
        if (this.field_jb == null) {
          return false;
        }
        if (this.field_jb[param0] == -1) {
          return false;
        }
        return true;
    }

    private final void h() {
        int var5 = 0;
        int stackIn_5_0 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        for (var5 = 0; var5 < this.field_g; var5++) {
          if (this.field_X == null) {
            stackIn_5_0 = -1;
          } else {
            stackIn_5_0 = this.field_X[var5];
          }
          var4 = stackIn_5_0;
          if (var4 == -1) {
            var1 = this.field_ob[var5] & 65535;
            var2 = (var1 & 127) * this.field_Db >> 7;
            var1 = tg.a((byte) -117, var1 & -128 | var2);
            if (this.field_Fb[var5] != -1) {
              if (this.field_Fb[var5] != -2) {
                var3 = this.field_t[var5] & -131072;
                this.field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                var3 = this.field_o[var5] & -131072;
                this.field_o[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                var3 = this.field_Fb[var5] & -131072;
                this.field_Fb[var5] = var3 | ds.c(-127, var1, var3 >> 17);
              }
            } else {
              var3 = this.field_t[var5] & -131072;
              this.field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
            }
          }
        }
        this.field_eb = 2;
    }

    private final void g(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_F.field_h) {
          var2 = this.field_M[param0];
          var3 = this.field_bb[param0];
          var4 = this.field_x[param0];
          var5 = 0;
          var6 = 0;
          var7 = 0;
          if (this.field_s[var2] <= this.field_F.field_L) {
            if (this.field_s[var2] > this.field_F.field_M) {
              var5 = (this.field_F.field_M - this.field_s[var2]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var5 = 255;
          }
          if (this.field_s[var3] <= this.field_F.field_L) {
            if (this.field_s[var3] > this.field_F.field_M) {
              var6 = (this.field_F.field_M - this.field_s[var3]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var6 = 255;
          }
          if (this.field_s[var4] <= this.field_F.field_L) {
            if (this.field_s[var4] > this.field_F.field_M) {
              var7 = (this.field_F.field_M - this.field_s[var4]) * 255 / (this.field_F.field_M - this.field_F.field_L);
            }
          } else {
            var7 = 255;
          }
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var8 = -16777216;
            if (this.field_h != null) {
              var8 = 255 - (this.field_h[param0] & 255) << 24;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var8 | this.field_t[param0] & 16777215, var8 | this.field_o[param0] & 16777215, var8 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            } else {
              var9 = var8 | this.field_t[param0] & 16777215;
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9, var9, var9, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
            } else {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
            }
          }
        } else {
          var2 = this.field_M[param0];
          var3 = this.field_bb[param0];
          var4 = this.field_x[param0];
          var5 = this.field_mb[var2] - this.field_F.field_B;
          if (var5 <= 255) {
            if (var5 < 0) {
              var5 = 0;
            }
          } else {
            var5 = 255;
          }
          var6 = this.field_mb[var3] - this.field_F.field_B;
          if (var6 <= 255) {
            if (var6 < 0) {
              var6 = 0;
            }
          } else {
            var6 = 255;
          }
          var7 = this.field_mb[var4] - this.field_F.field_B;
          if (var7 <= 255) {
            if (var7 < 0) {
              var7 = 0;
            }
          } else {
            var7 = 255;
          }
          var8 = var5 + var6 + var7;
          if (var8 == 765) {
            return;
          }
          if (var8 == 0) {
            this.j(param0);
            return;
          }
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var9 = -16777216;
            if (this.field_h != null) {
              var9 = 255 - (this.field_h[param0] & 255) << 24;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9 | this.field_t[param0] & 16777215, var9 | this.field_o[param0] & 16777215, var9 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            } else {
              var10 = var9 | this.field_t[param0] & 16777215;
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var10, var10, var10, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
            } else {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
            }
          }
        }

    }

    private final void e(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var16Lifetime1;
        int var17Lifetime1;
        int var13Lifetime4;
        int var13Lifetime1Lifetime1;
        int var13Lifetime2Lifetime1;
        int var16Lifetime1Lifetime1;
        var2 = 0;
        var3 = this.field_d.field_g;
        var4 = this.field_M[param0];
        var5 = this.field_bb[param0];
        var6 = this.field_x[param0];
        var7 = this.field_Ab[var4];
        var8 = this.field_Ab[var5];
        var9 = this.field_Ab[var6];
        if (this.field_h != null) {
          this.field_w.field_b = this.field_h[param0] & 255;
        } else {
          this.field_w.field_b = 0;
        }
        if (var7 < var3) {
          var10 = this.field_nb[var4];
          var11 = this.field_C[var4];
          var12 = this.field_t[param0] & 65535;
          if (var9 >= var3) {
            var13 = (var3 - var7) * (65536 / (var9 - var7));
            this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$0 = var2;
            var2++;
            this.field_hb[incrementValue$0] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
          }
          if (var8 >= var3) {
            var13Lifetime4 = (var3 - var7) * (65536 / (var8 - var7));
            this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13Lifetime4 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13Lifetime4 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$1 = var2;
            var2++;
            this.field_hb[incrementValue$1] = var12 + (((this.field_o[param0] & 65535) - var12) * var13Lifetime4 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var4];
          this.field_E[var2] = this.field_J[var4];
          this.field_yb[var2] = this.field_mb[var4];
          incrementValue$2 = var2;
          var2++;
          this.field_hb[incrementValue$2] = this.field_t[param0] & 65535;
        }
        if (var8 < var3) {
          var10Lifetime1 = this.field_nb[var5];
          var11Lifetime1 = this.field_C[var5];
          var12Lifetime1 = this.field_o[param0] & 65535;
          if (var7 >= var3) {
            var13Lifetime1 = (var3 - var8) * (65536 / (var7 - var8));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime1 + ((this.field_nb[var4] - var10Lifetime1) * var13Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime1 + ((this.field_C[var4] - var11Lifetime1) * var13Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$3 = var2;
            var2++;
            this.field_hb[incrementValue$3] = var12Lifetime1 + (((this.field_t[param0] & 65535) - var12Lifetime1) * var13Lifetime1 >> 16);
          }
          if (var9 >= var3) {
            var13Lifetime1Lifetime1 = (var3 - var8) * (65536 / (var9 - var8));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime1 + ((this.field_nb[var6] - var10Lifetime1) * var13Lifetime1Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime1 + ((this.field_C[var6] - var11Lifetime1) * var13Lifetime1Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$4 = var2;
            var2++;
            this.field_hb[incrementValue$4] = var12Lifetime1 + (((this.field_Fb[param0] & 65535) - var12Lifetime1) * var13Lifetime1Lifetime1 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var5];
          this.field_E[var2] = this.field_J[var5];
          this.field_yb[var2] = this.field_mb[var5];
          incrementValue$5 = var2;
          var2++;
          this.field_hb[incrementValue$5] = this.field_o[param0] & 65535;
        }
        if (var9 < var3) {
          var10Lifetime2 = this.field_nb[var6];
          var11Lifetime2 = this.field_C[var6];
          var12Lifetime2 = this.field_Fb[param0] & 65535;
          if (var8 >= var3) {
            var13Lifetime2 = (var3 - var9) * (65536 / (var8 - var9));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime2 + ((this.field_nb[var5] - var10Lifetime2) * var13Lifetime2 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime2 + ((this.field_C[var5] - var11Lifetime2) * var13Lifetime2 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$6 = var2;
            var2++;
            this.field_hb[incrementValue$6] = var12Lifetime2 + (((this.field_o[param0] & 65535) - var12Lifetime2) * var13Lifetime2 >> 16);
          }
          if (var7 >= var3) {
            var13Lifetime2Lifetime1 = (var3 - var9) * (65536 / (var7 - var9));
            this.field_y[var2] = this.field_F.field_o + (var10Lifetime2 + ((this.field_nb[var4] - var10Lifetime2) * var13Lifetime2Lifetime1 >> 16)) * this.field_d.field_Q / var3;
            this.field_E[var2] = this.field_F.field_H + (var11Lifetime2 + ((this.field_C[var4] - var11Lifetime2) * var13Lifetime2Lifetime1 >> 16)) * this.field_d.field_C / var3;
            this.field_yb[var2] = var3;
            incrementValue$7 = var2;
            var2++;
            this.field_hb[incrementValue$7] = var12Lifetime2 + (((this.field_t[param0] & 65535) - var12Lifetime2) * var13Lifetime2Lifetime1 >> 16);
          }
        } else {
          this.field_y[var2] = this.field_v[var6];
          this.field_E[var2] = this.field_J[var6];
          this.field_yb[var2] = this.field_mb[var6];
          incrementValue$8 = var2;
          var2++;
          this.field_hb[incrementValue$8] = this.field_Fb[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var10Lifetime3 = this.field_y[0];
        var11Lifetime3 = this.field_y[1];
        var12Lifetime3 = this.field_y[2];
        var13Lifetime3 = this.field_E[0];
        var14 = this.field_E[1];
        var15 = this.field_E[2];
        var7Lifetime1 = this.field_yb[0];
        var8Lifetime1 = this.field_yb[1];
        var9Lifetime1 = this.field_yb[2];
        this.field_w.field_q = false;
        if (var2 == 3) {
          if (var10Lifetime3 < 0 ||
            var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            !(var10Lifetime3 <= this.field_F.field_y) ||
            !(var11Lifetime3 <= this.field_F.field_y) ||
            !(var12Lifetime3 <= this.field_F.field_y)) {
            this.field_w.field_q = true;
          }
          if (this.field_X != null &&
            this.field_X[param0] != -1) {
            var16 = -16777216;
            if (this.field_h != null) {
              var16 = 255 - (this.field_h[param0] & 255) << 24;
            }
            var17 = var16 | this.field_t[param0] & 16777215;
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
            } else {
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
            } else {
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, bt.field_h[this.field_t[param0] & 65535]);
            }
          }
        }
        L12: {
          if (var2 == 4) {
            if (var10Lifetime3 < 0 ||
              var11Lifetime3 < 0 ||
              var12Lifetime3 < 0 ||
              !(var10Lifetime3 <= this.field_F.field_y) ||
              !(var11Lifetime3 <= this.field_F.field_y) ||
              !(var12Lifetime3 <= this.field_F.field_y) ||
              this.field_y[3] < 0 ||
              !(this.field_y[3] <= this.field_F.field_y)) {
              this.field_w.field_q = true;
            }
            if (this.field_X != null &&
              this.field_X[param0] != -1) {
              var16Lifetime1 = -16777216;
              if (this.field_h != null) {
                var16Lifetime1 = 255 - (this.field_h[param0] & 255) << 24;
              }
              var17Lifetime1 = var16Lifetime1 | this.field_t[param0] & 16777215;
              if (this.field_Fb[param0] != -1) {
                this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                this.field_w.b((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var9Lifetime1, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
              } else {
                this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                this.field_w.b((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var9Lifetime1, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17Lifetime1, var17Lifetime1, var17Lifetime1, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
              }
              break L12;
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              this.field_w.b((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var8Lifetime1, (float)this.field_yb[3], (float)this.field_hb[0], (float)this.field_hb[2], (float)this.field_hb[3]);
            } else {
              var16Lifetime1Lifetime1 = bt.field_h[this.field_t[param0] & 65535];
              this.field_w.a((float)var13Lifetime3, (float)var14, (float)var15, (float)var10Lifetime3, (float)var11Lifetime3, (float)var12Lifetime3, (float)var7Lifetime1, (float)var8Lifetime1, (float)var9Lifetime1, var16Lifetime1Lifetime1);
              this.field_w.a((float)var13Lifetime3, (float)var15, (float)this.field_E[3], (float)var10Lifetime3, (float)var12Lifetime3, (float)this.field_y[3], (float)var7Lifetime1, (float)var8Lifetime1, (float)this.field_yb[3], var16Lifetime1Lifetime1);
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    private final void f(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var2 = this.field_M[param0];
        var3 = this.field_bb[param0];
        var4 = this.field_x[param0];
        if (this.field_X != null &&
          this.field_X[param0] != -1) {
          var5 = -16777216;
          if (this.field_h != null) {
            var5 = 255 - (this.field_h[param0] & 255) << 24;
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var5 | this.field_t[param0] & 16777215, var5 | this.field_o[param0] & 16777215, var5 | this.field_Fb[param0] & 16777215, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
          } else {
            var6 = var5 | this.field_t[param0] & 16777215;
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var6, var6, var6, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
          }
        } else {
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
          } else {
            this.field_w.field_b = 0;
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], (float)(this.field_t[param0] & 65535), (float)(this.field_o[param0] & 65535), (float)(this.field_Fb[param0] & 65535));
          } else {
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], bt.field_h[this.field_t[param0] & 65535]);
          }
        }
    }

    final void FA(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        if ((this.field_P & 6) != 6) {
          throw new IllegalStateException();
        }
        var2 = qu.field_b[param0];
        var3 = qu.field_d[param0];
        var4 = this;
        synchronized (var4) {
          for (var5 = 0; var5 < this.field_p; var5++) {
            var6 = this.field_rb[var5] * var3 - this.field_T[var5] * var2 >> 14;
            this.field_T[var5] = this.field_rb[var5] * var2 + this.field_T[var5] * var3 >> 14;
            this.field_rb[var5] = var6;
          }
          this.f();
        }
        return;
    }

    final boolean NA() {
        if (this.field_sb == null) {
          return false;
        }
        this.field_gb = 0;
        this.field_H = 0;
        this.field_Y = 0;
        return true;
    }

    private final void b(gda param0, el param1, int param2, int param3) {
        try {
          float stackIn_17_0 = 0.0f;
          float stackIn_27_0 = 0.0f;
          float stackIn_42_0 = 0.0f;
          int stackIn_73_0 = 0;
          int stackIn_81_0 = 0;
          iua stackIn_143_0 = null;
          boolean stackIn_144_1 = false;
          int stackIn_148_0 = 0;
          int stackIn_152_1 = 0;
          boolean stackIn_156_2 = false;
          int stackIn_160_1 = 0;
          boolean stackIn_164_2 = false;
          Throwable decompiledCaughtException = null;
          pna var5 = null;
          int var6 = 0;
          float var7 = 0.0f;
          float var8 = 0.0f;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          float var13 = 0.0f;
          float var14 = 0.0f;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          int var18 = 0;
          float var19 = 0.0f;
          float var20 = 0.0f;
          int var21 = 0;
          int var22 = 0;
          int var23 = 0;
          int var24 = 0;
          float var25 = 0.0f;
          float var26 = 0.0f;
          float var27 = 0.0f;
          float var28 = 0.0f;
          float var29 = 0.0f;
          float var30 = 0.0f;
          Object var31_ref_Object = null;
          int var31 = 0;
          InterruptedException var32_ref_InterruptedException = null;
          int var32 = 0;
          int var33 = 0;
          float var34 = 0.0f;
          float var35 = 0.0f;
          float var36 = 0.0f;
          int var37 = 0;
          int var38 = 0;
          int var39 = 0;
          int var40 = 0;
          int var41 = 0;
          int var42 = 0;
          int var43_int = 0;
          Exception var43 = null;
          Object var43_ref = null;
          int var44 = 0;
          int var45 = 0;
          int var46 = 0;
          int var47_int = 0;
          float var47 = 0.0f;
          int var48 = 0;
          nsa var49 = null;
          hna var51 = null;
          hna var52 = null;
          nsa var53 = null;
          hna var54 = null;
          hna var55 = null;
          nsa var56 = null;
          float var34Lifetime1;
          float var35Lifetime1;
          float var36Lifetime1;
          int var37Lifetime1;
          int var38Lifetime1;
          int var39Lifetime1;
          int var46Lifetime1;
          int var37Lifetime1Lifetime1;
          int var38Lifetime1Lifetime1;
          int var39Lifetime1Lifetime1;
          if (this.field_Z < 1) {
            return;
          }
          this.field_B = (pna) (param0);
          var5 = this.field_d.field_A;
          if (!this.field_r) {
            this.d();
          }
          var6 = 0;
          if (this.field_B.field_g == 16384.0f &&
            this.field_B.field_i == 0.0f &&
            this.field_B.field_n == 0.0f &&
            this.field_B.field_h == 0.0f &&
            this.field_B.field_s == 16384.0f &&
            this.field_B.field_j == 0.0f &&
            this.field_B.field_r == 0.0f &&
            this.field_B.field_o == 0.0f &&
            this.field_B.field_f == 16384.0f) {
            var6 = 1;
          }
          var7 = var5.field_m + var5.field_r * this.field_B.field_l + var5.field_o * this.field_B.field_e + var5.field_f * this.field_B.field_m;
          if (var6 == 0) {
            stackIn_17_0 = var5.field_r * this.field_B.field_i + var5.field_o * this.field_B.field_s + var5.field_f * this.field_B.field_o;
          } else {
            stackIn_17_0 = var5.field_o;
          }
          var8 = stackIn_17_0;
          var9 = (int)(var7 + (float)this.field_f * var8);
          var10 = (int)(var7 + (float)this.field_cb * var8);
          if (var9 <= var10) {
            var11 = var9 - this.field_U;
            var12 = var10 + this.field_U;
          } else {
            var11 = var10 - this.field_U;
            var12 = var9 + this.field_U;
          }
          if (var11 >= this.field_d.field_U) {
            return;
          }
          if (var12 <= this.field_d.field_g) {
            return;
          }
          var13 = var5.field_l + var5.field_g * this.field_B.field_l + var5.field_i * this.field_B.field_e + var5.field_n * this.field_B.field_m;
          if (var6 == 0) {
            stackIn_27_0 = var5.field_g * this.field_B.field_i + var5.field_i * this.field_B.field_s + var5.field_n * this.field_B.field_o;
          } else {
            stackIn_27_0 = var5.field_i;
          }
          var14 = stackIn_27_0;
          var15 = (int)(var13 + (float)this.field_f * var14);
          var16 = (int)(var13 + (float)this.field_cb * var14);
          if (var15 <= var16) {
            var17 = (var15 - this.field_U) * this.field_d.field_Q;
            var18 = (var16 + this.field_U) * this.field_d.field_Q;
          } else {
            var17 = (var16 - this.field_U) * this.field_d.field_Q;
            var18 = (var15 + this.field_U) * this.field_d.field_Q;
          }
          if (param2 != -1) {
            if (var17 / param2 >= this.field_d.field_l) {
              return;
            }
            if (var18 / param2 <= this.field_d.field_p) {
              return;
            }
          } else {
            if (var17 / var12 >= this.field_d.field_l) {
              return;
            }
            if (var18 / var12 <= this.field_d.field_p) {
              return;
            }
          }
          var19 = var5.field_e + var5.field_h * this.field_B.field_l + var5.field_s * this.field_B.field_e + var5.field_j * this.field_B.field_m;
          if (var6 == 0) {
            stackIn_42_0 = var5.field_h * this.field_B.field_i + var5.field_s * this.field_B.field_s + var5.field_j * this.field_B.field_o;
          } else {
            stackIn_42_0 = var5.field_s;
          }
          var20 = stackIn_42_0;
          var21 = (int)(var19 + (float)this.field_f * var20);
          var22 = (int)(var19 + (float)this.field_cb * var20);
          if (var21 <= var22) {
            var23 = (var21 - this.field_U) * this.field_d.field_C;
            var24 = (var22 + this.field_U) * this.field_d.field_C;
          } else {
            var23 = (var22 - this.field_U) * this.field_d.field_C;
            var24 = (var21 + this.field_U) * this.field_d.field_C;
          }
          if (param2 != -1) {
            if (var23 / param2 >= this.field_d.field_o) {
              return;
            }
            if (var24 / param2 <= this.field_d.field_k) {
              return;
            }
          } else {
            if (var23 / var12 >= this.field_d.field_o) {
              return;
            }
            if (var24 / var12 <= this.field_d.field_k) {
              return;
            }
          }
          if (var6 == 0) {
            var25 = var5.field_g * this.field_B.field_g + var5.field_i * this.field_B.field_h + var5.field_n * this.field_B.field_r;
            var26 = var5.field_h * this.field_B.field_g + var5.field_s * this.field_B.field_h + var5.field_j * this.field_B.field_r;
            var27 = var5.field_r * this.field_B.field_g + var5.field_o * this.field_B.field_h + var5.field_f * this.field_B.field_r;
            var28 = var5.field_g * this.field_B.field_n + var5.field_i * this.field_B.field_j + var5.field_n * this.field_B.field_f;
            var29 = var5.field_h * this.field_B.field_n + var5.field_s * this.field_B.field_j + var5.field_j * this.field_B.field_f;
            var30 = var5.field_r * this.field_B.field_n + var5.field_o * this.field_B.field_j + var5.field_f * this.field_B.field_f;
          } else {
            var25 = var5.field_g;
            var26 = var5.field_h;
            var27 = var5.field_r;
            var28 = var5.field_n;
            var29 = var5.field_j;
            var30 = var5.field_f;
          }
          if (this.field_d.field_u > 1) {
            var31_ref_Object = this;
            synchronized (var31_ref_Object) {
              while (this.field_zb) {
                try {
                  this.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var32_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
              }
              this.field_zb = true;
            }
          }
          this.b(Thread.currentThread());
          if ((param3 & 2) == 0) {
            this.field_w.a(false);
          } else {
            this.field_w.a(true);
          }
          var31 = 0;
          stackIn_73_0 = (var11 > this.field_d.field_g) ? 0 : 1;
          var32 = stackIn_73_0;
          if (var32 == 0) {
            if (this.field_i == null) {
              stackIn_81_0 = (this.field_kb != null) ? 1 : 0;
            } else {
              stackIn_81_0 = 1;
            }
          } else {
            stackIn_81_0 = 1;
          }
          var33 = stackIn_81_0;
          this.field_F.field_y = this.field_w.field_h;
          this.field_F.field_o = this.field_w.field_e;
          this.field_F.field_H = this.field_w.field_n;
          var40 = this.field_d.field_Q;
          var41 = this.field_d.field_C;
          var42 = this.field_d.field_g;
          if (param2 != -1) {
            for (var43_int = 0; var43_int < this.field_p; var43_int++) {
              var37 = this.field_xb[var43_int];
              var38 = this.field_rb[var43_int];
              var39 = this.field_T[var43_int];
              var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
              var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
              var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
              this.field_mb[var43_int] = (int)var36;
              this.field_v[var43_int] = this.field_F.field_o + (int)(var34 * (float)var40 / (float)param2);
              this.field_J[var43_int] = this.field_F.field_H + (int)(var35 * (float)var41 / (float)param2);
              if (var33 != 0) {
                this.field_nb[var43_int] = (int)var34;
                this.field_C[var43_int] = (int)var35;
                this.field_Ab[var43_int] = param2;
              }
              if (this.field_F.field_h) {
                this.field_s[var43_int] = (int)(this.field_B.field_e + (this.field_B.field_h * (float)var37 + this.field_B.field_s * (float)var38 + this.field_B.field_j * (float)var39));
              }
            }
            if (this.field_e != null) {
              for (var43_int = 0; var43_int < this.field_m; var43_int++) {
                var52 = this.field_e[var43_int];
                var55 = var52;
                var56 = this.field_db[var43_int];
                var46 = this.field_M[var52.field_j];
                var47_int = this.field_bb[var52.field_j];
                var48 = this.field_x[var52.field_j];
                var37 = (this.field_xb[var46] + this.field_xb[var47_int] + this.field_xb[var48]) / 3;
                var38 = (this.field_rb[var46] + this.field_rb[var47_int] + this.field_rb[var48]) / 3;
                var39 = (this.field_T[var46] + this.field_T[var47_int] + this.field_T[var48]) / 3;
                var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                var56.field_e = this.field_d.field_L + (int)(var34 * (float)var40 / (float)param2);
                var56.field_h = this.field_d.field_w + (int)(var35 * (float)var41 / (float)param2);
                var56.field_n = param2 - var55.field_f;
                var56.field_l = var56.field_m * var55.field_i * var40 / (param2 << 7);
                var56.field_c = var56.field_g * var55.field_b * var41 / (param2 << 7);
              }
            }
          } else {
            for (var43_int = 0; var43_int < this.field_p; var43_int++) {
              var37 = this.field_xb[var43_int];
              var38 = this.field_rb[var43_int];
              var39 = this.field_T[var43_int];
              var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
              var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
              var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
              this.field_mb[var43_int] = (int)var36;
              if (!(var36 >= (float)var42)) {
                this.field_v[var43_int] = -5000;
                var31 = 1;
              } else {
                this.field_v[var43_int] = this.field_F.field_o + (int)(var34 * (float)var40 / var36);
                this.field_J[var43_int] = this.field_F.field_H + (int)(var35 * (float)var41 / var36);
              }
              if (var33 != 0) {
                this.field_nb[var43_int] = (int)var34;
                this.field_C[var43_int] = (int)var35;
                this.field_Ab[var43_int] = (int)var36;
              }
              if (this.field_F.field_h) {
                this.field_s[var43_int] = (int)(this.field_B.field_e + (this.field_B.field_h * (float)var37 + this.field_B.field_s * (float)var38 + this.field_B.field_j * (float)var39));
              }
            }
            if (this.field_e != null) {
              for (var43_int = 0; var43_int < this.field_m; var43_int++) {
                var51 = this.field_e[var43_int];
                var54 = var51;
                var53 = this.field_db[var43_int];
                var46 = this.field_M[var51.field_j];
                var47_int = this.field_bb[var51.field_j];
                var48 = this.field_x[var51.field_j];
                var37 = (this.field_xb[var46] + this.field_xb[var47_int] + this.field_xb[var48]) / 3;
                var38 = (this.field_rb[var46] + this.field_rb[var47_int] + this.field_rb[var48]) / 3;
                var39 = (this.field_T[var46] + this.field_T[var47_int] + this.field_T[var48]) / 3;
                var34 = (float)var53.field_b + (var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39);
                var35 = (float)var53.field_a + (var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39);
                var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                if (!(var36 > (float)this.field_d.field_g)) {
                  var49 = var53;
                  var53.field_c = 0;
                  var49.field_l = 0;
                } else {
                  var53.field_e = this.field_d.field_L + (int)(var34 * (float)var40 / var36);
                  var53.field_h = this.field_d.field_w + (int)(var35 * (float)var41 / var36);
                  var53.field_n = (int)var36 - var54.field_f;
                  var53.field_l = (int)((float)(var53.field_m * var54.field_i * var40) / (var36 * 128.0f));
                  var53.field_c = (int)((float)(var53.field_g * var54.field_b * var41) / (var36 * 128.0f));
                }
              }
            }
          }
          if (param1 != null) {
            var43_int = 0;
            var44 = 1;
            var45 = this.field_R + this.field_O >> 1;
            var46Lifetime1 = this.field_Bb + this.field_vb >> 1;
            var37Lifetime1 = var45;
            var38Lifetime1 = this.field_f;
            var39Lifetime1 = var46Lifetime1;
            var34Lifetime1 = var13 + var25 * (float)var37Lifetime1 + var14 * (float)var38Lifetime1 + var28 * (float)var39Lifetime1;
            var35Lifetime1 = var19 + var26 * (float)var37Lifetime1 + var20 * (float)var38Lifetime1 + var29 * (float)var39Lifetime1;
            var36Lifetime1 = var7 + var27 * (float)var37Lifetime1 + var8 * (float)var38Lifetime1 + var30 * (float)var39Lifetime1;
            if (!(var36Lifetime1 >= (float)var42)) {
              var43_int = 1;
            } else {
              if (param2 == -1) {
              }
            }
            var37Lifetime1Lifetime1 = var45;
            var38Lifetime1Lifetime1 = this.field_cb;
            var39Lifetime1Lifetime1 = var46Lifetime1;
            var47 = var7 + var27 * (float)var37Lifetime1Lifetime1 + var8 * (float)var38Lifetime1Lifetime1 + var30 * (float)var39Lifetime1Lifetime1;
            if (!(var47 >= (float)var42)) {
              var43_int = 1;
            } else {
              if (param2 == -1) {
              }
            }
            if (var43_int != 0) {
              if (var36Lifetime1 < (float)var42 &&
                var47 < (float)var42) {
                var44 = 0;
              } else {
                if (!(var36Lifetime1 < (float)var42)) {
                  if (var47 < (float)var42 &&
                    param2 == -1) {
                  }
                } else {
                  if (param2 == -1) {
                  }
                }
              }
            }
            if (var44 != 0) {
              if (!(var36Lifetime1 > var47)) {
              }
              if (param2 == -1) {
              }
            }
          }
          this.a(true);
          stackIn_143_0 = this.field_w;
          stackIn_144_1 = ((param3 & 1) != 0) ? false : true;
          stackIn_143_0.field_j = stackIn_144_1;
          this.field_w.field_g = false;
          try {
            stackIn_148_0 = ((param3 & 4) == 0) ? 0 : 1;
            var43_int = stackIn_148_0;
            if (var43_int == 0) {
              boolean decompiledFrameRemainder1 = true;
              stackIn_160_1 = var31;
              if ((!this.field_F.field_J ||
                !(var12 > this.field_F.field_B)) && !this.field_F.field_h) {
                stackIn_164_2 = false;
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_164_2 = true;
              }
              this.a(stackIn_160_1 != 0, stackIn_164_2, var11, var12 - var11);
            } else {
              boolean decompiledFrameRemainder0 = true;
              stackIn_152_1 = var31;
              if ((!this.field_F.field_J ||
                !(var12 > this.field_F.field_B)) && !this.field_F.field_h) {
                stackIn_156_2 = false;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_156_2 = true;
              }
              this.b(stackIn_152_1 != 0, stackIn_156_2, var11, var12 - var11);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var43 = (Exception) (Object) decompiledCaughtException;
          }
          if (this.field_e != null) {
            for (var43_int = 0; var43_int < this.field_g; var43_int++) {
              this.field_jb[var43_int] = -1;
            }
          }
          this.field_w = null;
          if (this.field_d.field_u > 1) {
            var43_ref = this;
            synchronized (var43_ref) {
              this.field_zb = false;
              this.notifyAll();
            }
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d() {
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        if (this.field_r) {
          return;
        }
        var1 = 0;
        var2 = 0;
        var3 = 32767;
        var4 = 32767;
        var5 = 32767;
        var6 = -32768;
        var7 = -32768;
        var8 = -32768;
        for (var9 = 0; var9 < this.field_Z; var9++) {
          var10 = this.field_xb[var9];
          var11 = this.field_rb[var9];
          var12 = this.field_T[var9];
          if (var10 < var3) {
            var3 = var10;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var11 < var4) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var12 < var5) {
            var5 = var12;
          }
          if (var12 > var8) {
            var8 = var12;
          }
          var13 = var10 * var10 + var12 * var12;
          if (var13 > var1) {
            var1 = var13;
          }
          var13 = var13 + var11 * var11;
          if (var13 > var2) {
            var2 = var13;
          }
        }
        this.field_R = (short)var3;
        this.field_O = (short)var6;
        this.field_f = (short)var4;
        this.field_cb = (short)var7;
        this.field_Bb = (short)var5;
        this.field_vb = (short)var8;
        this.field_U = (short)(int)(Math.sqrt((double)var1) + 0.99);
        Math.sqrt((double)var2);
        this.field_r = true;
        return;
    }

    private final void b(Thread param0) {
        tw var2 = this.field_d.a((Runnable) ((Object) param0));
        this.field_w = var2.field_v;
        if (var2 == this.field_F) {
          return;
        }
        this.field_F = var2;
        this.field_s = this.field_F.field_A;
        this.field_nb = this.field_F.field_c;
        this.field_C = this.field_F.field_k;
        this.field_Ab = this.field_F.field_G;
        this.field_v = this.field_F.field_j;
        this.field_J = this.field_F.field_a;
        this.field_mb = this.field_F.field_p;
        this.field_y = this.field_F.field_i;
        this.field_E = this.field_F.field_I;
        this.field_yb = this.field_F.field_q;
        this.field_hb = this.field_F.field_s;
        this.field_jb = this.field_F.field_l;
    }

    private final void b(boolean param0, boolean param1, int param2, int param3) {
        int var5;
        hna var6_ref_hna;
        int var6;
        int var7;
        int var5Lifetime1;
        if (this.field_e != null) {
          for (var5 = 0; var5 < this.field_m; var5++) {
            var6_ref_hna = this.field_e[var5];
            this.field_jb[var6_ref_hna.field_j] = var5;
          }
        }
        if (!this.field_ab &&
          this.field_e == null) {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            this.b(var5Lifetime1, param0, param1);
          }
        } else if ((this.field_P & 256) == 0 &&
          this.field_ub != null) {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            var6 = this.field_ub[var5Lifetime1];
            this.b(var6, param0, param1);
          }
        } else {
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            if (!this.c(var5Lifetime1) &&
              !this.h(var5Lifetime1)) {
              this.b(var5Lifetime1, param0, param1);
            }
          }
          if (this.field_wb == null) {
            for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
              if (this.c(var5Lifetime1) ||
                this.h(var5Lifetime1)) {
                this.b(var5Lifetime1, param0, param1);
              }
            }
          } else {
            for (var5Lifetime1 = 0; var5Lifetime1 < 12; var5Lifetime1++) {
              var7 = 0;
              var6 = var7;
              while (var7 < this.field_g) {
                if (this.field_wb[var7] == var5Lifetime1 && (this.c(var7) ||
                  this.h(var7))) {
                  this.b(var7, param0, param1);
                }
                var7++;
              }
            }
          }
        }
    }

    private final void b(boolean param0) {
        int var8 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_90_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        oha var13;
        int var13_int;
        int var14;
        int var15;
        oha var15_ref_oha;
        int var16;
        int var17;
        int var18;
        gna var19;
        gna var20;
        if (this.field_eb == 1) {
          this.e();
          return;
        }
        if (this.field_eb == 2) {
          if ((this.field_P & 618648) == 0 &&
            this.field_W == null) {
            this.field_ob = null;
          }
          if (param0) {
            this.field_k = null;
          }
          return;
        }
        this.g();
        var2 = this.field_d.field_x;
        var3 = this.field_d.field_V;
        var4 = this.field_d.field_S;
        var5 = this.field_d.field_f >> 8;
        var6 = this.field_d.field_q * 768 / this.field_ib;
        var7 = this.field_d.field_M * 768 / this.field_ib;
        if (this.field_t == null) {
          this.field_t = new int[this.field_g];
          this.field_o = new int[this.field_g];
          this.field_Fb = new int[this.field_g];
        }
        for (var8 = 0; var8 < this.field_g; var8++) {
          if (this.field_k != null) {
            var9 = this.field_k[var8];
          } else {
            var9 = 0;
          }
          if (this.field_h != null) {
            var10 = this.field_h[var8];
          } else {
            var10 = 0;
          }
          if (this.field_X != null) {
            var11 = this.field_X[var8];
          } else {
            var11 = -1;
          }
          if (var10 == -2) {
            var9 = 3;
          }
          if (var10 == -1) {
            var9 = 2;
          }
          L9: {
            if (var11 != -1) {
              var12 = this.field_ob[var8] & 65535;
              if (var9 == 0) {
                if (this.field_D != null &&
                  this.field_D[this.field_M[var8]] != null) {
                  var13 = this.field_D[this.field_M[var8]];
                } else {
                  var13 = this.field_lb[this.field_M[var8]];
                }
                var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                stackIn_70_0 = (var15 <= 256) ? var7 : var6;
                var16 = stackIn_70_0;
                var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                this.field_t[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                if (this.field_D != null &&
                  this.field_D[this.field_bb[var8]] != null) {
                  var13 = this.field_D[this.field_bb[var8]];
                } else {
                  var13 = this.field_lb[this.field_bb[var8]];
                }
                var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                stackIn_77_0 = (var15 <= 256) ? var7 : var6;
                var16 = stackIn_77_0;
                var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                this.field_o[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                if (this.field_D != null &&
                  this.field_D[this.field_x[var8]] != null) {
                  var13 = this.field_D[this.field_x[var8]];
                } else {
                  var13 = this.field_lb[this.field_x[var8]];
                }
                var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                stackIn_84_0 = (var15 <= 256) ? var7 : var6;
                var16 = stackIn_84_0;
                var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                this.field_Fb[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                break L9;
              }
              if (var9 == 1) {
                var20 = this.field_I[var8];
                var14 = var2 * var20.field_a + var3 * var20.field_c + var4 * var20.field_b >> 16;
                stackIn_90_0 = (var14 <= 256) ? var7 : var6;
                var15 = stackIn_90_0;
                var16 = this.d((var5 >> 2) + (var15 * var14 >> 18));
                this.field_t[var8] = var16 << 24 | this.a(var12, (short) var11, var16);
                this.field_Fb[var8] = -1;
                break L9;
              }
            } else {
              switch (var9) {
                case 0:
                  var12 = this.field_ob[var8] & 65535;
                  var13_int = (var12 & 127) * this.field_Db >> 7;
                  var14 = tg.a((byte) -128, var12 & -128 | var13_int);
                  if (this.field_D != null &&
                    this.field_D[this.field_M[var8]] != null) {
                    var15_ref_oha = this.field_D[this.field_M[var8]];
                  } else {
                    var15_ref_oha = this.field_lb[this.field_M[var8]];
                  }
                  var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                  stackIn_35_0 = (var17 <= 256) ? var7 : var6;
                  var18 = stackIn_35_0;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.field_t[var8] = var16 << 17 | ds.c(-127, var14, var16);
                  if (this.field_D != null &&
                    this.field_D[this.field_bb[var8]] != null) {
                    var15_ref_oha = this.field_D[this.field_bb[var8]];
                  } else {
                    var15_ref_oha = this.field_lb[this.field_bb[var8]];
                  }
                  var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                  stackIn_42_0 = (var17 <= 256) ? var7 : var6;
                  var18 = stackIn_42_0;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.field_o[var8] = var16 << 17 | ds.c(-127, var14, var16);
                  if (this.field_D != null &&
                    this.field_D[this.field_x[var8]] != null) {
                    var15_ref_oha = this.field_D[this.field_x[var8]];
                  } else {
                    var15_ref_oha = this.field_lb[this.field_x[var8]];
                  }
                  var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                  stackIn_49_0 = (var17 <= 256) ? var7 : var6;
                  var18 = stackIn_49_0;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.field_Fb[var8] = var16 << 17 | ds.c(-127, var14, var16);
                  break L9;
                case 1:
                  var12 = this.field_ob[var8] & 65535;
                  var13_int = (var12 & 127) * this.field_Db >> 7;
                  var14 = tg.a((byte) -105, var12 & -128 | var13_int);
                  var19 = this.field_I[var8];
                  var16 = var2 * var19.field_a + var3 * var19.field_c + var4 * var19.field_b >> 16;
                  stackIn_55_0 = (var16 <= 256) ? var7 : var6;
                  var17 = stackIn_55_0;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.field_t[var8] = var18 << 17 | ds.c(-127, var14, var18);
                  this.field_Fb[var8] = -1;
                  break L9;
                case 3:
                  this.field_t[var8] = 128;
                  this.field_Fb[var8] = -1;
                  break L9;
                default:
                  break;
              }
            }
            this.field_Fb[var8] = -2;
          }
        }
        this.field_lb = null;
        this.field_D = null;
        this.field_I = null;
        if ((this.field_P & 618648) == 0 &&
          this.field_W == null) {
          this.field_ob = null;
        }
        if (param0) {
          this.field_k = null;
        }
        this.field_eb = 2;
        return;
    }

    final void a(gda param0, el param1, int param2, int param3) {
        this.b(param0, param1, param2, param3);
    }

    private final void a(Thread param0) {
        tw var2 = this.field_d.a((Runnable) ((Object) param0));
        if (var2 == this.field_z) {
          return;
        }
        this.field_z = var2;
        this.field_pb = this.field_z.field_C;
        this.field_u = this.field_z.field_t;
        this.field_Q = this.field_z.field_m;
        this.field_Gb = this.field_z.field_K;
        this.field_N = this.field_z.field_x;
        this.field_n = this.field_z.field_E;
        this.field_qb = this.field_z.field_w;
        this.field_K = this.field_z.field_F;
        this.field_tb = this.field_z.field_e;
        this.field_fb = this.field_z.field_r;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        hna var11;
        int var12_int;
        nsa var12;
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
        if (this.field_Fb[param0] == -2) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = this.field_M[param0];
        var5 = this.field_bb[param0];
        var6 = this.field_x[param0];
        var7 = this.field_v[var4];
        var8 = this.field_v[var5];
        var9 = this.field_v[var6];
        if (param1 && (var7 == -5000 ||
          var8 == -5000 ||
          var9 == -5000)) {
          var10 = this.field_nb[var4];
          var11_int = this.field_nb[var5];
          var12_int = this.field_nb[var6];
          var13 = this.field_C[var4];
          var14 = this.field_C[var5];
          var15 = this.field_C[var6];
          var16 = this.field_Ab[var4];
          var17 = this.field_Ab[var5];
          var18 = this.field_Ab[var6];
          var10 = var10 - var11_int;
          var12_int = var12_int - var11_int;
          var13 = var13 - var14;
          var15 = var15 - var14;
          var16 = var16 - var17;
          var18 = var18 - var17;
          var19 = var13 * var18 - var16 * var15;
          var20 = var16 * var12_int - var10 * var18;
          var21 = var10 * var15 - var13 * var12_int;
          if (!(var11_int * var19 + var14 * var20 + var17 * var21 <= 0)) {
            this.e(param0);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_jb[param0] != -1 ||
            (var7 - var8) * (this.field_J[var6] - this.field_J[var5]) - (this.field_J[var4] - this.field_J[var5]) * (var9 - var8) > 0) {
            if (var7 >= 0 &&
              var8 >= 0 &&
              var9 >= 0 &&
              var7 <= this.field_F.field_y &&
              var8 <= this.field_F.field_y &&
              var9 <= this.field_F.field_y) {
              this.field_w.field_q = false;
            } else {
              this.field_w.field_q = true;
            }
            if (!param2) {
              var10Lifetime1 = this.field_jb[param0];
              if (var10Lifetime1 == -1) {
                this.f(param0);
              } else {
                var11 = this.field_e[var10Lifetime1];
                var12 = this.field_db[var10Lifetime1];
                if (!var11.field_d) {
                  this.f(param0);
                }
                this.field_d.c(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
              }
            } else {
              var10Lifetime1 = this.field_jb[param0];
              if (var10Lifetime1 != -1) {
                if (!this.field_e[var10Lifetime1].field_d) {
                  this.i(param0);
                }
              } else {
                this.i(param0);
              }
            }
          }
        }

    }

    ww(sfa param0) {
        this.field_zb = false;
        this.field_Z = 0;
        this.field_r = false;
        this.field_ab = false;
        this.field_eb = 0;
        this.field_S = false;
        this.field_A = false;
        this.field_g = 0;
        this.field_p = 0;
        this.field_d = param0;
    }

    ww(sfa param0, oc param1, int param2, int param3, int param4, int param5) {
        int var9_int = 0;
        int stackIn_6_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_67_0 = 0;
        d var7;
        long[] var9;
        int var10;
        int var11_int;
        ima var11;
        int var12;
        Object var13;
        int var14;
        int var15;
        int var16;
        int var17;
        dw var18;
        int var18_int;
        float[] var19;
        int var19_int;
        float[] var20;
        int var21;
        lp var21_ref_lp;
        int var22;
        dw var22_ref_dw;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        float var29;
        int var30;
        float var30_float;
        float var31;
        float var32;
        float var33;
        int var34;
        float var34_float;
        int var35;
        float var35_float;
        int var36;
        float var36_float;
        int var37;
        float var37_float;
        int var38;
        float var38_float;
        int var39;
        float var39_float;
        int var40;
        float var40_float;
        int var41;
        float var41_float;
        int var42;
        float var42_float;
        float var43;
        float var44;
        float var45;
        float var46;
        float var47;
        float var48;
        float var49;
        float var50;
        float var51;
        float var52;
        float var53;
        int var54;
        jt var56;
        dw var57;
        long[] var58;
        jt var59;
        lp var60;
        tw var61;
        dw var62;
        float[] var65;
        float[] var66;
        long[] var68;
        int[] var74;
        float[] var75;
        float[] var76;
        int var11_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18_intLifetime1;
        int var18_intLifetime2;
        int var19_intLifetime1;
        int var21Lifetime1;
        float var50Lifetime1;
        float var51Lifetime1;
        float var52Lifetime1;
        float var53Lifetime1;
        int var14Lifetime1Lifetime1;
        this.field_zb = false;
        this.field_Z = 0;
        this.field_r = false;
        this.field_ab = false;
        this.field_eb = 0;
        this.field_S = false;
        this.field_A = false;
        this.field_g = 0;
        this.field_p = 0;
        this.field_d = param0;
        this.field_P = param2;
        this.field_Db = param3;
        this.field_ib = param4;
        var7 = this.field_d.field_c;
        this.field_p = param1.field_E;
        this.field_Z = param1.field_L;
        this.field_xb = param1.field_b;
        this.field_rb = param1.field_I;
        this.field_T = param1.field_p;
        this.field_g = param1.field_o;
        this.field_M = param1.field_a;
        this.field_bb = param1.field_t;
        this.field_x = param1.field_J;
        this.field_wb = param1.field_C;
        this.field_ob = param1.field_A;
        this.field_h = param1.field_n;
        this.field_V = param1.field_h;
        this.field_k = param1.field_G;
        this.field_i = param1.field_B;
        this.field_kb = param1.field_e;
        this.field_Eb = param1.field_y;
        var74 = new int[this.field_g];
        for (var9_int = 0; var9_int < this.field_g; var9_int++) {
          var74[var9_int] = var9_int;
        }
        var68 = new long[this.field_g];
        var58 = var68;
        var9 = var58;
        stackIn_6_0 = ((this.field_P & 256) == 0) ? 0 : 1;
        var10 = stackIn_6_0;
        for (var11_int = 0; var11_int < this.field_g; var11_int++) {
          var12 = var74[var11_int];
          var13 = null;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = 0;
          if (param1.field_m != null) {
            var18_int = 0;
            for (var19_int = 0; var19_int < param1.field_m.length; var19_int++) {
              var56 = param1.field_m[var19_int];
              if (var12 == var56.field_a) {
                var21_ref_lp = fw.a(var56.field_d, false);
                if (var21_ref_lp.field_i) {
                  var18_int = 1;
                }
                if (var21_ref_lp.field_f != -1) {
                  var22_ref_dw = var7.a((byte) -71, var21_ref_lp.field_f);
                  if (var22_ref_dw.field_d == 2) {
                    this.field_ab = true;
                  }
                }
              }
            }
            if (var18_int != 0) {
              var9[var11_int] = 9223372036854775807L;
            }
          }
          var18_intLifetime2 = -1;
          if (param1.field_r != null) {
            var18_intLifetime2 = param1.field_r[var12];
            if (var18_intLifetime2 != -1) {
              var57 = var7.a((byte) -126, var18_intLifetime2 & 65535);
              var13 = var57;
              if ((param5 & 64) != 0 &&
                var57.field_p) {
                var18_intLifetime2 = -1;
              } else {
                var16 = var57.field_h;
                var17 = var57.field_a;
              }
            }
          }
          if (this.field_h != null &&
            this.field_h[var12] != 0) {
            stackIn_41_0 = 1;
          } else {
            if (var13 != null) {
              stackIn_41_0 = (((dw) (var13)).field_d == 2) ? 1 : 0;
            } else {
              stackIn_41_0 = 0;
            }
          }
          var19_intLifetime1 = stackIn_41_0;
          if ((var10 != 0 ||
            var19_intLifetime1 != 0) && this.field_wb != null) {
            var14 = var14 + (this.field_wb[var12] << 17);
          }
          if (var19_intLifetime1 != 0) {
            var14 = var14 + 65536;
          }
          var14 = var14 + ((var16 & 255) << 8);
          var14 = var14 + (var17 & 255);
          var15 = var15 + ((var18_intLifetime2 & 65535) << 16);
          var15 = var15 + (var11_int & 65535);
          var9[var11_int] = ((long)var14 << 32) + (long)var15;
          if (var19_intLifetime1 != 0) {
            this.field_ab = true;
          }
        }
        ofa.a(var74, var68, 89);
        if (param1.field_m != null) {
          this.field_m = param1.field_m.length;
          this.field_e = new hna[this.field_m];
          this.field_db = new nsa[this.field_m];
          var54 = 0;
          var11_intLifetime1 = var54;
          while (var54 < param1.field_m.length) {
            var59 = param1.field_m[var54];
            var60 = fw.a(var59.field_d, false);
            var14Lifetime1 = bt.field_h[param1.field_A[var59.field_a] & 65535] & 16777215;
            stackIn_57_0 = var14Lifetime1;
            stackIn_57_1 = 255;
            if (param1.field_n == null) {
              stackIn_58_2 = 0;
            } else {
              stackIn_58_2 = param1.field_n[var59.field_a] & 255;
            }
            var14Lifetime1Lifetime1 = stackIn_57_0 | stackIn_57_1 - stackIn_58_2 << 24;
            this.field_e[var54] = new hna(var59.field_a, (int) param1.field_a[var59.field_a], (int) param1.field_t[var59.field_a], (int) param1.field_J[var59.field_a], var60.field_d, var60.field_b, var60.field_f, var60.field_c, var60.field_e, var60.field_i, var59.field_c);
            this.field_db[var54] = new nsa(var14Lifetime1Lifetime1);
            var54++;
          }
        }
        this.field_W = new float[this.field_g][];
        this.field_l = new float[this.field_g][];
        var11 = qqa.a(var74, param1, this.field_g, (byte) -6);
        var61 = this.field_d.a((Runnable) ((Object) Thread.currentThread()));
        var75 = var61.field_d;
        var14Lifetime2 = 0;
        for (var15Lifetime1 = 0; var15Lifetime1 < this.field_g; var15Lifetime1++) {
          var16Lifetime1 = var74[var15Lifetime1];
          if (param1.field_g != null) {
            var17Lifetime1 = param1.field_g[var16Lifetime1];
          } else {
            var17Lifetime1 = -1;
          }
          if (param1.field_r != null) {
            stackIn_67_0 = param1.field_r[var16Lifetime1];
          } else {
            stackIn_67_0 = -1;
          }
          var18_intLifetime1 = stackIn_67_0;
          if (var18_intLifetime1 != -1 &&
            (param5 & 64) != 0) {
            var62 = var7.a((byte) 110, var18_intLifetime1 & 65535);
            if (var62.field_p) {
              var18_intLifetime1 = -1;
            }
          }
          if (var18_intLifetime1 != -1) {
            var14Lifetime2 = 1;
            this.field_W[var16Lifetime1] = new float[3];
            var65 = new float[3];
            var19 = var65;
            this.field_l[var16Lifetime1] = new float[3];
            var66 = new float[3];
            var20 = var66;
            var21 = 0;
            if (var17Lifetime1 != -1) {
              var17Lifetime1 = var17Lifetime1 & 255;
              var22 = param1.field_u[var17Lifetime1];
              if (var22 != 0) {
                var23 = this.field_M[var16Lifetime1];
                var24 = this.field_bb[var16Lifetime1];
                var25 = this.field_x[var16Lifetime1];
                var26 = var11.field_a[var17Lifetime1];
                var27 = var11.field_c[var17Lifetime1];
                var28 = var11.field_d[var17Lifetime1];
                var76 = var11.field_b[var17Lifetime1];
                var30 = param1.field_z[var17Lifetime1];
                var31 = (float)param1.field_d[var17Lifetime1] / 256.0f;
                if (var22 != 1) {
                  if (var22 != 2) {
                    if (var22 == 3) {
                      ifa.a(this.field_T[var23], this.field_xb[var23], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var23]);
                      var19[0] = var75[0];
                      var20[0] = var75[1];
                      ifa.a(this.field_T[var24], this.field_xb[var24], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var24]);
                      var19[1] = var75[0];
                      var20[1] = var75[1];
                      ifa.a(this.field_T[var25], this.field_xb[var25], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var25]);
                      var19[2] = var75[0];
                      var20[2] = var75[1];
                      if ((var30 & 1) != 0) {
                        if (!(var66[1] - var66[0] > 0.5f)) {
                          if (var66[0] - var66[1] > 0.5f) {
                            var20[1] = var20[1] + 1.0f;
                          }
                        } else {
                          var20[1] = var20[1] - 1.0f;
                        }
                        if (!(var66[2] - var66[0] > 0.5f)) {
                          if (var66[0] - var66[2] > 0.5f) {
                            var20[2] = var20[2] + 1.0f;
                          }
                        } else {
                          var20[2] = var20[2] - 1.0f;
                        }
                      } else {
                        if (!(var65[1] - var65[0] > 0.5f)) {
                          if (var65[0] - var65[1] > 0.5f) {
                            var19[1] = var19[1] + 1.0f;
                          }
                        } else {
                          var19[1] = var19[1] - 1.0f;
                        }
                        if (!(var65[2] - var65[0] > 0.5f)) {
                          if (var65[0] - var65[2] > 0.5f) {
                            var19[2] = var19[2] + 1.0f;
                          }
                        } else {
                          var19[2] = var19[2] - 1.0f;
                        }
                      }
                    }
                  } else {
                    var32 = (float)param1.field_v[var17Lifetime1] / 256.0f;
                    var33 = (float)param1.field_c[var17Lifetime1] / 256.0f;
                    var34 = this.field_xb[var24] - this.field_xb[var23];
                    var35 = this.field_rb[var24] - this.field_rb[var23];
                    var36 = this.field_T[var24] - this.field_T[var23];
                    var37 = this.field_xb[var25] - this.field_xb[var23];
                    var38 = this.field_rb[var25] - this.field_rb[var23];
                    var39 = this.field_T[var25] - this.field_T[var23];
                    var40 = var35 * var39 - var38 * var36;
                    var41 = var36 * var37 - var39 * var34;
                    var42 = var34 * var38 - var37 * var35;
                    var43 = 64.0f / (float)param1.field_j[var17Lifetime1];
                    var44 = 64.0f / (float)param1.field_f[var17Lifetime1];
                    var45 = 64.0f / (float)param1.field_x[var17Lifetime1];
                    var46 = ((float)var40 * var76[0] + (float)var41 * var76[1] + (float)var42 * var76[2]) / var43;
                    var47 = ((float)var40 * var76[3] + (float)var41 * var76[4] + (float)var42 * var76[5]) / var44;
                    var48 = ((float)var40 * var76[6] + (float)var41 * var76[7] + (float)var42 * var76[8]) / var45;
                    var21Lifetime1 = mr.a(var48, var47, false, var46);
                    as.a(var27, var75, this.field_rb[var23], var26, var33, var28, var32, this.field_xb[var23], var21Lifetime1, this.field_T[var23], -94, var31, var30, var76);
                    var19[0] = var75[0];
                    var20[0] = var75[1];
                    as.a(var27, var75, this.field_rb[var24], var26, var33, var28, var32, this.field_xb[var24], var21Lifetime1, this.field_T[var24], -125, var31, var30, var76);
                    var19[1] = var75[0];
                    var20[1] = var75[1];
                    as.a(var27, var75, this.field_rb[var25], var26, var33, var28, var32, this.field_xb[var25], var21Lifetime1, this.field_T[var25], 73, var31, var30, var76);
                    var19[2] = var75[0];
                    var20[2] = var75[1];
                  }
                } else {
                  var32 = (float)param1.field_x[var17Lifetime1] / 1024.0f;
                  loa.a(var30, var75, var32, this.field_T[var23], this.field_rb[var23], 65, var76, var31, var27, var28, this.field_xb[var23], var26);
                  var19[0] = var75[0];
                  var20[0] = var75[1];
                  loa.a(var30, var75, var32, this.field_T[var24], this.field_rb[var24], 64, var76, var31, var27, var28, this.field_xb[var24], var26);
                  var19[1] = var75[0];
                  var20[1] = var75[1];
                  loa.a(var30, var75, var32, this.field_T[var25], this.field_rb[var25], 76, var76, var31, var27, var28, this.field_xb[var25], var26);
                  var19[2] = var75[0];
                  var20[2] = var75[1];
                  var33 = var32 / 2.0f;
                  if ((var30 & 1) != 0) {
                    if (!(var66[1] - var66[0] > var33)) {
                      if (var66[0] - var66[1] > var33) {
                        var20[1] = var20[1] + var32;
                      }
                    } else {
                      var20[1] = var20[1] - var32;
                    }
                    if (!(var66[2] - var66[0] > var33)) {
                      if (var66[0] - var66[2] > var33) {
                        var20[2] = var20[2] + var32;
                      }
                    } else {
                      var20[2] = var20[2] - var32;
                    }
                  } else {
                    if (!(var65[1] - var65[0] > var33)) {
                      if (var65[0] - var65[1] > var33) {
                        var19[1] = var19[1] + var32;
                      }
                    } else {
                      var19[1] = var19[1] - var32;
                    }
                    if (!(var65[2] - var65[0] > var33)) {
                      if (var65[0] - var65[2] > var33) {
                        var19[2] = var19[2] + var32;
                      }
                    } else {
                      var19[2] = var19[2] - var32;
                    }
                  }
                }
              } else {
                var23 = this.field_M[var16Lifetime1];
                var24 = this.field_bb[var16Lifetime1];
                var25 = this.field_x[var16Lifetime1];
                var26 = param1.field_s[var17Lifetime1];
                var27 = param1.field_q[var17Lifetime1];
                var28 = param1.field_K[var17Lifetime1];
                var29 = (float)this.field_xb[var26];
                var30_float = (float)this.field_rb[var26];
                var31 = (float)this.field_T[var26];
                var32 = (float)this.field_xb[var27] - var29;
                var33 = (float)this.field_rb[var27] - var30_float;
                var34_float = (float)this.field_T[var27] - var31;
                var35_float = (float)this.field_xb[var28] - var29;
                var36_float = (float)this.field_rb[var28] - var30_float;
                var37_float = (float)this.field_T[var28] - var31;
                var38_float = (float)this.field_xb[var23] - var29;
                var39_float = (float)this.field_rb[var23] - var30_float;
                var40_float = (float)this.field_T[var23] - var31;
                var41_float = (float)this.field_xb[var24] - var29;
                var42_float = (float)this.field_rb[var24] - var30_float;
                var43 = (float)this.field_T[var24] - var31;
                var44 = (float)this.field_xb[var25] - var29;
                var45 = (float)this.field_rb[var25] - var30_float;
                var46 = (float)this.field_T[var25] - var31;
                var47 = var33 * var37_float - var34_float * var36_float;
                var48 = var34_float * var35_float - var32 * var37_float;
                var49 = var32 * var36_float - var33 * var35_float;
                var50 = var36_float * var49 - var37_float * var48;
                var51 = var37_float * var47 - var35_float * var49;
                var52 = var35_float * var48 - var36_float * var47;
                var53 = 1.0f / (var50 * var32 + var51 * var33 + var52 * var34_float);
                var19[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                var19[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                var19[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                var50Lifetime1 = var33 * var49 - var34_float * var48;
                var51Lifetime1 = var34_float * var47 - var32 * var49;
                var52Lifetime1 = var32 * var48 - var33 * var47;
                var53Lifetime1 = 1.0f / (var50Lifetime1 * var35_float + var51Lifetime1 * var36_float + var52Lifetime1 * var37_float);
                var20[0] = (var50Lifetime1 * var38_float + var51Lifetime1 * var39_float + var52Lifetime1 * var40_float) * var53Lifetime1;
                var20[1] = (var50Lifetime1 * var41_float + var51Lifetime1 * var42_float + var52Lifetime1 * var43) * var53Lifetime1;
                var20[2] = (var50Lifetime1 * var44 + var51Lifetime1 * var45 + var52Lifetime1 * var46) * var53Lifetime1;
              }
            } else {
              var19[0] = 0.0f;
              var20[0] = 1.0f;
              var19[1] = 1.0f;
              var20[1] = 1.0f;
              var19[2] = 0.0f;
              var20[2] = 0.0f;
            }
          }
        }
        if (var14Lifetime2 == 0) {
          this.field_l = (float[][]) null;
          this.field_W = (float[][]) null;
        }
        if (param1.field_l != null &&
          (this.field_P & 32) != 0) {
          this.field_sb = param1.a(true, (byte) 64);
        }
        if (param1.field_D != null &&
          (this.field_P & 384) != 0) {
          this.field_Cb = param1.c((byte) -61);
        }
        if (param1.field_m != null &&
          (this.field_P & 1024) != 0) {
          this.field_j = param1.b((byte) -119);
        }
        if (param1.field_r != null) {
          this.field_X = new short[this.field_g];
          var15Lifetime2 = 0;
          for (var16Lifetime2 = 0; var16Lifetime2 < this.field_g; var16Lifetime2++) {
            var17Lifetime2 = param1.field_r[var16Lifetime2];
            if (var17Lifetime2 == -1) {
              this.field_X[var16Lifetime2] = (short)-1;
            } else {
              var18 = this.field_d.field_c.a((byte) -2, var17Lifetime2);
              if ((param5 & 64) != 0 &&
                var18.field_p) {
                this.field_X[var16Lifetime2] = (short)-1;
              } else {
                this.field_X[var16Lifetime2] = (short)var17Lifetime2;
                var15Lifetime2 = 1;
                if (var18.field_d == 2) {
                  this.field_ab = true;
                }
                if (var18.field_s == 0 &&
                  var18.field_o != 0) {
                }
              }
            }
          }
          if (var15Lifetime2 == 0) {
            this.field_X = null;
          }
        } else {
          this.field_X = null;
        }
        if (this.field_ab) {
          this.field_ub = new short[this.field_g];
          for (var15Lifetime3 = 0; var15Lifetime3 < this.field_g; var15Lifetime3++) {
            this.field_ub[var15Lifetime3] = (short)var74[var15Lifetime3];
          }
        } else {
          if (this.field_e != null) {
            this.field_ub = new short[this.field_g];
            for (var15Lifetime3 = 0; var15Lifetime3 < this.field_g; var15Lifetime3++) {
              this.field_ub[var15Lifetime3] = (short)var74[var15Lifetime3];
            }
          }
        }
    }

    static {
        field_Hb = "FMT";
        field_G = 4096;
        field_q = 4096;
    }
}
