/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceNode implements DiffableState {
    int field_h;
    static int field_a;
    int y;
    static byte[] field_g;
    int captureTimer;
    int team;
    static int[][] field_b;
    int x;
    int radius;

    final void b(lta param0, int param1) {
        try {
          SetNumStars.a((float)this.radius * param0.field_a, (byte) 55, param0.b(true, this.y), qpb.a(false, this.team, 13894143), param0.a(this.x, (byte) 124));
          this.a(param0, 8947848);
          int var3_int = 97 % ((55 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rba.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        ResourceNode var3 = null;
        int var4 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (ResourceNode) (param1);
          var4 = 3 % ((22 - param0) / 59);
          stackIn_8_0 = (this.x != var3.x) || (var3.y != this.y) || (this.radius != var3.radius) || (this.team != var3.team) || (this.captureTimer != var3.captureTimer);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("rba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
          param0.a(-632, this.radius, 32);
          param0.a(-632, this.team, 32);
          param0.a(-632, this.captureTimer, 32);
          if (param1 > -109) {
            this.radius = -88;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rba.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ResourceNode var5 = null;
        try {
          var5 = (ResourceNode) (other);
          var4 = 0;
          if (this.x != var5.x) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
          }
          if (this.y != var5.y) {
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
            var4 = 1;
          }
          if (this.radius != var5.radius) {
            var4 = 1;
            System.out.println("int radius has changed. before=" + var5.radius + ", now=" + this.radius);
          }
          if (this.team != var5.team) {
            var4 = 1;
            System.out.println("int team has changed. before=" + var5.team + ", now=" + this.team);
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.captureTimer != var5.captureTimer) {
            var4 = 1;
            System.out.println("int capture_timer has changed. before=" + var5.captureTimer + ", now=" + this.captureTimer);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of ResourceNode has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("rba.F(");
          if (other == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var5 = 72 / ((8 - param1) / 57);
        int var4 = param0 - this.x;
        int var6 = param2 - this.y;
        int var7 = ar.a(var4, (byte) 118, var6);
        return var7 <= this.radius ? true : false;
    }

    public final void b(byte param0, tv param1) {
        ResourceNode var4 = (ResourceNode) (param1);
        ResourceNode var3 = var4;
        var4.team = this.team;
        var4.radius = this.radius;
        if (param0 <= 54) {
          return;
        }
        try {
          var4.y = this.y;
          var4.x = this.x;
          var4.captureTimer = this.captureTimer;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(lta param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8947848) {
            ResourceNode.a(false);
          }
          if (this.captureTimer <= 0) {
            return;
          }
          var3_int = param0.a(this.x - this.radius, (byte) 112);
          var4 = param0.b(true, this.y - (-this.radius - 8192));
          var5 = (int)(2.0f * (param0.field_a * (float)this.radius));
          var6 = (int)(8192.0f * param0.field_a);
          uv.a(126, var3_int - 1, var6 + 2, -1 + var4, 8947848, var5 + 2);
          var7 = qpb.a(false, this.field_h, 13894143);
          var8 = GetGrapplingHookAimarc.a(-16777216, var7);
          ci.a(var4, var6, var8, this.captureTimer * var5 / Particle.field_G, var3_int, var7, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rba.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static RasterBuffer a(int param0, boolean param1, java.awt.Canvas param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          java.awt.Canvas var6 = null;
          RasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("du");
              if (!param1) {
                var6 = (java.awt.Canvas) null;
                ResourceNode.a(102, true, (java.awt.Canvas) null, -4);
              }
              var5 = (RasterBuffer) (var4.newInstance());
              var5.a(4904, param0, param3, param2);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).a(4904, param0, param3, param2);
              stackIn_5_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("rba.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.radius = param0.i(0, 32);
          if (param1) {
            this.y = 51;
          }
          this.team = param0.i(0, 32);
          this.captureTimer = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ResourceNode() {
    }

    public static void a(boolean param0) {
        if (param0) {
          field_g = (byte[]) null;
          field_g = null;
          field_b = (int[][]) null;
          return;
        }
        field_g = null;
        field_b = (int[][]) null;
    }

    ResourceNode(int param0, int param1) {
        this.y = param1;
        this.captureTimer = 0;
        this.radius = 131072;
        this.x = param0;
        this.team = -1;
    }

    static {
        field_a = 15;
        field_g = new byte[]{(byte) 0};
    }
}
