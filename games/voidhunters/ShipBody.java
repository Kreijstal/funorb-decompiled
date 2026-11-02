/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ShipBody extends ara implements DiffableState, utb {
    private int momentofinertia;
    private int centreofmassx;
    int[] boundingbox;
    int mass;
    int angularvelocity;
    private int angle;
    int id;
    int field_p;
    private int centreofmassy;
    int field_o;
    ShipComponent chassis;
    int field_t;

    public void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ShipBody var5 = null;
        try {
          super.reportDifferences(other, -85);
          var5 = (ShipBody) (other);
          if (this.chassis != null &&
            var5.chassis != null) {
            this.chassis.reportDifferences(var5.chassis, -80);
          }
          var4 = 0;
          stackIn_7_0 = (var5.chassis != null) ? 0 : 1;
          if (null != this.chassis) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          if ((stackIn_7_0 ^ stackIn_10_1) != 0 ||
            this.chassis != null &&
            this.chassis.a((byte) -118, (tv) (var5.chassis))) {
            System.out.println("Component chassis has changed. before=" + var5.chassis + ", now=" + this.chassis);
            var4 = 1;
          }
          if (var5.angle != this.angle) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.angle + ", now=" + this.angle);
          }
          if (var5.angularvelocity != this.angularvelocity) {
            System.out.println("int angularvelocity has changed. before=" + var5.angularvelocity + ", now=" + this.angularvelocity);
            var4 = 1;
          }
          if (var5.centreofmassx != this.centreofmassx) {
            var4 = 1;
            System.out.println("int centreofmassx has changed. before=" + var5.centreofmassx + ", now=" + this.centreofmassx);
          }
          if (this.centreofmassy != var5.centreofmassy) {
            var4 = 1;
            System.out.println("int centreofmassy has changed. before=" + var5.centreofmassy + ", now=" + this.centreofmassy);
          }
          if (var5.mass != this.mass) {
            System.out.println("int mass has changed. before=" + var5.mass + ", now=" + this.mass);
            var4 = 1;
          }
          if (this.momentofinertia != var5.momentofinertia) {
            System.out.println("int momentofinertia has changed. before=" + var5.momentofinertia + ", now=" + this.momentofinertia);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.boundingbox, var5.boundingbox, false)) {
            var4 = 1;
            System.out.println("int[] boundingbox has changed. ");
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.id != var5.id) {
            var4 = 1;
            System.out.println("int id has changed. before=" + var5.id + ", now=" + this.id);
          }
          if (var4 != 0) {
            System.out.println("This instance of Body has changed, where id=" + this.id);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("anb.F(");
          if (other == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int j(int param0) {
        if (param0 != 995401160) {
          this.f(85);
        }
        int var2 = this.angle >> 8;
        return (int)((long)this.centreofmassx * (long)GetNumStars.a(var2, (byte) -62) - (long)this.centreofmassy * (long)eu.a(var2, 124) >> 16);
    }

    final void a(boolean param0, boolean param1, World param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          this.x = this.x + this.dx;
          if (!param1) {
            this.e((byte) 36);
          }
          this.angle = this.angle + this.angularvelocity;
          this.y = this.y + this.dy;
          this.angularvelocity = GetMissileLauncherEnergyUsed.field_q * this.angularvelocity / SetMassDriverEnergyUsed.field_o;
          this.dy = this.dy * ibb.field_a / SetMissilesCooldown.field_o;
          this.dx = ibb.field_a * this.dx / SetMissilesCooldown.field_o;
          if (param0) {
            param2.field_u.a(this.boundingbox, (byte) -105);
          }
          this.c(16);
          var4_int = this.x - this.j(995401160);
          var5 = this.y - this.i((byte) 5);
          this.chassis.a(this instanceof Ship, var4_int, var5, this.angle >> 8, 0, this.boundingbox);
          if (param0) {
            param2.field_u.a(1, this.d(82), this.id, this.boundingbox);
            this.d((byte) 124);
          } else {
            this.d((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("anb.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int i(byte param0) {
        if (param0 != 5) {
          return -127;
        }
        int var2 = this.angle >> 8;
        return (int)((long)this.centreofmassx * (long)eu.a(var2, param0 + 105) + (long)this.centreofmassy * (long)GetNumStars.a(var2, (byte) -68) >> 16);
    }

    public void a(faa param0, int param1) {
        try {
          super.a(param0, false);
          if (kv.a(false, param0)) {
            if (null == this.chassis) {
              this.chassis = new ShipComponent();
            }
            this.chassis.a(param0, 32);
          } else {
            this.chassis = null;
          }
          this.angle = uwa.a(24, param0, (byte) 20);
          this.angularvelocity = uwa.a(24, param0, (byte) 20);
          this.centreofmassx = param0.i(0, 32);
          this.centreofmassy = param0.i(param1 - 32, 32);
          this.mass = param0.i(0, param1);
          this.momentofinertia = param0.i(0, 32);
          this.boundingbox = wkb.a((byte) 37, this.boundingbox, param0, 8);
          this.id = param0.i(0, 16);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int[] param1, int[] param2, int param3, int[] param4, int param5, ShipComponent[] param6) {
        int var8_int = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param3 != 3) {
            this.chassis = (ShipComponent) null;
          }
          for (var8_int = 0; param6.length > var8_int; var8_int++) {
            var9 = ar.a(param4[var8_int], (byte) 111, param1[var8_int]);
            stackIn_8_0 = (param2[var8_int] < 0) ? 0 : 1;
            if (param5 < 0) {
              stackIn_11_1 = 0;
            } else {
              stackIn_11_1 = 1;
            }
            var10 = stackIn_8_0 ^ stackIn_11_1;
            var11 = param2[var8_int];
            if (param2[var8_int] < 0 &&
              var10 != 0 ||
              0 < param2[var8_int] &&
              var10 == 0) {
              var11 = -var11;
            }
            param0[var8_int] = var11 / Math.max(var9, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("anb.CA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final int g(byte param0) {
        int var2 = 124 % ((param0 - 62) / 55);
        return this.y;
    }

    final int g(int param0) {
        if (param0 >= -36) {
          this.g(-59);
        }
        int var2 = Math.abs(-this.x + this.boundingbox[0]);
        int var3 = Math.abs(-this.x + this.boundingbox[1]);
        int var4 = Math.abs(this.boundingbox[2] - this.y);
        int var5 = Math.abs(this.boundingbox[3] - this.y);
        return Math.max(var2, Math.max(var3, Math.max(var4, var5)));
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        if (param0 != 24) {
          World var4 = (World) null;
          this.a((lta) null, -28, (World) null, -49);
        }
        if (this.field_t != 0 ||
          this.field_o != 0) {
          this.dx = this.dx + this.field_t / param1;
          this.dy = this.dy + this.field_o / param1;
          this.d((byte) 91);
          this.field_t = 0;
          this.field_o = 0;
        }
        if (this.field_p != 0) {
          var3 = this.field_p / Math.max(this.momentofinertia >> wf.field_e, 1);
          this.angularvelocity = this.angularvelocity + var3;
          this.d((byte) 40);
          this.field_p = 0;
        }
    }

    final void i(int param0) {
        this.c(16);
        int var2 = this.x - this.j(995401160);
        int var3 = this.y - this.i((byte) 5);
        this.chassis.a(this instanceof Ship, var2, var3, this.angle >> 8, param0, this.boundingbox);
    }

    final int e(int param0) {
        if (param0 != 0) {
          this.field_o = -108;
        }
        return this.angle >> 8;
    }

    int d(int param0) {
        if (param0 <= 42) {
          this.field_p = -29;
        }
        return -1;
    }

    void e(byte param0) {
        int var2 = this.j(995401160);
        int var3 = this.i((byte) 5);
        this.chassis.a(0, true, 0, false, (byte) 88, 0, (int[]) null);
        if (param0 != 119) {
          this.chassis = (ShipComponent) null;
        }
        this.mass = this.chassis.e((byte) -86);
        int[] var4 = new int[]{0, 0, 0};
        this.chassis.a((byte) 114, var4);
        int var5 = Math.max(1, var4[2] >> 4);
        this.centreofmassy = var4[1] / var5;
        this.centreofmassx = var4[0] / var5;
        this.momentofinertia = this.chassis.a(-921054591, this.centreofmassx, this.centreofmassy);
        int var6 = this.j(995401160);
        int var7 = this.i((byte) 5);
        int var8 = var6 - var2;
        this.x = this.x + var8;
        int var9 = var7 - var3;
        this.y = this.y + var9;
        this.chassis.a(this.angle >> 8, false, this.y - var7, this instanceof Ship, (byte) 106, this.x - var6, (int[]) null);
        this.d((byte) 38);
    }

    final boolean h(int param0) {
        if (param0 >= -112) {
          return false;
        }
        return this.chassis.k((byte) 84);
    }

    public void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -111);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -94;
          stackIn_3_2 = (this.chassis != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.chassis.b(param0, -115);
          }
          param0.a(-632, this.angle, 24);
          param0.a(-632, this.angularvelocity, 24);
          param0.a(-632, this.id, 16);
          if (param1 > -109) {
            this.c(-33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("anb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = GetNumStars.a(param1, (byte) -69) * param3 >> 8;
        int var7 = param3 * eu.a(param1, 42) >> 8;
        this.a(var7, param2, param0, (byte) -118, var6);
        if (param4 != 1948934248) {
          this.id = 82;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -57 / ((param0 + 56) / 55);
        return this.chassis.a(param2, false, 0, param1, 21750, 0);
    }

    public void a(faa param0, boolean param1) {
        try {
          super.a(param0, false);
          if (kv.a(param1, param0)) {
            if (null == this.chassis) {
              this.chassis = new ShipComponent();
            }
            this.chassis.a(param0, false);
          } else {
            this.chassis = null;
          }
          this.angle = uwa.a(24, param0, (byte) 20);
          this.angularvelocity = uwa.a(24, param0, (byte) 20);
          this.id = param0.i(0, 16);
          this.h((byte) 63);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, World param2) {
        try {
          this.chassis.a(param1, param2, this, (byte) -89);
          if (param0 >= -46) {
            this.field_t = 42;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.RA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(lta param0, int param1, World param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (!MissionAction.a(this.boundingbox, param0.field_f, 36)) {
            return;
          }
          this.chassis.a((byte) 125, param0, this instanceof Ship, param2, param1);
          if (GetPointDefenceLaserProjectiles.a(2, 11284)) {
            var5_int = this.j(995401160);
            var6 = this.i((byte) 5);
            var7 = param0.a(this.x, (byte) 125);
            var8 = param0.b(true, this.y);
            GetPhasedEnergyBeamReload.a(var8, param0.field_a * 1024.0f, -81, var7, 16711680);
            var9 = param0.a(-var5_int + this.x, (byte) 122);
            var10 = param0.b(true, -var6 + this.y);
            SetNumStars.a(1024.0f * param0.field_a, (byte) 90, var10, 16777215, var9);
          }
          if (GetPointDefenceLaserProjectiles.a(param3, param3 ^ 11268)) {
            var5_intLifetime1 = param0.a(this.boundingbox[0], (byte) 121);
            var6Lifetime1 = param0.a(this.boundingbox[1], (byte) 112);
            var7Lifetime1 = param0.b(true, this.boundingbox[2]);
            var8Lifetime1 = param0.b(true, this.boundingbox[3]);
            uv.a(param3 + 105, var5_intLifetime1, -var7Lifetime1 + var8Lifetime1, var7Lifetime1, 16711935, -var5_intLifetime1 + var6Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("anb.IB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        this.angle = param0 << 8;
        if (param1 > -13) {
          this.centreofmassx = -127;
        }
    }

    final int c(byte param0) {
        if (param0 > -111) {
          return 58;
        }
        return this.dx;
    }

    final void a(int param0, World param1) {
        try {
          int var3_int = -85 % ((26 - param0) / 35);
          this.chassis.a(0, param1, this);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        if (!param0) {
          return -2;
        }
        return this.chassis.a(0, this.y, -125, this.x);
    }

    final int f(int param0) {
        if (param0 != 0) {
          this.id = -93;
        }
        return this.dy;
    }

    final boolean k(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 995401160) {
          this.field_t = -99;
        }
        stackIn_8_0 = (this.dx != 0) || (this.dy != 0) || (this.angularvelocity != 0);
        return stackIn_8_0;
    }

    public void a(faa param0, byte param1) {
        super.b(param0, -113);
        if (vq.a(param0, 54, this.chassis != null ? true : false)) {
          this.chassis.a(param0, (byte) -113);
        }
        param0.a(-632, this.angle, 24);
        if (param1 > -91) {
          return;
        }
        try {
          param0.a(-632, this.angularvelocity, 24);
          param0.a(-632, this.centreofmassx, 32);
          param0.a(-632, this.centreofmassy, 32);
          param0.a(-632, this.mass, 32);
          param0.a(-632, this.momentofinertia, 32);
          pgb.a(8, null != this.boundingbox ? this.boundingbox.length : 0, 84, param0, this.boundingbox);
          param0.a(-632, this.id, 16);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        if (this instanceof Debris) {
          this.chassis.c(0, this.chassis.i((byte) -112).field_b, param0 - 7, this.chassis.i((byte) -112).field_i);
        } else {
          this.chassis.c(0, 0, 56, 0);
        }
        int var2 = this.x;
        int var3 = this.y;
        this.e((byte) 119);
        this.x = var2;
        if (param0 != 63) {
          return;
        }
        this.y = var3;
        this.c(16);
        this.chassis.a(this instanceof Ship, this.x - this.j(995401160), this.y - this.i((byte) 5), this.angle >> 8, param0 - 63, this.boundingbox);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 5 / ((param2 + 11) / 38);
        this.x = param0;
        this.y = param1;
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_10_0 = false;
        if (param2 < 8) {
          this.c(101, -72, -14, 88, 79);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.boundingbox != null && (this.boundingbox[0] < param4 ||
          this.boundingbox[1] > param1 ||
          this.boundingbox[2] < param3 ||
          this.boundingbox[3] > param0)) {
          stackIn_10_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_10_0 = false;
        }
        return stackIn_10_0;
    }

    void d(byte param0) {
        int var2 = -43 % ((param0 + 4) / 38);
    }

    final int getId(boolean param0) {
        if (param0) {
          World var3 = (World) null;
          this.a((World) null, 115, false, 79, -113);
        }
        return this.id;
    }

    void a(int param0, int param1, World param2, int param3, int param4) {
        World var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 >= 0) {
            this.chassis.a(param1, param3, param2, (byte) -73, param4, this);
          }
          if (param0 > -36) {
            var7 = (World) null;
            this.a(-66, -62, (World) null, 87, -25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("anb.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(World param0, int param1, boolean param2, int param3, int param4) {
        int var17 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ShipComponent[] var7_ref_ml__ = null;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        boolean[] var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        ShipComponent var27_ref = null;
        Object var28 = null;
        ShipComponent var28_ref = null;
        Object var29 = null;
        ShipComponent var29_ref = null;
        Object var30 = null;
        ShipComponent var30_ref = null;
        Object var31 = null;
        ShipComponent var31_ref = null;
        Object var32 = null;
        ShipComponent var32_ref = null;
        ShipComponent var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        ShipComponent var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var49 = null;
        int[] var50 = null;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        int var16Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var25Lifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var8_intLifetime4;
        int var8_intLifetime5;
        int var8_intLifetime6;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var20Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        int var22Lifetime1Lifetime1;
        var27 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var26 = VoidHunters.field_G;
        try {
          if (SetSniperCannonProjectiles.field_o == 1) {
            stackIn_7_0 = (this.chassis.i((byte) -112).field_s) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var6_int = stackIn_7_0;
          if (param2) {
            this.h((byte) -95);
          }
          if (var6_int != 0) {
            var27_ref = new ShipComponent(13);
            var27_ref.a((byte) -127, 1);
            var8_int = 4096;
            var9 = -(var8_int * GetNumStars.a(this.chassis.finalangle, (byte) -76)) >> 16;
            var10 = -(eu.a(this.chassis.finalangle, 40) * var8_int) >> 16;
            var27_ref.a(false, this.chassis.finalx + var9, this.chassis.finaly + var10, this.chassis.finalangle, 0, (int[]) null);
            av.field_a[0] = var27_ref;
            var28_ref = new ShipComponent(13);
            var28_ref.a((byte) 114, 2);
            var8_intLifetime2 = 4096;
            var9Lifetime2 = GetNumStars.a(this.chassis.finalangle, (byte) 100) * var8_intLifetime2 >> 16;
            var10Lifetime2 = var8_intLifetime2 * eu.a(this.chassis.finalangle, 122) >> 16;
            var11 = this.chassis.finalangle + 4096;
            var28_ref.a(false, this.chassis.finalx + var9Lifetime2, this.chassis.finaly + var10Lifetime2, var11, 0, (int[]) null);
            av.field_a[1] = var28_ref;
            var29_ref = new ShipComponent(13);
            var29_ref.a((byte) 113, 36);
            var8_intLifetime3 = 8192;
            var9Lifetime3 = GameKeyHandler.a(22433, 256 + this.chassis.finalangle);
            var10Lifetime3 = var8_intLifetime3 * GetNumStars.a(var9Lifetime3, (byte) -112) >> 16;
            var11Lifetime2 = var8_intLifetime3 * eu.a(var9Lifetime3, 85) >> 16;
            var12_int = GameKeyHandler.a(22433, -2048 + this.chassis.finalangle);
            var29_ref.a(false, var10Lifetime3 + this.chassis.finalx, var11Lifetime2 + this.chassis.finaly, var12_int, 0, (int[]) null);
            av.field_a[2] = var29_ref;
            var30_ref = new ShipComponent(13);
            var30_ref.a((byte) 120, 72);
            var8_intLifetime4 = 8192;
            var9Lifetime4 = GameKeyHandler.a(22433, this.chassis.finalangle - 256);
            var10Lifetime4 = var8_intLifetime4 * GetNumStars.a(var9Lifetime4, (byte) -102) >> 16;
            var11Lifetime3 = var8_intLifetime4 * eu.a(var9Lifetime4, 87) >> 16;
            var12_intLifetime1 = GameKeyHandler.a(22433, 2048 + this.chassis.finalangle);
            var30_ref.a(false, var10Lifetime4 + this.chassis.finalx, var11Lifetime3 + this.chassis.finaly, var12_intLifetime1, 0, (int[]) null);
            av.field_a[3] = var30_ref;
            var31_ref = new ShipComponent(13);
            var31_ref.a((byte) -23, 68);
            var8_intLifetime5 = 8192;
            var9Lifetime5 = GameKeyHandler.a(22433, this.chassis.finalangle - 3840);
            var10Lifetime5 = GetNumStars.a(var9Lifetime5, (byte) -91) * var8_intLifetime5 >> 16;
            var11Lifetime4 = var8_intLifetime5 * eu.a(var9Lifetime5, 122) >> 16;
            var12_intLifetime2 = GameKeyHandler.a(22433, this.chassis.finalangle + 2048);
            var31_ref.a(false, var10Lifetime5 + this.chassis.finalx, var11Lifetime4 + this.chassis.finaly, var12_intLifetime2, 0, (int[]) null);
            av.field_a[4] = var31_ref;
            var32_ref = new ShipComponent(13);
            var32_ref.a((byte) 12, 40);
            var8_intLifetime6 = 8192;
            var9Lifetime6 = GameKeyHandler.a(22433, 4096 + this.chassis.finalangle - 256);
            var10Lifetime6 = var8_intLifetime6 * GetNumStars.a(var9Lifetime6, (byte) 46) >> 16;
            var11Lifetime5 = var8_intLifetime6 * eu.a(var9Lifetime6, 85) >> 16;
            var12_intLifetime3 = GameKeyHandler.a(22433, this.chassis.finalangle - 2048);
            var32_ref.a(false, var10Lifetime6 + this.chassis.finalx, this.chassis.finaly + var11Lifetime5, var12_intLifetime3, 0, (int[]) null);
            av.field_a[5] = var32_ref;
          }
          boolean decompiledFrameRemainder0 = true;
          if (1 == wqa.field_b &&
            (99 & param1) != 0 &&
            (param1 & 111) == (99 & param1)) {
            var7_ref_ml__ = this.chassis.a(0, (ShipComponent[]) null, param1);
            if (var6_int != 0) {
              for (var8_intLifetime1 = 0; var8_intLifetime1 < av.field_a.length; var8_intLifetime1++) {
                var7_ref_ml__ = (ShipComponent[]) (ija.a(av.field_a[var8_intLifetime1], var7_ref_ml__, 0, ii.field_d));
              }
            }
            if (var7_ref_ml__ == null) {
              param1 = param1 & -112;
              if ((var6_int != 0)) {
                for (var7 = 0; var7 < av.field_a.length; var7++) {
                  av.field_a[var7].a(param4, 7834, this, param3, param1, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var41 = new int[var7_ref_ml__.length];
              var34 = var41;
              var8 = var34;
              var9Lifetime1 = this.field_t;
              var10Lifetime1 = this.field_o;
              var11Lifetime1 = this.field_p;
              var43 = new int[var7_ref_ml__.length];
              var36 = var43;
              var12 = var36;
              var44 = new int[var7_ref_ml__.length];
              var37 = var44;
              var13 = var37;
              var42 = new int[var7_ref_ml__.length];
              var35 = var42;
              var14 = var35;
              var15 = 0;
              for (var16 = 0; var7_ref_ml__.length > var16; var16++) {
                var33 = var7_ref_ml__[var16];
                var18_int = var33.triggermap;
                var19 = this.field_t;
                var20 = this.field_o;
                var21 = this.field_p;
                var22 = var33.thrusterbehaviour.a(var33.componentTypeId, false);
                this.a(var33.finaly, var33.finalangle, var33.finalx, var22, 1948934248);
                var12[var16] = this.field_t - var19;
                var13[var16] = -var20 + this.field_o;
                var14[var16] = this.field_p - var21;
                if ((param1 & var18_int) != 0) {
                  var41[var16] = 256;
                  var15 = var15 + var42[var16];
                  var12[var16] = -var43[var16];
                  var13[var16] = -var44[var16];
                  var14[var16] = -var42[var16];
                }
              }
              this.field_o = var10Lifetime1;
              this.field_p = var11Lifetime1;
              this.field_t = var9Lifetime1;
              var16Lifetime1 = var15 / Math.max(this.momentofinertia >> wf.field_e, 1);
              if (var15 != 0 &&
                Math.abs(var16Lifetime1) > us.field_f) {
                var49 = new int[var7_ref_ml__.length];
                var18 = new boolean[var7_ref_ml__.length];
                this.a(var49, var44, var42, 3, var43, var15, var7_ref_ml__);
                var50 = new int[var7_ref_ml__.length];
                for (var20Lifetime1 = 0; var50.length > var20Lifetime1; var20Lifetime1++) {
                  var21Lifetime1 = -2147483648;
                  var22Lifetime1 = -1;
                  for (var23 = 0; var23 < var49.length; var23++) {
                    if (!var18[var23] &&
                      var49[var23] > var21Lifetime1) {
                      var22Lifetime1 = var23;
                      var21Lifetime1 = var49[var23];
                    }
                  }
                  if (var22Lifetime1 != -1) {
                    var50[var20Lifetime1] = var22Lifetime1;
                    var18[var22Lifetime1] = true;
                  }
                }
                var20Lifetime1Lifetime1 = 0;
                while (var50.length > var20Lifetime1Lifetime1) {
                  var21Lifetime1Lifetime1 = var50[var20Lifetime1Lifetime1];
                  if (0 > var49[var21Lifetime1Lifetime1]) {
                    break;
                  }
                  var22Lifetime1Lifetime1 = var42[var21Lifetime1Lifetime1];
                  var23Lifetime1 = Math.abs(var15);
                  var24 = Math.abs(var22Lifetime1Lifetime1) >> 8;
                  var25 = var23Lifetime1 / Math.max(var24, 1);
                  if (var25 < 256) {
                    if (var41[var21Lifetime1Lifetime1] > 0) {
                      var8[var21Lifetime1Lifetime1] = -var25 + 256;
                      break;
                    }
                    var41[var21Lifetime1Lifetime1] = var25;
                    break;
                  }
                  if (var41[var21Lifetime1Lifetime1] > 0) {
                    var41[var21Lifetime1Lifetime1] = 0;
                  } else {
                    var41[var21Lifetime1Lifetime1] = 256;
                  }
                  var15 = var15 + var22Lifetime1Lifetime1;
                  var25Lifetime1 = 256;
                  var20Lifetime1Lifetime1++;
                }
              }
              for (var17 = 0; var17 < var7_ref_ml__.length; var17++) {
                var40 = var7_ref_ml__[var17];
                if (var41[var17] > 0) {
                  var40.a(this, param4, param0, param3, 55, var41[var17]);
                }
              }
              param1 = param1 & -112;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var6_int != 0)) {
            for (var7Lifetime1 = 0; var7Lifetime1 < av.field_a.length; var7Lifetime1++) {
              av.field_a[var7Lifetime1].a(param4, 7834, this, param3, param1, param0);
            }
          }
          this.chassis.a(param4, 7834, this, param3, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("anb.FB(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int e(boolean param0) {
        if (param0) {
          this.angle = 99;
        }
        return this.mass;
    }

    void a(World param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        World var6 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            stackIn_18_0 = 1;
          } else {
            if (0 == this.dx) {
              if (this.dy == 0) {
                if (0 == this.angularvelocity) {
                  if (this.boundingbox[0] == 0) {
                    if (this.boundingbox[1] == 0) {
                      if (this.boundingbox[2] == 0) {
                        stackIn_18_0 = (0 == this.boundingbox[3]) ? 1 : 0;
                      } else {
                        stackIn_18_0 = 0;
                      }
                    } else {
                      stackIn_18_0 = 0;
                    }
                  } else {
                    stackIn_18_0 = 0;
                  }
                } else {
                  stackIn_18_0 = 1;
                }
              } else {
                stackIn_18_0 = 1;
              }
            } else {
              stackIn_18_0 = 1;
            }
          }
          var5_int = stackIn_18_0;
          if (var5_int != 0) {
            this.a(param3, true, param0);
          }
          if (this instanceof Ship) {
            this.chassis.a(true, (byte) -124, param0, this);
          }
          if (param2 != 67) {
            var6 = (World) null;
            this.a(93, false, (World) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("anb.SA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(boolean param0) {
        if (param0) {
          this.e((byte) 22);
        }
        return this.x;
    }

    final void a(tpb param0, Projectile param1, byte param2) {
        try {
          this.chassis.a(param1, param0, 0);
          if (param2 < 24) {
            this.angle = 116;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.U(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (null == this.boundingbox) {
          return false;
        }
        if (param1 != 2147483647) {
          this.getBoundingbox((byte) 36);
        }
        var6 = 0;
        if (this.boundingbox[0] < param3) {
          var6 = 1;
          if (0 > this.dx) {
            this.dx = -this.dx;
          }
          this.x = this.x + (-this.boundingbox[0] + param3);
        }
        if (param4 < this.boundingbox[1]) {
          if (this.dx > 0) {
            this.dx = -this.dx;
          }
          var6 = 1;
          this.x = this.x + (param4 - this.boundingbox[1]);
        }
        if (this.boundingbox[2] < param0) {
          if (this.dy < 0) {
            this.dy = -this.dy;
          }
          var6 = 1;
          this.y = this.y + (-this.boundingbox[2] + param0);
        }
        if (this.boundingbox[3] > param2) {
          this.y = this.y + (param2 - this.boundingbox[3]);
          if (this.dy > 0) {
            this.dy = -this.dy;
          }
          var6 = 1;
        }
        return var6 != 0;
    }

    final int[] getBoundingbox(byte param0) {
        if (param0 >= -21) {
          return (int[]) null;
        }
        return this.boundingbox;
    }

    public boolean a(byte param0, tv param1) {
        ShipBody var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -16 / ((param0 - 22) / 59);
          var3 = (ShipBody) (param1);
          if (!super.a((byte) 104, param1)) {
            stackIn_4_0 = (null != this.chassis) ? 0 : 1;
            if (var3.chassis != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.chassis == null ||
              !this.chassis.a((byte) 126, (tv) (var3.chassis))) && (var3.angle == this.angle &&
              var3.angularvelocity == this.angularvelocity &&
              this.id == var3.id)) {
              stackIn_17_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = true;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("anb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        long var8;
        long var10;
        long var12;
        int var14;
        this.field_t = this.field_t + param4;
        this.field_o = this.field_o + param0;
        var6 = -this.x + param1;
        var7 = -this.y + param2;
        if (param3 > -112) {
          this.mass = 65;
        }
        var8 = (long)(-var7 >> ge.field_c);
        var10 = (long)(var6 >> ge.field_c);
        var12 = var8 * (long)param4 + (long)param0 * var10;
        var14 = this.field_p;
        this.field_p = (int)((long)this.field_p + (var12 >> tua.field_a));
        if (var12 > 0L) {
          if (this.field_p < var14) {
            this.field_p = 2147483647;
          } else {
            if (var12 < 0L &&
              var14 < this.field_p) {
              this.field_p = -2147483648;
            }
          }
        } else {
          if (var12 < 0L &&
            var14 < this.field_p) {
            this.field_p = -2147483648;
          }
        }
        this.d((byte) 111);
        VariableCondition.a(param1, param2, param2 - param0, -param4 + param1, (byte) -54);
    }

    final void a(sfa param0, Projectile param1, int param2) {
        try {
          this.chassis.a(param1, param0, -1);
          if (param2 != -4414) {
            World var5 = (World) null;
            this.a(97, false, (World) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.JB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return ": Mass=" + this.mass + ", MOI=" + this.momentofinertia + ",xpos=" + this.x + ",ypos=" + this.y + ", angle=" + this.angle + ",avel=" + this.angularvelocity;
    }

    public void b(byte param0, tv param1) {
        ShipBody var4 = null;
        try {
          super.b((byte) 105, param1);
          var4 = (ShipBody) (param1);
          if (null != this.chassis) {
            if (null == var4.chassis) {
              var4.chassis = new ShipComponent();
            }
            this.chassis.b((byte) 110, var4.chassis);
          } else {
            var4.chassis = null;
          }
          var4.angularvelocity = this.angularvelocity;
          var4.momentofinertia = this.momentofinertia;
          var4.angle = this.angle;
          var4.mass = this.mass;
          var4.centreofmassx = this.centreofmassx;
          var4.centreofmassy = this.centreofmassy;
          if (param0 < 54) {
            this.id = 79;
          }
          var4.boundingbox = SetTeamSelectionSpeedup.a(var4.boundingbox, (byte) -85, this.boundingbox);
          var4.id = this.id;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ShipBody() {
        this.boundingbox = new int[4];
    }

    private final void c(int param0) {
        this.boundingbox[3] = -2147483648;
        this.boundingbox[2] = 2147483647;
        this.boundingbox[1] = -2147483648;
        if (param0 != 16) {
          this.mass = 17;
        }
        this.boundingbox[0] = 2147483647;
    }

    static {
    }
}
