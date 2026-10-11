/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends nv {
    static int field_p;
    private fsa field_r;
    private int field_v;
    private fsa field_A;
    private int field_s;
    private fsa field_o;
    private int field_q;
    private int field_y;
    private boolean field_u;
    private int field_x;
    static boolean field_n;
    private int field_t;
    private hj field_z;
    private int field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var16 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_u) {
            return false;
          }
          if (null == this.field_z) {
            return false;
          }
          var8_int = this.field_g.d(3) - this.field_g.c(-29) / 2;
          var9 = this.field_g.e(9648) - this.field_g.a((byte) 55) / 2;
          param3 = param3 - (this.field_y + param1 / 2);
          param4 = param4 - (this.field_w + param0 / 2);
          var10 = -var8_int + param3;
          var11 = param1 + (param3 - var8_int);
          var12 = -var9 + param4;
          var13 = -var9 + (param4 + param0);
          if (0 > var10) {
            var10 = var10 - (this.field_t - 1);
          }
          if (var12 < 0) {
            var12 = var12 - (this.field_t - 1);
          }
          if (var11 < 0) {
            var11 = var11 - (this.field_t - 1);
          }
          var12 = var12 / this.field_t;
          var10 = var10 / this.field_t;
          if (0 > var13) {
            var13 = var13 - (-1 + this.field_t);
          }
          var11 = var11 / this.field_t;
          var13 = var13 / this.field_t;
          var10 = za.$cfr$intArgs$a$c604db63f465(0, 113, this.field_z.field_f - param2, var10);
          var11 = za.$cfr$intArgs$a$c604db63f465(0, 99, this.field_z.field_f - 1, var11);
          for (var14 = var10; var11 >= var14; var14++) {
            for (var15 = var12; var13 >= var15; var15++) {
              if (this.field_z.a(var14, var15, (byte) -128) &&
                this.field_z.b((byte) -5, var15, var14) > 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_33_0 = var8;
          stackIn_33_1 = new StringBuilder().append("vd.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          if (this.b(true).field_E < 4) {
            param1.h(4, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vd.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        if (param1 < 0) {
          param1 = -param1;
        }
        int var2 = 0;
        if (param1 > 65535) {
          var2 = var2 | 16;
          param1 = param1 >>> 16;
        }
        if (param1 > 255) {
          param1 = param1 >>> 8;
          var2 = var2 | 8;
        }
        if (param1 > 15) {
          var2 = var2 | 4;
          param1 = param1 >>> 4;
        }
        if (param1 > 3) {
          var2 = var2 | 2;
          param1 = param1 >>> 2;
        }
        if (param1 > param0) {
          var2 = var2 | 1;
          param1 = param1 >>> 1;
        }
        return var2;
    }

    final void a(fsa param0, byte param1) {
        try {
          this.field_r = param0;
          int var3_int = -100 % ((param1 + 10) / 56);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vd.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(fsa param0, int param1) {
        if (param1 != 2) {
          return;
        }
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vd.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_t = 114;
        }
        return 11;
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, pc param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = 16;
          if (param0) {
            return false;
          }
          var8 = hm.a(param4.field_a, (byte) -15, param2, param2 + param5, param1 + param3, var7_int, param4.field_e, param4.field_k, param4.field_d, param3);
          if (var8 <= 0) {
            return false;
          }
          var9 = wm.a(1 << var7_int, var8, -75);
          param4.a(var9, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("vd.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(pc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        pc var18 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.field_g.d(param1 + 4) - this.field_g.c(param1 - 54) / 2;
          var4 = this.field_g.e(9648) - this.field_g.a((byte) 55) / 2;
          var5 = -this.field_y + (-var3_int + param0.field_d);
          var6 = param0.field_e - var3_int - this.field_y;
          var7 = param0.field_k - (this.field_w + var4);
          var8 = param0.field_a - this.field_w - var4;
          if (param1 != -1) {
            var18 = (pc) null;
            this.a(10, -109, (pc) null, 116);
          }
          var9 = new nf();
          var9.a(var6, var7, this.field_z.field_a, this.field_t, var5, 0, this.field_z.field_f, var8);
          while (!var9.field_d) {
            var10 = var9.b((byte) 75);
            var11 = var9.b(2);
            if (this.field_z.b((byte) -5, var11, var10) > 0) {
              var12 = 16;
              var13 = this.field_t * var10;
              var14 = this.field_t * var11;
              var15 = hm.a(var8, (byte) -15, var13, this.field_t + var13, var14 + this.field_t, var12, var6, var7, var5, var14);
              if (var15 > 0) {
                var16 = wm.a(1 << var12, var15, -51);
                param0.a(var16, (byte) 47);
                return true;
              }
            }
            var9.d(param1 ^ -102);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vd.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
          this.field_x = 97;
        }
        this.field_v = param1;
    }

    private final void c(int param0) {
        int var18 = 0;
        int var19 = 0;
        qea var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        loa var12_ref_loa;
        int var12;
        int[][] var13_ref_int____;
        int var13;
        int var14;
        Object var15;
        Object var16;
        Object var17;
        int var20;
        int var21;
        int var22;
        av var23;
        int[][] var24;
        la var25;
        kh var26;
        kh var27;
        kh var28;
        int[][] var31;
        int[][] var36;
        int[][] var37;
        int var20Lifetime1;
        var22 = TombRacer.field_G ? 1 : 0;
        if (this.field_g == null) {
          return;
        }
        var25 = this.b(true);
        var3 = this.o((byte) 46);
        var4 = this.field_g.c(-34) / this.field_t;
        var5 = this.field_g.a((byte) 55) / this.field_t;
        if (var4 / 2 * 2 == var4) {
          var4--;
        }
        if (var5 == 2 * (var5 / 2)) {
          var5--;
        }
        if (this.field_u &&
          this.field_t * var4 <= this.field_g.c(-109) - 2097152) {
          var4 += 2;
        }
        var6 = var4 / 2;
        var7 = -2 + var5;
        if (var6 == 2 * (var6 / 2)) {
          if (this.b(true).h((byte) -77)) {
            var6++;
          } else {
            var6--;
          }
        }
        var8 = 1;
        if (param0 <= 123) {
          return;
        }
        if (var4 < 3) {
          return;
        }
        if (var5 < 3) {
          return;
        }
        var9 = 0;
        var10 = 0;
        var11 = null;
        while (var9 == 0) {
          var12_ref_loa = lba.a((byte) 27, var3, this.field_s);
          this.field_z = var12_ref_loa.a(var5, var6, var4, -122, var8);
          this.field_z.a(1 + var7, 0, 0, var6);
          this.field_z.a(0, 0, 0, var6);
          var23 = new av(this.field_z);
          var11 = var23;
          var23.a(var7 + 1, 0, var6, 124, var6);
          var31 = var23.b((byte) 125);
          var24 = var31;
          var13_ref_int____ = var24;
          if (var13_ref_int____ != null) {
            if (var5 >= 5 &&
              5 <= var4 &&
              var5 >= var31.length) {
              var9 = 0;
            } else if ((0 == this.field_x ||
              var31.length >= -(var10 * 2) + this.field_x) && (0 == this.field_q ||
              var10 * 2 + this.field_q > var31.length)) {
              var9 = 1;
            }
            var10++;
            continue;
          }
          break;
        }
        this.field_y = (this.field_g.c(-30) - this.field_t * this.field_z.field_f) / 2;
        this.field_w = (this.field_g.a((byte) 55) - this.field_z.field_a * this.field_t) / 2;
        var12 = this.field_y - this.field_g.c(-12) / 2 + this.field_t / 2;
        var13 = this.field_w - this.field_g.a((byte) 55) / 2 + this.field_t / 2;
        if (this.field_u) {
          return;
        }
        var14 = var25.field_E;
        var25.field_E = 26;
        var15 = null;
        var16 = null;
        var17 = null;
        if (this.field_r != null &&
          !this.field_r.J(90)) {
          var26 = new kh(30000);
          var15 = var26;
          var26.i(8);
          this.field_r.a(var26, 125);
          var26.k(-1826190686);
        }
        if (null != this.field_A &&
          !this.field_A.J(51)) {
          var27 = new kh(30000);
          var16 = var27;
          var27.i(8);
          this.field_A.a(var27, 84);
          var27.k(-1826190686);
        }
        if (null != this.field_o &&
          !this.field_o.J(73)) {
          var28 = new kh(30000);
          var17 = var28;
          var28.i(8);
          this.field_o.a(var28, -112);
          var28.k(-1826190686);
        }
        for (var18 = 0; this.field_z.field_f > var18; var18++) {
          for (var19 = 0; this.field_z.field_a > var19; var19++) {
            if (this.field_z.b((byte) -5, var19, var18) > 0) {
              this.a(var18, var13, var19, -58, (kh) (var15), var12);
            } else {
              this.a(var18, var13, var19, -44, (kh) (var16), var12);
            }
          }
        }
        if (this.field_v > 0) {
          var36 = ((av) (var11)).a((byte) -72);
          var37 = new int[this.field_v][2];
          for (var20 = 0; var20 < this.field_v; var20++) {
            if (var36.length <= var20) {
              while (0 != this.field_z.b((byte) -5, var37[var20][1], var37[var20][0])) {
                var37[var20][0] = 1 + var3.a(-2 + this.field_z.field_f, 0);
                var37[var20][1] = 1 + var3.a(-2 + this.field_z.field_a, 0);
              }
            } else {
              var21 = var3.a(var36.length, 0);
              while (var36[var21][0] == -1) {
                var21++;
                if (var21 < var36.length) {
                  continue;
                }
                var21 = 0;
              }
              var37[var20][0] = var36[var21][0];
              var37[var20][1] = var36[var21][1];
              var36[var21][0] = -1;
            }
          }
          for (var20Lifetime1 = 0; this.field_v > var20Lifetime1; var20Lifetime1++) {
            this.a(var37[var20Lifetime1][0], var13, var37[var20Lifetime1][1], -113, (kh) (var17), var12);
          }
        }
        var25.field_E = var14;
        return;
    }

    vd(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = false;
        this.field_t = 2097152;
        try {
          this.field_r = new fsa(param0, false);
          wd.a((byte) -98, 1, true, param0, this.field_r, false);
          this.field_r.b(false, 11468);
          this.field_A = new fsa(param0, false);
          this.field_o = new fsa(param0, false);
          this.d(true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ffa var11 = null;
        int var5_intLifetime1;
        try {
          if (!this.field_u) {
            return false;
          }
          if (null == this.field_z) {
            return false;
          }
          var5_int = 0;
          if (0 < this.field_y) {
            var6 = this.field_g.d(3) - this.field_g.c(-49) / 2;
            var7 = this.field_g.e(9648) - (this.field_g.a((byte) 55) / 2 - this.field_w);
            var8 = this.field_t * this.field_z.field_f;
            var9 = this.field_z.field_a * this.field_t;
            var10 = this.field_y + var8;
            if (!this.a(false, var9, var6, var7, param2, this.field_y)) {
              stackIn_14_0 = (var5_int != 0) ? 1 : 0;
            } else {
              stackIn_14_0 = 1;
            }
            var5_int = stackIn_14_0;
            if (!this.a(false, var9, var10 + var6, var7, param2, this.field_g.c(-45) - var10)) {
              stackIn_20_0 = (var5_int != 0) ? 1 : 0;
            } else {
              stackIn_20_0 = 1;
            }
            var5_int = stackIn_20_0;
          }
          if (param1 != 1) {
            var11 = (ffa) null;
            this.a(-49, 56, -14, 110, -69, 19, (ffa) null);
          }
          if (this.a(param2, param1 ^ -2)) {
            stackIn_29_0 = 1;
          } else {
            stackIn_29_0 = (var5_int != 0) ? 1 : 0;
          }
          var5_intLifetime1 = stackIn_29_0;
          stackIn_30_0 = var5_intLifetime1;
          return stackIn_30_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("vd.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, kh param4, int param5) {
        fsa var8 = null;
        if (param4 == null) {
          return;
        }
        la var7 = this.b(true);
        param4.field_h = 0;
        if (param3 >= -41) {
          return;
        }
        try {
          param4.h((byte) 123);
          var8 = new fsa(var7, param4, true);
          param4.i((byte) 98);
          var8.d((byte) -97, true);
          var8.m(1, param5 + this.field_t * param0);
          var8.c(param1 + this.field_t * param2, -19879);
          this.field_g.a(-97, var8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vd.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    vd(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = false;
        this.field_t = 2097152;
        try {
          this.field_s = param1.b((byte) 44, 2);
          if (param0.field_E >= 4) {
            this.field_t = param1.b((byte) 44, 10) << 16;
            stackIn_6_1 = (1 == param1.b((byte) 44, 1));
            this.field_u = stackIn_6_1;
          } else {
            this.field_t = 2097152;
            this.field_u = true;
          }
          if (param0.field_E >= 11) {
            this.field_x = param1.b((byte) 44, 7);
            this.field_q = param1.b((byte) 44, 7);
            this.field_v = param1.b((byte) 44, 3);
          }
          this.field_o = null;
          if (this.field_u) {
            this.field_r = new fsa(param0, false);
            wd.a((byte) -120, 1, true, param0, this.field_r, false);
            this.field_A = new fsa(param0, false);
          } else {
            this.field_r = new fsa(param0, param1, false);
            this.field_A = new fsa(param0, param1, false);
            if (this.field_v > 0 &&
              14 <= param0.field_E) {
              this.field_o = new fsa(param0, param1, false);
            }
          }
          if (this.field_o == null) {
            this.field_o = new fsa(param0, false);
            wd.a((byte) -93, 7, true, param0, this.field_o, false);
            this.d(true);
          } else {
            this.d(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("vd.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(boolean param0) {
        if (1048576 > this.field_t) {
          this.field_t = 1048576;
        }
        this.field_r.c((byte) 77, false);
        this.field_r.b((byte) -11, this.field_t, this.field_t);
        this.field_A.c((byte) 59, false);
        this.field_A.b((byte) -11, this.field_t, this.field_t);
        if (!param0) {
          this.field_o = (fsa) null;
        }
    }

    final void a(byte param0, fsa param1) {
        if (param0 > -115) {
          return;
        }
        try {
          this.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_s = param1;
        if (param0) {
          this.n((byte) 51);
        }
    }

    final void h(int param0) {
        super.h(param0);
    }

    final void a(boolean param0, kh param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          param1.a((byte) -41, this.field_s, 2);
          param1.a((byte) 42, this.field_t >> 16, 10);
          stackIn_2_0 = (kh) (param1);
          stackIn_2_1 = 125;
          if (!this.field_u) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((kh) (Object) stackIn_2_0).a((byte) stackIn_2_1, stackIn_3_2, 1);
          param1.a((byte) -128, this.field_x, 7);
          param1.a((byte) 113, this.field_q, 7);
          param1.a((byte) -127, this.field_v, 3);
          if (!this.field_u) {
            this.field_r.a(param1, 85);
            this.field_A.a(param1, 126);
            if (this.field_v > 0) {
              this.field_o.a(param1, -10);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(byte param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (param0 < 60) {
          this.field_A = (fsa) null;
        }
    }

    final static void b(int param0) {
        if (!una.a((byte) 105)) {
          return;
        }
        qna.a(param0, false, 4);
    }

    final void k(int param0) {
        boolean discarded$0 = false;
        if (param0 != 5418) {
          pc var3 = (pc) null;
          discarded$0 = this.a(false, -81, 38, -44, (pc) null, -15);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          this.field_A = (fsa) null;
        }
        return param0;
    }

    final void n(byte param0) {
        super.n((byte) 105);
        this.c(127);
        if (param0 <= 68) {
          this.field_r = (fsa) null;
        }
    }

    static {
    }
}
