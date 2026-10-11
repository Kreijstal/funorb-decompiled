/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends qb {
    private float field_w;
    private int[] field_z;
    private float field_r;
    private we[] field_s;
    private float field_p;
    private el[] field_y;
    private float field_n;
    private we[] field_x;
    private el[] field_u;
    private float field_v;
    private float field_m;
    private qb field_t;
    private float field_o;
    private float field_q;
    private float field_A;

    final int a() {
        return 8;
    }

    final synchronized void d(float param0) {
        this.field_r = param0;
        this.field_p = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_r * (float)vn.field_t));
    }

    final synchronized void b(float param0) {
        this.field_n = param0;
    }

    final synchronized void c(float param0) {
        this.field_w = param0;
        this.field_v = (float)((double)this.field_q * Math.sqrt((double)(1.0f + this.field_w) * 0.5));
        this.field_m = (float)((double)this.field_q * Math.sqrt((double)(1.0f - this.field_w) * 0.5));
    }

    final synchronized void a(int param0) {
        if (this.field_t != null) {
          this.field_t.a(param0);
        }
    }

    final synchronized void a(float param0) {
        this.field_q = param0;
        this.field_v = (float)((double)this.field_q * Math.sqrt((double)(1.0f + this.field_w) * 0.5));
        this.field_m = (float)((double)this.field_q * Math.sqrt((double)(1.0f - this.field_w) * 0.5));
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
        we var23;
        el var24;
        we var25;
        el var26;
        we var27;
        el var28;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var6Lifetime2Lifetime1;
        this.e();
        param2 = param2 + param1;
        while (param1 < param2) {
          var4 = param2 - param1;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.field_t != null) {
            this.field_t.b(this.field_z, 0, var4);
          }
          var5 = 0;
          for (var6 = 0; var6 < 8; var6++) {
            var5 = ge.a(var5, this.field_x[var6].field_c, this.field_x[var6].field_a, var4);
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = ge.a(var5, this.field_y[var6Lifetime1].field_a, this.field_y[var6Lifetime1].field_b, var4);
          }
          if (vn.field_g) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = ge.a(var5, this.field_s[var6Lifetime2].field_c, this.field_s[var6Lifetime2].field_a, var4);
            }
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = ge.a(var5, this.field_u[var6Lifetime2Lifetime1].field_a, this.field_u[var6Lifetime2Lifetime1].field_b, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            var7 = this.field_z[var6Lifetime3];
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
          var7Lifetime1 = (int)(this.field_A * 4096.0f);
          var8 = (int)(this.field_p * 4096.0f);
          var9 = (int)(this.field_n * 4096.0f);
          var10 = (int)(this.field_o * 65536.0f);
          if (!vn.field_g) {
            var11 = (int)(this.field_q * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_z[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                var27 = this.field_x[var16];
                var18 = var27.field_c[var27.field_a] >> var6Lifetime4;
                var19 = var27.field_b >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.field_b = var19 << var6Lifetime4;
                var27.field_c[var27.field_a] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$3 = var27.field_a + 1;
                var27.field_a = var27.field_a + 1;
                if (fieldTemp$3 >= var27.field_c.length) {
                  var27.field_a = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                var28 = this.field_y[var16];
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
            var11 = (int)(this.field_v * 4096.0f);
            var12 = (int)(this.field_m * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                incrementValue$4 = var13;
                var13++;
                var14 = this.field_z[incrementValue$4] >> var6Lifetime4;
                incrementValue$5 = var13;
                var13++;
                var15 = this.field_z[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  var23 = this.field_x[var18];
                  var20 = var23.field_c[var23.field_a] >> var6Lifetime4;
                  var21 = var23.field_b >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.field_b = var21 << var6Lifetime4;
                  var23.field_c[var23.field_a] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$13 = var23.field_a + 1;
                  var23.field_a = var23.field_a + 1;
                  if (fieldTemp$13 >= var23.field_c.length) {
                    var23.field_a = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  var24 = this.field_y[var18];
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
                  var25 = this.field_s[var19];
                  var21Lifetime1 = var25.field_c[var25.field_a] >> var6Lifetime4;
                  var22 = var25.field_b >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.field_b = var22 << var6Lifetime4;
                  var25.field_c[var25.field_a] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$11 = var25.field_a + 1;
                  var25.field_a = var25.field_a + 1;
                  if (fieldTemp$11 >= var25.field_c.length) {
                    var25.field_a = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  var26 = this.field_u[var19];
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
          if (this.field_t == null) {
            continue;
          }
          cj.a(this.field_z, 0, var4);
        }
    }

    final qb c() {
        return null;
    }

    final synchronized void e(float param0) {
        this.field_A = param0;
    }

    final qb d() {
        return this.field_t;
    }

    private final void e() {
        int var1;
        if (!vn.field_g) {
          if (this.field_s != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_x[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_y[var1].a();
            }
            this.field_s = null;
            this.field_u = null;
            this.field_z = new int[256];
          }
        } else {
          if (this.field_s == null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_x[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_y[var1].a();
            }
            this.field_s = new we[8];
            this.field_s[0] = new we(1139 * vn.field_t / 44100);
            this.field_s[1] = new we(1211 * vn.field_t / 44100);
            this.field_s[2] = new we(1300 * vn.field_t / 44100);
            this.field_s[3] = new we(1379 * vn.field_t / 44100);
            this.field_s[4] = new we(1445 * vn.field_t / 44100);
            this.field_s[5] = new we(1514 * vn.field_t / 44100);
            this.field_s[6] = new we(1580 * vn.field_t / 44100);
            this.field_s[7] = new we(1640 * vn.field_t / 44100);
            this.field_u = new el[4];
            this.field_u[0] = new el(579 * vn.field_t / 44100);
            this.field_u[1] = new el(464 * vn.field_t / 44100);
            this.field_u[2] = new el(364 * vn.field_t / 44100);
            this.field_u[3] = new el(248 * vn.field_t / 44100);
            this.field_z = new int[512];
          }
        }
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

    ge(qb param0) {
        this.field_x = new we[8];
        this.field_x[0] = new we(1116 * vn.field_t / 44100);
        this.field_x[1] = new we(1188 * vn.field_t / 44100);
        this.field_x[2] = new we(1277 * vn.field_t / 44100);
        this.field_x[3] = new we(1356 * vn.field_t / 44100);
        this.field_x[4] = new we(1422 * vn.field_t / 44100);
        this.field_x[5] = new we(1491 * vn.field_t / 44100);
        this.field_x[6] = new we(1557 * vn.field_t / 44100);
        this.field_x[7] = new we(1617 * vn.field_t / 44100);
        this.field_y = new el[4];
        this.field_y[0] = new el(556 * vn.field_t / 44100);
        this.field_y[1] = new el(441 * vn.field_t / 44100);
        this.field_y[2] = new el(341 * vn.field_t / 44100);
        this.field_y[3] = new el(225 * vn.field_t / 44100);
        if (!vn.field_g) {
          this.field_z = new int[256];
        }
        this.e();
        this.f(0.04500000178813934f);
        this.a(1.0f);
        this.e(0.8399999737739563f);
        this.b(1.0f);
        this.d(7000.0f);
        this.c(1.0f);
        this.field_t = param0;
    }

    final synchronized void f(float param0) {
        this.field_o = param0;
    }
}
