/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static int[] field_f;
    private int field_b;
    private int field_g;
    private boolean field_k;
    private int field_c;
    private int field_d;
    private int field_a;
    private gm field_i;
    int field_h;
    static String field_e;
    static String field_j;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        double var9;
        double var9Lifetime1;
        double var9Lifetime2;
        double var9Lifetime3;
        this.field_c = param2;
        this.field_k = false;
        var5 = ug.a(0, this.field_i.field_kb >> 16);
        var6 = lf.a((byte) -94, this.field_i.field_bb >> 16);
        if (param0 >= 10 &&
          param1 >= 10 &&
          630 >= param0 &&
          470 >= param1) {
          if (lb.a(var5, var6, 480)) {
            return;
          }
          this.field_a = -uv.b(-param1 + var6, -param0 + var5, (byte) 2);
          var7 = var5 - param0;
          var8 = -param1 + var6;
          this.field_g = de.a(var8 * var8 + var7 * var7, (byte) -88) * 100 >> 10;
          if (this.field_g > 100) {
            this.field_g = 100;
          }
          var9 = (double)param0 / (double)(param0 - var5);
          if (param3 > -1) {
            field_e = (String) null;
          }
          if (0.0 <= var9 &&
            var9 <= 1.0) {
            this.field_b = 0;
            this.field_d = (int)((double)(var6 - param1) * var9) + param1;
            if (this.field_d >= 0 &&
              this.field_d <= 480) {
              this.field_k = true;
              return;
            }
          }
          var9Lifetime1 = (double)(param0 - 640) / (double)(-var5 + param0);
          if (0.0 <= var9Lifetime1 &&
            1.0 >= var9Lifetime1) {
            this.field_b = 640;
            this.field_d = param1 + (int)(var9Lifetime1 * (double)(var6 - param1));
            if (0 <= this.field_d &&
              480 >= this.field_d) {
              this.field_k = true;
              return;
            }
          }
          var9Lifetime2 = (double)param1 / (double)(param1 - var6);
          if (0.0 <= var9Lifetime2 &&
            1.0 >= var9Lifetime2) {
            this.field_d = 0;
            this.field_b = (int)((double)(var5 - param0) * var9Lifetime2) + param0;
            if (this.field_b >= 0 &&
              this.field_b <= 640) {
              this.field_k = true;
              return;
            }
          }
          var9Lifetime3 = (double)(-480 + param1) / (double)(-var6 + param1);
          if (var9Lifetime3 >= 0.0 &&
            1.0 >= var9Lifetime3) {
            this.field_b = param0 + (int)((double)(var5 - param0) * var9Lifetime3);
            this.field_d = 480;
            if (this.field_b >= 0 &&
              this.field_b <= 640) {
              this.field_k = true;
              return;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = 74 % ((-20 - param0) / 60);
        field_j = null;
        field_e = null;
    }

    final static int b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (ks.field_e == 1) {
          var1 = et.field_d.field_P[0][1].a(true);
          var2 = 30 + (var1 - 1634 << 8) / -490;
          return Math.max(0, Math.min(256, 768 - var2 * 3));
        }
        if (param0 != -75) {
          dt.a(101);
        }
        return 0;
    }

    dt(gm param0, int param1) {
        this.field_k = false;
        try {
          this.field_h = param1;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ut var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = Kickabout.field_G;
        if (!this.field_k) {
        } else {
          var2 = this.field_g + 155;
          var3 = 1600 - (1200 * var2 >> 8);
          var4 = we.a(this.field_a, false) * 40 >> 17;
          var5 = ei.a(this.field_a, (byte) -23) * 40 >> 17;
          var6 = we.a(this.field_a - var3, false) * var2 * 40 >> 24;
          var7 = var2 * ei.a(-var3 + this.field_a, (byte) -23) * 40 >> 24;
          var8 = 40 * (var2 * we.a(var3 + this.field_a, false)) >> 24;
          var9 = 40 * var2 * ei.a(var3 + this.field_a, (byte) -23) >> 24;
          if (0 == tb.field_v) {
            t.c();
            t.b(this.field_b, this.field_d);
            t.a(this.field_d, var7 + this.field_d, this.field_d + var5, this.field_b, -var6 + this.field_b, -var4 + this.field_b, 4487082);
            t.a(this.field_d, var9 + this.field_d, this.field_d + var5, this.field_b, this.field_b - var8, -var4 + this.field_b, 85);
          } else {
            iw.a(param0 + 112, fd.field_e);
            on.b();
            t.c();
            t.a(ga.field_P, ga.field_P + (var7 << 1), (var5 << 1) + ga.field_P, ga.field_P, -(var6 << 1) + ga.field_P, ga.field_P - (var4 << 1), -16777216);
            t.a(ga.field_P, ga.field_P + (var9 << 1), (var5 << 1) + ga.field_P, ga.field_P, ga.field_P - (var8 << 1), -(var4 << 1) + ga.field_P, -16777216);
            ta.e(param0 + 116);
            iw.a(param0 ^ 68, ga.field_N);
            on.b();
            t.c();
            t.b(ga.field_P, ga.field_P);
            t.a(ga.field_P, ga.field_P + (var7 << 1), ga.field_P + (var5 << 1), ga.field_P, ga.field_P - (var6 << 1), -(var4 << 1) + ga.field_P, 153);
            on.a(-(3 * var4 >> 1) + ga.field_P << 4, ga.field_P + (3 * var5 >> 1) << 4, 544, 29, en.field_n);
            t.a(ga.field_P, (var9 << 1) + ga.field_P, ga.field_P + (var5 << 1), ga.field_P, -(var8 << 1) + ga.field_P, -(var4 << 1) + ga.field_P, 68);
            on.a(-(var4 * 3 >> 1) + ga.field_P << 4, ga.field_P + (3 * var5 >> 1) << 4, 544, 18, en.field_n);
            on.e(0, 0, on.field_g, on.field_f, 16711935);
            ta.e(param0 + 113);
            t.c();
            for (var10_int = 0; var10_int < ga.field_N.field_y.length; var10_int++) {
              ga.field_N.field_y[var10_int] = hf.a(ga.field_N.field_y[var10_int], fd.field_e.field_y[var10_int]);
            }
            ga.field_N.f(this.field_b - (ga.field_N.field_o >> 2), this.field_d - (ga.field_N.field_v >> 2));
          }
          if (-1 != this.field_c) {
            var10 = tm.field_n[this.field_c];
            var11 = var10.field_o << 1;
            var12 = var10.field_v << 1;
            var13 = -var10.field_o + (-(var4 << 1) + this.field_b);
            if (var13 < 10) {
              var13 = 10;
            }
            var14 = -var10.field_v + ((var5 << 1) + this.field_d);
            if (var13 + var11 > 630) {
              var13 = 640 - var11 - 10;
            }
            if (var14 < 10) {
              var14 = 10;
            }
            if (var14 + var12 > 470) {
              var14 = -var12 + 470;
            }
            var10.a(var13, var14, var11, var12);
          }
        }
        if (param0 != 10) {
          this.a((byte) -83);
        }
    }

    static {
        field_f = new int[]{1000, -1000, 60, 840};
        field_e = "Trinkets cannot be altered when a player is in an auction.";
        field_j = "Invalid password.";
    }
}
