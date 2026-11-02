/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShieldsDirectionalRadius extends ConsoleCommand {
    static int field_o;
    static int field_p;

    GetShieldsDirectionalRadius(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        if (!EscapePod.a(GetBoostersCooldown.field_o, qd.field_a, 32)) {
          return;
        }
        if (es.field_b == null) {
          es.field_b = new kc();
        }
        es.field_b.a(qd.field_a, -28855);
        GetMissionResnetResourceTickTime.e((byte) -46);
        int var1 = -27 / ((1 - param0) / 32);
        GetBoostersCooldown.field_o = GetBots.a(GetBoostersCooldown.field_o, -31567, qd.field_a);
    }

    final static void a(byte param0, boolean param1) {
        boolean stackIn_9_0 = false;
        int stackIn_12_1;
        int stackIn_12_2;
        boolean stackIn_12_3;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        boolean stackIn_14_7 = false;
        boolean stackIn_32_0 = false;
        int stackIn_35_1;
        int stackIn_35_2;
        boolean stackIn_35_3;
        int stackIn_35_4;
        int stackIn_35_5;
        int stackIn_35_6;
        boolean stackIn_37_7 = false;
        boolean stackIn_54_0 = false;
        int stackIn_57_1;
        int stackIn_57_2;
        boolean stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_57_6;
        boolean stackIn_59_7 = false;
        int stackIn_75_0 = 0;
        boolean stackIn_82_0 = false;
        int stackIn_85_1;
        int stackIn_85_2;
        boolean stackIn_85_3;
        int stackIn_85_4;
        int stackIn_85_5;
        int stackIn_85_6;
        boolean stackIn_87_7 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        SetRepairModeRadius.a(param0 ^ 21);
        if (param0 == 21) {
          if (null != SetSpinningBladeSpindamageMultiplier.field_o) {
            stackIn_75_0 = (dib.a(112, SetSpinningBladeSpindamageMultiplier.field_o.field_zb)) ? 1 : 0;
          } else {
            stackIn_75_0 = 0;
          }
          var2 = stackIn_75_0;
          var3 = GetBombletSprayEnergyUsed.field_p.width;
          var4 = GetBombletSprayEnergyUsed.field_p.height;
          var5 = (var3 - dma.field_g) / 2;
          var6 = -dma.field_j + var4;
          if (!SetShipTeamAction.field_f ||
            !GetMessageFadetime.field_o) {
            var6 = (var4 - dma.field_j) / 2;
          }
          GetBombletSprayReload.a(70, var6, var5);
          stackIn_82_0 = !(GetCountermeasureLauncherEnergyUsed.field_o <= 50);
          stackIn_85_1 = 11;
          stackIn_85_2 = 14;
          stackIn_85_3 = true;
          stackIn_85_4 = GetPointDefenceLaserPulsetime.field_o;
          stackIn_85_5 = param0 ^ 16777194;
          stackIn_85_6 = var2;
          stackIn_87_7 = (GetThrusterSmallForce.field_o) || (SetMissionTerrainDebrisProbability.field_p);
          SetGrapplingHookRopeBreakLength.a(stackIn_82_0, stackIn_85_1, stackIn_85_2, stackIn_85_3, stackIn_85_4, stackIn_85_5, stackIn_85_6 != 0, stackIn_87_7, param1, 13, 15, 0);
        } else {
          GetShieldsDirectionalRadius.a(77);
          if (null == SetSpinningBladeSpindamageMultiplier.field_o) {
            var2 = 0;
            var3 = GetBombletSprayEnergyUsed.field_p.width;
            var4 = GetBombletSprayEnergyUsed.field_p.height;
            var5 = (var3 - dma.field_g) / 2;
            var6 = -dma.field_j + var4;
            if (!SetShipTeamAction.field_f ||
              !GetMessageFadetime.field_o) {
              var6 = (var4 - dma.field_j) / 2;
            }
            GetBombletSprayReload.a(70, var6, var5);
            stackIn_9_0 = !(GetCountermeasureLauncherEnergyUsed.field_o <= 50);
            stackIn_12_1 = 11;
            stackIn_12_2 = 14;
            stackIn_12_3 = true;
            stackIn_12_4 = GetPointDefenceLaserPulsetime.field_o;
            stackIn_12_5 = param0 ^ 16777194;
            stackIn_12_6 = var2;
            stackIn_14_7 = (GetThrusterSmallForce.field_o) || (SetMissionTerrainDebrisProbability.field_p);
            SetGrapplingHookRopeBreakLength.a(stackIn_9_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6 != 0, stackIn_14_7, param1, 13, 15, 0);
          } else {
            if (dib.a(112, SetSpinningBladeSpindamageMultiplier.field_o.field_zb)) {
              var2 = 1;
              var3 = GetBombletSprayEnergyUsed.field_p.width;
              var4 = GetBombletSprayEnergyUsed.field_p.height;
              var5 = (var3 - dma.field_g) / 2;
              var6 = -dma.field_j + var4;
              if (!SetShipTeamAction.field_f ||
                !GetMessageFadetime.field_o) {
                var6 = (var4 - dma.field_j) / 2;
              }
              GetBombletSprayReload.a(70, var6, var5);
              stackIn_54_0 = !(GetCountermeasureLauncherEnergyUsed.field_o <= 50);
              stackIn_57_1 = 11;
              stackIn_57_2 = 14;
              stackIn_57_3 = true;
              stackIn_57_4 = GetPointDefenceLaserPulsetime.field_o;
              stackIn_57_5 = param0 ^ 16777194;
              stackIn_57_6 = var2;
              stackIn_59_7 = (GetThrusterSmallForce.field_o) || (SetMissionTerrainDebrisProbability.field_p);
              SetGrapplingHookRopeBreakLength.a(stackIn_54_0, stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_57_6 != 0, stackIn_59_7, param1, 13, 15, 0);
            } else {
              var2 = 0;
              var3 = GetBombletSprayEnergyUsed.field_p.width;
              var4 = GetBombletSprayEnergyUsed.field_p.height;
              var5 = (var3 - dma.field_g) / 2;
              var6 = -dma.field_j + var4;
              if (!SetShipTeamAction.field_f ||
                !GetMessageFadetime.field_o) {
                var6 = (var4 - dma.field_j) / 2;
              }
              GetBombletSprayReload.a(70, var6, var5);
              stackIn_32_0 = !(GetCountermeasureLauncherEnergyUsed.field_o <= 50);
              stackIn_35_1 = 11;
              stackIn_35_2 = 14;
              stackIn_35_3 = true;
              stackIn_35_4 = GetPointDefenceLaserPulsetime.field_o;
              stackIn_35_5 = param0 ^ 16777194;
              stackIn_35_6 = var2;
              stackIn_37_7 = (GetThrusterSmallForce.field_o) || (SetMissionTerrainDebrisProbability.field_p);
              SetGrapplingHookRopeBreakLength.a(stackIn_32_0, stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, stackIn_35_5, stackIn_35_6 != 0, stackIn_37_7, param1, 13, 15, 0);
            }
          }
        }
        BodyCondition.b(-1);
        kl.field_c.field_l = 0;
        kl.field_c.field_k = 0;
        if (GetExplosionProjectileDamage.field_o) {
          RequestNewestBlackboxRecording.field_p.h(24335, 57);
          GetExplosionProjectileDamage.field_o = false;
        }
        if (MessageLog.field_d) {
          RequestNewestBlackboxRecording.field_p.h(param0 ^ 24346, 10);
          MessageLog.field_d = false;
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(211, 80));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("m.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = 200;
        field_p = 2;
    }
}
