/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Debris extends ShipBody implements DiffableState, ofa, utb {
    private int field_w;
    boolean field_x;
    boolean field_u;
    boolean phantom;
    static llb field_y;

    private final void a(boolean param0, Debris param1) {
        try {
          param1.field_o = this.field_o;
          param1.field_p = this.field_p;
          param1.field_t = this.field_t;
          this.field_p = 0;
          if (!param0) {
            this.field_x = true;
          }
          this.field_o = 0;
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0) {
        if (param0 < 42) {
          return -85;
        }
        return 2;
    }

    public final void a(faa param0, int param1) {
        try {
          super.a(param0, param1);
          this.phantom = kv.a(false, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -110);
          vq.a(param0, 118, this.phantom);
          if (param1 > -109) {
            this.d(-99);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        Debris var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -52);
          var3 = (Debris) (other);
          var4 = 0;
          if (var3.phantom != this.phantom) {
            System.out.println("boolean phantom has changed. before=" + var3.phantom + ", now=" + this.phantom);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of Debris has changed");
          }
          if (obfuscationGuard <= -19) {
            return;
          }
          this.phantom = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("nbb.F(");
          if (other == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    Debris(ShipComponent param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_w = 0;
        this.d((byte) -52);
        try {
          this.chassis = param0;
          this.a(this.chassis.finalangle, -56);
          this.a(this.chassis.finalx, this.chassis.finaly, (byte) 31);
          this.chassis.c(0, this.chassis.b(52), 56, this.chassis.c((byte) 100));
          this.chassis.h((byte) 42);
          this.chassis.a((byte) -125, (ShipBody) (this));
          this.e((byte) 119);
          if (GetFullMissionSet.field_p != 0 &&
            !param1) {
            this.chassis.d(false);
            return;
          }
          this.field_u = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nbb.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        int fieldTemp$0 = GetMomentOfInertiaPerpointCalcDownshift.field_o;
        GetMomentOfInertiaPerpointCalcDownshift.field_o = GetMomentOfInertiaPerpointCalcDownshift.field_o + 1;
        this.field_w = fieldTemp$0;
        int var2 = 102 / ((param0 + 4) / 38);
    }

    public final void a(faa param0, byte param1) {
        try {
          super.a(param0, (byte) -103);
          vq.a(param0, 95, this.phantom);
          if (param1 >= -91) {
            this.field_w = 55;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public Debris() {
        this.field_w = 0;
        this.d((byte) -52);
    }

    public final void b(byte param0, tv param1) {
        Debris var3 = (Debris) (param1);
        if (this.field_w == var3.field_w) {
          return;
        }
        try {
          var3.field_w = this.field_w;
          this.a(true, var3);
          super.b((byte) 60, param1);
          var3.phantom = this.phantom;
          if (param0 < 54) {
            tv var4 = (tv) null;
            this.b((byte) -95, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, false);
          this.phantom = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nbb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(byte param0) {
        field_y = null;
        if (param0 >= -125) {
          Debris.j((byte) 120);
        }
    }

    public final boolean a(byte param0, tv param1) {
        Debris var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 114 / ((param0 - 22) / 59);
          var3 = (Debris) (param1);
          stackIn_5_0 = (super.a((byte) 93, param1)) || (var3.phantom != this.phantom);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("nbb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
