/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Asteroid extends ShipBody implements DiffableState, utb, ofa {
    static int[][] field_w;
    private int field_u;
    static bwa field_v;

    final int d(int param0) {
        if (param0 <= 42) {
          faa var3 = (faa) null;
          this.a((faa) null, (byte) -116);
          return 3;
        }
        return 3;
    }

    public final void a(faa param0, int param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          super.b(param0, -115);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        try {
          super.reportDifferences(other, -45);
          if (obfuscationGuard >= -19) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 80 / ((22 - param0) / 59);
          stackIn_1_0 = super.a((byte) 96, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("crb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != 3) {
          Asteroid.a(123, true);
          field_w = (int[][]) null;
          field_v = null;
          return;
        }
        field_w = (int[][]) null;
        field_v = null;
    }

    public final void b(byte param0, tv param1) {
        Asteroid var3 = (Asteroid) (param1);
        if (this.field_u == var3.field_u) {
          return;
        }
        try {
          var3.field_u = this.field_u;
          super.b((byte) 94, param1);
          if (param0 <= 54) {
            field_v = (bwa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 3) {
          return;
        }
        if (GetReverbDry.e((byte) 105)) {
          param1 = false;
        }
        SetPhasedEnergyBeamAimspeed.a(-128, param1);
        if (!kea.field_b) {
          SetMissionDebrisVotingChancestep.a(param1, 4095);
          return;
        }
        dma.e(GetReverbWidth.field_o.field_a.field_L, GetReverbWidth.field_o.field_a.field_K, GetReverbWidth.field_o.field_a.field_hb, GetReverbWidth.field_o.field_a.field_G);
        GetReverbWidth.field_o.field_a.b(param1, 35);
        SetMissionDebrisVotingChancestep.a(param1, 4095);
    }

    public final void a(faa param0, byte param1) {
        try {
          super.a(param0, (byte) -101);
          if (param1 > -91) {
            Asteroid.l(-20);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    Asteroid() {
        this.field_u = 0;
        this.d((byte) -50);
    }

    final void d(byte param0) {
        int fieldTemp$0 = SetLag.field_o;
        SetLag.field_o = SetLag.field_o + 1;
        this.field_u = fieldTemp$0;
        GetCountermeasuresCooldown.e((byte) -125);
        int var2 = -58 / ((param0 + 4) / 38);
    }

    Asteroid(ShipComponent param0) {
        this.field_u = 0;
        this.d((byte) -50);
        try {
          this.chassis = param0;
          this.e((byte) 119);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "crb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
