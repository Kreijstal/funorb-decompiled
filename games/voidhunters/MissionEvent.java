/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionEvent implements DiffableState {
    static int field_d;
    static int field_a;
    static String field_e;
    private MissionCondition[] conditions;
    private MissionAction[] actions;
    static String field_f;

    public final boolean a(byte param0, tv param1) {
        MissionEvent var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (MissionEvent) (param1);
          var4 = -88 / ((22 - param0) / 59);
          stackIn_5_0 = (SetCountermeasureLauncherAimspeed.a(var3.conditions, true, 1, this.conditions, -4)) || (SetCountermeasureLauncherAimspeed.a(var3.actions, true, 1, this.actions, -73));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("bba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(GameSnapshot param0, int param1) {
        int var4_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        MissionCondition var5_ref_wm = null;
        int var5 = 0;
        int var6_int = 0;
        MissionAction var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (param1 >= -27) {
            return;
          }
          var3_int = 1;
          if (null != this.conditions) {
            for (var4_int = 0; this.conditions.length > var4_int; var4_int++) {
              var5_ref_wm = this.conditions[var4_int];
              var6_int = var5_ref_wm.a(0, param0.missionState, param0.world) ^ var5_ref_wm.negated ? 1 : 0;
              if (var6_int == 0) {
                var3_int = 0;
              }
            }
          }
          if (var3_int != 0 &&
            null != this.actions) {
            var4 = null;
            if (null != this.conditions) {
              for (var5 = 0; var5 < this.conditions.length; var5++) {
                var4 = this.conditions[var5].a(param0.world, 120, (int[]) (var4));
              }
            }
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < this.actions.length) {
              var6 = this.actions[var8];
              var6.a(1, (int[]) (var4), param0);
              var8++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("bba.N(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        MissionEvent var9 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        Class[] var6 = null;
        dja[] var7 = null;
        try {
          var9 = (MissionEvent) (param1);
          var4 = new Class[]{VariableCondition.class, ShipSpawnedCondition.class, TeamNodeCondition.class, MissionCondition.class, BodyInZoneCondition.class, TeamShipComponentCondition.class, TickCondition.class, ShipCondition.class, BodyCondition.class};
          var5 = new dja[]{lq.field_i, GetFps.field_o, GetUseCircleOutline.field_o, jv.field_d, GetNebulaProximityFadeDownshift.field_o, SetSalvoaim.field_s, GetMachineGunEnergyUsed.field_q, rla.field_v, oua.field_b};
          var9.conditions = (MissionCondition[]) (hla.a(var4, this.conditions, var5, -118, var9.conditions, 1, jv.field_d));
          if (param0 <= 54) {
            tv var8 = (tv) null;
            this.reportDifferences((tv) null, 121);
          }
          var6 = new Class[]{SetVariableLabelAction.class, AdjustVariableAction.class, SetShipTeamAction.class, IncrementVariableAction.class, MissionAction.class, AwardVictoryToWinnerAction.class, RemoveEventAction.class, AdjustBodyComponentsAction.class, AwardVictoryToTeamAction.class, SetVariableAction.class};
          var7 = new dja[]{GetUseBackgroundInFullscreen.field_o, re.field_k, SetDebrisCarryOver.field_o, cwa.field_a, SetUseCircleOutline.field_o, GetLaserBeamProjectileDamage.field_r, SetShieldsDirectionalHalfarcCuts.field_o, GetFixedaim.field_q, SetBloomThresholdPercentage.field_o, whb.field_c};
          var9.actions = (MissionAction[]) (hla.a(var6, this.actions, var7, -120, var9.actions, 1, SetUseCircleOutline.field_o));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(MissionAction param0, boolean param1) {
        try {
          this.actions = (MissionAction[]) (ija.a(param0, this.actions, 0, SetUseCircleOutline.field_o));
          if (!param1) {
            MissionCondition var4 = (MissionCondition) null;
            this.a((byte) 23, (MissionCondition) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bba.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        MissionEvent var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (MissionEvent) (other);
          tja.a(var3.conditions, 1, this.conditions, true, 5547);
          tja.a(var3.actions, 1, this.actions, true, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.conditions, true, 1, this.conditions, -64)) {
            System.out.println("MissionCondition[] conditions has changed. ");
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          if (SetCountermeasureLauncherAimspeed.a(var3.actions, true, 1, this.actions, -13)) {
            System.out.println("MissionAction[] actions has changed. ");
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionEvent has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bba.F(");
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        Class[] var5 = null;
        Class[] var4 = null;
        try {
          if (param1 >= -109) {
            this.a(-43, -72);
          }
          var5 = new Class[]{VariableCondition.class, ShipSpawnedCondition.class, TeamNodeCondition.class, MissionCondition.class, BodyInZoneCondition.class, TeamShipComponentCondition.class, TickCondition.class, ShipCondition.class, BodyCondition.class};
          pjb.a(param0, this.conditions, 8, 1, var5, 122);
          var4 = new Class[]{SetVariableLabelAction.class, AdjustVariableAction.class, SetShipTeamAction.class, IncrementVariableAction.class, MissionAction.class, AwardVictoryToWinnerAction.class, RemoveEventAction.class, AdjustBodyComponentsAction.class, AwardVictoryToTeamAction.class, SetVariableAction.class};
          pjb.a(param0, this.actions, 8, 1, var4, 118);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bba.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final MissionCondition[] getConditions(byte param0) {
        if (param0 >= -110) {
          GameSnapshot var3 = (GameSnapshot) null;
          this.a((GameSnapshot) null, -8);
        }
        return this.conditions;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 > -30) {
          return;
        }
        field_e = null;
    }

    final void a(byte param0, MissionCondition param1) {
        try {
          this.conditions = (MissionCondition[]) (ija.a(param1, this.conditions, 0, jv.field_d));
          if (param0 >= -97) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bba.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        Class[] var5 = null;
        dja[] var6 = null;
        Class[] var7 = new Class[]{VariableCondition.class, ShipSpawnedCondition.class, TeamNodeCondition.class, MissionCondition.class, BodyInZoneCondition.class, TeamShipComponentCondition.class, TickCondition.class, ShipCondition.class, BodyCondition.class};
        dja[] var4 = new dja[]{lq.field_i, GetFps.field_o, GetUseCircleOutline.field_o, jv.field_d, GetNebulaProximityFadeDownshift.field_o, SetSalvoaim.field_s, GetMachineGunEnergyUsed.field_q, rla.field_v, oua.field_b};
        this.conditions = (MissionCondition[]) (iq.a(var4, this.conditions, var7, jv.field_d, 8, param0, 1, 108));
        if (param1) {
          return;
        }
        try {
          var5 = new Class[]{SetVariableLabelAction.class, AdjustVariableAction.class, SetShipTeamAction.class, IncrementVariableAction.class, MissionAction.class, AwardVictoryToWinnerAction.class, RemoveEventAction.class, AdjustBodyComponentsAction.class, AwardVictoryToTeamAction.class, SetVariableAction.class};
          var6 = new dja[]{GetUseBackgroundInFullscreen.field_o, re.field_k, SetDebrisCarryOver.field_o, cwa.field_a, SetUseCircleOutline.field_o, GetLaserBeamProjectileDamage.field_r, SetShieldsDirectionalHalfarcCuts.field_o, GetFixedaim.field_q, SetBloomThresholdPercentage.field_o, whb.field_c};
          this.actions = (MissionAction[]) (iq.a(var6, this.actions, var5, SetUseCircleOutline.field_o, 8, param0, 1, 119));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int stackIn_6_0 = 0;
        if (param1 != -79) {
          this.conditions = (MissionCondition[]) null;
        }
        if (0 <= param0) {
          if (this.conditions == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = this.conditions.length;
          }
          var3 = stackIn_6_0;
          if (this.conditions != null &&
            param0 < this.conditions.length) {
            this.conditions = (MissionCondition[]) (GetSalvoUsesAllEnergy.a(jv.field_d, param0, 15667, this.conditions));
          } else {
            if (null != this.actions &&
              -var3 + param0 < this.actions.length) {
              this.actions = (MissionAction[]) (GetSalvoUsesAllEnergy.a(SetUseCircleOutline.field_o, param0 - var3, 15667, this.actions));
            }
          }
        }
    }

    final static int a(int param0, ShipComponent param1, int param2, int[] param3) {
        int dupTemp$4 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ShipComponent var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 0) {
            stackIn_3_0 = 41;
            return stackIn_3_0;
          }
          if (param1.hardpoints != null &&
            param1.hardpoints.length != 0) {
            while (param3.length > param2) {
              dupTemp$4 = param3[param2++];
              var4_int = dupTemp$4;
              if (dupTemp$4 != -1) {
                var5 = param3[param2++];
                var6 = new ShipComponent(var5);
                param1.a(1, var4_int, var6);
                param2 = MissionEvent.a(param0 ^ 0, var6, param2, param3);
                if (var4_int != -1 + param1.hardpoints.length) {
                  continue;
                }
              }
              break;
            }
            stackIn_14_0 = param2;
            return stackIn_14_0;
          }
          stackIn_8_0 = param2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("bba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final MissionAction[] getActions(byte param0) {
        if (param0 != -42) {
          return (MissionAction[]) null;
        }
        return this.actions;
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
          this.getActions((byte) 14);
        }
        if (param0 >= 0 &&
          (this.conditions != null && this.conditions.length > param0)) {
          this.conditions[param0].negated = !this.conditions[param0].negated ? true : false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -113 % ((param0 - 32) / 63);
        if (0 > param1) {
          return 0;
        }
        int var5 = this.conditions != null ? this.conditions.length : 0;
        if (this.conditions != null &&
          param1 < this.conditions.length) {
          return this.conditions[param1].a((byte) -117, param2);
        }
        if (null != this.actions &&
          param1 - var5 < this.actions.length) {
          return this.actions[-var5 + param1].a(param2, -125);
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, World param4) {
        int var6_int = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        try {
          if (param3 >= 0) {
            if (this.conditions != null) {
              stackIn_5_0 = this.conditions.length;
            } else {
              stackIn_5_0 = 0;
            }
            var6_int = stackIn_5_0;
            if (null != this.conditions &&
              param3 < this.conditions.length) {
              this.conditions[param3].a(param4, -2, param2, param0);
            } else {
              if (null != this.actions) {
                if (-var6_int + param3 >= this.actions.length) {
                  var6_int = -7 % ((35 - param1) / 63);
                  return;
                }
                this.actions[-var6_int + param3].a(param4, false, param2, param0);
              }
            }
          }
          var6_intLifetime1 = -7 % ((35 - param1) / 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("bba.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_e = "Enter name of friend to delete from list";
        field_a = 50;
        field_f = "Mode";
    }
}
