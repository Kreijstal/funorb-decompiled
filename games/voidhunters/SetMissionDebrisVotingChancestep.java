/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissionDebrisVotingChancestep extends ConsoleCommand {
    static int[] field_q;
    static String field_p;
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 112) {
          return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    SetMissionDebrisVotingChancestep(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(69, 62, arguments[0].a(116));
          if (obfuscationGuard > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uta.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        SetToggledScoreboard.field_o.b(param0, param1 ^ 3970);
        pia var2 = ada.field_b;
        if (param1 == 4095) {
          if (var2 != null) {
            var2.a(0, SetToggledScoreboard.field_o.field_u, SetToggledScoreboard.field_o.field_M);
          }
          return;
        }
        SetMissionDebrisVotingChancestep.a(true, 28);
        if (var2 != null) {
          var2.a(0, SetToggledScoreboard.field_o.field_u, SetToggledScoreboard.field_o.field_M);
        }
    }

    static {
        field_p = "Logging in...";
        field_o = "Hide private chat and appear offline to friends";
        field_q = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
