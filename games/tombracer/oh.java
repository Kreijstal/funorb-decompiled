/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends nv {
    private int field_r;
    static int field_o;
    private int field_s;
    private int field_p;
    private boolean field_q;
    private String[] field_n;
    private int field_u;
    private int field_t;

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -128, this.field_t >> 16, 10);
          param1.a((byte) -126, this.field_p / 50, 6);
          param1.a((byte) 1, this.field_s / 50, 6);
          param1.a((byte) 105, !this.field_q ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, fna[] param1) {
        dea var7 = null;
        fna[] var3 = null;
        int var4 = 0;
        fna var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param1[0].field_c;
          dea var2 = var7;
          if (param0 != -91) {
            oh.b(-52);
          }
          var3 = param1;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var5.field_c = var7;
            var5.field_a = true;
          }
          param1[0].field_a = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oh.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return -29;
        }
        return 23;
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          this.field_n = fda.field_a;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oh.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
          this.field_p = 75;
          return param0;
        }
        return param0;
    }

    final static jea b(int param0) {
        if (param0 != 19845) {
          return (jea) null;
        }
        return bsa.field_j.field_tb;
    }

    oh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = 0;
        this.field_p = 50;
        this.field_u = 0;
        this.field_s = 50;
        this.field_q = true;
        this.field_t = 8388608;
        try {
          this.field_t = param1.b((byte) 44, 10) << 16;
          this.field_p = param1.b((byte) 44, 6) * 50;
          this.field_s = param1.b((byte) 44, 6) * 50;
          this.field_q = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        hca var9 = null;
        hr var10 = null;
        hca var11 = null;
        hr var12 = null;
        hr var14 = null;
        hr var13 = null;
        hca var15 = null;
        hr var16 = null;
        hr var20 = null;
        hr var18 = null;
        hr var22 = null;
        hr var24 = null;
        int var7 = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime4;
        int var7Lifetime5;
        int var4Lifetime3;
        int var5Lifetime3;
        int var6Lifetime3;
        int var7Lifetime1Lifetime1;
        if (null == this.field_n ||
          0 == this.field_n.length) {
          return;
        }
        if (0 >= this.field_p) {
          var2 = this.field_t >> 16;
          if (param0 != 5418) {
            this.a(-91, 115);
            var2 = var2 * var2;
            var9 = this.m((byte) 19);
            var4 = this.field_g.d(3) - var9.d(param0 ^ 5417) >> 16;
            var5 = this.field_g.e(9648) - var9.e(9648) >> 16;
            var6 = var4 * var4 + var5 * var5;
            if (var2 > var6) {
              if (this.field_q) {
                var7 = this.o((byte) 46).a(this.field_n.length, 0);
              } else {
                var7 = this.field_u;
                this.field_u = this.field_u + 1;
                if (this.field_n.length <= this.field_u) {
                  this.field_u = 0;
                }
              }
              var10 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
              var10.a(false, 8388608, 0, 8388608, this.field_s);
              var10.a(0, 16777215, this.field_n[var7]);
              var10.a(65536, 0, -101, 0);
              this.field_r = this.field_p;
            }
            return;
          }
          var2 = var2 * var2;
          var11 = this.m((byte) 19);
          var4Lifetime3 = this.field_g.d(3) - var11.d(param0 ^ 5417) >> 16;
          var5Lifetime3 = this.field_g.e(9648) - var11.e(9648) >> 16;
          var6Lifetime3 = var4Lifetime3 * var4Lifetime3 + var5Lifetime3 * var5Lifetime3;
          if (var2 <= var6Lifetime3) {
            return;
          }
          if (this.field_q) {
            var7Lifetime4 = this.o((byte) 46).a(this.field_n.length, 0);
            var12 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
            var12.a(false, 8388608, 0, 8388608, this.field_s);
            var12.a(0, 16777215, this.field_n[var7Lifetime4]);
            var12.a(65536, 0, -101, 0);
            this.field_r = this.field_p;
            return;
          }
          var7Lifetime5 = this.field_u;
          this.field_u = this.field_u + 1;
          if (this.field_n.length <= this.field_u) {
            this.field_u = 0;
            var14 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
            var14.a(false, 8388608, 0, 8388608, this.field_s);
            var14.a(0, 16777215, this.field_n[var7Lifetime5]);
            var14.a(65536, 0, -101, 0);
            this.field_r = this.field_p;
            return;
          }
          var13 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
          var13.a(false, 8388608, 0, 8388608, this.field_s);
          var13.a(0, 16777215, this.field_n[var7Lifetime5]);
          var13.a(65536, 0, -101, 0);
          this.field_r = this.field_p;
          return;
        }
        if (this.field_r > 0) {
          this.field_r = this.field_r - 1;
          return;
        }
        var2Lifetime1 = this.field_t >> 16;
        if (param0 != 5418) {
          this.a(-91, 115);
          var2Lifetime1 = var2Lifetime1 * var2Lifetime1;
          var15 = this.m((byte) 19);
          var4Lifetime1 = this.field_g.d(3) - var15.d(param0 ^ 5417) >> 16;
          var5Lifetime1 = this.field_g.e(9648) - var15.e(9648) >> 16;
          var6Lifetime1 = var4Lifetime1 * var4Lifetime1 + var5Lifetime1 * var5Lifetime1;
          if (var2Lifetime1 <= var6Lifetime1) {
            return;
          }
          if (this.field_q) {
            var7Lifetime1 = this.o((byte) 46).a(this.field_n.length, 0);
            var16 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
            var16.a(false, 8388608, 0, 8388608, this.field_s);
            var16.a(0, 16777215, this.field_n[var7Lifetime1]);
            var16.a(65536, 0, -101, 0);
            this.field_r = this.field_p;
            return;
          }
          var7Lifetime1Lifetime1 = this.field_u;
          this.field_u = this.field_u + 1;
          if (this.field_n.length <= this.field_u) {
            this.field_u = 0;
            var20 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
            var20.a(false, 8388608, 0, 8388608, this.field_s);
            var20.a(0, 16777215, this.field_n[var7Lifetime1Lifetime1]);
            var20.a(65536, 0, -101, 0);
            this.field_r = this.field_p;
            return;
          }
          var18 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
          var18.a(false, 8388608, 0, 8388608, this.field_s);
          var18.a(0, 16777215, this.field_n[var7Lifetime1Lifetime1]);
          var18.a(65536, 0, -101, 0);
          this.field_r = this.field_p;
          return;
        }
        var2Lifetime1 = var2Lifetime1 * var2Lifetime1;
        hca var21 = this.m((byte) 19);
        var4Lifetime2 = this.field_g.d(3) - var21.d(param0 ^ 5417) >> 16;
        var5Lifetime2 = this.field_g.e(9648) - var21.e(9648) >> 16;
        var6Lifetime2 = var4Lifetime2 * var4Lifetime2 + var5Lifetime2 * var5Lifetime2;
        if (var2Lifetime1 <= var6Lifetime2) {
          return;
        }
        if (this.field_q) {
          var7Lifetime2 = this.o((byte) 46).a(this.field_n.length, 0);
          var22 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
          var22.a(false, 8388608, 0, 8388608, this.field_s);
          var22.a(0, 16777215, this.field_n[var7Lifetime2]);
          var22.a(65536, 0, -101, 0);
          this.field_r = this.field_p;
          return;
        }
        var7Lifetime3 = this.field_u;
        this.field_u = this.field_u + 1;
        if (this.field_n.length <= this.field_u) {
          this.field_u = 0;
          var24 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
          var24.a(false, 8388608, 0, 8388608, this.field_s);
          var24.a(0, 16777215, this.field_n[var7Lifetime3]);
          var24.a(65536, 0, -101, 0);
          this.field_r = this.field_p;
          return;
        }
        hr var23 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
        var23.a(false, 8388608, 0, 8388608, this.field_s);
        var23.a(0, 16777215, this.field_n[var7Lifetime3]);
        var23.a(65536, 0, -101, 0);
        this.field_r = this.field_p;
    }

    static {
        field_o = 0;
    }
}
