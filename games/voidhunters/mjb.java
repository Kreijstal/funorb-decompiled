/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mjb extends aja {
    private boolean field_k;
    private eb field_o;
    private int field_l;
    static dja field_c;
    private boolean field_j;
    private int field_m;
    static boolean field_e;
    private boolean field_b;
    private int field_n;
    private int field_f;
    private int field_d;
    private boolean field_i;
    private pf field_h;
    private int field_g;
    private boolean field_a;

    final int b() {
        return this.field_m + this.field_n + this.field_g;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -79) {
          mjb.a(9);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        oj var10;
        oj var11;
        eb stackIn_4_0 = null;
        tu stackIn_6_1 = null;
        var11 = this.field_h.A(11);
        var10 = this.field_h.H((byte) -119);
        stackIn_4_0 = this.field_o;
        if (!this.field_j &&
          !this.field_i &&
          (1 & param7) != 0) {
          stackIn_6_1 = cs.field_a;
        } else {
          stackIn_6_1 = jd.field_o;
        }
        ((eb) (Object) stackIn_4_0).a(stackIn_6_1, -28798);
        this.field_h.E((byte) 111);
        this.field_h.a(this.field_o, -109);
        this.field_h.c(124, param6);
        this.field_h.h(-117, param4);
        this.field_h.a(1, pea.field_d, 7);
        this.field_h.a(1, (byte) -97, pea.field_d);
        this.field_h.e(-127, param5);
        var10.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)this.field_n, 106), 1.0f);
        if (this.field_k) {
          param2 = this.field_d * param2 / this.c();
          param3 = this.field_n * param3 / this.b();
          param0 = param0 + this.field_l * param2 / this.field_d;
          param1 = param1 + param3 * this.field_m / this.field_n;
        }
        var11.a(5557, (float)param2, (float)param3, 0.0f);
        var11.a(param1, 16383, 0, param0);
        this.field_h.a(vf.field_a, true);
        this.field_h.h(20837);
        this.field_h.r((byte) -79);
        this.field_h.F((byte) 74);
        this.field_h.a(1, pja.field_l, 7);
        this.field_h.a(1, (byte) -55, pja.field_l);
    }

    final static int b(int param0, int param1) {
        if (param0 != 21957) {
          return -115;
        }
        if (param1 >= 0 &&
          param1 <= 1) {
          return -param1 + 1;
        }
        return param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        oj var8 = this.field_h.A(11);
        oj var7 = this.field_h.H((byte) 124);
        param1 = param1 + this.field_m;
        param0 = param0 + this.field_l;
        this.field_o.a(jd.field_o, -28798);
        this.field_h.E((byte) 111);
        this.field_h.a(this.field_o, -123);
        this.field_h.c(121, param4);
        this.field_h.h(107, param2);
        this.field_h.a(1, pea.field_d, 7);
        this.field_h.a(1, (byte) -54, pea.field_d);
        this.field_h.e(-127, param3);
        var8.a(5557, (float)this.field_d, (float)this.field_n, 0.0f);
        var8.a(param1, 16383, 0, param0);
        var7.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)this.field_n, 117), 1.0f);
        this.field_h.a(vf.field_a, true);
        this.field_h.h(20837);
        this.field_h.r((byte) -72);
        this.field_h.F((byte) 85);
        this.field_h.a(1, pja.field_l, 7);
        this.field_h.a(1, (byte) -72, pja.field_l);
    }

    final int c() {
        return this.field_f + (this.field_d + this.field_l);
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        oj var12;
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
        oj var27;
        eb stackIn_4_0 = null;
        tu stackIn_5_1 = null;
        var27 = this.field_h.A(11);
        var12 = this.field_h.H((byte) 81);
        stackIn_4_0 = this.field_o;
        if (!this.field_j &&
          !this.field_i &&
          (param9 & 1) != 0) {
          stackIn_5_1 = cs.field_a;
        } else {
          stackIn_5_1 = jd.field_o;
        }
        ((eb) (Object) stackIn_4_0).a(stackIn_5_1, -28798);
        this.field_h.E((byte) 111);
        this.field_h.a(this.field_o, -122);
        this.field_h.c(54, param8);
        this.field_h.h(13, param6);
        this.field_h.a(1, pea.field_d, 7);
        this.field_h.a(1, (byte) -121, pea.field_d);
        this.field_h.e(-126, param7);
        if (this.field_k) {
          var13 = (float)this.c();
          var14 = (float)this.b();
          var15 = (-param0 + param2) / var13;
          var16 = (param3 - param1) / var13;
          var17 = (-param0 + param4) / var14;
          var18 = (-param1 + param5) / var14;
          var19 = var17 * (float)this.field_m;
          var20 = var18 * (float)this.field_m;
          var21 = (float)this.field_l * var15;
          var22 = var16 * (float)this.field_l;
          var23 = (float)this.field_f * -var15;
          var24 = (float)this.field_f * -var16;
          var25 = (float)this.field_g * -var17;
          param1 = var20 + (var22 + param1);
          param2 = param2 + var23 + var19;
          param3 = var24 + param3 + var20;
          param4 = var21 + param4 + var25;
          var26 = -var18 * (float)this.field_g;
          param0 = var19 + (var21 + param0);
          param5 = var26 + (param5 + var22);
        }
        var27.a(0.0f, 0.0f, (byte) 101, param2 - param0, 0.0f, 0.0f, -param1 + param5, param3 - param1, 1.0f, -param0 + param4);
        var27.a(0.0f, param0, param1, (byte) 13);
        var12.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)this.field_n, 110), 1.0f);
        this.field_h.a(vf.field_a, true);
        this.field_h.h(20837);
        this.field_h.r((byte) -102);
        this.field_h.F((byte) 72);
        this.field_h.a(1, pja.field_l, 7);
        this.field_h.a(1, (byte) -123, pja.field_l);
    }

    final int a() {
        return this.field_n;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        oj var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        int var20;
        int var22;
        oj var23;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int var21;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var22 = VoidHunters.field_G;
        var23 = this.field_h.A(11);
        var9 = this.field_h.H((byte) -122);
        this.field_o.a(jd.field_o, -28798);
        this.field_h.E((byte) 111);
        this.field_h.a(this.field_o, -119);
        this.field_h.c(75, param6);
        this.field_h.h(-124, param4);
        this.field_h.a(1, pea.field_d, 7);
        this.field_h.a(1, (byte) -98, pea.field_d);
        this.field_h.e(-123, param5);
        if (this.field_a &&
          0 == this.field_m &&
          this.field_g == 0) {
          stackIn_5_0 = 1;
        } else {
          stackIn_5_0 = 0;
        }
        var10 = stackIn_5_0;
        if (this.field_b &&
          this.field_l == 0 &&
          this.field_f == 0) {
          stackIn_10_0 = 1;
        } else {
          stackIn_10_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var11 = stackIn_10_0;
        if ((var11 & var10) == 0) {
          if (var11 != 0) {
            var12 = param3 + param1;
            var13 = this.b();
            var9.a(5557, this.field_o.a((float)param2, -1080), this.field_o.b((float)this.field_n, 91), 1.0f);
            this.field_h.a(vf.field_a, true);
            var14 = param1 + this.field_m;
            for (var15 = var14 + this.field_n; var15 <= var12; var15 = var15 + var13) {
              var23.a(5557, (float)param2, (float)this.field_n, 0.0f);
              var23.a(var14, 16383, 0, param0);
              this.field_h.h(20837);
              this.field_h.r((byte) -87);
              var14 = var14 + var13;
            }
            if (var12 > var14) {
              var16 = var12 - var14;
              var9.a(5557, this.field_o.a((float)param2, -1080), this.field_o.b((float)var16, 90), 1.0f);
              this.field_h.a(vf.field_a, true);
              var23.a(5557, (float)param2, (float)var16, 0.0f);
              var23.a(var14, 16383, 0, param0);
              this.field_h.h(20837);
              this.field_h.r((byte) -81);
            }
          } else if (var10 != 0) {
            var12 = param2 + param0;
            var13 = this.c();
            var9.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)param3, 75), 1.0f);
            this.field_h.a(vf.field_a, true);
            var14 = this.field_l + param0;
            var15 = this.field_d + var14;
            while (var12 >= var15) {
              var23.a(5557, (float)this.field_d, (float)param3, 0.0f);
              var23.a(param1, 16383, 0, var14);
              this.field_h.h(20837);
              this.field_h.r((byte) -91);
              var15 = var15 + var13;
              var14 = var14 + var13;
            }
            if (var12 > var14) {
              var16 = -var14 + var12;
              var9.a(5557, this.field_o.a((float)var16, -1080), this.field_o.b((float)param3, 121), 1.0f);
              this.field_h.a(vf.field_a, true);
              var23.a(5557, (float)var16, (float)param3, 0.0f);
              var23.a(param1, 16383, 0, var14);
              this.field_h.h(20837);
              this.field_h.r((byte) -89);
            }
          } else {
            var12 = param1 + param3;
            var13 = param2 + param0;
            var14 = this.c();
            var15 = this.b();
            var16 = this.field_m + param1;
            for (var17 = this.field_n + var16; var17 <= var12; var17 = var17 + var15) {
              var9.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)this.field_n, 107), 1.0f);
              this.field_h.a(vf.field_a, true);
              var18 = param0 + this.field_l;
              var19 = this.field_d + var18;
              while (var19 <= var13) {
                var23.a(5557, (float)this.field_d, (float)this.field_n, 0.0f);
                var23.a(var16, 16383, 0, var18);
                this.field_h.h(20837);
                var19 = var19 + var14;
                var18 = var18 + var14;
                this.field_h.r((byte) -82);
              }
              if (var13 > var18) {
                var20 = -var18 + var13;
                var9.a(5557, this.field_o.a((float)var20, -1080), this.field_o.b((float)this.field_n, 78), 1.0f);
                this.field_h.a(vf.field_a, true);
                var23.a(5557, (float)var20, (float)this.field_n, 0.0f);
                var23.a(var16, 16383, 0, var18);
                this.field_h.h(20837);
                this.field_h.r((byte) -90);
              }
              var16 = var16 + var15;
            }
            if (var12 > var16) {
              var18Lifetime1 = -var16 + var12;
              var9.a(5557, this.field_o.a((float)this.field_d, -1080), this.field_o.b((float)var18Lifetime1, 104), 1.0f);
              this.field_h.a(vf.field_a, true);
              var19Lifetime1 = this.field_l + param0;
              for (var20Lifetime1 = var19Lifetime1 + this.field_d; var13 >= var20Lifetime1; var20Lifetime1 = var20Lifetime1 + var14) {
                var23.a(5557, (float)this.field_d, (float)var18Lifetime1, 0.0f);
                var23.a(var16, 16383, 0, var19Lifetime1);
                this.field_h.h(20837);
                var19Lifetime1 = var19Lifetime1 + var14;
                this.field_h.r((byte) -109);
              }
              if (var13 <= var19Lifetime1) {
                this.field_h.F((byte) 125);
                this.field_h.a(1, pja.field_l, 7);
                this.field_h.a(1, (byte) -101, pja.field_l);
                decompiledFrameRemainder0 = false;
              }
              else {
                var21 = -var19Lifetime1 + var13;
                var9.a(5557, this.field_o.a((float)var21, -1080), this.field_o.b((float)var18Lifetime1, 92), 1.0f);
                this.field_h.a(vf.field_a, true);
                var23.a(5557, (float)var21, (float)var18Lifetime1, 0.0f);
                var23.a(var16, 16383, 0, var19Lifetime1);
                this.field_h.h(20837);
                this.field_h.r((byte) -80);
              }
            }
          }
        } else {
          var9.a(5557, this.field_o.a((float)param2, -1080), this.field_o.b((float)param3, 88), 1.0f);
          var23.a(5557, (float)param2, (float)param3, 0.0f);
          var23.a(param1, 16383, 0, param0);
          this.field_h.a(vf.field_a, true);
          this.field_h.h(20837);
          this.field_h.r((byte) -66);
        }
        if (decompiledFrameRemainder0) {
          this.field_h.F((byte) 125);
          this.field_h.a(1, pja.field_l, 7);
          this.field_h.a(1, (byte) -101, pja.field_l);
        }

    }

    final static void a(byte param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.field_e = var2.field_e + 1;
        int var3 = var2.field_e;
        if (param0 <= 93) {
          field_c = (dja) null;
        }
        var2.c(0, 2);
        var2.a(0, ce.field_o, -1, ce.field_o.length);
        var2.c(0, imb.field_a);
        var2.c(0, qd.field_d);
        var2.a(0, nkb.field_p, -1, nkb.field_p.length);
        var2.e(-var3 + var2.field_e, -129);
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_7_1 = false;
        this.field_m = param1;
        this.field_l = param0;
        this.field_g = param3;
        this.field_f = param2;
        stackIn_7_1 = (this.field_l != 0) || (0 != this.field_m) || (0 != this.field_f) || (this.field_g != 0);
        this.field_k = stackIn_7_1;
    }

    final int d() {
        return this.field_d;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.field_o.a(param1, param3, param2, param5, param6, param4, param0, (byte) -101);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "mjb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    mjb(pf param0, int param1, int param2, boolean param3) {
        Object stackIn_3_0;
        pf stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        kb stackIn_4_5 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_m = 0;
        this.field_k = false;
        this.field_f = 0;
        this.field_l = 0;
        this.field_g = 0;
        try {
          this.field_n = param2;
          this.field_d = param1;
          this.field_h = param0;
          stackIn_3_0 = this;
          stackIn_3_1 = (pf) (param0);
          stackIn_3_2 = 118;
          stackIn_3_3 = param1;
          stackIn_3_4 = param2;
          if (param3) {
            stackIn_4_5 = qua.field_d;
          } else {
            stackIn_4_5 = ep.field_o;
          }
          this.field_o = ((pf) (Object) stackIn_3_1).a(stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5, mj.field_f);
          this.field_o.a(true, (byte) -98, true);
          stackIn_7_1 = (~param1 != ~this.field_o.b((byte) 113));
          this.field_j = stackIn_7_1;
          stackIn_10_1 = (param2 != this.field_o.a((byte) -55));
          this.field_i = stackIn_10_1;
          stackIn_14_1 = (!this.field_j) && (this.field_o.a(-127));
          this.field_b = stackIn_14_1;
          stackIn_18_1 = (!this.field_i) && (this.field_o.a(36));
          this.field_a = stackIn_18_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("mjb.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    mjb(pf param0, int param1, int param2, int[] param3, int param4, int param5) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_11_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_m = 0;
        this.field_k = false;
        this.field_f = 0;
        this.field_l = 0;
        this.field_g = 0;
        try {
          this.field_n = param2;
          this.field_d = param1;
          this.field_h = param0;
          this.field_o = param0.a(param1, false, param3, param2, param5, true, param4);
          this.field_o.a(true, (byte) -98, true);
          stackIn_4_1 = (param1 != this.field_o.b((byte) 113));
          this.field_j = stackIn_4_1;
          stackIn_7_1 = (~this.field_o.a((byte) -57) != ~param2);
          this.field_i = stackIn_7_1;
          stackIn_11_1 = (!this.field_j) && (this.field_o.a(-13));
          this.field_b = stackIn_11_1;
          stackIn_15_1 = (!this.field_i) && (this.field_o.a(-128));
          this.field_a = stackIn_15_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("mjb.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_e = false;
        field_c = (dja) ((Object) new ada());
    }
}
