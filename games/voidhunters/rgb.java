/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rgb extends MapClearanceArea implements DiffableState {
    private int x;
    private int y;
    private int radius;
    static soa field_f;

    public final boolean a(byte param0, tv param1) {
        rgb var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 106 / ((param0 - 22) / 59);
          var3 = (rgb) (param1);
          stackIn_7_0 = (super.a((byte) -50, param1)) || (this.x != var3.x) || (var3.y != this.y) || (var3.radius != this.radius);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rgb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        rgb var5 = null;
        rgb var6 = null;
        try {
          if (param0 < 54) {
            field_f = (soa) null;
          }
          super.b((byte) 98, param1);
          var5 = (rgb) (param1);
          var6 = var5;
          var6.y = this.y;
          var6.radius = this.radius;
          var6.x = this.x;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rgb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_f = (soa) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.radius = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rgb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(World param0, boolean param1) {
        try {
          if (!param1) {
            World var4 = (World) null;
            this.a((World) null, true);
          }
          param0.a((byte) -99, false, this.y, this.x, this.radius);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rgb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        rgb var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -19) {
            this.x = 46;
          }
          var5 = (rgb) (other);
          super.reportDifferences(other, -59);
          var4 = 0;
          if (this.x != var5.x) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
          }
          if (var5.y != this.y) {
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
            var4 = 1;
          }
          if (this.radius != var5.radius) {
            var4 = 1;
            System.out.println("int radius has changed. before=" + var5.radius + ", now=" + this.radius);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MapClearanceCircle has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rgb.F(");
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -123);
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.b((faa) null, -92);
          }
          param0.a(-632, this.radius, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rgb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rgb() {
    }

    rgb(int param0, int param1, int param2) {
        this.radius = param2;
        this.y = param1;
        this.x = param0;
    }

    static {
    }
}
