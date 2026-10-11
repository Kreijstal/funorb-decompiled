/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    private bf[] field_l;
    private int field_c;
    private int field_e;
    private int field_d;
    static String field_i;
    static boolean field_f;
    private int field_k;
    static String field_j;
    private int field_a;
    private int field_h;
    private dd field_m;
    private int field_g;
    static fm field_n;
    private int field_o;
    private int field_b;

    final static void a(int param0, sb param1, int param2, int param3) {
        try {
          we.field_n = param3;
          he.field_a = param1;
          gh.field_t = param0;
          if (param2 != 16) {
            sb var5 = (sb) null;
            pb.a(-25, (sb) null, 81, -121);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pb.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0) {
        if (param0 == -18577) {
          this.field_e = this.b((byte) -37);
          return;
        }
        this.a((byte) -44);
        this.field_e = this.b((byte) -37);
    }

    final static void a(int param0, tf[] param1) {
        RuntimeException var2 = null;
        sb var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wg.field_g = param1;
          if (null != wg.field_g &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          if (param0 == -25960) {
            return;
          }
          var3 = (sb) null;
          pb.a(-62, (sb) null, 98, 74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("pb.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (0 - ub.field_a == ga.field_f) {
          if (param0 > 122) {
            ga.field_f = ga.field_f + 1;
            return;
          }
          return;
        }
        if (ga.field_f != 250 - ub.field_a) {
          if (param0 > 122) {
            ga.field_f = ga.field_f + 1;
            return;
          }
          return;
        }
        if (param0 > 122) {
          ga.field_f = ga.field_f + 1;
          return;
        }
    }

    public static void c(int param0) {
        if (param0 == 0) {
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        }
        sb var2 = (sb) null;
        pb.a(-41, (sb) null, 24, 65);
        field_n = null;
        field_j = null;
        field_i = null;
    }

    final boolean a(byte param0) {
        int var2 = -37 % ((param0 + 10) / 55);
        return 0 == this.field_c ? true : false;
    }

    private final int b(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -37) {
          this.field_m = (dd) null;
          var2 = this.field_m.field_d;
          if (!(this.field_m.field_d < this.field_m.field_l.length)) {
            return this.field_o - (100 * var2 + 100);
          }
          return this.field_o - var2 * 100;
        }
        var2Lifetime1 = this.field_m.field_d;
        if (!(this.field_m.field_d < this.field_m.field_l.length)) {
          return this.field_o - (100 * var2Lifetime1 + 100);
        }
        return this.field_o - var2Lifetime1 * 100;
    }

    private final int a(boolean param0, int param1) {
        if (param1 > this.field_o) {
          param1 = 2 * this.field_o - param1;
        }
        int var3 = 512 * (param1 - this.field_o + 100) / 100;
        if (param0) {
          tf[] var4 = (tf[]) null;
          pb.a(31, (tf[]) null);
          if (var3 > 256) {
            return 256;
          }
          return var3;
        }
        if (var3 > 256) {
          return 256;
        }
        return var3;
    }

    final void c(byte param0) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = Pixelate.field_H ? 1 : 0;
        var2 = jc.field_d ? 1 : 0;
        t.a(uf.field_b);
        if (var2 == 0) {
          t.f(0, -100 + this.field_o, 640, this.field_o + 100);
        }
        for (var7 = 0; this.field_m.field_l.length > var7; var7++) {
          var8 = var7;
          if (var8 < 0) {
            var8 = var8 + this.field_l.length;
          }
          if (var8 >= this.field_l.length) {
            var8 = var8 - this.field_l.length;
          }
          var9 = -(gb.field_b.field_A >> 1) + this.field_k;
          var10 = this.field_e + 100 * var7 - 50;
          if (var2 != 0) {
            var3 = this.a(false, var10);
            var4 = this.a(false, 100 + var10);
            if (var3 > 0 ||
              var4 > 0) {
              fi.a(gb.field_b, var9, var10, var3 >> 1, var4 >> 1);
              var5 = this.a(false, var10 + this.field_a);
              var6 = this.a(false, this.field_g + (var10 + this.field_a));
              this.field_l[var8].a(0, this.field_h + var9, var6, this.field_a + var10, var5);
            }
            if (var7 == 0) {
              if (var3 > 0) {
                wh.field_q.a(var9, var10 - wh.field_q.field_B, var3 >> 1);
              }
              if (this.field_l.length - 1 == var7 &&
                var4 > 0) {
                of.field_h.a(var9, 100 + var10, var4 >> 1);
              }
            } else {
              if (this.field_l.length - 1 == var7 &&
                var4 > 0) {
                of.field_h.a(var9, 100 + var10, var4 >> 1);
              }
            }
          } else {
            gb.field_b.a(var9, var10, 128);
            this.field_l[var8].b(this.field_h + var9, var10 + this.field_a, (byte) -106);
            if (0 == var7) {
              wh.field_q.a(var9, var10 - wh.field_q.field_B, 128);
            }
            if (this.field_l.length - 1 == var7) {
              of.field_h.a(var9, var10 + 100, 128);
            }
          }
        }
        if (param0 <= 43) {
          this.field_h = -119;
        }
        t.b(uf.field_b);
    }

    final void d(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -16888) {
          pb.c(-121);
          var2 = this.b((byte) -37);
          if (this.field_c > 0) {
            this.field_c = this.field_c - 1;
            this.field_e = this.field_b * this.field_c * this.field_c / 900 + var2;
            return;
          }
          if (this.field_e > var2) {
            this.field_c = 30;
            this.field_b = -var2 + this.field_e;
          }
          if (var2 > this.field_e) {
            this.field_e = 100;
            this.field_b = 100;
            this.field_c = 30;
            return;
          }
          return;
        }
        var2Lifetime1 = this.b((byte) -37);
        if (this.field_c > 0) {
          this.field_c = this.field_c - 1;
          this.field_e = this.field_b * this.field_c * this.field_c / 900 + var2Lifetime1;
          return;
        }
        if (this.field_e > var2Lifetime1) {
          this.field_c = 30;
          this.field_b = -var2Lifetime1 + this.field_e;
        }
        if (var2Lifetime1 <= this.field_e) {
          return;
        }
        this.field_e = 100;
        this.field_b = 100;
        this.field_c = 30;
    }

    pb(dd param0, int param1, int param2) {
        hh[] var7 = null;
        int var5 = 0;
        try {
          this.field_o = param2;
          this.field_m = param0;
          var7 = this.field_m.field_l;
          hh[] var4 = var7;
          this.field_g = var7[0].field_d * 16;
          this.field_d = 16 * var7[0].field_g;
          this.field_a = -this.field_g + gb.field_b.field_B >> 1;
          this.field_h = gb.field_b.field_A - this.field_d >> 1;
          this.field_l = new bf[var7.length];
          for (var5 = 0; var7.length > var5; var5++) {
            this.field_l[var5] = new bf(var7[var5]);
          }
          this.field_e = 200 + this.field_o;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Passwords must be between 5 and 20 letters and numbers";
    }
}
