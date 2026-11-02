/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetKeepTeamColours extends ConsoleCommand {
    static int field_o;
    static String field_q;
    static qsa[] field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(7, 62, arguments[0].a(103));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bjb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (ssa.b(2)) {
          GetFullMissionSet.a(kt.field_r, 2182, 0);
        }
        if (!SetRepairModeActiveTime.a(-116)) {
          GetFullMissionSet.a(SetCountermeasureLauncherEnergyUsed.field_o, 2182, 1);
          GetFullMissionSet.a(GetBombletSprayProjectiles.field_r, 2182, 2);
          GetFullMissionSet.a(SetNebulaFadesOutWhenClose.field_o, 2182, 3);
          GetFullMissionSet.a(SetMissileLauncherProjectileLife.field_o, 2182, 4);
        }
        if (param0 == 15334) {
          return;
        }
        SetKeepTeamColours.b(true);
    }

    SetKeepTeamColours(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          SetKeepTeamColours.b(false);
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        field_o = -2;
        field_q = "Asking for or providing contact information";
    }
}
