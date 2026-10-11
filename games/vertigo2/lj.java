/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    wo[] field_l;
    int field_c;
    private boolean field_B;
    static String field_o;
    private boolean field_b;
    int field_t;
    static int field_p;
    int field_h;
    int field_f;
    int field_e;
    bh field_r;
    int field_j;
    int field_d;
    static String field_A;
    private int field_y;
    int field_u;
    static int field_k;
    private bh field_n;
    static ne field_m;
    String[] field_w;
    int field_i;
    boolean field_a;
    private int field_s;
    int field_z;
    private int field_v;
    private int field_x;
    int field_g;
    int field_q;

    final int b(int param0) {
        if (param0 != -6133) {
          this.a(9, 18);
        }
        return 53188834 ^ this.field_s;
    }

    final void a(int param0, boolean param1) {
        bh stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        int var3;
        int var4;
        int var5;
        wo var5_ref_wo;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var4Lifetime1;
        var12 = Vertigo2.field_L ? 1 : 0;
        var3 = this.b(-6133);
        if (param0 != 30113) {
          this.b((byte) 31);
        }
        if (!param1) {
          var3++;
          this.a(var3, 53188834);
        }
        if (this.c(param0 - 33430)) {
          return;
        }
        for (var4 = this.field_l.length - 1; var4 >= 0; var4--) {
          var5_ref_wo = this.field_l[var4];
          var5_ref_wo.d(false);
        }
        if (!this.field_B &&
          this.field_j != 2 &&
          0 == this.field_j &&
          var3 >= t.field_l) {
          var4Lifetime1 = df.field_k;
          var8 = var3;
          var9 = rg.field_f % 4;
          var10 = 4 * (var8 - t.field_l);
          if (var9 == 0) {
            var11 = var10 / 2;
            f.field_B = f.field_B + var11;
            hj.field_c = hj.field_c + (var10 - var11);
          } else {
            if (var9 == 1) {
              var11 = var10 / 3;
              f.field_B = f.field_B + (var10 - var11);
              hj.field_c = hj.field_c + var11;
            } else {
              if (2 == var9) {
                f.field_B = f.field_B + var10;
              } else {
                if (var9 == 3) {
                  hj.field_c = hj.field_c + var10;
                }
              }
            }
          }
          t.field_l = var8;
          var5 = f.field_B;
          var6 = hj.field_c;
          var7 = ca.field_g;
          oh.field_D.a(new ub(this.field_j, var3, var4Lifetime1, var5, var6, var7), false);
        }
        this.field_r.a((byte) -31, var3, kn.field_h[this.field_j][var3]);
        stackIn_28_0 = this.field_r;
        stackIn_29_1 = (this.field_j == 0) && (var3 == 49);
        stackIn_28_0.field_m = stackIn_29_1;
        if (null == this.field_n) {
          this.field_n = this.c((byte) -116);
        }
        this.field_n.a(false, this.field_r);
        return;
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -3317) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.b(param0 ^ 6912) < kn.field_h[this.field_j].length && (this.field_j == 0 ||
          this.field_c > this.field_v)) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final void a(mi param0, byte param1) {
        try {
          this.field_r.a(param0, 0);
          if (param1 <= 66) {
            this.field_r = (bh) null;
          }
          this.field_r.i(-10);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "lj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        if (param0 > -9) {
          return -5;
        }
        if (this.field_y == 0) {
          return this.field_l[0].g((byte) 121);
        }
        if (this.field_y == 1) {
          return this.field_l[1].g((byte) 121);
        }
        return 0;
    }

    final static void a(byte param0) {
        e.a(12899, hb.field_D, ji.field_s, ee.field_b, ua.field_c);
        if (param0 >= -114) {
          lj.d(80);
        }
    }

    final int b(byte param0) {
        if (param0 <= 105) {
          this.field_i = -107;
        }
        return this.field_x;
    }

    final void a(byte param0, int param1) {
        this.field_x = param1;
        int var3 = 15 % ((78 - param0) / 35);
        this.field_a = true;
    }

    final void e(int param0) {
        if (~this.field_j != param0) {
          return;
        }
        this.field_b = true;
    }

    public static void d(int param0) {
        field_o = null;
        if (param0 != 1) {
          return;
        }
        field_m = null;
        field_A = null;
    }

    private final void a(int param0, int param1) {
        this.field_s = param0 ^ param1;
    }

    final void a(int[] param0, int param1, boolean[] param2) {
        wo dupTemp$0 = null;
        int stackIn_19_0 = 0;
        boolean stackIn_24_1 = false;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var5Lifetime4;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_r == null ||
            this.field_r.field_w != 1 ||
            !this.field_r.field_f[0].f((byte) 39) ||
            !this.field_r.field_f[1].f((byte) 97)) {
            this.field_q = this.field_q + 1;
          }
          if (this.field_a) {
            return;
          }
          if (0 < this.field_r.field_p &&
            this.field_y == 0) {
            this.field_h = this.field_h + this.field_r.field_p;
            this.field_r.field_p = 0;
          }
          if (this.field_r.field_d > 0 &&
            this.field_y == 1) {
            this.field_h = this.field_h + this.field_r.field_d;
            this.field_r.field_d = 0;
          }
          stackIn_19_0 = (0 != this.field_j) ? 0 : 1;
          var4_int = stackIn_19_0;
          stackIn_24_1 = (this.field_b) || (this.field_r.a(true, param2, 128, param0, var4_int != 0));
          this.field_b = stackIn_24_1;
          if (this.field_b) {
            for (var5 = 0; this.field_l.length > var5; var5++) {
              if (this.field_j != 2 &&
                this.field_j != 3) {
                this.field_n.field_f[var5].a(true, -1 + this.field_l[var5].l(param1 ^ -32748));
              }
            }
            this.field_r.a(false, this.field_n);
            if (this.field_j != 2 &&
              this.field_j != 3) {
              for (var5Lifetime4 = 0; this.field_l.length > var5Lifetime4; var5Lifetime4++) {
                this.b(-6133);
              }
            }
            this.field_b = false;
          }
          if (this.field_j == 3 &&
            this.field_r.f(17940)) {
            var5Lifetime1 = ln.field_d.field_s % 3;
            if (var5Lifetime1 == 0) {
              field_k = field_k + 1;
            } else {
              mc.field_e = mc.field_e + 1;
            }
            dupTemp$0 = this.field_l[0];
            dupTemp$0.field_H = dupTemp$0.field_H + 1;
          }
          var5Lifetime2 = 0;
          while (this.field_l.length > var5Lifetime2) {
            if (!this.field_l[var5Lifetime2].a(false)) {
              var5Lifetime2++;
              continue;
            }
            this.field_n.a(false, this.field_r);
            for (var6 = 0; var6 < this.field_n.field_f.length; var6++) {
              this.field_n.field_f[var6].field_c = 0;
              this.field_n.field_f[var6].field_O = 0;
            }
            break;
          }
          var5Lifetime3 = this.field_r.d((byte) -114);
          if (-2 != var5Lifetime3) {
            if (var5Lifetime3 == 0) {
              this.field_f = this.field_f + 1;
            }
            if (1 == var5Lifetime3) {
              this.field_g = this.field_g + 1;
            }
            this.field_v = this.field_v + 1;
            if (-1 != var5Lifetime3 &&
              this.field_j == 2 &&
              this.field_B &&
              on.a((byte) -121, 0) &&
              this.field_l[var5Lifetime3].k((byte) 72)) {
            }
            if (this.c(-3317)) {
              var6Lifetime1 = -1;
              if (this.field_j == 2) {
                if (this.field_g < this.field_f) {
                  stackIn_77_0 = 0;
                } else {
                  stackIn_77_0 = (this.field_f >= this.field_g) ? -1 : 1;
                }
                var6Lifetime1 = stackIn_77_0;
              }
              if (this.field_u != 3 &&
                0 != this.field_u) {
                var6Lifetime1 = -this.field_u + 2;
              }
              if (this.field_j == 1) {
                var6Lifetime1 = 0;
              }
              this.a((byte) 114, var6Lifetime1);
            }
            if (this.field_j == 3) {
              dh.a(this.field_e, this.field_l[0].field_H, true);
              gj.a((byte) 91, false, am.field_n, 20);
            } else {
              this.a(param1 + 30093, false);
            }
          }
          if (param1 != 20) {
            this.field_f = -75;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_94_0 = var4;
          stackIn_94_1 = new StringBuilder().append("lj.A(");
          if (param0 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_94_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
          return 127;
        }
        int var3 = param0 >>> 31;
        return (var3 + param0) / param2 - var3;
    }

    final bh c(byte param0) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        wo[] var5 = new wo[this.field_l.length];
        wo[] var2 = var5;
        if (param0 != -116) {
          return (bh) null;
        }
        for (var3_int = 0; var3_int < this.field_l.length; var3_int++) {
          var5[var3_int] = new wo(this.field_l[var3_int].field_l, this.field_B, var3_int, 1 < this.field_l.length ? true : false, this.field_j == 2 ? true : false, true);
        }
        bh var3 = new bh(this.field_j, var2, this.field_B, false);
        var3.a(false, this.field_r);
        return var3;
    }

    lj(String[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7) {
        int var9_int = 0;
        boolean stackIn_4_1 = false;
        wo[] stackIn_8_0;
        int stackIn_8_1;
        wo stackIn_8_2;
        wo stackIn_8_3;
        wo stackIn_9_2 = null;
        wo stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        boolean stackIn_11_5;
        int stackIn_11_6;
        boolean stackIn_12_7 = false;
        boolean stackIn_15_8;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        wo stackIn_9_2Lifetime1;
        wo stackIn_9_2Lifetime2;
        wo stackIn_9_3Lifetime1;
        wo stackIn_9_3Lifetime2;
        this.field_x = -2;
        try {
          this.field_y = param1;
          this.field_z = param0.length;
          this.field_w = param0;
          this.a(param4, 53188834);
          stackIn_4_1 = (param6);
          this.field_B = stackIn_4_1;
          this.field_c = param5;
          this.field_j = param2;
          this.field_i = 4012 ^ param3;
          this.field_l = new wo[this.field_z];
          this.field_e = param3;
          for (var9_int = 0; var9_int < this.field_z; var9_int++) {
            stackIn_8_0 = this.field_l;
            stackIn_8_1 = var9_int;
            stackIn_8_2 = null;
            stackIn_8_3 = null;
            if (b.a(1, var9_int) != 0) {
              stackIn_9_2 = null;
              stackIn_9_3 = null;
              stackIn_9_4 = 1;
            } else {
              stackIn_9_2 = null;
              stackIn_9_3 = null;
              stackIn_9_4 = 0;
            }
            stackIn_11_5 = this.field_B;
            stackIn_11_6 = var9_int;
            if (this.field_l.length <= 1) {
              stackIn_9_2Lifetime1 = null;
              stackIn_9_3Lifetime1 = null;
              stackIn_12_7 = false;
            } else {
              stackIn_9_2Lifetime1 = null;
              stackIn_9_3Lifetime1 = null;
              stackIn_12_7 = true;
            }
            if (2 != this.field_j) {
              stackIn_9_2Lifetime2 = null;
              stackIn_9_3Lifetime2 = null;
              stackIn_15_8 = false;
            } else {
              stackIn_9_2Lifetime2 = null;
              stackIn_9_3Lifetime2 = null;
              stackIn_15_8 = true;
            }
            stackIn_8_0[stackIn_8_1] = new wo(stackIn_9_4, stackIn_11_5, stackIn_11_6, stackIn_12_7, stackIn_15_8, false);
          }
          oo.field_i = false;
          this.field_r = new bh(this.field_j, this.field_l, this.field_B, param7);
          this.a(30113, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_20_0 = var9;
          stackIn_20_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_o = "Find opponent";
        field_A = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
