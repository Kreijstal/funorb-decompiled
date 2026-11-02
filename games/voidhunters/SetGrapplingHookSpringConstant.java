/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetGrapplingHookSpringConstant extends ConsoleCommand {
    static String field_o;

    SetGrapplingHookSpringConstant(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            SetGrapplingHookSpringConstant.a(69, 32, 84);
          }
          SetMachineGunEnergyUsed.a(200, 62, arguments[0].a(110));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("thb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 200) {
          field_o = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        GetMissionTerrainDebrisProbability.a(param0, -1, (double)param2, param0, (double)param2);
        if (param1 != 0) {
          field_o = (String) null;
        }
    }

    static {
        field_o = "Hold this to win the game";
    }
}
