/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipSpawnedCondition extends MissionCondition implements DiffableState {
    static int field_d;
    private int teamId;
    static String[] field_e;

    public final void reportDifferences(tv other, int obfuscationGuard) {
        ShipSpawnedCondition var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          super.reportDifferences(other, -47);
          var3 = (ShipSpawnedCondition) (other);
          var4 = 0;
          if (var3.teamId != this.teamId) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var3.teamId + ", now=" + this.teamId);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionShipJustSpawned has changed");
          }
          if (obfuscationGuard >= -19) {
            field_d = -49;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jsb.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final ucb[] a(World param0, int param1) {
        RuntimeException var3 = null;
        ucb[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -20605) {
            return null;
          }
          stackIn_3_0 = (ucb[]) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jsb.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] a(World param0, int param1, int[] param2) {
        int var6 = 0;
        Ship[] var4 = null;
        Ship[] var5 = null;
        Ship var7 = null;
        int var8 = 0;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = VoidHunters.field_G;
        try {
          var4 = param0.getShips(1000);
          if (param1 <= 16) {
            this.a(-56);
          }
          var5 = var4;
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.getTeam((byte) 114) == this.teamId &&
              !var7.l((byte) -10) &&
              var7.getOwner((byte) -117) >= 0 &&
              var7.field_D) {
              param2 = SetAutozoomSpeedDivide.a(var7.getId(false), true, param2, (byte) -14);
            }
          }
          stackIn_23_0 = (int[]) (param2);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("jsb.J(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final boolean a(int param0, MissionState param1, World param2) {
        int var6 = 0;
        RuntimeException var4 = null;
        Ship[] var5 = null;
        Ship var7 = null;
        int var8 = 0;
        Ship[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = param2.getShips(param0 ^ 1000);
          var5 = var9;
          for (var6 = param0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.getTeam((byte) 93) == this.teamId &&
              var7.field_D) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jsb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 11) {
          ShipSpawnedCondition.b((byte) 113);
        }
        field_e = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ShipSpawnedCondition var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -112 % ((param0 - 22) / 59);
          var4 = (ShipSpawnedCondition) (param1);
          stackIn_5_0 = (super.a((byte) -56, param1)) || (this.teamId != var4.teamId);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jsb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        ShipSpawnedCondition var6 = null;
        ShipSpawnedCondition var7 = null;
        try {
          var6 = (ShipSpawnedCondition) (param1);
          var7 = var6;
          if (param0 <= 54) {
            World var4 = (World) null;
            this.a((World) null, -15);
          }
          super.b((byte) 81, param1);
          var7.teamId = this.teamId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jsb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ShipSpawnedCondition() {
    }

    final String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        String var2 = "Any ship just spawned";
        return var2 + " onto team " + this.teamId;
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.teamId = param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jsb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ShipSpawnedCondition(int param0) {
        this.teamId = param0;
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          World var4 = (World) null;
          this.a((World) null, 9);
        }
        return this.teamId;
    }

    final void a(World param0, int param1, int param2, int param3) {
        if (param1 != -2) {
          return;
        }
        try {
          this.teamId = (SettingsChange.field_b + param3) % SettingsChange.field_b;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jsb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -116);
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.teamId, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jsb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = 1;
    }
}
