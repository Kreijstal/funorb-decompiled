/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Particle implements DiffableState {
    private int type;
    static int field_z;
    static int field_p;
    static int field_j;
    static int field_G;
    static int field_q;
    static int field_y;
    private int fadestart;
    private int life;
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
    private int x;
    static int field_a;
    static int field_v;
    private int dx;
    static int field_C;
    static int field_k;
    static int field_H;
    private int y;
    static int field_c;
    static int field_A;
    static int field_m;
    static int field_e;
    private int dy;

    final boolean b(byte param0) {
        if (param0 <= -115) {
          return this.life > 0 ? true : false;
        }
        this.a(87);
        return this.life > 0 ? true : false;
    }

    final void a(byte param0) {
        if (param0 <= 109) {
          this.a(false);
          this.life = 0;
          return;
        }
        this.life = 0;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Particle var5 = null;
        try {
          var5 = (Particle) (other);
          var4 = 0;
          if (this.x != var5.x) {
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          if (var5.y != this.y) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
          }
          if (var5.dx != this.dx) {
            System.out.println("int dx has changed. before=" + var5.dx + ", now=" + this.dx);
            var4 = 1;
          }
          if (var5.dy != this.dy) {
            System.out.println("int dy has changed. before=" + var5.dy + ", now=" + this.dy);
            var4 = 1;
          }
          if (var5.life != this.life) {
            var4 = 1;
            System.out.println("int life has changed. before=" + var5.life + ", now=" + this.life);
          }
          if (var5.fadestart != this.fadestart) {
            var4 = 1;
            System.out.println("int fadestart has changed. before=" + var5.fadestart + ", now=" + this.fadestart);
          }
          if (this.type != var5.type) {
            System.out.println("int type has changed. before=" + var5.type + ", now=" + this.type);
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
          if (other == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(')').toString());
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
          var3_int = param1.a(this.x, (byte) 121);
          var4 = param1.b(true, this.y);
          if (param0 < 108) {
            field_h = 22;
          }
          var5 = 255;
          if (this.fadestart > 0 &&
            this.fadestart > this.life) {
            var5 = this.life * 255 / this.fadestart;
          }
          if (GetPedrosRepairMode.field_q == this.type) {
            var6 = 16742144;
            var7 = 400.0f * param1.field_a;
            var8 = var5;
            if (0.5f > var7) {
              var8 = (int)(2.0f * (var7 * (float)var5));
            }
            var9 = (int)var7;
            if (this.dx == 0 &&
              this.dy == 0) {
              SetMissileLauncherEnergyUsed.a(var6, (byte) 7, var4, var7, var8, var3_int);
              return;
            }
            var10 = param1.a((this.dx << 2) + this.x, (byte) 124);
            var11 = param1.b(true, (this.dy << 2) + this.y);
            if (var9 <= 1) {
              SetShowTutorial.a(var3_int, (byte) 66, var10, var4, var6, var11, var8);
              return;
            }
            kra.a(var6, var9, 16994, var4, var8, var3_int, var10, var11);
            return;
          }
          if (SetPhasedEnergyBeamReload.field_o > this.type) {
            return;
          }
          var6Lifetime1 = 8 * this.fadestart;
          var7_int = this.fadestart * 4 + 256;
          var8Lifetime1 = GetSniperCannonFireForce.field_o * this.fadestart + this.fadestart;
          if (this.fadestart > 135) {
            var8Lifetime1 = -var8Lifetime1;
          }
          var9Lifetime1 = GetNumStars.a(var8Lifetime1, (byte) -60);
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
          var11Lifetime2 = param1.a(var17 + this.x, (byte) 125);
          var12Lifetime1 = param1.b(true, this.y + var18);
          var13Lifetime1 = param1.a(var19 + this.x, (byte) 117);
          var14Lifetime1 = param1.b(true, var20 + this.y);
          var15Lifetime1 = param1.a(var21 + this.x, (byte) 117);
          var16Lifetime1 = param1.b(true, var22 + this.y);
          var23 = -SetPhasedEnergyBeamReload.field_o + this.type - 1;
          var24 = qpb.a(false, var23, 13894143);
          var5 = var5 * 200 >> 8;
          var25 = var24 | var5 << 24;
          GetDebrisCarryOver.a(8, var16Lifetime1, 1, var25, var11Lifetime2, var15Lifetime1, var14Lifetime1, var12Lifetime1, var25, var13Lifetime1, var25);
          if (-10 + (this.fadestart << 1) > this.life) {
            return;
          }
          var26 = 11 + this.life - (this.fadestart << 1);
          SetMissileLauncherEnergyUsed.a(var24, (byte) 7, param1.b(true, this.y), (float)(int)((float)var26 * (param1.field_a * 4096.0f)), 1, param1.a(this.x, (byte) 113));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        Particle var5 = null;
        Particle var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (Particle) (param1);
          var6 = var5;
          var6.life = this.life;
          var6.x = this.x;
          var6.dx = this.dx;
          var6.type = this.type;
          var6.dy = this.dy;
          var6.y = this.y;
          var6.fadestart = this.fadestart;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.a(-123);
          }
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.dx = param0.i(0, 32);
          this.dy = param0.i(0, 32);
          this.life = param0.i(0, 32);
          this.fadestart = param0.i(0, 32);
          this.type = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        this.y = param3;
        this.type = param1;
        this.dy = param4;
        this.life = param0;
        this.x = param6;
        this.dx = param2;
        if (param7) {
          this.fadestart = param5;
          return;
        }
        tv var10 = (tv) null;
        this.b((byte) -24, (tv) null);
        this.fadestart = param5;
    }

    final void a(int param0) {
        this.x = this.x + this.dx;
        this.y = this.y + this.dy;
        this.life = this.life - 1;
        if (param0 != -8460) {
          field_c = -6;
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
          param0.a(-632, this.dx, 32);
          param0.a(-632, this.dy, 32);
          param0.a(-632, this.life, 32);
          param0.a(-632, this.fadestart, 32);
          param0.a(-632, this.type, 4);
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.b((faa) null, -1);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Particle var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          var4 = 27 % ((22 - param0) / 59);
          var3 = (Particle) (param1);
          stackIn_10_0 = (var3.x != this.x) || (this.y != var3.y) || (this.dx != var3.dx) || (var3.dy != this.dy) || (this.life != var3.life) || (this.fadestart != var3.fadestart) || (this.type != var3.type);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
          return (this.fadestart << 1) - this.life;
        }
        tv var3 = (tv) null;
        this.b((byte) -76, (tv) null);
        return (this.fadestart << 1) - this.life;
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
