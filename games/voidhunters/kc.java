/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc implements DiffableState {
    static int[] field_e;
    int version;
    ShipBlueprint blueprint;
    static String field_a;
    private boolean[] tipsDone;
    static int field_b;

    private final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        int[] var4;
        int var6;
        int[] var7;
        var6 = VoidHunters.field_G;
        if (null != this.blueprint) {
          var7 = this.blueprint.description;
          var4 = var7;
          if (var7 != null) {
            for (var5 = 0; var7.length > var5; var5++) {
              if (param2 <= var7[var5]) {
                var7[var5] = var7[var5] + param0;
              }
            }
          }
        }
        if (param1 != 31) {
          field_e = (int[]) null;
        }
    }

    final void a(int param0, boolean[] param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0 != 0) {
            return;
          }
          if (this.tipsDone != null) {
            var3_int = Math.min(param1.length, this.tipsDone.length);
            for (var4 = 0; var3_int > var4; var4++) {
              param1[var4] = this.tipsDone[var4];
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        tv var4 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.a(-632, this.version, 8);
          SetArmageddonTimerStart.a(param0, (byte) -15, this.tipsDone, 8);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = 79;
          stackIn_3_2 = (this.blueprint != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.blueprint.b(param0, -126);
          }
          if (param1 > -109) {
            var4 = (tv) null;
            this.a((byte) 81, (tv) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        kc var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 112 % ((22 - param0) / 59);
          var3 = (kc) (param1);
          if (this.version == var3.version &&
            !EscapePod.a(var3.tipsDone, this.tipsDone, 32)) {
            stackIn_5_0 = (null != var3.blueprint) ? 0 : 1;
            if (null != this.blueprint) {
              stackIn_8_1 = 0;
            } else {
              stackIn_8_1 = 1;
            }
            if ((stackIn_5_0 ^ stackIn_8_1) == 0 && (this.blueprint == null ||
              !this.blueprint.a((byte) 94, var3.blueprint))) {
              stackIn_14_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_14_0 = true;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("kc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -68) {
          kc.a(10);
        }
        field_a = null;
        field_e = null;
    }

    private final void a(byte param0) {
        if (param0 < 46) {
          return;
        }
        if (0 == this.version) {
          this.a(4, (byte) 31, 8);
        }
        this.version = 1;
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        try {
          if (param4 > param2) {
            var5_int = (param4 + param2) / 2;
            var6 = param2;
            var7 = param1[var5_int];
            param1[var5_int] = param1[param4];
            param1[param4] = var7;
            var9 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var9;
            stackIn_6_0 = (9223372036854775807L != var7) ? 1 : 0;
            var10 = stackIn_6_0;
            for (var11 = param2; var11 < param4; var11++) {
              if (param1[var11] < ((long)(var10 & var11) + var7)) {
                var12 = param1[var11];
                param1[var11] = param1[var6];
                param1[var6] = var12;
                var14 = param3[var11];
                param3[var11] = param3[var6];
                param3[var6++] = var14;
              }
            }
            param1[param4] = param1[var6];
            param1[var6] = var7;
            param3[param4] = param3[var6];
            param3[var6] = var9;
            kc.a(-14677, param1, param2, param3, -1 + var6);
            kc.a(-14677, param1, var6 + 1, param3, param4);
          }
          if (param0 != -14677) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean[] param0, int param1) {
        try {
          this.tipsDone = param0;
          if (param1 != -28855) {
            this.version = -112;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public kc() {
        this.version = 1;
    }

    public final void b(byte param0, tv param1) {
        kc var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 < 54) {
            field_b = 51;
          }
          var3 = (kc) (param1);
          var3.version = this.version;
          var3.tipsDone = GetBots.a(var3.tipsDone, -31567, this.tipsDone);
          if (null == this.blueprint) {
            var3.blueprint = null;
          } else {
            if (null == var3.blueprint) {
              var3.blueprint = new ShipBlueprint();
            }
            this.blueprint.b((byte) 72, var3.blueprint);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("kc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kc var5 = null;
        try {
          var5 = (kc) (other);
          if (null != this.blueprint &&
            var5.blueprint != null) {
            this.blueprint.reportDifferences(var5.blueprint, -28);
          }
          var4 = 0;
          if (this.version != var5.version) {
            var4 = 1;
            System.out.println("int version has changed. before=" + var5.version + ", now=" + this.version);
          }
          if (obfuscationGuard >= -19) {
            this.a((byte) 101);
          }
          if (uca.a(this.tipsDone, var5.tipsDone, -48)) {
            System.out.println("boolean[] tips_done has changed. ");
            var4 = 1;
          }
          stackIn_13_0 = (null != var5.blueprint) ? 0 : 1;
          if (null != this.blueprint) {
            stackIn_16_1 = 0;
          } else {
            stackIn_16_1 = 1;
          }
          if ((stackIn_13_0 ^ stackIn_16_1) != 0 ||
            this.blueprint != null &&
            this.blueprint.a((byte) 121, var5.blueprint)) {
            var4 = 1;
            System.out.println("ShipBlueprint blueprint has changed. before=" + var5.blueprint + ", now=" + this.blueprint);
          }
          if (var4 != 0) {
            System.out.println("This instance of PlayerGameData has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("kc.F(");
          if (other == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.version = param0.i(0, 8);
          this.tipsDone = GetAutoaim.a(8, param0, 76, this.tipsDone);
          if (!kv.a(param1, param0)) {
            this.blueprint = null;
          } else {
            if (null == this.blueprint) {
              this.blueprint = new ShipBlueprint();
            }
            this.blueprint.a(param0, false);
          }
          this.a((byte) 58);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Lattice";
        field_b = 0;
    }
}
