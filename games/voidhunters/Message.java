/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Message implements DiffableState {
    int aId;
    int stringId;
    int bId;
    int tick;
    static int field_d;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        Message var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 79 / ((param0 - 22) / 59);
          var4 = (Message) (param1);
          stackIn_7_0 = (this.tick != var4.tick) || (var4.stringId != this.stringId) || (this.aId != var4.aId) || (var4.bId != this.bId);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (ob.field_j <= param1) {
          if (param1 > GetCountermeasureLauncherProjectiles.field_o) {
            if (param0 > -18) {
              Message.a(72, 80, 26, 93, -92);
              return;
            }
            return;
          }
          param4 = IntrusiveNode.a(31123, NebulaField.field_c, hab.field_i, param4);
          param3 = IntrusiveNode.a(31123, NebulaField.field_c, hab.field_i, param3);
          GetPhasedEnergyBeamProjectileOndamageParticles.a(-105, param4, param1, param3, param2);
        }
        if (param0 <= -18) {
          return;
        }
        Message.a(72, 80, 26, 93, -92);
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.tick, 32);
          param0.a(-632, this.stringId, 8);
          param0.a(-632, 1 + this.aId, 8);
          param0.a(-632, 1 + this.bId, 8);
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) -115, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static float a(float param0, float param1, int param2, float param3, byte param4) {
        float[] var6 = null;
        if (param4 > 53) {
          var6 = cn.field_a[param2];
          float[] var5 = var6;
          return param3 * var6[1] + var6[0] * param1 + param0 * var6[2];
        }
        return 0.2956068813800812f;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Message var5 = null;
        try {
          if (obfuscationGuard > -19) {
            this.stringId = 92;
          }
          var5 = (Message) (other);
          var4 = 0;
          if (var5.tick != this.tick) {
            var4 = 1;
            System.out.println("int tick has changed. before=" + var5.tick + ", now=" + this.tick);
          }
          if (this.stringId != var5.stringId) {
            var4 = 1;
            System.out.println("int string_id has changed. before=" + var5.stringId + ", now=" + this.stringId);
          }
          if (var5.aId != this.aId) {
            var4 = 1;
            System.out.println("int a_id has changed. before=" + var5.aId + ", now=" + this.aId);
          }
          if (this.bId != var5.bId) {
            var4 = 1;
            System.out.println("int b_id has changed. before=" + var5.bId + ", now=" + this.bId);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of Message has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("rha.F(");
          if (other == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        Message var4 = (Message) (param1);
        Message var3 = var4;
        var4.tick = this.tick;
        var4.stringId = this.stringId;
        if (param0 <= 54) {
          return;
        }
        try {
          var4.aId = this.aId;
          var4.bId = this.bId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        this.tick = param0.i(0, 32);
        this.stringId = param0.i(0, 8);
        if (param1) {
          return;
        }
        try {
          this.aId = param0.i(0, 8) - 1;
          this.bId = -1 + param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    Message() {
    }

    Message(int param0, int param1, int param2) {
        this.stringId = param0;
        this.bId = param2;
        this.aId = param1;
    }

    static {
    }
}
