/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionList implements DiffableState {
    static eab field_b;
    private Mission[] missions;

    final static boolean a(byte param0) {
        if (param0 >= -41) {
          return false;
        }
        if (null == fwa.field_g) {
          return false;
        }
        if (fwa.field_g.field_e == null) {
          return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (eab) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static java.applet.Applet b(byte param0) {
        if (bkb.field_b != null) {
          return bkb.field_b;
        }
        if (param0 >= -81) {
          return (java.applet.Applet) null;
        }
        return (java.applet.Applet) ((Object) tu.field_a);
    }

    public final void b(faa param0, int param1) {
        int var7 = 0;
        faa var3 = null;
        Mission[] var4 = null;
        int var5 = 0;
        Mission[] var6 = null;
        Mission var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 >= -109) {
            field_b = (eab) null;
          }
          var3 = param0;
          var4 = this.missions;
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var5 = stackIn_6_0;
          var3.a(-632, var5, 8);
          if (0 != var5) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              stackIn_11_0 = var3;
              stackIn_11_1 = -88;
              stackIn_12_2 = (var8 != null);
              if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_12_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("vpa.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final Mission a(int param0, boolean param1) {
        Object var3;
        int var4;
        int var5;
        tv var6;
        var5 = VoidHunters.field_G;
        if (null == this.missions) {
          return null;
        }
        var3 = null;
        var4 = 0;
        if (!param1) {
          while (this.missions.length > var4) {
            if (param0 == this.missions[var4].a(0)) {
              return this.missions[var4];
            }
            if (this.missions[var4].a(0) == 0) {
              var3 = this.missions[var4];
            }
            var4++;
          }
          System.err.println("Mission id " + param0 + ", not found, using sandbox");
          return (Mission) (var3);
        }
        var6 = (tv) null;
        this.reportDifferences((tv) null, -74);
        while (this.missions.length > var4) {
          if (param0 == this.missions[var4].a(0)) {
            return this.missions[var4];
          }
          if (this.missions[var4].a(0) == 0) {
            var3 = this.missions[var4];
          }
          var4++;
        }
        System.err.println("Mission id " + param0 + ", not found, using sandbox");
        return (Mission) (var3);
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        MissionList var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (MissionList) (other);
          tja.a(var3.missions, 1, this.missions, false, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.missions, false, 1, this.missions, -5)) {
            var4 = 1;
            System.out.println("Mission[] missions has changed. ");
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionList has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vpa.F(");
          if (other == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        MissionList var3 = (MissionList) (param1);
        if (param0 <= 54) {
          return;
        }
        try {
          var3.missions = (Mission[]) (sqb.a(var3.missions, this.missions, 1, GetThrusterParticleLife.field_p, false));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vpa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        MissionList var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (MissionList) (param1);
          var4 = -51 / ((22 - param0) / 59);
          stackIn_1_0 = SetCountermeasureLauncherAimspeed.a(var3.missions, false, 1, this.missions, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("vpa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.missions = (Mission[]) (SetAutoDetail.a(8, GetThrusterParticleLife.field_p, param0, 1, -92, this.missions));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vpa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
