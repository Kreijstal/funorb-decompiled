/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSniperCannonAimspeed extends ConsoleCommand {
    static int field_o;

    final static void a(boolean param0, int param1, boolean param2, String param3) {
        GetUseFilledPolygons.a(-1);
        GetLagStandardDeviationIn.field_r.g((byte) -17);
        if (param1 >= -77) {
          return;
        }
        try {
          SetAiFiringRangeUpshift.field_o = new vla(qsb.field_d, (String) null, tla.field_c, param0, param2);
          GetMissionVariablesHudX.field_o = new ud(GetLagStandardDeviationIn.field_r, SetAiFiringRangeUpshift.field_o);
          GetLagStandardDeviationIn.field_r.a(false, GetMissionVariablesHudX.field_o);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vt.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    SetSniperCannonAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(122, 62, arguments[0].a(19));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vt.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = 0;
    }
}
