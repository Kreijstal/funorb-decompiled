/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamShipComponentCondition extends MissionCondition implements DiffableState {
    private int componentTypeId;
    private int teamId;
    static ri field_e;

    final void a(World param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != -2) {
            return;
          }
          if (0 == param2) {
            this.teamId = (param3 + SettingsChange.field_b) % SettingsChange.field_b;
          } else {
            this.componentTypeId = (56 + param3) % 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vp.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -2404) {
          TeamShipComponentCondition.b(-35);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          return -124;
        }
        if (0 == param1) {
          return this.teamId;
        }
        return this.componentTypeId;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int var4 = 0;
        TeamShipComponentCondition var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var5 = (TeamShipComponentCondition) (other);
          super.reportDifferences(other, -98);
          var4 = 0;
          if (this.teamId != var5.teamId) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var5.teamId + ", now=" + this.teamId);
          }
          if (obfuscationGuard > -19) {
            field_e = (ri) null;
          }
          if (this.componentTypeId != var5.componentTypeId) {
            System.out.println("int component_type_id has changed. before=" + var5.componentTypeId + ", now=" + this.componentTypeId);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionShipHoldsComponent has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vp.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        TeamShipComponentCondition var5 = null;
        TeamShipComponentCondition var6 = null;
        super.b((byte) 69, param1);
        if (param0 <= 54) {
          return;
        }
        try {
          var5 = (TeamShipComponentCondition) (param1);
          var6 = var5;
          var6.teamId = this.teamId;
          var6.componentTypeId = this.componentTypeId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vp.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
              var7.getTeam((byte) 105) == this.teamId &&
              0 < var7.chassis.a(this.componentTypeId, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vp.G(").append(param0).append(',');
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

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -115);
          if (param1 >= -109) {
            this.teamId = -31;
          }
          param0.a(-632, this.teamId, 8);
          param0.a(-632, this.componentTypeId, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.teamId = param0.i(0, 8);
          this.componentTypeId = param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vp.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ucb[] a(World param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -20605) {
            return null;
          }
          this.a((byte) -105, 11);
          stackIn_3_0 = null;
          return (ucb[]) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vp.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] a(World param0, int param1, int[] param2) {
        int var6 = 0;
        Ship[] var5 = null;
        Ship var7 = null;
        int var8 = 0;
        Ship[] var9 = null;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = param0.getShips(1000);
          var5 = var9;
          if (param1 < 16) {
            this.a((World) null, -9);
          }
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.getTeam((byte) 114) == this.teamId &&
              !var7.l((byte) -10) &&
              var7.getOwner((byte) -117) >= 0 &&
              var7.chassis.a(this.componentTypeId, 0) > 0) {
              param2 = SetAutozoomSpeedDivide.a(var7.getId(false), true, param2, (byte) -14);
            }
          }
          stackIn_22_0 = (int[]) (param2);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("vp.J(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
          this.a(-64, (MissionState) null, (World) null);
        }
        String var2 = "Any ship ";
        return var2 + "on team " + this.teamId + " holds component " + SetSpinningBladeSpinupSpeed.field_o[this.componentTypeId];
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        TeamShipComponentCondition var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 81 % ((22 - param0) / 59);
          var4 = (TeamShipComponentCondition) (param1);
          stackIn_6_0 = (super.a((byte) -76, param1)) || (var4.teamId != this.teamId) || (var4.componentTypeId != this.componentTypeId);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    TeamShipComponentCondition() {
    }

    TeamShipComponentCondition(int param0, int param1) {
        this.teamId = param0;
        this.componentTypeId = param1;
    }

    static {
        field_e = new ri(0, 2, 2, 1);
    }
}
