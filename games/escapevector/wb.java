/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends wg {
    private float field_q;
    private float field_k;
    private lc[] field_v;
    private float field_n;
    private lc[] field_l;
    private float field_m;
    private float field_w;
    private nc[] field_y;
    private int[] field_t;
    private wg field_r;
    private float field_o;
    private float field_u;
    private float field_x;
    private nc[] field_s;
    private float field_p;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        this.e();
        param2 = param2 + param1;
        while (param1 < param2) {
          int var4 = param2 - param1;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.field_r != null) {
            this.field_r.b(this.field_t, 0, var4);
          }
          int var5 = 0;
          for (int var6 = 0; var6 < 8; var6++) {
            var5 = wb.a(var5, this.field_s[var6].field_a, this.field_s[var6].field_b, var4);
          }
          for (int var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = wb.a(var5, this.field_l[var6Lifetime1].field_b, this.field_l[var6Lifetime1].field_a, var4);
          }
          if (ie.field_o) {
            for (int var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = wb.a(var5, this.field_y[var6Lifetime2].field_a, this.field_y[var6Lifetime2].field_b, var4);
            }
            for (int var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = wb.a(var5, this.field_v[var6Lifetime2Lifetime1].field_b, this.field_v[var6Lifetime2Lifetime1].field_a, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (int var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            int var7 = this.field_t[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          int var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          int var7Lifetime1 = (int)(this.field_k * 4096.0f);
          int var8 = (int)(this.field_p * 4096.0f);
          int var9 = (int)(this.field_o * 4096.0f);
          int var10 = (int)(this.field_x * 65536.0f);
          if (!ie.field_o) {
            var11 = (int)(this.field_n * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_t[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                nc var27 = this.field_s[var16];
                var18 = var27.field_a[var27.field_b] >> var6Lifetime4;
                var19 = var27.field_c >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.field_c = var19 << var6Lifetime4;
                var27.field_a[var27.field_b] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$3 = var27.field_b + 1;
                var27.field_b = var27.field_b + 1;
                if (fieldTemp$3 >= var27.field_a.length) {
                  var27.field_b = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                lc var28 = this.field_l[var16];
                var18 = var28.field_b[var28.field_a] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.field_b[var28.field_a] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$2 = var28.field_a + 1;
                var28.field_a = var28.field_a + 1;
                if (fieldTemp$2 >= var28.field_b.length) {
                  var28.field_a = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                int incrementValue$0 = param1;
                param1++;
                param0[incrementValue$0] = param0[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                int incrementValue$1 = param1;
                param1++;
                param0[incrementValue$1] = param0[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.field_w * 4096.0f);
            var12 = (int)(this.field_q * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                int incrementValue$4 = var13;
                var13++;
                var14 = this.field_t[incrementValue$4] >> var6Lifetime4;
                int incrementValue$5 = var13;
                var13++;
                var15 = this.field_t[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                int var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  nc var23 = this.field_s[var18];
                  int var20 = var23.field_a[var23.field_b] >> var6Lifetime4;
                  int var21 = var23.field_c >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.field_c = var21 << var6Lifetime4;
                  var23.field_a[var23.field_b] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$13 = var23.field_b + 1;
                  var23.field_b = var23.field_b + 1;
                  if (fieldTemp$13 >= var23.field_a.length) {
                    var23.field_b = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  lc var24 = this.field_l[var18];
                  int var20Lifetime1 = var24.field_b[var24.field_a] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.field_b[var24.field_a] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$12 = var24.field_a + 1;
                  var24.field_a = var24.field_a + 1;
                  if (fieldTemp$12 >= var24.field_b.length) {
                    var24.field_a = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  nc var25 = this.field_y[var19];
                  int var21Lifetime1 = var25.field_a[var25.field_b] >> var6Lifetime4;
                  int var22 = var25.field_c >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.field_c = var22 << var6Lifetime4;
                  var25.field_a[var25.field_b] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$11 = var25.field_b + 1;
                  var25.field_b = var25.field_b + 1;
                  if (fieldTemp$11 >= var25.field_a.length) {
                    var25.field_b = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  lc var26 = this.field_v[var19];
                  int var21Lifetime2 = var26.field_b[var26.field_a] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.field_b[var26.field_a] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$10 = var26.field_a + 1;
                  var26.field_a = var26.field_a + 1;
                  if (fieldTemp$10 >= var26.field_b.length) {
                    var26.field_a = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  int incrementValue$6 = param1;
                  param1++;
                  param0[incrementValue$6] = param0[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  int incrementValue$7 = param1;
                  param1++;
                  param0[incrementValue$7] = param0[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                int incrementValue$8 = param1;
                param1++;
                param0[incrementValue$8] = param0[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                int incrementValue$9 = param1;
                param1++;
                param0[incrementValue$9] = param0[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                param1 = param1 >> 1;
              }
            }
          }
          if (this.field_r == null) {
            continue;
          }
          qg.a(this.field_t, 0, var4);
        }
    }

    private final synchronized void a(float param0) {
        this.field_u = param0;
        this.field_w = (float)((double)this.field_n * Math.sqrt((double)(1.0f + this.field_u) * 0.5));
        this.field_q = (float)((double)this.field_n * Math.sqrt((double)(1.0f - this.field_u) * 0.5));
    }

    final wg c() {
        return this.field_r;
    }

    private final static int a(int param0, int[] param1, int param2, int param3) {
        if (param3 > param1.length) {
          param3 = param1.length;
        }
        for (int var4 = 0; var4 < param3; var4++) {
          int var5 = param1[param2];
          if (var5 > 0) {
            var5 = -var5;
          }
          if (var5 < param0) {
            param0 = var5;
          }
          param2++;
          if (param2 == param1.length) {
            param2 = 0;
          }
        }
        return param0;
    }

    private final synchronized void c(float param0) {
        this.field_o = param0;
    }

    final synchronized void d(int param0) {
        if (this.field_r != null) {
          this.field_r.d(param0);
        }
    }

    private final synchronized void f(float param0) {
        this.field_n = param0;
        this.field_w = (float)((double)this.field_n * Math.sqrt((double)(1.0f + this.field_u) * 0.5));
        this.field_q = (float)((double)this.field_n * Math.sqrt((double)(1.0f - this.field_u) * 0.5));
    }

    private final synchronized void e(float param0) {
        this.field_x = param0;
    }

    private final void e() {
        int var1;
        if (!ie.field_o) {
          if (this.field_y != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_s[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_l[var1].a();
            }
            this.field_y = null;
            this.field_v = null;
            this.field_t = new int[256];
          }
        } else if (this.field_y == null) {
          for (var1 = 0; var1 < 8; var1++) {
            this.field_s[var1].a();
          }
          for (var1 = 0; var1 < 4; var1++) {
            this.field_l[var1].a();
          }
          this.field_y = new nc[8];
          this.field_y[0] = new nc(1139 * ie.field_q / 44100);
          this.field_y[1] = new nc(1211 * ie.field_q / 44100);
          this.field_y[2] = new nc(1300 * ie.field_q / 44100);
          this.field_y[3] = new nc(1379 * ie.field_q / 44100);
          this.field_y[4] = new nc(1445 * ie.field_q / 44100);
          this.field_y[5] = new nc(1514 * ie.field_q / 44100);
          this.field_y[6] = new nc(1580 * ie.field_q / 44100);
          this.field_y[7] = new nc(1640 * ie.field_q / 44100);
          this.field_v = new lc[4];
          this.field_v[0] = new lc(579 * ie.field_q / 44100);
          this.field_v[1] = new lc(464 * ie.field_q / 44100);
          this.field_v[2] = new lc(364 * ie.field_q / 44100);
          this.field_v[3] = new lc(248 * ie.field_q / 44100);
          this.field_t = new int[512];
        }
    }

    final synchronized void b(float param0) {
        this.field_m = param0;
        this.field_p = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_m * (float)ie.field_q));
    }

    final wg b() {
        return null;
    }

    final synchronized void d(float param0) {
        this.field_k = param0;
    }

    final int a() {
        return 8;
    }

    wb(wg param0) {
        this.field_s = new nc[8];
        this.field_s[0] = new nc(1116 * ie.field_q / 44100);
        this.field_s[1] = new nc(1188 * ie.field_q / 44100);
        this.field_s[2] = new nc(1277 * ie.field_q / 44100);
        this.field_s[3] = new nc(1356 * ie.field_q / 44100);
        this.field_s[4] = new nc(1422 * ie.field_q / 44100);
        this.field_s[5] = new nc(1491 * ie.field_q / 44100);
        this.field_s[6] = new nc(1557 * ie.field_q / 44100);
        this.field_s[7] = new nc(1617 * ie.field_q / 44100);
        this.field_l = new lc[4];
        this.field_l[0] = new lc(556 * ie.field_q / 44100);
        this.field_l[1] = new lc(441 * ie.field_q / 44100);
        this.field_l[2] = new lc(341 * ie.field_q / 44100);
        this.field_l[3] = new lc(225 * ie.field_q / 44100);
        if (!ie.field_o) {
          this.field_t = new int[256];
        }
        this.e();
        this.e(0.04500000178813934f);
        this.f(1.0f);
        this.d(0.8399999737739563f);
        this.c(1.0f);
        this.b(7000.0f);
        this.a(1.0f);
        this.field_r = param0;
    }
}
