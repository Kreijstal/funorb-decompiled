/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends pa {
    private boolean field_f;
    private int field_d;
    private int field_b;
    private int field_a;
    private int field_h;
    private int field_k;
    private bf field_e;
    private boolean field_i;
    private int field_l;
    private boolean field_j;
    private qi field_g;
    static String field_m;
    static String field_c;

    public static void a(int param0) {
        if (param0 != 16523) {
            rp.b(89);
            field_c = null;
            field_m = null;
            return;
        }
        field_c = null;
        field_m = null;
    }

    final int c() {
        return this.field_b + this.field_h + this.field_l;
    }

    final static void b(int param0) {
        if (param0 == 1) {
          if (it.field_c != -la.field_k + 0) {
            if (250 - la.field_k != it.field_c) {
              it.field_c = it.field_c + 1;
              return;
            } else {
              it.field_c = it.field_c + 1;
              return;
            }
          } else {
            it.field_c = it.field_c + 1;
            return;
          }
        } else {
          field_c = (String) null;
          if (it.field_c != -la.field_k + 0) {
            if (250 - la.field_k != it.field_c) {
              it.field_c = it.field_c + 1;
              return;
            } else {
              it.field_c = it.field_c + 1;
              return;
            }
          } else {
            it.field_c = it.field_c + 1;
            return;
          }
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        ec var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        ec var27;
        qi stackIn_4_0 = null;
        var27 = this.field_e.y(-125);
        var12 = this.field_e.d(12343);
        stackIn_4_0 = this.field_g;

        if (!this.field_f) {


          if (!this.field_i) {


            if (-1 != (1 & param9 ^ -1)) {
              L0: {
                ((qi) (Object) stackIn_4_0).a(fg.field_A, -31662);
                this.field_e.r((byte) 112);
                this.field_e.a(this.field_g, -9135);
                this.field_e.e(true, param8);
                this.field_e.b(param6, false);
                this.field_e.a((byte) 124, 1, bs.field_a);
                this.field_e.a(bs.field_a, 1, 0);
                this.field_e.a((byte) -74, param7);
                if (!this.field_j) {
                  break L0;
                } else {
                  var13 = (float)this.d();
                  var14 = (float)this.c();
                  var15 = (param2 - param0) / var13;
                  var16 = (-param1 + param3) / var13;
                  var17 = (-param0 + param4) / var14;
                  var18 = (param5 - param1) / var14;
                  var19 = var17 * (float)this.field_h;
                  var20 = (float)this.field_h * var18;
                  var21 = var15 * (float)this.field_a;
                  var22 = (float)this.field_a * var16;
                  var23 = -var15 * (float)this.field_d;
                  var24 = -var16 * (float)this.field_d;
                  var25 = (float)this.field_b * -var17;
                  param1 = var20 + (var22 + param1);
                  param4 = var25 + (param4 + var21);
                  param0 = var21 + param0 + var19;
                  param2 = var23 + param2 + var19;
                  var26 = -var18 * (float)this.field_b;
                  param3 = param3 + var24 + var20;
                  param5 = var22 + param5 + var26;
                  break L0;
                }
              }
              var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
              var27.b(param1, (byte) -128, 0.0f, param0);
              var12.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(112, (float)this.field_k), 1.0f, 32);
              this.field_e.a(tr.field_a, (byte) 103);
              this.field_e.q((byte) 83);
              this.field_e.s(2);
              this.field_e.f(-21041);
              this.field_e.a((byte) 118, 1, un.field_i);
              this.field_e.a(un.field_i, 1, 0);
              return;
            } else {
              L1: {
                ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
                this.field_e.r((byte) 112);
                this.field_e.a(this.field_g, -9135);
                this.field_e.e(true, param8);
                this.field_e.b(param6, false);
                this.field_e.a((byte) 124, 1, bs.field_a);
                this.field_e.a(bs.field_a, 1, 0);
                this.field_e.a((byte) -74, param7);
                if (!this.field_j) {
                  break L1;
                } else {
                  var13 = (float)this.d();
                  var14 = (float)this.c();
                  var15 = (param2 - param0) / var13;
                  var16 = (-param1 + param3) / var13;
                  var17 = (-param0 + param4) / var14;
                  var18 = (param5 - param1) / var14;
                  var19 = var17 * (float)this.field_h;
                  var20 = (float)this.field_h * var18;
                  var21 = var15 * (float)this.field_a;
                  var22 = (float)this.field_a * var16;
                  var23 = -var15 * (float)this.field_d;
                  var24 = -var16 * (float)this.field_d;
                  var25 = (float)this.field_b * -var17;
                  param1 = var20 + (var22 + param1);
                  param4 = var25 + (param4 + var21);
                  param0 = var21 + param0 + var19;
                  param2 = var23 + param2 + var19;
                  var26 = -var18 * (float)this.field_b;
                  param3 = param3 + var24 + var20;
                  param5 = var22 + param5 + var26;
                  break L1;
                }
              }
              var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
              var27.b(param1, (byte) -128, 0.0f, param0);
              var12.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(112, (float)this.field_k), 1.0f, 32);
              this.field_e.a(tr.field_a, (byte) 103);
              this.field_e.q((byte) 83);
              this.field_e.s(2);
              this.field_e.f(-21041);
              this.field_e.a((byte) 118, 1, un.field_i);
              this.field_e.a(un.field_i, 1, 0);
              return;
            }
          } else {
            L2: {
              ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
              this.field_e.r((byte) 112);
              this.field_e.a(this.field_g, -9135);
              this.field_e.e(true, param8);
              this.field_e.b(param6, false);
              this.field_e.a((byte) 124, 1, bs.field_a);
              this.field_e.a(bs.field_a, 1, 0);
              this.field_e.a((byte) -74, param7);
              if (!this.field_j) {
                break L2;
              } else {
                var13 = (float)this.d();
                var14 = (float)this.c();
                var15 = (param2 - param0) / var13;
                var16 = (-param1 + param3) / var13;
                var17 = (-param0 + param4) / var14;
                var18 = (param5 - param1) / var14;
                var19 = var17 * (float)this.field_h;
                var20 = (float)this.field_h * var18;
                var21 = var15 * (float)this.field_a;
                var22 = (float)this.field_a * var16;
                var23 = -var15 * (float)this.field_d;
                var24 = -var16 * (float)this.field_d;
                var25 = (float)this.field_b * -var17;
                param1 = var20 + (var22 + param1);
                param4 = var25 + (param4 + var21);
                param0 = var21 + param0 + var19;
                param2 = var23 + param2 + var19;
                var26 = -var18 * (float)this.field_b;
                param3 = param3 + var24 + var20;
                param5 = var22 + param5 + var26;
                break L2;
              }
            }
            var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
            var27.b(param1, (byte) -128, 0.0f, param0);
            var12.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(112, (float)this.field_k), 1.0f, 32);
            this.field_e.a(tr.field_a, (byte) 103);
            this.field_e.q((byte) 83);
            this.field_e.s(2);
            this.field_e.f(-21041);
            this.field_e.a((byte) 118, 1, un.field_i);
            this.field_e.a(un.field_i, 1, 0);
            return;
          }
        } else {
          L3: {
            ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
            this.field_e.r((byte) 112);
            this.field_e.a(this.field_g, -9135);
            this.field_e.e(true, param8);
            this.field_e.b(param6, false);
            this.field_e.a((byte) 124, 1, bs.field_a);
            this.field_e.a(bs.field_a, 1, 0);
            this.field_e.a((byte) -74, param7);
            if (!this.field_j) {
              break L3;
            } else {
              var13 = (float)this.d();
              var14 = (float)this.c();
              var15 = (param2 - param0) / var13;
              var16 = (-param1 + param3) / var13;
              var17 = (-param0 + param4) / var14;
              var18 = (param5 - param1) / var14;
              var19 = var17 * (float)this.field_h;
              var20 = (float)this.field_h * var18;
              var21 = var15 * (float)this.field_a;
              var22 = (float)this.field_a * var16;
              var23 = -var15 * (float)this.field_d;
              var24 = -var16 * (float)this.field_d;
              var25 = (float)this.field_b * -var17;
              param1 = var20 + (var22 + param1);
              param4 = var25 + (param4 + var21);
              param0 = var21 + param0 + var19;
              param2 = var23 + param2 + var19;
              var26 = -var18 * (float)this.field_b;
              param3 = param3 + var24 + var20;
              param5 = var22 + param5 + var26;
              break L3;
            }
          }
          var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
          var27.b(param1, (byte) -128, 0.0f, param0);
          var12.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(112, (float)this.field_k), 1.0f, 32);
          this.field_e.a(tr.field_a, (byte) 103);
          this.field_e.q((byte) 83);
          this.field_e.s(2);
          this.field_e.f(-21041);
          this.field_e.a((byte) 118, 1, un.field_i);
          this.field_e.a(un.field_i, 1, 0);
          return;
        }
    }

    final int b() {
        return this.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ec var10;
        ec var11;
        qi stackIn_4_0 = null;
        qi stackIn_5_0 = null;
        ke stackIn_5_1 = null;
        L0: {
          L1: {
            var11 = this.field_e.y(-118);
            var10 = this.field_e.d(12343);
            stackIn_4_0 = this.field_g;

            if (this.field_f) {
              break L1;
            } else {
              stackIn_4_0 = (qi) ((Object) stackIn_4_0);

              if (this.field_i) {
                break L1;
              } else {
                stackIn_4_0 = (qi) ((Object) stackIn_4_0);

                if (-1 == (param7 & 1 ^ -1)) {
                  break L1;
                } else {
                  stackIn_5_0 = (qi) ((Object) stackIn_4_0);
                  stackIn_5_1 = fg.field_A;
                  break L0;
                }
              }
            }
          }
          stackIn_5_0 = (qi) ((Object) stackIn_4_0);
          stackIn_5_1 = jp.field_a;
          break L0;
        }
        L2: {
          ((qi) (Object) stackIn_5_0).a(stackIn_5_1, -31662);
          this.field_e.r((byte) 107);
          this.field_e.a(this.field_g, -9135);
          this.field_e.e(true, param6);
          this.field_e.b(param4, false);
          this.field_e.a((byte) 124, 1, bs.field_a);
          this.field_e.a(bs.field_a, 1, 0);
          this.field_e.a((byte) -74, param5);
          var10.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(84, (float)this.field_k), 1.0f, -82);
          if (this.field_j) {
            param2 = param2 * this.field_k / this.d();
            param3 = param3 * this.field_l / this.c();
            param0 = param0 + this.field_a * param2 / this.field_k;
            param1 = param1 + this.field_h * param3 / this.field_l;
            break L2;
          } else {
            break L2;
          }
        }
        var11.b((float)param3, (float)param2, 0.0f, 68);
        var11.a(param1, param0, 0, -120);
        this.field_e.a(tr.field_a, (byte) -111);
        this.field_e.q((byte) 119);
        this.field_e.s(2);
        this.field_e.f(-21041);
        this.field_e.a((byte) 120, 1, un.field_i);
        this.field_e.a(un.field_i, 1, 0);
    }

    final int d() {
        return this.field_d + (this.field_a + this.field_k);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ec var8 = this.field_e.y(-112);
        ec var7 = this.field_e.d(12343);
        param1 = param1 + this.field_h;
        param0 = param0 + this.field_a;
        this.field_g.a(jp.field_a, -31662);
        this.field_e.r((byte) 117);
        this.field_e.a(this.field_g, -9135);
        this.field_e.e(true, param4);
        this.field_e.b(param2, false);
        this.field_e.a((byte) 120, 1, bs.field_a);
        this.field_e.a(bs.field_a, 1, 0);
        this.field_e.a((byte) -74, param3);
        var8.b((float)this.field_l, (float)this.field_k, 0.0f, -83);
        var8.a(param1, param0, 0, 124);
        var7.b(this.field_g.a((float)this.field_l, (byte) -32), this.field_g.a(118, (float)this.field_k), 1.0f, -94);
        this.field_e.a(tr.field_a, (byte) 55);
        this.field_e.q((byte) 73);
        this.field_e.s(2);
        this.field_e.f(-21041);
        this.field_e.a((byte) 126, 1, un.field_i);
        this.field_e.a(un.field_i, 1, 0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        this.field_d = param2;
        this.field_b = param3;
        this.field_a = param0;
        this.field_h = param1;
        stackIn_2_0 = this;

        if (this.field_a == 0) {
          stackIn_4_0 = this;

          if (this.field_h == 0) {
            stackIn_8_0 = this;

            if (this.field_d == 0) {
              stackIn_10_0 = this;

              if (this.field_b != 0) {
                ((rp) (this)).field_j = true;
                return;
              } else {
                ((rp) (this)).field_j = false;
                return;
              }
            } else {
              stackIn_7_0 = this;
              stackIn_7_1 = 1;
              ((rp) (this)).field_j = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((rp) (this)).field_j = true;
            return;
          }
        } else {
          ((rp) (this)).field_j = true;
          return;
        }
    }

    rp(bf param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_d = 0;
        this.field_b = 0;
        this.field_a = 0;
        this.field_j = false;
        try {
          L0: {
            L1: {
              this.field_k = param1;
              this.field_l = param2;
              this.field_e = param0;
              this.field_g = param0.a(param4, true, false, param2, param5, param3, param1);
              this.field_g.a(true, true, (byte) -127);
              stackIn_3_0 = this;

              if (this.field_g.a(72) == param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((rp) (this)).field_f = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (param2 == this.field_g.b((byte) 87)) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((rp) (this)).field_i = stackIn_7_1 != 0;
              if (this.field_f) {
                break L3;
              } else {
                this.field_g.c((byte) -113);
                break L3;
              }
            }
            if (this.field_i) {
              break L0;
            } else {
              this.field_g.c((byte) -127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("rp.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a() {
        return this.field_k;
    }

    static {
        field_c = "This entry doesn't match";
    }
}
