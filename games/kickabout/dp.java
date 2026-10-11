/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends lq {
    private lq field_r;
    private float field_s;
    private float field_u;
    private int[] field_i;
    private tp[] field_n;
    private mq[] field_k;
    private float field_p;
    private tp[] field_m;
    private mq[] field_v;
    private float field_o;
    private float field_t;
    private float field_q;
    private float field_w;
    private float field_j;
    private float field_l;

    final synchronized void a(int[] param0, int param1, int param2) {
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
        tp var23;
        mq var24;
        tp var25;
        mq var26;
        tp var27;
        mq var28;
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
          if (this.field_r != null) {
            this.field_r.a(this.field_i, 0, var4);
          }
          var5 = 0;
          for (var6 = 0; var6 < 8; var6++) {
            var5 = dp.a(var5, this.field_m[var6].field_c, this.field_m[var6].field_a, var4);
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = dp.a(var5, this.field_k[var6Lifetime1].field_a, this.field_k[var6Lifetime1].field_b, var4);
          }
          if (uh.field_o) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = dp.a(var5, this.field_n[var6Lifetime2].field_c, this.field_n[var6Lifetime2].field_a, var4);
            }
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = dp.a(var5, this.field_v[var6Lifetime2Lifetime1].field_a, this.field_v[var6Lifetime2Lifetime1].field_b, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            var7 = this.field_i[var6Lifetime3];
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
          var7Lifetime1 = (int)(this.field_j * 4096.0f);
          var8 = (int)(this.field_q * 4096.0f);
          var9 = (int)(this.field_w * 4096.0f);
          var10 = (int)(this.field_u * 65536.0f);
          if (!uh.field_o) {
            var11 = (int)(this.field_t * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_i[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                var27 = this.field_m[var16];
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
                var28 = this.field_k[var16];
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
            var11 = (int)(this.field_s * 4096.0f);
            var12 = (int)(this.field_p * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                incrementValue$4 = var13;
                var13++;
                var14 = this.field_i[incrementValue$4] >> var6Lifetime4;
                incrementValue$5 = var13;
                var13++;
                var15 = this.field_i[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  var23 = this.field_m[var18];
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
                  var24 = this.field_k[var18];
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
                  var26 = this.field_v[var19];
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
          if (this.field_r == null) {
            continue;
          }
          dv.a(this.field_i, 0, var4);
        }
    }

    final synchronized void d(float param0) {
        this.field_o = param0;
        this.field_s = (float)((double)this.field_t * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_p = (float)((double)this.field_t * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    final synchronized void e(float param0) {
        this.field_w = param0;
    }

    private final void e() {
        int var1;
        if (!uh.field_o) {
          if (this.field_n != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_m[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_k[var1].a();
            }
            this.field_n = null;
            this.field_v = null;
            this.field_i = new int[256];
          }
        } else {
          if (this.field_n == null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_m[var1].a();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_k[var1].a();
            }
            this.field_n = new tp[8];
            this.field_n[0] = new tp(1139 * uh.field_i / 44100);
            this.field_n[1] = new tp(1211 * uh.field_i / 44100);
            this.field_n[2] = new tp(1300 * uh.field_i / 44100);
            this.field_n[3] = new tp(1379 * uh.field_i / 44100);
            this.field_n[4] = new tp(1445 * uh.field_i / 44100);
            this.field_n[5] = new tp(1514 * uh.field_i / 44100);
            this.field_n[6] = new tp(1580 * uh.field_i / 44100);
            this.field_n[7] = new tp(1640 * uh.field_i / 44100);
            this.field_v = new mq[4];
            this.field_v[0] = new mq(579 * uh.field_i / 44100);
            this.field_v[1] = new mq(464 * uh.field_i / 44100);
            this.field_v[2] = new mq(364 * uh.field_i / 44100);
            this.field_v[3] = new mq(248 * uh.field_i / 44100);
            this.field_i = new int[512];
          }
        }
    }

    final synchronized void f(float param0) {
        this.field_j = param0;
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

    final synchronized void c(float param0) {
        this.field_l = param0;
        this.field_q = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_l * (float)uh.field_i));
    }

    final synchronized void b(float param0) {
        this.field_t = param0;
        this.field_s = (float)((double)this.field_t * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_p = (float)((double)this.field_t * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    final synchronized void a(float param0) {
        this.field_u = param0;
    }

    final lq b() {
        return null;
    }

    final lq c() {
        return this.field_r;
    }

    final synchronized void a(int param0) {
        if (this.field_r != null) {
          this.field_r.a(param0);
        }
    }

    final int d() {
        return 8;
    }

    dp(lq param0) {
        this.field_m = new tp[8];
        this.field_m[0] = new tp(1116 * uh.field_i / 44100);
        this.field_m[1] = new tp(1188 * uh.field_i / 44100);
        this.field_m[2] = new tp(1277 * uh.field_i / 44100);
        this.field_m[3] = new tp(1356 * uh.field_i / 44100);
        this.field_m[4] = new tp(1422 * uh.field_i / 44100);
        this.field_m[5] = new tp(1491 * uh.field_i / 44100);
        this.field_m[6] = new tp(1557 * uh.field_i / 44100);
        this.field_m[7] = new tp(1617 * uh.field_i / 44100);
        this.field_k = new mq[4];
        this.field_k[0] = new mq(556 * uh.field_i / 44100);
        this.field_k[1] = new mq(441 * uh.field_i / 44100);
        this.field_k[2] = new mq(341 * uh.field_i / 44100);
        this.field_k[3] = new mq(225 * uh.field_i / 44100);
        if (!uh.field_o) {
          this.field_i = new int[256];
        }
        this.e();
        this.a(0.04500000178813934f);
        this.b(1.0f);
        this.f(0.8399999737739563f);
        this.e(1.0f);
        this.c(7000.0f);
        this.d(1.0f);
        this.field_r = param0;
    }
}
