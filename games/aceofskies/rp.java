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
        if (param0 != 1) {
          field_c = (String) null;
          if (it.field_c == -la.field_k + 0) {
            it.field_c = it.field_c + 1;
            return;
          }
          if (250 - la.field_k == it.field_c) {
            it.field_c = it.field_c + 1;
            return;
          }
          it.field_c = it.field_c + 1;
          return;
        }
        if (it.field_c == -la.field_k + 0) {
          it.field_c = it.field_c + 1;
          return;
        }
        if (250 - la.field_k == it.field_c) {
          it.field_c = it.field_c + 1;
          return;
        }
        it.field_c = it.field_c + 1;
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
        if (this.field_f) {
          ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
        } else {
          if (this.field_i) {
            ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
          } else {
            if ((1 & param9) != 0) {
              ((qi) (Object) stackIn_4_0).a(fg.field_A, -31662);
            } else {
              ((qi) (Object) stackIn_4_0).a(jp.field_a, -31662);
            }
          }
        }
        this.field_e.r((byte) 112);
        this.field_e.a(this.field_g, -9135);
        this.field_e.e(true, param8);
        this.field_e.b(param6, false);
        this.field_e.a((byte) 124, 1, bs.field_a);
        this.field_e.a(bs.field_a, 1, 0);
        this.field_e.a((byte) -74, param7);
        if (this.field_j) {
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
    }

    final int b() {
        return this.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ec var10;
        ec var11;
        qi stackIn_4_0 = null;
        ke stackIn_5_1 = null;
        var11 = this.field_e.y(-118);
        var10 = this.field_e.d(12343);
        stackIn_4_0 = this.field_g;
        if (!this.field_f &&
          !this.field_i &&
          (param7 & 1) != 0) {
          stackIn_5_1 = fg.field_A;
        } else {
          stackIn_5_1 = jp.field_a;
        }
        ((qi) (Object) stackIn_4_0).a(stackIn_5_1, -31662);
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
        this.field_d = param2;
        this.field_b = param3;
        this.field_a = param0;
        this.field_h = param1;
        if (this.field_a != 0) {
          this.field_j = true;
        } else {
          if (this.field_h != 0) {
            this.field_j = true;
          } else {
            if (this.field_d != 0) {
              this.field_j = true;
            } else {
              if (this.field_b != 0) {
                this.field_j = true;
              } else {
                this.field_j = false;
              }
            }
          }
        }
    }

    rp(bf param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_d = 0;
        this.field_b = 0;
        this.field_a = 0;
        this.field_j = false;
        try {
          this.field_k = param1;
          this.field_l = param2;
          this.field_e = param0;
          this.field_g = param0.a(param4, true, false, param2, param5, param3, param1);
          this.field_g.a(true, true, (byte) -127);
          stackIn_4_1 = (this.field_g.a(72) != param1);
          this.field_f = stackIn_4_1;
          stackIn_7_1 = (param2 != this.field_g.b((byte) 87));
          this.field_i = stackIn_7_1;
          if (!this.field_f) {
            this.field_g.c((byte) -113);
          }
          if (this.field_i) {
            return;
          }
          this.field_g.c((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("rp.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a() {
        return this.field_k;
    }

    static {
        field_c = "This entry doesn't match";
    }
}
