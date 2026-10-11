/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq implements ntb {
    private int field_f;
    static int field_z;
    static int field_p;
    static int field_j;
    static int field_G;
    static int field_q;
    static int field_y;
    private int field_i;
    private int field_b;
    static int field_d;
    static int field_x;
    static int field_l;
    static int field_s;
    static int field_t;
    static int field_I;
    static int field_n;
    static int field_w;
    static int field_E;
    static int field_o;
    static int field_g;
    static int field_h;
    private int field_F;
    static int field_a;
    static int field_v;
    private int field_r;
    static int field_C;
    static int field_k;
    static int field_H;
    private int field_u;
    static int field_c;
    static int field_A;
    static int field_m;
    static int field_e;
    private int field_D;

    final boolean b(byte param0) {
        if (param0 <= -115) {
          return this.field_b > 0 ? true : false;
        }
        this.a(87);
        return this.field_b > 0 ? true : false;
    }

    final void a(byte param0) {
        if (param0 <= 109) {
          this.a(false);
          this.field_b = 0;
          return;
        }
        this.field_b = 0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        oq var5 = null;
        try {
          var5 = (oq) (param0);
          var4 = 0;
          if (this.field_F != var5.field_F) {
            System.out.println("int x has changed. before=" + var5.field_F + ", now=" + this.field_F);
            var4 = 1;
          }
          if (param1 >= -19) {
            return;
          }
          if (var5.field_u != this.field_u) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_u + ", now=" + this.field_u);
          }
          if (var5.field_r != this.field_r) {
            System.out.println("int dx has changed. before=" + var5.field_r + ", now=" + this.field_r);
            var4 = 1;
          }
          if (var5.field_D != this.field_D) {
            System.out.println("int dy has changed. before=" + var5.field_D + ", now=" + this.field_D);
            var4 = 1;
          }
          if (var5.field_b != this.field_b) {
            var4 = 1;
            System.out.println("int life has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var5.field_i != this.field_i) {
            var4 = 1;
            System.out.println("int fadestart has changed. before=" + var5.field_i + ", now=" + this.field_i);
          }
          if (this.field_f != var5.field_f) {
            System.out.println("int type has changed. before=" + var5.field_f + ", now=" + this.field_f);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of Particle has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("oq.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, lta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        var27 = VoidHunters.field_G;
        try {
          var3_int = param1.a(this.field_F, (byte) 121);
          var4 = param1.b(true, this.field_u);
          if (param0 < 108) {
            field_h = 22;
          }
          var5 = 255;
          if (this.field_i > 0 &&
            this.field_i > this.field_b) {
            var5 = this.field_b * 255 / this.field_i;
          }
          if (omb.field_q == this.field_f) {
            var6 = 16742144;
            var7 = 400.0f * param1.field_a;
            var8 = var5;
            if (0.5f > var7) {
              var8 = (int)(2.0f * (var7 * (float)var5));
            }
            var9 = (int)var7;
            if (this.field_r == 0 &&
              this.field_D == 0) {
              jj.a(var6, (byte) 7, var4, var7, var8, var3_int);
              return;
            }
            var10 = param1.a((this.field_r << 2) + this.field_F, (byte) 124);
            var11 = param1.b(true, (this.field_D << 2) + this.field_u);
            if (var9 <= 1) {
              hha.a(var3_int, (byte) 66, var10, var4, var6, var11, var8);
              return;
            }
            kra.a(var6, var9, 16994, var4, var8, var3_int, var10, var11);
            return;
          }
          if (tk.field_o > this.field_f) {
            return;
          }
          var6Lifetime1 = 8 * this.field_i;
          var7_int = this.field_i * 4 + 256;
          var8Lifetime1 = th.field_o * this.field_i + this.field_i;
          if (this.field_i > 135) {
            var8Lifetime1 = -var8Lifetime1;
          }
          var9Lifetime1 = fc.a(var8Lifetime1, (byte) -60);
          var10Lifetime1 = eu.a(var8Lifetime1, 82);
          var11Lifetime1 = -var6Lifetime1;
          var12 = -var7_int;
          var13 = -var6Lifetime1;
          var14 = var7_int;
          var15 = var6Lifetime1;
          var16 = 0;
          var17 = var9Lifetime1 * var11Lifetime1 - var10Lifetime1 * var12 >> 16;
          var18 = var9Lifetime1 * var12 + var11Lifetime1 * var10Lifetime1 >> 16;
          var19 = var9Lifetime1 * var13 - var14 * var10Lifetime1 >> 16;
          var20 = var14 * var9Lifetime1 + var13 * var10Lifetime1 >> 16;
          var21 = -(var16 * var10Lifetime1) + var9Lifetime1 * var15 >> 16;
          var22 = var9Lifetime1 * var16 + var15 * var10Lifetime1 >> 16;
          var11Lifetime2 = param1.a(var17 + this.field_F, (byte) 125);
          var12Lifetime1 = param1.b(true, this.field_u + var18);
          var13Lifetime1 = param1.a(var19 + this.field_F, (byte) 117);
          var14Lifetime1 = param1.b(true, var20 + this.field_u);
          var15Lifetime1 = param1.a(var21 + this.field_F, (byte) 117);
          var16Lifetime1 = param1.b(true, var22 + this.field_u);
          var23 = -tk.field_o + this.field_f - 1;
          var24 = qpb.a(false, var23, 13894143);
          var5 = var5 * 200 >> 8;
          var25 = var24 | var5 << 24;
          hcb.a(8, var16Lifetime1, 1, var25, var11Lifetime2, var15Lifetime1, var14Lifetime1, var12Lifetime1, var25, var13Lifetime1, var25);
          if (-10 + (this.field_i << 1) > this.field_b) {
            return;
          }
          var26 = 11 + this.field_b - (this.field_i << 1);
          jj.a(var24, (byte) 7, param1.b(true, this.field_u), (float)(int)((float)var26 * (param1.field_a * 4096.0f)), 1, param1.a(this.field_F, (byte) 113));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("oq.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        oq var5 = null;
        oq var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (oq) (param1);
          var6 = var5;
          var6.field_b = this.field_b;
          var6.field_F = this.field_F;
          var6.field_r = this.field_r;
          var6.field_f = this.field_f;
          var6.field_D = this.field_D;
          var6.field_u = this.field_u;
          var6.field_i = this.field_i;
          if (param0 > 54) {
            return;
          }
          this.a(5, 70, 45, 42, 86, -73, 112, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("oq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.a(-123);
          }
          this.field_F = param0.i(0, 32);
          this.field_u = param0.i(0, 32);
          this.field_r = param0.i(0, 32);
          this.field_D = param0.i(0, 32);
          this.field_b = param0.i(0, 32);
          this.field_i = param0.i(0, 32);
          this.field_f = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "oq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        this.field_u = param3;
        this.field_f = param1;
        this.field_D = param4;
        this.field_b = param0;
        this.field_F = param6;
        this.field_r = param2;
        if (param7) {
          this.field_i = param5;
          return;
        }
        tv var10 = (tv) null;
        this.b((byte) -24, (tv) null);
        this.field_i = param5;
    }

    final void a(int param0) {
        this.field_F = this.field_F + this.field_r;
        this.field_u = this.field_u + this.field_D;
        this.field_b = this.field_b - 1;
        if (param0 != -8460) {
          field_c = -6;
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_F, 32);
          param0.a(-632, this.field_u, 32);
          param0.a(-632, this.field_r, 32);
          param0.a(-632, this.field_D, 32);
          param0.a(-632, this.field_b, 32);
          param0.a(-632, this.field_i, 32);
          param0.a(-632, this.field_f, 4);
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.b((faa) null, -1);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "oq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        oq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          var4 = 27 % ((22 - param0) / 59);
          var3 = (oq) (param1);
          stackIn_10_0 = (var3.field_F != this.field_F) || (this.field_u != var3.field_u) || (this.field_r != var3.field_r) || (var3.field_D != this.field_D) || (this.field_b != var3.field_b) || (this.field_i != var3.field_i) || (this.field_f != var3.field_f);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("oq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        int var1 = 117 % ((param0 - 44) / 58);
        if (null == efb.field_b) {
          return false;
        }
        if (efb.field_b.a(34)) {
          return true;
        }
        return false;
    }

    final int a(boolean param0) {
        if (param0) {
          return (this.field_i << 1) - this.field_b;
        }
        tv var3 = (tv) null;
        this.b((byte) -76, (tv) null);
        return (this.field_i << 1) - this.field_b;
    }

    static {
        field_l = 50;
        field_I = field_l * 1;
        field_j = field_l * 20;
        field_y = 11 * field_l;
        field_q = field_l * 40;
        field_H = 0;
        field_k = 5 * field_l;
        field_t = field_l;
        field_p = 10 * field_l;
        field_z = field_l * 20;
        field_x = 2 * field_l;
        field_v = 3 * field_l;
        field_w = field_l / 2;
        field_G = 10 * field_l;
        field_o = field_l;
        field_A = field_l * 10;
        field_c = 10 * field_l;
        field_E = field_l * 120;
        field_C = 10 * field_l;
        field_s = field_l;
        field_g = field_l * 20;
        field_h = 20 * field_l;
        field_a = field_l * 20;
        field_d = 3 * field_l;
        field_n = field_l * 1;
        field_e = 10 * field_l;
        field_m = field_l * 25;
    }
}
