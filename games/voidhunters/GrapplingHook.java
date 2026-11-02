/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrapplingHook extends ShipBody implements DiffableState, utb {
    private boolean retracting;
    private int firedFromId;
    static String field_x;
    private int grabbedObjectId;
    private int firedFromPlayer;
    private int grabbedComponentId;
    private int grabbedComponentOffsety;
    private int grabbedComponentOffsetx;
    static llb field_C;

    final void a(int param0, boolean param1) {
        int var3 = -47 / ((param0 - 56) / 50);
        this.retracting = param1 ? true : false;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        GrapplingHook var5 = null;
        try {
          var5 = (GrapplingHook) (other);
          super.reportDifferences(other, -34);
          var4 = 0;
          if (var5.grabbedObjectId != this.grabbedObjectId) {
            System.out.println("int grabbed_object_id has changed. before=" + var5.grabbedObjectId + ", now=" + this.grabbedObjectId);
            var4 = 1;
          }
          if (var5.grabbedComponentId != this.grabbedComponentId) {
            System.out.println("int grabbed_component_id has changed. before=" + var5.grabbedComponentId + ", now=" + this.grabbedComponentId);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          if (var5.grabbedComponentOffsetx != this.grabbedComponentOffsetx) {
            System.out.println("int grabbed_component_offsetx has changed. before=" + var5.grabbedComponentOffsetx + ", now=" + this.grabbedComponentOffsetx);
            var4 = 1;
          }
          if (this.grabbedComponentOffsety != var5.grabbedComponentOffsety) {
            System.out.println("int grabbed_component_offsety has changed. before=" + var5.grabbedComponentOffsety + ", now=" + this.grabbedComponentOffsety);
            var4 = 1;
          }
          if (var5.firedFromId != this.firedFromId) {
            var4 = 1;
            System.out.println("int fired_from_id has changed. before=" + var5.firedFromId + ", now=" + this.firedFromId);
          }
          if (var5.firedFromPlayer != this.firedFromPlayer) {
            var4 = 1;
            System.out.println("int fired_from_player has changed. before=" + var5.firedFromPlayer + ", now=" + this.firedFromPlayer);
          }
          if (var5.retracting != this.retracting) {
            var4 = 1;
            System.out.println("boolean retracting has changed. before=" + var5.retracting + ", now=" + this.retracting);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of GrapplingHook has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mqb.F(");
          if (other == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getGrabbedComponentOffsety(int param0) {
        if (param0 != 32) {
          return -77;
        }
        return this.grabbedComponentOffsety;
    }

    final void d(int param0, int param1, int param2, int param3, int param4) {
        if (param3 >= 43) {
          this.grabbedComponentOffsety = param2;
          this.grabbedComponentId = param0;
          this.grabbedObjectId = 1 + param4;
          this.grabbedComponentOffsetx = param1;
          return;
        }
    }

    final int l(byte param0) {
        int var2 = 59 / ((66 - param0) / 49);
        return -1 + this.grabbedObjectId;
    }

    final int m(int param0) {
        if (param0 != 32) {
          tv var3 = (tv) null;
          this.reportDifferences((tv) null, -15);
          return this.firedFromPlayer;
        }
        return this.firedFromPlayer;
    }

    final int getGrabbedComponentId(int param0) {
        int var2 = 78 % ((39 - param0) / 46);
        return this.grabbedComponentId;
    }

    public final void a(faa param0, byte param1) {
        try {
          super.a(param0, (byte) -115);
          param0.a(-632, this.grabbedObjectId, 32);
          param0.a(-632, this.grabbedComponentId, 32);
          param0.a(-632, this.grabbedComponentOffsetx, 32);
          param0.a(-632, this.grabbedComponentOffsety, 32);
          param0.a(-632, this.firedFromId, 32);
          param0.a(-632, this.firedFromPlayer, 32);
          vq.a(param0, -98, this.retracting);
          if (param1 > -91) {
            this.o(-128);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int o(int param0) {
        if (param0 != 23463) {
          this.l((byte) -122);
          return this.grabbedComponentOffsetx;
        }
        return this.grabbedComponentOffsetx;
    }

    public static void j(byte param0) {
        if (param0 != -116) {
          return;
        }
        field_x = null;
        field_C = null;
    }

    public final void a(faa param0, int param1) {
        try {
          super.a(param0, 32);
          this.grabbedObjectId = param0.i(0, 32);
          this.grabbedComponentId = param0.i(param1 ^ 32, 32);
          this.grabbedComponentOffsetx = param0.i(0, 32);
          this.grabbedComponentOffsety = param0.i(0, param1);
          this.firedFromId = param0.i(param1 ^ 32, 32);
          this.firedFromPlayer = param0.i(0, 32);
          this.retracting = kv.a(false, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void f(boolean param0) {
        if (!param0) {
          this.firedFromPlayer = -107;
          this.grabbedObjectId = 0;
          return;
        }
        this.grabbedObjectId = 0;
    }

    final int p(int param0) {
        if (param0 != 32) {
          this.d(87, 119, -79, -18, -61);
          return this.firedFromId;
        }
        return this.firedFromId;
    }

    final void n(int param0) {
        if (param0 != 620) {
          return;
        }
        this.chassis.a(this.chassis.i((byte) -112).field_p, (byte) 92);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -126);
        if (param1 >= -109) {
          return;
        }
        try {
          param0.a(-632, this.grabbedObjectId, 32);
          param0.a(-632, this.grabbedComponentId, 32);
          param0.a(-632, this.grabbedComponentOffsetx, 32);
          param0.a(-632, this.grabbedComponentOffsety, 32);
          param0.a(-632, this.firedFromId, 32);
          param0.a(-632, this.firedFromPlayer, 32);
          vq.a(param0, -123, this.retracting);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        GrapplingHook var4 = (GrapplingHook) (param1);
        GrapplingHook var3 = var4;
        super.b((byte) 82, param1);
        if (param0 < 54) {
          return;
        }
        try {
          var4.grabbedObjectId = this.grabbedObjectId;
          var4.grabbedComponentId = this.grabbedComponentId;
          var4.firedFromPlayer = this.firedFromPlayer;
          var4.grabbedComponentOffsetx = this.grabbedComponentOffsetx;
          var4.firedFromId = this.firedFromId;
          var4.retracting = this.retracting;
          var4.grabbedComponentOffsety = this.grabbedComponentOffsety;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean getRetracting(byte param0) {
        if (param0 >= -1) {
          return true;
        }
        return this.retracting;
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        GrapplingHook var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 66 % ((param0 - 22) / 59);
          var5 = (GrapplingHook) (param1);
          if (!super.a((byte) 111, param1) &&
            this.grabbedObjectId == var5.grabbedObjectId &&
            var5.grabbedComponentId == this.grabbedComponentId &&
            var5.grabbedComponentOffsetx == this.grabbedComponentOffsetx &&
            this.grabbedComponentOffsety == var5.grabbedComponentOffsety &&
            var5.firedFromId == this.firedFromId &&
            var5.firedFromPlayer == this.firedFromPlayer) {
            stackIn_10_0 = (this.retracting) ? 0 : 1;
            if (stackIn_10_0 != (var5.retracting ? 1 : 0)) {
              stackIn_13_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_13_0 = true;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("mqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, false);
          this.grabbedObjectId = param0.i(0, 32);
          this.grabbedComponentId = param0.i(0, 32);
          this.grabbedComponentOffsetx = param0.i(0, 32);
          this.grabbedComponentOffsety = param0.i(0, 32);
          this.firedFromId = param0.i(0, 32);
          this.firedFromPlayer = param0.i(0, 32);
          this.retracting = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    GrapplingHook() {
    }

    GrapplingHook(ShipComponent param0, int param1, int param2) {
        try {
          this.chassis = param0;
          this.e((byte) 119);
          this.firedFromPlayer = param2;
          this.firedFromId = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mqb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
