/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    private boolean field_q;
    private int field_p;
    private int field_m;
    static boolean field_o;
    private int field_e;
    private int field_f;
    private boolean field_i;
    private fj field_n;
    private int field_g;
    private int field_c;
    static int field_b;
    private int field_h;
    private int field_l;
    private dta field_d;
    private int field_k;
    private int field_j;
    private qh field_a;

    final boolean c(int param0) {
        if (param0 != 1727002282) {
          return true;
        }
        return this.field_q;
    }

    final static int a(boolean param0, mi[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          while (true) {
            if (param1.length - 1 <= var3_int) {
              if (!param0) {
                field_b = -62;
              }
              stackIn_12_0 = param1.length - 1;
              return stackIn_12_0;
            }
            if (param1[var3_int + 1].field_h <= param2 - 1) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var6 = 0;
        if (param2 == param0) {
          return param0;
        }
        int var4 = -param2 + param0;
        int var5 = ua.a(var4, 14);
        if (var4 > param1) {
          var6 = 1;
        } else {
          var6 = -1;
        }
        if (this.field_h <= var5) {
          return var4 / this.field_h + param2;
        }
        return var6 + param2;
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 >= 26) {
          this.field_g = this.field_g + param2;
          this.field_m = this.field_m + param2;
          this.field_j = this.field_j + param0;
          this.field_f = this.field_f + param0;
          this.field_h = 16;
          return;
        }
        this.a((byte) -94);
        this.field_g = this.field_g + param2;
        this.field_m = this.field_m + param2;
        this.field_j = this.field_j + param0;
        this.field_f = this.field_f + param0;
        this.field_h = 16;
    }

    final void b(int param0) {
        if (!this.a(0)) {
          return;
        }
        this.field_n.a(this.field_e, this.field_p, this.field_k, this.field_c, this.field_l, this.field_a, 51);
        if (param0 != 23479) {
          mi[] var3 = (mi[]) null;
          qa.a(true, (mi[]) null, 44);
          if (this.field_a.f((byte) 33)) {
            return;
          }
          if (this.field_a.field_A) {
            return;
          }
          this.field_d.a(this.field_p, this.field_k, this.field_e, -88, this.field_a, this.field_c, this.field_l);
          if (this.field_a.field_D) {
            tra.a(0, bm.field_f, (byte) -72, this.field_p, tga.field_a, this.field_k - this.field_p, 1, -this.field_c + this.field_l, this.field_c, -16777216 | wga.field_a[this.field_e]);
            return;
          }
          return;
        }
        if (this.field_a.f((byte) 33)) {
          return;
        }
        if (this.field_a.field_A) {
          return;
        }
        this.field_d.a(this.field_p, this.field_k, this.field_e, -88, this.field_a, this.field_c, this.field_l);
        if (!this.field_a.field_D) {
          return;
        }
        tra.a(0, bm.field_f, (byte) -72, this.field_p, tga.field_a, this.field_k - this.field_p, 1, -this.field_c + this.field_l, this.field_c, -16777216 | wga.field_a[this.field_e]);
    }

    final void a(int param0, wm param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != -20186) {
            return;
          }
          var4_int = aaa.a(false) - koa.b(0) / 2;
          var5 = koa.b(0) / 2;
          if (mf.field_d == param1) {
            this.a(0, 0, 8, aaa.a(false), koa.b(0));
            return;
          }
          if (param1 == dp.field_j) {
            this.a(0, 0, param2 + 20194, var4_int, koa.b(param2 ^ -20186));
            return;
          }
          if (qu.field_e == param1) {
            this.a(var4_int, 0, 8, aaa.a(false), var5 << 1);
            return;
          }
          if (param1 != mma.field_c) {
            return;
          }
          this.a(var4_int, param0 * var5, 8, aaa.a(false), (param0 + 1) * var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 59) {
          this.field_g = -31;
          if (param0 < this.field_p) {
            return false;
          }
          if (param2 < this.field_c) {
            return false;
          }
          if (param3 > this.field_k) {
            return false;
          }
          if (this.field_l >= param4) {
            return true;
          }
          return false;
        }
        if (param0 < this.field_p) {
          return false;
        }
        if (param2 < this.field_c) {
          return false;
        }
        if (param3 > this.field_k) {
          return false;
        }
        if (this.field_l >= param4) {
          return true;
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        this.field_q = param1 ? true : false;
        if (param0 > 26) {
          return;
        }
        this.field_p = -104;
    }

    final void a(byte param0) {
        if (this.field_i) {
          this.field_i = false;
          this.field_p = this.field_g;
          this.field_l = this.field_j;
          this.field_k = this.field_m;
          this.field_c = this.field_f;
          return;
        }
        this.field_p = this.a(this.field_g, 0, this.field_p);
        this.field_c = this.a(this.field_f, 0, this.field_c);
        this.field_k = this.a(this.field_m, 0, this.field_k);
        this.field_l = this.a(this.field_j, 0, this.field_l);
        this.field_n.a(-8);
        if (param0 >= 77) {
          this.field_d.a((byte) -21);
          return;
        }
    }

    private final boolean a(int param0) {
        if (param0 == 0) {
          return this.a(aaa.a(false), (byte) 59, koa.b(param0 ^ 0), 0, 0);
        }
        this.field_f = 126;
        return this.a(aaa.a(false), (byte) 59, koa.b(param0 ^ 0), 0, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param1;
        this.field_c = param1;
        this.field_g = param0;
        this.field_j = param4;
        this.field_m = param3;
        this.field_h = param2;
        this.field_p = param0;
        this.field_k = param3;
        this.field_l = param4;
    }

    final void a(byte param0, int param1) {
        int var3 = 81 % ((-76 - param0) / 39);
        this.field_n.a(0, param1);
    }

    final static void a(int param0, int param1, byte param2, int param3, nh[] param4, int param5) {
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        nh[] var11 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = aq.field_a[0].a();
          param1 = (var6_int / 2 + param1) / var6_int * var6_int;
          var7 = aq.field_a[0].c();
          param4[0].a(param3, param5);
          param0 = (param0 + var7 / 2) / var7 * var7;
          param4[2].a(-var6_int + param1 + param3, param5);
          param4[6].a(param3, -var7 + param0 + param5);
          param4[8].a(-var6_int + (param3 + param1), param5 + param0 - var7);
          for (var8 = var6_int + param3; param3 - (-param1 + var6_int * 2) >= var8; var8 = var8 + var6_int) {
            param4[1].a(var8, param5);
            param4[7].a(var8, param0 + (param5 - var7));
          }
          for (var8Lifetime1 = param5 + var7; var8Lifetime1 <= -(var7 * 2) + param0 + param5; var8Lifetime1 = var8Lifetime1 + var7) {
            param4[3].a(param3, var8Lifetime1);
            param4[5].a(param1 + (param3 - var6_int), var8Lifetime1);
          }
          for (var8Lifetime2 = var6_int + param3; var8Lifetime2 <= param1 + param3 - 2 * var6_int; var8Lifetime2 = var8Lifetime2 + var6_int) {
            for (var9 = param5 + var7; param5 + (param0 - var7 * 2) >= var9; var9 = var9 + var7) {
              param4[4].a(var8Lifetime2, var9);
            }
          }
          if (param2 > 64) {
            return;
          }
          var11 = (nh[]) null;
          qa.a(110, 85, (byte) -45, -18, (nh[]) null, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("qa.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(')').toString());
        }
    }

    qa(qh param0, int param1) {
        this.field_i = true;
        this.field_h = 8;
        try {
          this.field_a = param0;
          this.field_e = param1;
          this.field_n = new fj();
          this.field_d = new dta();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = 1727002282;
    }
}
