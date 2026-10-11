/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static int[] field_u;
    e field_A;
    Terraphoenix field_i;
    private boolean field_n;
    int field_c;
    private String field_b;
    int field_g;
    private int field_d;
    private int field_v;
    int field_k;
    private boolean field_a;
    private int field_B;
    private int field_j;
    private int field_w;
    static int field_h;
    static String field_e;
    private int field_r;
    int field_y;
    private int field_C;
    int field_t;
    private String field_f;
    private boolean field_s;
    static ak field_x;
    int field_q;
    static byte[] field_m;
    int field_l;
    String field_o;
    int field_z;
    private int field_p;

    final static jb c(int param0) {
        try {
          Throwable var1 = null;
          jb stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != -3109) {
              ad.b((byte) -71);
            }
            stackIn_3_0 = (jb) (Class.forName("ii").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 <= 68) {
          field_h = -126;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (95 == param1) || (param1 == 45);
        return stackIn_9_0;
    }

    final boolean b(int param0) {
        boolean stackIn_262_0 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        r var7;
        r var8;
        r var9;
        r var10;
        r var11;
        r var12;
        r var13;
        r var14;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var6 = Terraphoenix.field_V;
        if (this.field_p == 0 &&
          this.field_w == 0) {
          var2 = (this.field_A.field_q.field_F - this.field_A.field_q.field_H) * 32;
          var3 = -(this.field_A.field_q.field_E * 48) + 16 * (this.field_A.field_q.field_H + this.field_A.field_q.field_F);
          if (this.field_l == this.field_d &&
            this.field_d == 1 &&
            Math.abs(-var2 + sj.field_b) + Math.abs(lg.field_c - var3) > 32) {
            this.field_w = 5;
            this.field_B = 2;
          }
          if (this.field_d == this.field_l &&
            2 == this.field_d &&
            Math.abs(sj.field_b - var2) + Math.abs(-var3 + lg.field_c) == 0) {
            this.field_B = 3;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l && (this.field_d == 3 ||
            this.field_d == 2) && 0 < og.field_d) {
            this.field_w = 5;
            this.field_B = 4;
          }
          if (this.field_l == this.field_d &&
            this.field_d <= 4 && (3 != this.field_A.field_q.field_F ||
            this.field_A.field_q.field_H != 4)) {
            this.field_B = 5;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l &&
            this.field_d <= 5 && (!(this.field_A.field_q.field_F <= 7) ||
            !(7 >= this.field_A.field_q.field_H))) {
            this.field_B = 6;
            this.field_w = 5;
          }
          if (this.field_d < 6 &&
            this.field_A.field_q.field_v / 2 >= this.field_A.field_q.field_jb) {
            this.field_A.a(29518, -1);
            this.field_A.a(param0 + 29518, -2);
            this.field_B = 6;
            this.field_w = 5;
          }
          if (this.field_l == this.field_d &&
            this.field_d == 6 &&
            this.field_A.field_q.field_v * 3 / 4 < this.field_A.field_q.field_jb) {
            this.field_B = 7;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l &&
            this.field_d <= 7 &&
            this.field_A.field_q.field_E > 0) {
            this.field_B = 8;
            this.field_w = 5;
          }
          if (this.field_l == this.field_d &&
            8 > this.field_d &&
            0 == this.field_A.field_q.field_E &&
            this.field_A.field_q.field_H >= 9 &&
            this.field_A.field_q.field_F <= 8) {
            this.field_B = 9;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l &&
            this.field_d == 8 &&
            0 == this.field_A.field_q.field_E) {
            this.field_B = 9;
            this.field_w = 5;
          }
          if (this.field_l == this.field_d &&
            this.field_d <= 12 &&
            this.field_A.field_q != this.field_A.field_C[0]) {
            this.field_B = 13;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l &&
            this.field_d <= 13 &&
            (!(this.field_A.field_C[6].field_P > 0) ||
            !(this.field_A.field_C[7].field_P > 0))) {
            this.field_w = 5;
            this.field_B = 14;
          }
          if (this.field_l == this.field_d &&
            this.field_d <= 14 &&
            this.field_A.field_C[6].field_P <= 0 &&
            0 >= this.field_A.field_C[7].field_P) {
            this.field_B = 15;
            this.field_w = 5;
          }
          if (this.field_l == this.field_d &&
            this.field_d == 15 && (this.field_A.field_q.field_B == 0 ||
            !(this.field_A.field_C[8].field_P > 0) ||
            !(this.field_A.field_C[9].field_P > 0))) {
            this.field_B = 16;
            this.field_w = 5;
          }
          if (this.field_l == this.field_d &&
            16 >= this.field_d && (!(this.field_A.field_C[8].field_P > 0) ||
            !(this.field_A.field_C[9].field_P > 0))) {
            this.field_w = 5;
            this.field_B = 17;
          }
          if (this.field_d == this.field_l && (9 == this.field_l ||
            this.field_l == 10)) {
            var8 = this.field_A.field_C[4];
            var8.field_jb = var8.field_v;
            if (!var8.field_S) {
              var8.field_d = 2;
              var8.field_N = 0;
              var8.field_S = true;
              var8.field_A = 0;
              var8.field_X = 32;
              var8.field_n = 16;
            }
            var8.field_B = 0;
            var8.field_nb.field_c = 20;
            var9 = this.field_A.field_C[5];
            if (!var9.field_S) {
              var9.field_d = 2;
              var9.field_n = 28;
              var9.field_S = true;
              var9.field_N = 0;
              var9.field_X = 33;
              var9.field_A = 0;
            }
            var9.field_nb.field_c = 20;
            var9.field_jb = var9.field_v;
          }
          if (this.field_l == this.field_d &&
            this.field_d <= 17 &&
            0 >= this.field_A.field_C[8].field_P &&
            this.field_A.field_C[9].field_P <= 0) {
            this.field_B = 18;
            this.field_w = 5;
          }
          if (this.field_d == this.field_l &&
            this.field_l == 10) {
            var10 = this.field_A.field_C[6];
            if (!var10.field_S &&
              0 < this.field_A.field_C[5].field_P) {
              var10.field_S = true;
              var10.field_A = 0;
              var10.field_X = 19;
              var10.field_n = 20;
              var10.field_N = 0;
              var10.field_d = 2;
            }
            var10.field_jb = var10.field_v;
            var10.field_nb.field_c = 20;
            var11 = this.field_A.field_C[7];
            if (!var11.field_S &&
              this.field_A.field_C[4].field_P > 0) {
              var11.field_N = 0;
              var11.field_A = 0;
              var11.field_n = 16;
              var11.field_S = true;
              var11.field_X = 20;
              var11.field_d = 2;
            }
            var11.field_nb.field_c = 20;
            var11.field_jb = var11.field_v;
            if (this.field_A.field_C[4].field_P <= 0 &&
              0 >= this.field_A.field_C[5].field_P) {
              this.field_B = this.field_l + 1;
              this.field_l = this.field_B;
              this.field_d = this.field_l;
              this.a(false, 17097);
            }
          }
          if (this.field_l == this.field_d &&
            this.field_l == 11) {
            var12 = this.field_A.field_C[6];
            var12.field_jb = var12.field_v;
            if (!var12.field_S) {
              var12.field_N = 0;
              var12.field_X = 12;
              var12.field_n = 19;
              var12.field_jb = 3 * var12.field_jb / 2;
              var12.field_B = 0;
              var12.field_A = 0;
              var12.field_r = null;
              var12.field_d = var12.field_B;
              var12.field_S = true;
              if (var12.field_F == var12.field_X &&
                var12.field_H == var12.field_n) {
                var12.field_S = false;
              }
            }
            var7 = this.field_A.field_C[7];
            var13 = var7;
            var13.field_jb = var13.field_v;
            if (!var13.field_S) {
              var13.field_B = 0;
              var13.field_jb = var13.field_jb * 3 / 2;
              var13.field_X = 12;
              var13.field_N = 0;
              var13.field_n = 17;
              var13.field_d = var13.field_B;
              var13.field_S = true;
              var13.field_A = 0;
              var13.field_r = null;
              if (var13.field_X == var13.field_F &&
                var13.field_n == var13.field_H) {
                var7.field_S = false;
              }
            }
            var14 = this.field_A.field_C[1];
            var14.field_jb = var14.field_v;
            if (!var14.field_S) {
              var14.field_n = 19;
              var14.field_jb = 3 * var14.field_jb / 2;
              var14.field_N = 0;
              var14.field_X = 5;
              var14.field_B = 0;
              var14.field_r = null;
              var14.field_S = true;
              var14.field_d = var14.field_B;
              var14.field_A = 0;
              if (var14.field_X == var14.field_F &&
                var14.field_n == var14.field_H) {
                var14.field_S = false;
              }
              if (22 > var14.field_H &&
                !this.field_A.field_C[6].field_S &&
                !this.field_A.field_C[7].field_S) {
                var14.field_jb = var14.field_v;
                this.field_w = 5;
                var14.field_B = 1;
                this.field_B = this.field_l + 1;
              }
            }
          }
        }
        this.field_j = this.field_j + 1;
        if (this.field_j > 10) {
          this.field_j = 0;
        }
        var2Lifetime1 = param0;
        var3Lifetime1 = 260;
        var4 = 40;
        if (1 == this.field_p) {
          var2Lifetime1 = 640 - wh.field_e.field_r;
          var4 = 77;
        }
        if (this.field_p == 2) {
          var2Lifetime1 = -wh.field_e.field_r + 640;
          var4 = 53;
        }
        var5 = og.field_f.field_s * (og.field_f.c(this.field_b, var3Lifetime1) + 1) + 32;
        if (this.field_o != "") {
          if (this.field_a) {
            if (this.field_w == 0 &&
              this.field_z == 1 &&
              this.field_g >= var2Lifetime1 &&
              wh.field_e.field_r + var2Lifetime1 > this.field_g &&
              this.field_c >= var5 + var4 &&
              wh.field_e.field_t + var5 + var4 > this.field_c) {
              this.field_B = 1 + this.field_l;
              this.field_w = 5;
            }
          } else {
            if (0 == this.field_p &&
              this.field_w == 0 &&
              this.field_z == 1 &&
              this.field_g >= var2Lifetime1 &&
              qh.field_b.field_r + var2Lifetime1 > this.field_g &&
              this.field_c >= var4 + var5 &&
              var5 + var4 + qh.field_b.field_t > this.field_c) {
              this.field_n = true;
              return false;
            }
            if (this.field_A == null &&
              this.field_s &&
              this.field_k <= this.field_g &&
              this.field_t >= this.field_g &&
              this.field_q <= this.field_c &&
              this.field_y >= this.field_c &&
              this.field_w == 0) {
              if (1 != this.field_z) {
                return true;
              }
              this.field_w = 5;
              if (this.field_l == 4 &&
                this.field_p == 1) {
                this.field_i.field_hb = 1;
              }
              this.field_B = 1 + this.field_l;
              if (this.field_l == 2 &&
                3 == this.field_p) {
                this.field_i.field_D = 6;
              }
              if (this.field_l != 1) {
                return true;
              }
              if (this.field_p != 2) {
                return true;
              }
              this.field_i.field_hb = 4;
              return true;
            }
          }
        }
        if (this.field_w >= 0) {
          if (0 < this.field_w) {
            this.field_w = this.field_w + 15;
            if (255 < this.field_w) {
              this.field_l = this.field_B;
              this.field_w = -255;
              if (this.field_d > this.field_l) {
                this.a(87);
              } else {
                if (this.field_d < this.field_l) {
                  this.field_d = this.field_l;
                }
                this.a(false, param0 ^ 17097);
              }
            }
          } else {
            if (this.field_B != this.field_l) {
              this.field_w = 5;
            }
          }
        } else {
          this.field_w = this.field_w + 15;
          if (this.field_w > 0) {
            this.field_w = 0;
          }
        }
        if (0 == this.field_p &&
          this.field_l == 19) {
          le.field_q = null;
          this.field_A.a(this.field_A.field_G, (byte) 122);
          this.field_A.field_C[9].field_jb = this.field_A.field_C[9].field_v;
          this.field_A.field_C[10].field_jb = 2 * this.field_A.field_C[10].field_v;
          this.field_A.field_C[11].field_jb = this.field_A.field_C[11].field_v;
        }
        if (1 == this.field_p &&
          this.field_l == 11) {
          this.field_i.field_wb = null;
        }
        if (2 == this.field_p &&
          this.field_l == 6) {
          this.field_i.field_wb = null;
        }
        if (this.field_n) {
          return true;
        }
        var5 += 16;
        if (0 == this.field_p &&
          this.field_l == this.field_d &&
          0 == this.field_d) {
          return false;
        }
        if (null == this.field_A) {
          return false;
        }
        if (this.field_p == 0) {
          if (this.field_g >= 0 &&
            var3Lifetime1 + 12 >= this.field_g &&
            var4 <= this.field_c &&
            this.field_c <= var5 + var4) {
            return false;
          }
        } else {
          if (-12 - var3Lifetime1 + 640 <= this.field_g &&
            this.field_g <= 640 &&
            var4 <= this.field_c &&
            this.field_c <= var4 + var5) {
            return false;
          }
        }
        var2Lifetime2 = -aa.field_j.field_r + 534;
        if (this.field_a) {
          return true;
        }
        if (this.field_g < var2Lifetime2) {
          return true;
        }
        if (this.field_g > wh.field_e.field_r + var2Lifetime2) {
          return true;
        }
        if (this.field_c < var5 - 16) {
          return true;
        }
        stackIn_262_0 = !(this.field_c <= -16 + var5 + wh.field_e.field_t);
        return stackIn_262_0;
    }

    public static void b(byte param0) {
        if (param0 >= -16) {
          return;
        }
        field_u = null;
        field_m = null;
        field_e = null;
        field_x = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
          l.d(0, 0, l.field_k, l.field_j, 0, 192);
        } else {
          l.a();
        }
        oi.a(-22417, param2);
        if (param1 != 0) {
          ad.a(30, -91);
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = Terraphoenix.field_V;
        if (this.field_A != null &&
          !this.field_A.field_J) {
          return;
        }
        if (this.field_n) {
          return;
        }
        if (param0 != -100) {
          this.b(120);
        }
        var2 = 40;
        if (this.field_p == 1) {
          var2 = 77;
        }
        if (this.field_p == 2) {
          var2 = 53;
        }
        if (this.field_l == 0 &&
          this.field_d == 0) {
          if (this.field_w >= 0) {
            l.d(0, var2, 640, 480 - var2, 0, 255 - (128 + this.field_w) / 2);
          } else {
            l.d(0, var2, 640, 480 - var2, 0, 128);
          }
        }
        if (34 == this.field_l) {
          lg.field_c = (9 * lg.field_c + 768) / 10;
          sj.field_b = (-488 + 9 * sj.field_b) / 10;
        }
        if (this.field_l == 35 ||
          38 == this.field_l) {
          sj.field_b = (sj.field_b * 9 - 496) / 10;
          lg.field_c = (lg.field_c * 9 + 896) / 10;
        }
        if (this.field_o != "") {
          var4 = 260;
          if (!this.field_a &&
            this.field_s) {
            var6 = 6250335 + this.field_j * 1052688;
            og.field_f.c(this.field_f, (this.field_k + this.field_t) / 2, -1 + this.field_q - 3, 0, -1);
            og.field_f.c(this.field_f, (this.field_k + this.field_t) / 2, 1 + (this.field_q - 3), 0, -1);
            og.field_f.c(this.field_f, -1 + (this.field_k + this.field_t) / 2, this.field_q - 3, 0, -1);
            og.field_f.c(this.field_f, 1 + (this.field_k + this.field_t) / 2, -3 + this.field_q, 0, -1);
            og.field_f.c(this.field_f, (this.field_k + this.field_t) / 2, -3 + this.field_q, var6, -1);
            l.e(-this.field_j + this.field_k, this.field_q - this.field_j, 1 + this.field_t + (-this.field_k + this.field_j * 2), 2 * this.field_j + 1 - this.field_q + this.field_y, var6);
            l.e(this.field_k + 1 - this.field_j, -this.field_j + 1 + this.field_q, 2 * this.field_j - this.field_k + this.field_t - 1, -1 + this.field_y - (this.field_q - this.field_j * 2), 0);
            l.e(this.field_k - 1 - this.field_j, -this.field_j - 1 + this.field_q, 3 + (-this.field_k + (this.field_t + this.field_j * 2)), 2 * this.field_j + (3 + (-this.field_q + this.field_y)), 0);
          }
          var3 = og.field_f.field_s * (og.field_f.c(this.field_b, var4) + 1) + 32;
          if (0 != this.field_p) {
            l.d(643 - (var4 + 12), var2 + 3, 6 + var4, var3 - 6, 0, 192);
          } else {
            l.d(3, var2 + 3, 6 + var4, var3 - 6, 0, 192);
          }
          if (this.field_p == 0) {
            jl.a(jc.field_G, var3, var2, 12 + var4, (byte) -121, 0);
          } else {
            jl.a(jc.field_G, var3, var2, 12 + var4, (byte) -127, -var4 + 640 - 12);
          }
          if (this.field_p == 0) {
            og.field_f.b(this.field_o, 32, var2 + 16, 16777215, -1);
          } else {
            og.field_f.b(this.field_o, 32 + (-var4 + 640), var2 + 16, 16777215, -1);
          }
          if (this.field_p == 0) {
            ji.a(6, og.field_f.field_s, 16777215, og.field_f.field_s + (var2 + 32), this.field_b, (byte) 90, var4);
          } else {
            ji.a(-6 + (-var4 + 640), og.field_f.field_s, 16777215, og.field_f.field_s + (var2 + 33), this.field_b, (byte) 98, 637);
          }
          var6Lifetime1 = this.field_l;
          if (var6Lifetime1 > 9) {
            var6Lifetime1 -= 3;
          }
          var7 = this.field_d;
          if (this.field_p == 0) {
            if (0 < this.field_w) {
              l.d(3, var2 + 3, 6 + var4, -6 + var3, 0, this.field_w);
            }
            if (this.field_w < 0) {
              l.d(3, 3 + var2, 12 + (var4 - 6), var3 - 6, 16711680, -this.field_w);
            }
          } else {
            if (this.field_w > 0) {
              l.d(640 + (-var4 - 12) + 3, var2 + 3, 12 + (-6 + var4), var3 - 6, 0, this.field_w);
            }
            if (this.field_w < 0) {
              l.d(-var4 + 640 - 9, var2 + 3, var4 + 6, var3 - 6, 16711680, -this.field_w);
            }
          }
          var5 = 0;
          if (var7 > 9) {
            var7 -= 3;
          }
          if (0 < this.field_p) {
            var5 = 640 - wh.field_e.field_r;
          }
          if (this.field_a) {
            aa.field_j.b(var5, var3 + var2);
            if (this.field_g >= var5 &&
              this.field_g < wh.field_e.field_r + var5 &&
              var3 + var2 <= this.field_c &&
              this.field_c < wh.field_e.field_t + (var3 + var2)) {
              l.d(var5, var3 + var2, wh.field_e.field_r, wh.field_e.field_t, 16777215, 128);
            }
            if (this.field_s) {
              var8 = 6250335 + 1052688 * this.field_j;
              l.e(this.field_k, this.field_q, 1 + (this.field_t - this.field_k), 1 - this.field_q + this.field_y, var8);
              l.e(this.field_k + 1, 1 + this.field_q, -this.field_k + this.field_t - 1, this.field_y - this.field_q - 1, 0);
              l.e(this.field_k - 1, this.field_q - 1, 3 + (-this.field_k + this.field_t), this.field_y + (-this.field_q + 3), 0);
            }
          } else {
            if (this.field_p == 0) {
              qh.field_b.b(var5, var2 + var3);
              if (var5 <= this.field_g &&
                qh.field_b.field_r + var5 > this.field_g &&
                var3 + var2 <= this.field_c &&
                qh.field_b.field_t + var3 + var2 > this.field_c) {
                l.d(var5, var3 + var2, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
              }
            }
          }
        }
        return;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Terraphoenix.field_V;
        var2 = 0;
        var3 = kf.field_f;
        if (param1 >= ~var3) {
          if (var3 < 105) {
            var2 = (-40960 + 16384 * var3) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(8192 * var3 * var3 / 3300) + 8192;
            }
          }
        } else {
          var2 = var3 * var3 * 8192 / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (1 == param0) {
          var5 = 1;
        }
        if (param0 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 6) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 == 7 ||
          param0 == 8) {
          var4 = -1;
          var5 = -1;
        }
        if (11 == param0) {
          var4 = -1;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var5 = 1;
          var4 = 1;
        }
        ld.field_a = jb.a(var5 * var2, var2 * var4, 0);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        r var4;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0) {
          this.b(117);
        }
        if (this.field_l == this.field_d &&
          9 == this.field_l) {
          var2 = 134;
          var3 = 664;
          sj.field_b = (var2 + sj.field_b * 9) / 10;
          lg.field_c = (var3 + lg.field_c * 9) / 10;
          if (Math.abs(-var2 + sj.field_b) + Math.abs(lg.field_c - var3) < 32) {
            this.field_B = 1 + this.field_l;
            this.field_l = this.field_B;
            this.field_d = this.field_l;
            this.a(false, 17097);
          }
        }
        if (this.field_l == this.field_d &&
          this.field_l == 11) {
          var4 = this.field_A.field_C[1];
          var2Lifetime1 = 32 * (-var4.field_H + var4.field_F);
          var4.field_jb = var4.field_v;
          var3Lifetime1 = (var4.field_H + var4.field_F) * 16 - 48 * var4.field_E;
          lg.field_c = (var3Lifetime1 + lg.field_c * 9) / 10;
          sj.field_b = (var2Lifetime1 + 9 * sj.field_b) / 10;
        }
    }

    final void c(byte param0) {
        dl var5 = null;
        r dupTemp$0 = null;
        dl var4 = null;
        dl var6 = null;
        dl var7 = null;
        int var3 = 0;
        dl var8 = null;
        r dupTemp$1 = null;
        dl var9 = null;
        r dupTemp$2 = null;
        dl var10 = null;
        r dupTemp$3 = null;
        dl var2 = null;
        dl var2Lifetime1;
        dl var2Lifetime1Lifetime1;
        dl var2Lifetime1Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        if (this.field_p == 0) {
          this.field_A.a(29518, -1);
          this.field_A.a(29518, -2);
          if (this.field_l == 0) {
            this.field_A.field_C[0].field_c = null;
            this.field_A.field_C[0].field_H = 18;
            this.field_A.field_C[0].field_F = 3;
            var5 = this.field_A.field_h.a(-66, this.field_A.field_C[0].field_H, this.field_A.field_C[0].field_E, this.field_A.field_C[0].field_F);
            var2 = var5;
            if (var5.field_h != null) {
              dupTemp$0 = this.field_A.field_C[0];
              dupTemp$0.field_F = dupTemp$0.field_F + 1;
              var2 = this.field_A.field_h.a(-104, this.field_A.field_C[0].field_H, this.field_A.field_C[0].field_E, this.field_A.field_C[0].field_F);
            }
            this.field_A.field_C[0].field_c = var2;
            var2.field_h = this.field_A.field_C[0];
          }
          if (9 > this.field_l) {
            this.field_A.field_C[4].field_t = 7;
            var4 = this.field_A.field_C[4].field_c;
            var6 = var4;
            this.field_A.field_C[4].field_C = 0;
            this.field_A.field_C[4].field_P = 0;
            var6.field_m = 7;
            if (7 == var6.field_m) {
              var6.field_m = 7;
            }
            var6.field_t = 16777088;
            var4.field_h = null;
            var7 = this.field_A.field_C[5].field_c;
            this.field_A.field_C[5].field_C = 0;
            this.field_A.field_C[5].field_P = 0;
            this.field_A.field_C[5].field_t = 7;
            var7.field_m = 7;
            if (7 == var7.field_m) {
              var7.field_m = 7;
            }
            var7.field_t = 10460976;
            var7.field_h = null;
          }
          if (this.field_l < 11) {
            var3 = 1;
            this.field_A.field_C[var3] = new r(this.field_A.field_G.field_nb[var3]);
            this.field_A.field_C[var3].field_F = 7;
            this.field_A.field_C[var3].field_H = 24;
            this.field_A.field_C[var3].field_E = 0;
            this.field_A.field_C[var3].field_U = 4;
            var8 = this.field_A.field_h.a(88, this.field_A.field_C[var3].field_H, this.field_A.field_C[var3].field_E, this.field_A.field_C[var3].field_F);
            var2Lifetime1 = var8;
            if (null != var8.field_h) {
              dupTemp$1 = this.field_A.field_C[var3];
              dupTemp$1.field_F = dupTemp$1.field_F + 1;
              var2Lifetime1 = this.field_A.field_h.a(-26, this.field_A.field_C[var3].field_H, this.field_A.field_C[var3].field_E, this.field_A.field_C[var3].field_F);
            }
            var2Lifetime1.field_h = this.field_A.field_C[var3];
            this.field_A.field_C[var3].field_c = var2Lifetime1;
            var3Lifetime1 = 2;
            this.field_A.field_C[var3Lifetime1] = new r(this.field_A.field_G.field_nb[var3Lifetime1]);
            this.field_A.field_C[var3Lifetime1].field_F = 5;
            this.field_A.field_C[var3Lifetime1].field_H = 16;
            this.field_A.field_C[var3Lifetime1].field_E = 0;
            this.field_A.field_C[var3Lifetime1].field_U = 1;
            var9 = this.field_A.field_h.a(-48, this.field_A.field_C[var3Lifetime1].field_H, this.field_A.field_C[var3Lifetime1].field_E, this.field_A.field_C[var3Lifetime1].field_F);
            var2Lifetime1Lifetime1 = var9;
            if (var9.field_h != null) {
              dupTemp$2 = this.field_A.field_C[var3Lifetime1];
              dupTemp$2.field_F = dupTemp$2.field_F + 1;
              var2Lifetime1Lifetime1 = this.field_A.field_h.a(112, this.field_A.field_C[var3Lifetime1].field_H, this.field_A.field_C[var3Lifetime1].field_E, this.field_A.field_C[var3Lifetime1].field_F);
            }
            var2Lifetime1Lifetime1.field_h = this.field_A.field_C[var3Lifetime1];
            this.field_A.field_C[var3Lifetime1].field_c = var2Lifetime1Lifetime1;
            var3Lifetime2 = 3;
            this.field_A.field_C[var3Lifetime2] = new r(this.field_A.field_G.field_nb[var3Lifetime2]);
            this.field_A.field_C[var3Lifetime2].field_F = 6;
            this.field_A.field_C[var3Lifetime2].field_H = 17;
            this.field_A.field_C[var3Lifetime2].field_E = 0;
            this.field_A.field_C[var3Lifetime2].field_U = 2;
            var10 = this.field_A.field_h.a(102, this.field_A.field_C[var3Lifetime2].field_H, this.field_A.field_C[var3Lifetime2].field_E, this.field_A.field_C[var3Lifetime2].field_F);
            var2Lifetime1Lifetime2 = var10;
            if (var10.field_h != null) {
              dupTemp$3 = this.field_A.field_C[var3Lifetime2];
              dupTemp$3.field_F = dupTemp$3.field_F + 1;
              var2Lifetime1Lifetime2 = this.field_A.field_h.a(-30, this.field_A.field_C[var3Lifetime2].field_H, this.field_A.field_C[var3Lifetime2].field_E, this.field_A.field_C[var3Lifetime2].field_F);
            }
            var2Lifetime1Lifetime2.field_h = this.field_A.field_C[var3Lifetime2];
            this.field_A.field_C[var3Lifetime2].field_c = var2Lifetime1Lifetime2;
          }
        }
        if (param0 < 28) {
          ad.a(false, 108, true);
        }
    }

    private final void a(int param0) {
        this.a(true, 17097);
        int var2 = 19 % ((param0 + 8) / 48);
        this.field_a = true;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (this.field_A != null &&
          !this.field_A.field_J) {
          return;
        }
        if (this.field_n) {
          return;
        }
        if (!this.field_s &&
          this.field_v == -1) {
          var2 = 320 - sj.field_b + (this.field_r * 32 - this.field_C * 32);
          var3 = -lg.field_c + 16 * this.field_C + this.field_r * 16 + 240;
          var4 = 1052688 * this.field_j + 11513775;
          if (-1 != this.field_r) {
            l.c(var2 - 32, var3, var2, -16 + var3, var4);
            l.c(var2 - 32, var3, var2, var3 + 16, var4);
            l.c(32 + var2, var3, var2, var3 - 16, var4);
            l.c(var2 + 32, var3, var2, 16 + var3, var4);
          }
        }
        if (param0 <= 116) {
          this.field_v = 90;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final void a(boolean param0, int param1) {
        r dupTemp$0 = null;
        r dupTemp$1 = null;
        r dupTemp$2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        boolean stackIn_60_1 = false;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        boolean stackIn_98_1 = false;
        boolean stackIn_102_1 = false;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        int var3_int;
        dl var3;
        int var4;
        int var5;
        dl var6;
        dl var7;
        dl var8;
        int var4Lifetime1;
        int var4Lifetime2;
        dl var3Lifetime1;
        dl var3Lifetime2;
        var5 = Terraphoenix.field_V;
        this.field_a = true;
        this.field_n = false;
        this.field_o = this.field_l + " my title";
        this.field_s = false;
        this.field_b = "This is some tutorial text that will never appear in the new game :P.  But anyway, press the next button to continue";
        this.field_r = -1;
        this.field_v = -1;
        var3_int = this.field_p;
        if (var3_int != 2) {
          if (1 == var3_int) {
            var3_int = this.field_l;
            if (var3_int != 0) {
              if (var3_int != 1) {
                if (var3_int == 2) {
                  this.field_o = kl.field_d[23];
                  stackIn_70_1 = new StringBuilder().append(kl.field_d[24]);
                  if (!param0) {
                    stackIn_71_2 = kl.field_d[2];
                  } else {
                    stackIn_71_2 = "";
                  }
                  this.field_b = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).toString();
                } else {
                  if (3 == var3_int) {
                    this.field_k = 93;
                    this.field_q = 413;
                    this.field_t = 475;
                    stackIn_74_1 = new StringBuilder().append(kl.field_d[26]);
                    if (param0) {
                      stackIn_75_2 = "";
                    } else {
                      stackIn_75_2 = kl.field_d[2];
                    }
                    this.field_b = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).toString();
                    this.field_s = true;
                    this.field_o = kl.field_d[25];
                    this.field_y = 477;
                  } else {
                    if (var3_int == 4) {
                      this.field_k = 5;
                      stackIn_78_1 = new StringBuilder().append(kl.field_d[28]);
                      if (param0) {
                        stackIn_79_2 = "";
                      } else {
                        stackIn_79_2 = kl.field_d[29];
                      }
                      this.field_b = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).toString();
                      this.field_s = true;
                      this.field_q = 111;
                      this.field_a = false;
                      this.field_t = 47;
                      this.field_o = kl.field_d[27];
                      this.field_y = 153;
                    } else {
                      if (var3_int != 5) {
                        if (var3_int == 6) {
                          this.field_a = false;
                          stackIn_86_1 = new StringBuilder().append(kl.field_d[34]);
                          if (param0) {
                            stackIn_87_2 = "";
                          } else {
                            stackIn_87_2 = kl.field_d[35];
                          }
                          this.field_b = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).toString();
                          this.field_q = 90;
                          this.field_s = true;
                          this.field_y = 170;
                          this.field_o = kl.field_d[33];
                          this.field_t = 317;
                          this.field_k = 63;
                        } else {
                          if (7 == var3_int) {
                            this.field_o = kl.field_d[36];
                            stackIn_90_1 = new StringBuilder().append(kl.field_d[37]);
                            if (!param0) {
                              stackIn_91_2 = kl.field_d[2];
                            } else {
                              stackIn_91_2 = "";
                            }
                            this.field_b = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).toString();
                            this.field_i.field_I.field_a[18] = this.field_i.field_I.field_a[18] - 1;
                            this.field_i.field_nb[2].field_b = new oh(18);
                            this.field_i.field_nb[2].d((byte) -113);
                          } else {
                            if (var3_int != 8) {
                              if (var3_int != 9) {
                                if (var3_int != 10) {
                                  this.field_y = 480;
                                  this.field_s = true;
                                  this.field_t = 640;
                                  this.field_k = 0;
                                  this.field_q = 0;
                                } else {
                                  this.field_b = kl.field_d[45] + kl.field_d[46];
                                  this.field_o = kl.field_d[44];
                                }
                              } else {
                                this.field_q = 373;
                                this.field_y = 387;
                                this.field_o = kl.field_d[41];
                                this.field_k = 330;
                                this.field_t = 624;
                                stackIn_102_1 = !(param0);
                                this.field_s = stackIn_102_1;
                                this.field_a = false;
                                stackIn_104_1 = new StringBuilder().append(kl.field_d[42]);
                                if (param0) {
                                  stackIn_105_2 = "";
                                } else {
                                  stackIn_105_2 = kl.field_d[43];
                                }
                                this.field_b = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).toString();
                                this.field_i.field_I.field_a[18] = this.field_i.field_I.field_a[18] + 1;
                                this.field_i.field_nb[2].field_b = null;
                                this.field_i.field_nb[2].d((byte) -100);
                              }
                            } else {
                              this.field_o = kl.field_d[38];
                              stackIn_94_1 = new StringBuilder().append(kl.field_d[39]);
                              if (!param0) {
                                stackIn_95_2 = kl.field_d[40];
                              } else {
                                stackIn_95_2 = "";
                              }
                              this.field_b = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).toString();
                              this.field_a = false;
                              this.field_k = 364;
                              this.field_y = 280;
                              this.field_t = 430;
                              this.field_q = 143;
                              stackIn_98_1 = !(param0);
                              this.field_s = stackIn_98_1;
                            }
                          }
                        }
                      } else {
                        this.field_t = 234;
                        this.field_a = false;
                        this.field_q = 372;
                        this.field_y = 387;
                        this.field_k = 172;
                        this.field_s = true;
                        stackIn_82_1 = new StringBuilder().append(kl.field_d[31]);
                        if (param0) {
                          stackIn_83_2 = "";
                        } else {
                          stackIn_83_2 = kl.field_d[32];
                        }
                        this.field_b = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).toString();
                        this.field_o = kl.field_d[30];
                      }
                    }
                  }
                }
              } else {
                stackIn_66_1 = new StringBuilder().append(kl.field_d[21]);
                if (param0) {
                  stackIn_67_2 = "";
                } else {
                  stackIn_67_2 = kl.field_d[22];
                }
                this.field_b = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).toString();
                this.field_o = kl.field_d[20];
                this.field_a = false;
                this.field_t = 419;
                this.field_s = true;
                this.field_k = 220;
                this.field_q = 440;
                this.field_y = 467;
              }
            } else {
              this.field_q = 153;
              this.field_t = 639;
              this.field_y = 180;
              this.field_o = kl.field_d[18];
              stackIn_60_1 = !(param0);
              this.field_s = stackIn_60_1;
              this.field_k = 540;
              stackIn_62_1 = new StringBuilder().append(kl.field_d[19]);
              if (param0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = kl.field_d[2];
              }
              this.field_b = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).toString();
            }
          } else {
            if (var3_int == 0) {
              var3_int = this.field_l;
              if (0 == var3_int) {
                this.field_b = kl.field_d[48];
                this.field_a = true;
                this.field_o = kl.field_d[47];
              } else {
                if (var3_int != 1) {
                  if (2 != var3_int) {
                    if (var3_int != 3) {
                      if (var3_int != 4) {
                        if (5 != var3_int) {
                          if (var3_int != 6) {
                            if (var3_int == 7) {
                              this.field_r = 9;
                              this.field_C = 5;
                              this.field_b = kl.field_d[66];
                              this.field_o = kl.field_d[65];
                              if (!param0) {
                                this.field_A.a(29518, -2);
                              }
                              if (!param0) {
                                this.field_A.a(param1 ^ 12679, -1);
                              }
                              if (!param0) {
                                this.field_A.a(-2, kl.field_d[67], -18);
                              }
                              this.field_a = false;
                            } else {
                              if (8 != var3_int) {
                                if (var3_int != 9) {
                                  if (var3_int != 10) {
                                    if (var3_int != 11) {
                                      if (var3_int == 12) {
                                        this.field_o = kl.field_d[71];
                                        this.field_b = kl.field_d[72];
                                        if (!param0) {
                                          this.field_A.a(29518, -2);
                                        }
                                        if (!param0) {
                                          this.field_A.a(29518, -1);
                                        }
                                        if (!param0) {
                                          this.field_A.a(-1, kl.field_d[73], -118);
                                        }
                                        this.field_a = false;
                                      } else {
                                        if (var3_int == 13) {
                                          this.field_o = kl.field_d[74];
                                          this.field_b = kl.field_d[75];
                                          if (!param0) {
                                            this.field_A.a(29518, -1);
                                          }
                                          if (!param0) {
                                            this.field_A.a(29518, -2);
                                          }
                                          if (!param0) {
                                            this.field_A.a(1, kl.field_d[76], param1 ^ -17124);
                                          }
                                        } else {
                                          if (var3_int != 14) {
                                            if (var3_int == 15) {
                                              this.field_o = kl.field_d[79];
                                              this.field_b = kl.field_d[80];
                                              this.field_t = 153;
                                              this.field_k = 98;
                                              this.field_q = 450;
                                              this.field_y = 477;
                                              this.field_s = true;
                                            } else {
                                              if (var3_int == 16) {
                                                this.field_b = kl.field_d[82];
                                                this.field_o = kl.field_d[81];
                                              } else {
                                                if (var3_int == 17) {
                                                  this.field_b = kl.field_d[84];
                                                  this.field_o = kl.field_d[83];
                                                  this.field_k = 306;
                                                  this.field_t = 542;
                                                  this.field_s = true;
                                                  this.field_y = 469;
                                                  this.field_q = 391;
                                                } else {
                                                  if (var3_int != 18) {
                                                    this.field_t = 640;
                                                    this.field_s = true;
                                                    this.field_q = 0;
                                                    this.field_y = 480;
                                                    this.field_k = 0;
                                                  } else {
                                                    this.field_o = kl.field_d[85];
                                                    this.field_b = kl.field_d[86];
                                                    this.field_a = false;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            this.field_o = kl.field_d[77];
                                            this.field_b = kl.field_d[78];
                                          }
                                        }
                                      }
                                    } else {
                                      this.field_o = "";
                                      if (!param0) {
                                        this.field_A.field_C[0].field_jb = this.field_A.field_C[0].field_v;
                                        var4 = 1;
                                        this.field_A.field_C[var4] = new r(this.field_A.field_G.field_nb[var4]);
                                        this.field_A.field_C[var4].field_F = 7;
                                        this.field_A.field_C[var4].field_H = 24;
                                        this.field_A.field_C[var4].field_E = 0;
                                        this.field_A.field_C[var4].field_U = 4;
                                        var6 = this.field_A.field_h.a(-41, this.field_A.field_C[var4].field_H, this.field_A.field_C[var4].field_E, this.field_A.field_C[var4].field_F);
                                        var3 = var6;
                                        if (null != var6.field_h) {
                                          dupTemp$0 = this.field_A.field_C[var4];
                                          dupTemp$0.field_F = dupTemp$0.field_F + 1;
                                          var3 = this.field_A.field_h.a(param1 - 17164, this.field_A.field_C[var4].field_H, this.field_A.field_C[var4].field_E, this.field_A.field_C[var4].field_F);
                                        }
                                        var3.field_h = this.field_A.field_C[var4];
                                        this.field_A.field_C[var4].field_c = var3;
                                        var4Lifetime1 = 2;
                                        this.field_A.field_C[var4Lifetime1] = new r(this.field_A.field_G.field_nb[var4Lifetime1]);
                                        this.field_A.field_C[var4Lifetime1].field_F = 5;
                                        this.field_A.field_C[var4Lifetime1].field_H = 16;
                                        this.field_A.field_C[var4Lifetime1].field_E = 0;
                                        this.field_A.field_C[var4Lifetime1].field_U = 1;
                                        var7 = this.field_A.field_h.a(123, this.field_A.field_C[var4Lifetime1].field_H, this.field_A.field_C[var4Lifetime1].field_E, this.field_A.field_C[var4Lifetime1].field_F);
                                        var3Lifetime1 = var7;
                                        if (null != var7.field_h) {
                                          dupTemp$1 = this.field_A.field_C[var4Lifetime1];
                                          dupTemp$1.field_F = dupTemp$1.field_F + 1;
                                          var3Lifetime1 = this.field_A.field_h.a(param1 ^ -17130, this.field_A.field_C[var4Lifetime1].field_H, this.field_A.field_C[var4Lifetime1].field_E, this.field_A.field_C[var4Lifetime1].field_F);
                                        }
                                        var3Lifetime1.field_h = this.field_A.field_C[var4Lifetime1];
                                        this.field_A.field_C[var4Lifetime1].field_c = var3Lifetime1;
                                        var4Lifetime2 = 3;
                                        this.field_A.field_C[var4Lifetime2] = new r(this.field_A.field_G.field_nb[var4Lifetime2]);
                                        this.field_A.field_C[var4Lifetime2].field_F = 6;
                                        this.field_A.field_C[var4Lifetime2].field_H = 17;
                                        this.field_A.field_C[var4Lifetime2].field_E = 0;
                                        this.field_A.field_C[var4Lifetime2].field_U = 2;
                                        var8 = this.field_A.field_h.a(90, this.field_A.field_C[var4Lifetime2].field_H, this.field_A.field_C[var4Lifetime2].field_E, this.field_A.field_C[var4Lifetime2].field_F);
                                        var3Lifetime2 = var8;
                                        if (null != var8.field_h) {
                                          dupTemp$2 = this.field_A.field_C[var4Lifetime2];
                                          dupTemp$2.field_F = dupTemp$2.field_F + 1;
                                          var3Lifetime2 = this.field_A.field_h.a(84, this.field_A.field_C[var4Lifetime2].field_H, this.field_A.field_C[var4Lifetime2].field_E, this.field_A.field_C[var4Lifetime2].field_F);
                                        }
                                        var3Lifetime2.field_h = this.field_A.field_C[var4Lifetime2];
                                        this.field_A.field_C[var4Lifetime2].field_c = var3Lifetime2;
                                      }
                                    }
                                  } else {
                                    this.field_o = "";
                                  }
                                } else {
                                  this.field_o = "";
                                  if (!param0) {
                                    this.field_A.a(29518, -1);
                                  }
                                  if (!param0) {
                                    this.field_A.field_C[4].field_C = 0;
                                    this.field_A.field_C[4].field_t = 7;
                                    this.field_A.field_C[4].field_x = 16777088;
                                    this.field_A.field_C[5].field_C = 0;
                                    this.field_A.field_C[5].field_x = 10460976;
                                    this.field_A.field_C[5].field_t = 7;
                                  }
                                }
                              } else {
                                this.field_q = 452;
                                this.field_t = 234;
                                this.field_k = 184;
                                this.field_y = 474;
                                this.field_s = true;
                                this.field_o = kl.field_d[68];
                                this.field_b = kl.field_d[69];
                                if (!param0) {
                                  this.field_A.a(29518, -2);
                                }
                                if (!param0) {
                                  this.field_A.a(param1 + 12421, -1);
                                }
                                if (!param0) {
                                  this.field_A.a(-1, kl.field_d[70], -87);
                                }
                                this.field_a = false;
                              }
                            }
                          } else {
                            this.field_b = kl.field_d[63];
                            this.field_o = kl.field_d[62];
                            if (!param0) {
                              this.field_A.a(param1 ^ 12679, -2);
                            }
                            if (!param0) {
                              this.field_A.a(29518, -1);
                            }
                            if (!param0) {
                              this.field_A.a(-1, kl.field_d[64], -110);
                            }
                            this.field_y = 474;
                            this.field_q = 394;
                            this.field_s = true;
                            this.field_a = false;
                            this.field_t = 632;
                            this.field_k = 612;
                          }
                        } else {
                          this.field_o = "";
                          if (!param0) {
                            this.field_A.a(29518, -2);
                          }
                          if (!param0) {
                            this.field_A.a(29518, -1);
                          }
                          if (!param0) {
                            this.field_A.a(-2, kl.field_d[61], -98);
                          }
                          this.field_a = false;
                        }
                      } else {
                        this.field_b = kl.field_d[59];
                        this.field_o = kl.field_d[58];
                        this.field_C = 3;
                        this.field_r = 4;
                        if (og.field_d > 0) {
                          this.field_r = ql.field_i;
                          this.field_C = ld.field_e;
                        }
                        if (!param0) {
                          this.field_A.a(29518, -2);
                        }
                        if (!param0) {
                          this.field_A.a(29518, -1);
                        }
                        if (!param0) {
                          this.field_A.a(-1, kl.field_d[60], param1 ^ -17095);
                        }
                        this.field_a = false;
                      }
                    } else {
                      this.field_b = kl.field_d[56];
                      this.field_o = kl.field_d[55];
                      this.field_r = 4;
                      this.field_C = 3;
                      if (!param0) {
                        this.field_A.a(29518, -2);
                      }
                      if (!param0) {
                        this.field_A.a(param1 + 12421, -1);
                      }
                      if (!param0) {
                        this.field_A.a(-2, kl.field_d[57], -79);
                      }
                      this.field_a = false;
                    }
                  } else {
                    this.field_k = 268;
                    this.field_y = 474;
                    this.field_s = true;
                    this.field_t = 290;
                    this.field_b = kl.field_d[53];
                    this.field_q = 452;
                    this.field_o = kl.field_d[52];
                    if (!param0) {
                      this.field_A.a(29518, -2);
                    }
                    if (!param0) {
                      this.field_A.a(param1 + 12421, -1);
                    }
                    if (!param0) {
                      this.field_A.a(-1, kl.field_d[54], -108);
                    }
                    this.field_a = false;
                  }
                } else {
                  this.field_b = kl.field_d[50];
                  this.field_o = kl.field_d[49];
                  if (!param0) {
                    this.field_A.a(param1 + 12421, -2);
                  }
                  if (!param0) {
                    this.field_A.a(29518, -1);
                  }
                  if (!param0) {
                    this.field_A.a(-2, kl.field_d[51], -47);
                  }
                  this.field_a = false;
                }
              }
            }
          }
        } else {
          var3_int = this.field_l;
          if (var3_int != 0) {
            if (var3_int == 1) {
              this.field_a = false;
              this.field_s = true;
              this.field_o = kl.field_d[3];
              this.field_q = 266;
              this.field_k = 5;
              this.field_t = 47;
              this.field_y = 308;
              stackIn_21_1 = new StringBuilder().append(kl.field_d[4]);
              if (!param0) {
                stackIn_22_2 = kl.field_d[5];
              } else {
                stackIn_22_2 = "";
              }
              this.field_b = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).toString();
            } else {
              if (var3_int != 2) {
                if (var3_int == 3) {
                  this.field_y = 416;
                  this.field_s = true;
                  this.field_t = 628;
                  stackIn_29_1 = new StringBuilder().append(kl.field_d[10]);
                  if (!param0) {
                    stackIn_30_2 = kl.field_d[11];
                  } else {
                    stackIn_30_2 = "";
                  }
                  this.field_b = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).toString();
                  this.field_k = 357;
                  this.field_a = false;
                  this.field_q = 387;
                  this.field_o = kl.field_d[9];
                } else {
                  if (var3_int != 4) {
                    if (var3_int == 5) {
                      this.field_o = kl.field_d[15];
                      stackIn_37_1 = new StringBuilder().append(kl.field_d[16]);
                      if (!param0) {
                        stackIn_38_2 = kl.field_d[17];
                      } else {
                        stackIn_38_2 = "";
                      }
                      this.field_b = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).toString();
                    } else {
                      this.field_y = 480;
                      this.field_t = 640;
                      this.field_q = 0;
                      this.field_s = true;
                      this.field_k = 0;
                    }
                  } else {
                    this.field_a = false;
                    this.field_k = 525;
                    this.field_q = 437;
                    this.field_t = 623;
                    this.field_y = 462;
                    this.field_o = kl.field_d[12];
                    stackIn_33_1 = new StringBuilder().append(kl.field_d[13]);
                    if (!param0) {
                      stackIn_34_2 = kl.field_d[14];
                    } else {
                      stackIn_34_2 = "";
                    }
                    this.field_b = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).toString();
                    this.field_s = true;
                  }
                }
              } else {
                stackIn_25_1 = new StringBuilder().append(kl.field_d[7]);
                if (!param0) {
                  stackIn_26_2 = kl.field_d[8];
                } else {
                  stackIn_26_2 = "";
                }
                this.field_b = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).toString();
                this.field_y = 152;
                this.field_t = 320;
                this.field_q = 69;
                this.field_a = false;
                this.field_o = kl.field_d[6];
                this.field_k = 59;
                this.field_s = true;
              }
            }
          } else {
            stackIn_17_1 = new StringBuilder().append(kl.field_d[1]);
            if (!param0) {
              stackIn_18_2 = kl.field_d[2];
            } else {
              stackIn_18_2 = "";
            }
            this.field_b = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).toString();
            this.field_o = kl.field_d[0];
          }
        }
        if (param1 != 17097) {
          this.a(124);
        }
        if (param0) {
          this.field_v = -1;
          this.field_a = true;
        }
    }

    ad(int param0) {
        this.field_w = -255;
        this.field_d = 0;
        this.field_B = 0;
        this.field_l = 0;
        this.field_j = 0;
        this.field_p = param0;
        this.a(false, 17097);
    }

    static {
        field_u = new int[8192];
        field_m = new byte[520];
    }
}
