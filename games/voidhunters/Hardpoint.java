/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Hardpoint implements DiffableState, utb {
    int connectedComponentIdx;
    static int field_a;
    int worldx;
    int worldy;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 54) {
          Hardpoint.a(64);
        }
    }

    public final void a(faa param0, byte param1) {
        param0.a(-632, this.connectedComponentIdx + 1, 5);
        param0.a(-632, this.worldx, 32);
        if (param1 > -91) {
          return;
        }
        try {
          param0.a(-632, this.worldy, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "imb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, int param1) {
        try {
          this.connectedComponentIdx = param0.i(0, 5) - 1;
          this.worldx = param0.i(0, param1);
          this.worldy = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "imb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        Hardpoint var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -41 % ((param0 - 22) / 59);
          var3 = (Hardpoint) (param1);
          stackIn_3_0 = (var3.connectedComponentIdx != this.connectedComponentIdx);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("imb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        Hardpoint var5 = null;
        Hardpoint var6 = null;
        try {
          var5 = (Hardpoint) (param1);
          var6 = var5;
          if (param0 <= 54) {
            this.worldy = -122;
          }
          var6.worldx = this.worldx;
          var6.worldy = this.worldy;
          var6.connectedComponentIdx = this.connectedComponentIdx;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "imb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Hardpoint() {
        this.connectedComponentIdx = -1;
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, 1 + this.connectedComponentIdx, 5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "imb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.worldx = -38;
          }
          this.connectedComponentIdx = param0.i(0, 5) - 1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "imb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        Hardpoint var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (Hardpoint) (other);
          var4 = 0;
          if (var6.connectedComponentIdx != this.connectedComponentIdx) {
            System.out.println("int connected_component_idx has changed. before=" + var6.connectedComponentIdx + ", now=" + this.connectedComponentIdx);
            var4 = 1;
          }
          if (this.worldx != var6.worldx) {
            var4 = 1;
            System.out.println("int worldx has changed. before=" + var6.worldx + ", now=" + this.worldx);
          }
          if (var6.worldy != this.worldy) {
            var4 = 1;
            System.out.println("int worldy has changed. before=" + var6.worldy + ", now=" + this.worldy);
          }
          if (obfuscationGuard >= -19) {
            var5 = (tv) null;
            this.b((byte) 67, (tv) null);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of Hardpoint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("imb.F(");
          if (other == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.worldy = (param3 * param6 + param0 * param5 >> 16) + param2;
        if (param4 == -665140432) {
          this.worldx = param1 + (-(param6 * param0) + param3 * param5 >> 16);
          return;
        }
        faa var9 = (faa) null;
        this.a((faa) null, true);
        this.worldx = param1 + (-(param6 * param0) + param3 * param5 >> 16);
    }

    static {
        field_b = "Accurate and long ranged. High energy consumption";
    }
}
