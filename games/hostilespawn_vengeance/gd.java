/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends tj {
    private tj field_s;
    private float field_q;
    private float field_r;
    private float field_m;
    private float field_w;
    private oi[] field_n;
    private float field_l;
    private oi[] field_y;
    private sh[] field_z;
    private float field_v;
    private int[] field_u;
    private float field_x;
    private float field_p;
    private float field_o;
    private sh[] field_t;

    final tj b() {
        return null;
    }

    final tj d() {
        return this.field_s;
    }

    final synchronized void c(int param0) {
        if (this.field_s != null) {
          this.field_s.c(param0);
        }
    }

    final synchronized float j() {
        return this.field_o;
    }

    final synchronized float g() {
        return this.field_p;
    }

    private final void i() {
        int var1;
        if (!ug.field_b) {
          if (this.field_n != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_y[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_t[var1].a();
            }
            this.field_n = null;
            this.field_z = null;
            this.field_u = new int[256];
          }
        } else {
          if (this.field_n == null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_y[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_t[var1].a();
            }
            this.field_n = new oi[8];
            this.field_n[0] = new oi(1139 * ug.field_g / 44100);
            this.field_n[1] = new oi(1211 * ug.field_g / 44100);
            this.field_n[2] = new oi(1300 * ug.field_g / 44100);
            this.field_n[3] = new oi(1379 * ug.field_g / 44100);
            this.field_n[4] = new oi(1445 * ug.field_g / 44100);
            this.field_n[5] = new oi(1514 * ug.field_g / 44100);
            this.field_n[6] = new oi(1580 * ug.field_g / 44100);
            this.field_n[7] = new oi(1640 * ug.field_g / 44100);
            this.field_z = new sh[4];
            this.field_z[0] = new sh(579 * ug.field_g / 44100);
            this.field_z[1] = new sh(464 * ug.field_g / 44100);
            this.field_z[2] = new sh(364 * ug.field_g / 44100);
            this.field_z[3] = new sh(248 * ug.field_g / 44100);
            this.field_u = new int[512];
          }
        }
    }

    final synchronized void a(float param0) {
        this.field_m = param0;
    }

    final synchronized float f() {
        return this.field_w;
    }

    final synchronized float k() {
        return this.field_x;
    }

    final synchronized void f(float param0) {
        this.field_v = param0;
    }

    final synchronized float h() {
        return this.field_v;
    }

    private final static int a(int param0, int[] param1, int param2, int param3) {
        int var4 = 0;
        int var5;
        if (param3 > param1.length) {
          param3 = param1.length;
        }
        for (var4 = 0; var4 < param3; var4++) {
          var5 = param1[param2];
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

    final synchronized void b(int[] param0, int param1, int param2) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$10 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        oi var23;
        sh var24;
        oi var25;
        sh var26;
        oi var27;
        sh var28;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var6Lifetime2Lifetime1;
        this.i();
        param2 = param2 + param1;
        while (param1 < param2) {
          var4 = param2 - param1;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.field_s != null) {
            this.field_s.b(this.field_u, 0, var4);
          }
          var5 = 0;
          for (var6 = 0; var6 < 8; var6++) {
            var5 = gd.a(var5, this.field_y[var6].field_c, this.field_y[var6].field_b, var4);
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = gd.a(var5, this.field_t[var6Lifetime1].field_a, this.field_t[var6Lifetime1].field_b, var4);
          }
          if (ug.field_b) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = gd.a(var5, this.field_n[var6Lifetime2].field_c, this.field_n[var6Lifetime2].field_b, var4);
            }
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = gd.a(var5, this.field_z[var6Lifetime2Lifetime1].field_a, this.field_z[var6Lifetime2Lifetime1].field_b, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            var7 = this.field_u[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          var7Lifetime1 = (int)(this.field_w * 4096.0f);
          var8 = (int)(this.field_l * 4096.0f);
          var9 = (int)(this.field_m * 4096.0f);
          var10 = (int)(this.field_v * 65536.0f);
          if (!ug.field_b) {
            var11 = (int)(this.field_x * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_u[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                var27 = this.field_y[var16];
                var18 = var27.field_c[var27.field_b] >> var6Lifetime4;
                var19 = var27.field_a >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.field_a = var19 << var6Lifetime4;
                var27.field_c[var27.field_b] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$3 = var27.field_b + 1;
                var27.field_b = var27.field_b + 1;
                if (fieldTemp$3 >= var27.field_c.length) {
                  var27.field_b = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                var28 = this.field_t[var16];
                var18 = var28.field_a[var28.field_b] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.field_a[var28.field_b] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$2 = var28.field_b + 1;
                var28.field_b = var28.field_b + 1;
                if (fieldTemp$2 >= var28.field_a.length) {
                  var28.field_b = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                incrementValue$0 = param1;
                param1++;
                param0[incrementValue$0] = param0[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                incrementValue$1 = param1;
                param1++;
                param0[incrementValue$1] = param0[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.field_q * 4096.0f);
            var12 = (int)(this.field_r * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                incrementValue$4 = var13;
                var13++;
                var14 = this.field_u[incrementValue$4] >> var6Lifetime4;
                incrementValue$5 = var13;
                var13++;
                var15 = this.field_u[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  var23 = this.field_y[var18];
                  var20 = var23.field_c[var23.field_b] >> var6Lifetime4;
                  var21 = var23.field_a >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.field_a = var21 << var6Lifetime4;
                  var23.field_c[var23.field_b] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$13 = var23.field_b + 1;
                  var23.field_b = var23.field_b + 1;
                  if (fieldTemp$13 >= var23.field_c.length) {
                    var23.field_b = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  var24 = this.field_t[var18];
                  var20Lifetime1 = var24.field_a[var24.field_b] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.field_a[var24.field_b] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$12 = var24.field_b + 1;
                  var24.field_b = var24.field_b + 1;
                  if (fieldTemp$12 >= var24.field_a.length) {
                    var24.field_b = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  var25 = this.field_n[var19];
                  var21Lifetime1 = var25.field_c[var25.field_b] >> var6Lifetime4;
                  var22 = var25.field_a >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.field_a = var22 << var6Lifetime4;
                  var25.field_c[var25.field_b] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$11 = var25.field_b + 1;
                  var25.field_b = var25.field_b + 1;
                  if (fieldTemp$11 >= var25.field_c.length) {
                    var25.field_b = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  var26 = this.field_z[var19];
                  var21Lifetime2 = var26.field_a[var26.field_b] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.field_a[var26.field_b] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$10 = var26.field_b + 1;
                  var26.field_b = var26.field_b + 1;
                  if (fieldTemp$10 >= var26.field_a.length) {
                    var26.field_b = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  incrementValue$6 = param1;
                  param1++;
                  param0[incrementValue$6] = param0[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  incrementValue$7 = param1;
                  param1++;
                  param0[incrementValue$7] = param0[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                incrementValue$8 = param1;
                param1++;
                param0[incrementValue$8] = param0[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                incrementValue$9 = param1;
                param1++;
                param0[incrementValue$9] = param0[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                param1 = param1 >> 1;
              }
            }
          }
          if (this.field_s == null) {
            continue;
          }
          kf.a(this.field_u, 0, var4);
        }
    }

    final synchronized void b(float param0) {
        this.field_w = param0;
    }

    final int c() {
        return 8;
    }

    final synchronized void c(float param0) {
        this.field_x = param0;
        this.field_q = (float)((double)this.field_x * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_r = (float)((double)this.field_x * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    final synchronized void e(float param0) {
        this.field_p = param0;
        this.field_l = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_p * (float)ug.field_g));
    }

    final synchronized float e() {
        return this.field_m;
    }

    final synchronized void d(float param0) {
        this.field_o = param0;
        this.field_q = (float)((double)this.field_x * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_r = (float)((double)this.field_x * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    gd(tj param0) {
        this.field_y = new oi[8];
        this.field_y[0] = new oi(1116 * ug.field_g / 44100);
        this.field_y[1] = new oi(1188 * ug.field_g / 44100);
        this.field_y[2] = new oi(1277 * ug.field_g / 44100);
        this.field_y[3] = new oi(1356 * ug.field_g / 44100);
        this.field_y[4] = new oi(1422 * ug.field_g / 44100);
        this.field_y[5] = new oi(1491 * ug.field_g / 44100);
        this.field_y[6] = new oi(1557 * ug.field_g / 44100);
        this.field_y[7] = new oi(1617 * ug.field_g / 44100);
        this.field_t = new sh[4];
        this.field_t[0] = new sh(556 * ug.field_g / 44100);
        this.field_t[1] = new sh(441 * ug.field_g / 44100);
        this.field_t[2] = new sh(341 * ug.field_g / 44100);
        this.field_t[3] = new sh(225 * ug.field_g / 44100);
        if (!ug.field_b) {
          this.field_u = new int[256];
        }
        this.i();
        this.f(0.04500000178813934f);
        this.c(1.0f);
        this.b(0.8399999737739563f);
        this.a(1.0f);
        this.e(7000.0f);
        this.d(1.0f);
        this.field_s = param0;
    }
}
