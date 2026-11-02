/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TargetLock implements DiffableState {
    int targetId;
    static llb field_b;
    int targetX;
    int targetY;

    public final void b(byte param0, tv param1) {
        TargetLock var4 = (TargetLock) (param1);
        TargetLock var3 = var4;
        var4.targetId = this.targetId;
        var4.targetX = this.targetX;
        if (param0 < 54) {
          return;
        }
        try {
          var4.targetY = this.targetY;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "odb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.targetId = -41;
          }
          this.targetId = param0.i(0, 32);
          this.targetX = param0.i(0, 32);
          this.targetY = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "odb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        TargetLock var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -19) {
            return;
          }
          var5 = (TargetLock) (other);
          var4 = 0;
          if (var5.targetId != this.targetId) {
            System.out.println("int target_id has changed. before=" + var5.targetId + ", now=" + this.targetId);
            var4 = 1;
          }
          if (this.targetX != var5.targetX) {
            var4 = 1;
            System.out.println("int target_x has changed. before=" + var5.targetX + ", now=" + this.targetX);
          }
          if (var5.targetY != this.targetY) {
            System.out.println("int target_y has changed. before=" + var5.targetY + ", now=" + this.targetY);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of TargetLock has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("odb.F(");
          if (other == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.targetId, 32);
          param0.a(-632, this.targetX, 32);
          param0.a(-632, this.targetY, 32);
          if (param1 >= -109) {
            this.targetY = -84;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "odb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        TargetLock var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -108 / ((22 - param0) / 59);
          var4 = (TargetLock) (param1);
          stackIn_6_0 = (this.targetId != var4.targetId) || (this.targetX != var4.targetX) || (var4.targetY != this.targetY);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("odb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
