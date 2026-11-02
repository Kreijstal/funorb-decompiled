/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ptb extends MapClearanceArea implements DiffableState {
    private int x;
    static String field_f;
    private int height;
    private int width;
    private int y;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ptb var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 122 / ((param0 - 22) / 59);
          var4 = (ptb) (param1);
          stackIn_8_0 = (super.a((byte) 113, param1)) || (this.x != var4.x) || (this.y != var4.y) || (this.width != var4.width) || (this.height != var4.height);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ptb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(World param0, boolean param1) {
        try {
          if (!param1) {
            tv var4 = (tv) null;
            this.a((byte) -16, (tv) null);
          }
          param0.a(this.x + this.width / 2, this.y + this.height / 2, this.y, false, -124, this.x);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ptb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -107) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = ShipBlueprint.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ssa.field_a.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ptb.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, this.x, 32);
        param0.a(-632, this.y, 32);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.width, 32);
          param0.a(-632, this.height, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ptb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 120) {
          field_f = (String) null;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.width = param0.i(0, 32);
          this.height = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ptb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        ptb var5 = null;
        ptb var6 = null;
        try {
          super.b((byte) 58, param1);
          var5 = (ptb) (param1);
          var6 = var5;
          if (param0 <= 54) {
            field_f = (String) null;
          }
          var6.height = this.height;
          var6.x = this.x;
          var6.width = this.width;
          var6.y = this.y;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ptb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ptb() {
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ptb var5 = null;
        try {
          super.reportDifferences(other, -57);
          var5 = (ptb) (other);
          var4 = 0;
          if (this.x != var5.x) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
          }
          if (this.y != var5.y) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
          }
          if (this.width != var5.width) {
            System.out.println("int width has changed. before=" + var5.width + ", now=" + this.width);
            var4 = 1;
          }
          if (var5.height != this.height) {
            System.out.println("int height has changed. before=" + var5.height + ", now=" + this.height);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MapClearanceRectangle has changed");
          }
          if (obfuscationGuard < -19) {
            return;
          }
          this.width = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ptb.F(");
          if (other == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ptb(int param0, int param1, int param2, int param3) {
        this.x = param0;
        this.width = param2;
        this.height = param3;
        this.y = param1;
    }

    static {
        field_f = "New";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -107) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = ShipBlueprint.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ssa.field_a.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ptb.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
