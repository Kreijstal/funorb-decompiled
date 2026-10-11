/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ub {
    private o field_K;
    private int field_B;
    static uf field_C;
    private o[] field_G;
    private int field_H;
    private o field_y;
    private int field_A;
    private int field_J;
    private int field_L;
    int field_z;
    static String field_E;
    boolean field_I;
    private int field_F;
    private o field_D;

    private final void a(int param0) {
        this.field_G = new o[]{this.a(this.field_B, this.field_H, (byte) -11), this.a(this.field_L, this.field_F, (byte) -11)};
        this.field_D = this.d(10706);
        this.field_y = this.field_D.c();
        if (param0 != -24060) {
          this.field_G = (o[]) null;
        }
        this.field_K = new o(this.field_n >> 1, this.field_n);
    }

    private final o a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = wizardrun.field_H;
        o var14 = new o(this.field_J * 2, this.field_n);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        ud.a(var14, false);
        int var5 = this.field_n >> 1;
        if (param2 != -11) {
          return (o) null;
        }
        for (var6 = 0; this.field_n > var6; var6++) {
          var7 = (-1 + 2 * this.field_J) * (var6 >> 1) % (this.field_J * 2);
          var8 = param1 & 16711935;
          var9 = param1 & 65280;
          var10 = -var5 + var6;
          var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
          var12 = var11 < 256 ? (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8 : var8 | var9;
          ed.f(var7, var6, this.field_J, var12);
          var9Lifetime1 = 65280 & param0;
          ed.f(-(this.field_J * 2) + var7, var6, this.field_J, var12);
          var8Lifetime1 = param0 & 16711935;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var9Lifetime1 * var11) >>> 8;
          ed.f(var7 + this.field_J, var6, this.field_J, var12Lifetime1);
          ed.f(var7 - this.field_J, var6, this.field_J, var12Lifetime1);
        }
        bb.b(4);
        return var14;
    }

    final void a(int param0, int param1, int param2) {
        this.field_L = (param2 & 16711422) >> 1;
        this.field_F = (param0 & 16711422) >> 1;
        this.field_H = param0;
        this.field_B = param2;
        this.a(-24060);
        if (param1 != -1028717695) {
          this.field_A = 0;
        }
    }

    private final void a(o param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          var5_int = param2 + this.field_r;
          eb.a(param3, param1 + this.field_n, param2 + this.field_D.field_z, param1, var5_int - this.field_D.field_z);
          for (var6 = param2 - this.field_A; var5_int > var6; var6 = var6 + param0.field_z) {
            param0.e(var6, param1);
          }
          bb.b(4);
          if (ed.field_c <= param2 + this.field_D.field_z) {
            ud.a(this.field_K, false);
            param0.e(-this.field_A, 0);
            param0.e(this.field_J * 2 - this.field_A, 0);
            this.field_y.f(0, 0);
            bb.b(4);
            this.field_K.e(param2, param1);
          }
          if (var5_int - this.field_D.field_z <= ed.field_l) {
            ud.a(this.field_K, false);
            for (var7 = this.field_r - this.field_D.field_z + this.field_A; this.field_J * 2 < var7; var7 = var7 - this.field_J * 2) {
            }
            param0.e(-var7, 0);
            param0.e(-var7 + 2 * this.field_J, 0);
            this.field_D.f(0, 0);
            bb.b(4);
            this.field_K.e(var5_int - this.field_D.field_z, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("hd.GA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final o d(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = wizardrun.field_H;
        int var2 = this.field_n >> 1;
        o var3 = new o(var2, this.field_n);
        if (param0 != 10706) {
          return (o) null;
        }
        ud.a(var3, false);
        for (var4 = 0; var4 < this.field_n; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_n - var4) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            ed.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        bb.b(4);
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 108) {
          this.field_K = (o) null;
        }
        super.a(122, param1, param2, param3, param4);
        this.a(-24060);
    }

    final static void a(kl param0, int param1) {
        nc var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          nc.a(param0.a(-85, "", "headers.packvorbis"));
          var2 = nc.a(param0, "jagex logo2.packvorbis", "");
          var2.b();
          if (param1 >= -96) {
            field_C = (uf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("hd.FA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        int var5 = param0 + this.field_o;
        int var6 = param3 + this.field_l;
        this.a(this.field_G[param1], var6, var5, param1 ^ 0);
        if (this.field_z < 65536) {
          eb.a(0, this.field_n + var6, var5 + (this.field_r * this.field_z >> 16), var6, var5 + this.field_r);
          this.a(this.field_G[1], var6, var5, 0);
          bb.b(4);
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 10000536) {
            return;
          }
          if (this.field_I) {
            this.field_A = this.field_A + 1;
            if (2 * this.field_J >= this.field_A) {
              return;
            }
            this.field_A = this.field_A - 2 * this.field_J;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean g(byte param0) {
        int var1 = -126 % ((param0 + 10) / 63);
        return true;
    }

    public static void a(byte param0) {
        if (param0 < 96) {
          hd.a((byte) -5);
        }
        field_C = null;
        field_E = null;
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_J = param4;
        this.field_F = param7;
        this.field_L = param8;
        this.field_B = param6;
        this.field_H = param5;
        this.a(113, param1, param3, param2, param0);
    }

    static {
        field_C = new uf("email");
        field_E = "to return to the normal view.";
    }
}
