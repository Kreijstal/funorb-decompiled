/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    private boolean field_g;
    static MusicTrack[] field_b;
    static boolean field_c;
    private int field_h;
    static String[] field_f;
    static int field_e;
    private int field_a;
    private int[] field_d;
    static boolean field_i;

    final void e(int param0, int param1) {
        if (param0 == 26884) {
          this.a(param1, this.field_a + 1, param0 ^ -27002);
          return;
        }
        this.a(60);
        this.a(param1, this.field_a + 1, param0 ^ -27002);
    }

    final static void a(int param0, ModelMesh param1) {
        try {
          if (param0 <= 123) {
            field_c = false;
          }
          param1.field_Z = MidiPcmStream.field_E;
          param1.field_t = MidiPcmStream.field_E;
          param1.field_R = MidiPcmStream.field_E;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0, int param1) {
        if (param0 > this.field_a) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 652110180) {
          return this.field_d[param0];
        }
        return 75;
    }

    final int a(int param0) {
        if (param0 > -54) {
          fh.b((byte) 62);
          return 1 + this.field_a;
        }
        return 1 + this.field_a;
    }

    final void b(int param0, int param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_a < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 < -64) {
          if (param0 != this.field_a) {
            vm.a(this.field_d, 1 + param0, this.field_d, param0, this.field_a - param0);
          }
          this.field_a = this.field_a - 1;
          return;
        }
        field_c = true;
        if (param0 != this.field_a) {
          vm.a(this.field_d, 1 + param0, this.field_d, param0, this.field_a - param0);
        }
        this.field_a = this.field_a - 1;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 == -28) {
          field_f = null;
          return;
        }
        int[] var2 = (int[]) null;
        fh.$cfr$intArgs$a$e0bc7fdb2979(3, 71, -110, (int[]) null, 86, 72, -80);
        field_f = null;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_a < param1) {
          this.field_a = param1;
        }
        if (param2 > -41) {
          this.field_d = (int[]) null;
        }
        if (param1 >= this.field_d.length) {
          this.c(74, param1);
        }
        this.field_d[param1] = param0;
    }

    private fh() throws Throwable {
        throw new Error();
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(param1, -18113)];
        int[] var3 = var4;
        vm.a(this.field_d, 0, var4, 0, this.field_d.length);
        this.field_d = var4;
        if (param0 > 34) {
          return;
        }
        this.a(99);
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = this.field_d.length;
        while (param0 >= var3) {
          if (!this.field_g) {
            var3 = var3 + this.field_h;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_h;
            continue;
          }
          var3 = 1;
        }
        if (param1 == -18113) {
          return var3;
        }
        this.field_d = (int[]) null;
        return var3;
    }

    final static boolean b(byte param0) {
        int var1 = -84 % ((-51 - param0) / 32);
        if (null == MoveAttackRequest.sessionSocket) {
          return false;
        }
        if (ov.connectionState.b((byte) -121)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ModelMesh var15 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = TriangleRasterizer.projectionCenterX;
          var8 = TriangleRasterizer.projectionCenterY;
          var9 = TriangleRasterizer.sineTable[150];
          var10 = TriangleRasterizer.cosineTable[150];
          if (param2 != 56) {
            var15 = (ModelMesh) null;
            fh.a(104, (ModelMesh) null);
          }
          var11 = -(param6 * var9) + var10 * param0 >> 16;
          var12 = param0 * var9 + param6 * var10 >> 16;
          if (var12 <= 0) {
            return;
          }
          var13 = (param5 << 9) / var12 + var7_int;
          var14 = var8 + (var11 << 9) / var12;
          SoftwareRaster.a(var13 << 4, var14 << 4, param1, param4, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("fh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_c = true;
        field_f = new String[]{"This unit can still move and attack this turn", "This unit can still attack enemies in range this turn", "This unit has no actions left this turn", "This unit is poisoned", "This unit is paralysed with fear", "This unit's morale is boosted", "This unit is confused", "This unit has no status modifiers"};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e0bc7fdb2979(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ModelMesh var15 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = TriangleRasterizer.projectionCenterX;
          var8 = TriangleRasterizer.projectionCenterY;
          var9 = TriangleRasterizer.sineTable[150];
          var10 = TriangleRasterizer.cosineTable[150];
          if (param2 != 56) {
            var15 = (ModelMesh) null;
            fh.a(104, (ModelMesh) null);
          }
          var11 = -(param6 * var9) + var10 * param0 >> 16;
          var12 = param0 * var9 + param6 * var10 >> 16;
          if (var12 <= 0) {
            return;
          }
          var13 = (param5 << 9) / var12 + var7_int;
          var14 = var8 + (var11 << 9) / var12;
          SoftwareRaster.a(var13 << 4, var14 << 4, param1, param4, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("fh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }
}
