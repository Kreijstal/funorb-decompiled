/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NebulaField implements DiffableState, ofa {
    private Nebula[] nebulae;
    static int field_d;
    private int field_a;
    static int field_c;

    final Nebula a(byte param0, int param1) {
        Nebula var3 = this.nebulae[param1];
        int var4 = -90 / ((param0 - 0) / 38);
        this.nebulae = (Nebula[]) (GetSalvoUsesAllEnergy.a(rma.field_c, param1, 15667, this.nebulae));
        this.a(125);
        return var3;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        NebulaField var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tv var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (NebulaField) (other);
          if (obfuscationGuard >= -19) {
            var5 = (tv) null;
            this.b((byte) 8, (tv) null);
          }
          tja.a(var3.nebulae, 1, this.nebulae, false, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.nebulae, false, 1, this.nebulae, 124)) {
            var4 = 1;
            System.out.println("Nebula[] nebulae has changed. ");
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of NebulaContainer has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("lua.F(");
          if (other == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = sja.field_g;
        sja.field_g = sja.field_g + 1;
        this.field_a = fieldTemp$0;
        if (param0 <= 118) {
          NebulaField.a((byte) 80);
        }
    }

    public final void b(faa param0, int param1) {
        int var7 = 0;
        faa var3 = null;
        Nebula[] var4 = null;
        int var5 = 0;
        Nebula[] var6 = null;
        Nebula var8 = null;
        int var9 = 0;
        int stackIn_4_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          var3 = param0;
          var4 = this.nebulae;
          if (var4 != null) {
            stackIn_4_0 = var4.length;
          } else {
            stackIn_4_0 = 0;
          }
          var5 = stackIn_4_0;
          var3.a(-632, var5, 12);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              stackIn_10_0 = var3;
              stackIn_10_1 = -68;
              stackIn_11_2 = (var8 != null);
              if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
              }
            }
          }
          if (param1 <= -109) {
            return;
          }
          this.nebulae = (Nebula[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("lua.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        NebulaField var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 75 % ((param0 - 22) / 59);
          var3 = (NebulaField) (param1);
          stackIn_1_0 = SetCountermeasureLauncherAimspeed.a(var3.nebulae, false, 1, this.nebulae, -78);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("lua.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
          return;
        }
        NebulaField var3 = (NebulaField) (param1);
        if (var3.field_a == this.field_a) {
          return;
        }
        try {
          var3.field_a = this.field_a;
          var3.nebulae = (Nebula[]) (sqb.a(var3.nebulae, this.nebulae, 1, rma.field_c, false));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(Nebula param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.nebulae &&
            this.nebulae.length >= 4095) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          this.nebulae = (Nebula[]) (ija.a(param0, this.nebulae, 0, rma.field_c));
          this.a(124);
          if (param1 <= 73) {
            this.a(60);
          }
          stackIn_8_0 = -1 + this.nebulae.length;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lua.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final Nebula[] a(boolean param0) {
        if (param0) {
          this.field_a = -112;
          return this.nebulae;
        }
        return this.nebulae;
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            NebulaField.a((byte) 76);
          }
          this.nebulae = (Nebula[]) (SetAutoDetail.a(12, rma.field_c, param0, 1, -65, this.nebulae));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lua.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static qsa a(byte param0) {
        qsa[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        if (SetKeepTeamColours.field_p.length > GetDebrisCarryOver.field_p) {
          if (SetKeepTeamColours.field_p[GetDebrisCarryOver.field_p] == null) {
            SetKeepTeamColours.field_p[GetDebrisCarryOver.field_p] = new qsa();
          }
          int var1 = 28 / ((15 - param0) / 47);
          fieldTemp$0 = SetKeepTeamColours.field_p;
          fieldTemp$1 = GetDebrisCarryOver.field_p;
          GetDebrisCarryOver.field_p = GetDebrisCarryOver.field_p + 1;
          return fieldTemp$0[fieldTemp$1];
        }
        GetDebrisThrowable.a(false, "We've run out of temp objective slots");
        return null;
    }

    NebulaField() {
        this.field_a = 0;
        this.a(123);
        this.nebulae = null;
    }

    static {
        field_d = 1024;
        field_c = 0;
    }
}
