/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPointDefenceLaserProjectileDamage extends ConsoleCommand {
    static llb field_o;

    GetPointDefenceLaserProjectileDamage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -15) {
          field_o = (llb) null;
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
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(150, 94));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vqb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void f(byte param0) {
        GetSniperCannonEnergyUsed.field_o = new String[SetFightersPerPlayerMaximum.field_o];
        GetSniperCannonEnergyUsed.field_o[5] = GetMachineGunAimspeed.field_q;
        GetSniperCannonEnergyUsed.field_o[21] = bda.field_a;
        GetSniperCannonEnergyUsed.field_o[15] = rq.field_G;
        GetSniperCannonEnergyUsed.field_o[17] = SetBots.field_p;
        GetSniperCannonEnergyUsed.field_o[9] = vqa.field_j;
        if (param0 <= -75) {
          GetSniperCannonEnergyUsed.field_o[11] = fk.field_d;
          GetSniperCannonEnergyUsed.field_o[7] = SetUseExtraBackground.field_o;
          GetSniperCannonEnergyUsed.field_o[19] = cfa.field_e;
          GetSniperCannonEnergyUsed.field_o[20] = GetSelfDestructTimer.field_o;
          GetSniperCannonEnergyUsed.field_o[4] = GetDebrisCarryOver.field_q;
          GetSniperCannonEnergyUsed.field_o[16] = SetExplosionProjectileDamage.field_p;
          GetSniperCannonEnergyUsed.field_o[18] = SettingsInstance.field_b;
          GetSniperCannonEnergyUsed.field_o[13] = SetKeepTeamColours.field_q;
          GetSniperCannonEnergyUsed.field_o[6] = uea.field_p;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = VoidHunters.field_G;
        if (param15 >= param5) {
          if (param15 < param11) {
            SetPhasedEnergyBeamRandomness.a(param7, param6, param14, param11, dma.field_i, param2, param12, param5, param1, param13, param8, param4, param0, param15, param3, -1, param10);
          } else {
            if (param11 <= param5) {
              SetPhasedEnergyBeamRandomness.a(param1, param2, param8, param15, dma.field_i, param0, param14, param11, param4, param10, param12, param7, param6, param5, param13, param9 ^ 18418, param3);
            } else {
              SetPhasedEnergyBeamRandomness.a(param4, param0, param14, param15, dma.field_i, param2, param8, param5, param1, param13, param12, param7, param6, param11, param10, param9 + 18418, param3);
            }
          }
        } else {
          if (param11 > param5) {
            SetPhasedEnergyBeamRandomness.a(param1, param2, param12, param11, dma.field_i, param6, param14, param15, param7, param3, param8, param4, param0, param5, param13, param9 + 18418, param10);
          } else {
            if (param15 >= param11) {
              SetPhasedEnergyBeamRandomness.a(param7, param6, param8, param5, dma.field_i, param0, param12, param11, param4, param10, param14, param1, param2, param15, param3, -1, param13);
            } else {
              SetPhasedEnergyBeamRandomness.a(param4, param0, param12, param5, dma.field_i, param6, param8, param15, param7, param3, param14, param1, param2, param11, param10, -1, param13);
            }
          }
        }
        if (param9 == -18419) {
          return;
        }
        GetPointDefenceLaserProjectileDamage.a(true, -61);
    }

    final static void a(boolean param0, int param1) {
        GetLagStandardDeviationIn.field_r.a(0, 0, 0);
        int var2 = 100 % ((-38 - param1) / 39);
    }

    static {
    }
}
