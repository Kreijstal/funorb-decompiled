/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissionDebrisVotingChancestep extends ConsoleCommand {
    static String field_o;

    public static void a(int param0) {
        if (param0 != 69) {
          GetMissionDebrisVotingChancestep.a(-33, 96, true);
          field_o = null;
          return;
        }
        field_o = null;
    }

    GetMissionDebrisVotingChancestep(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          return false;
        }
        return 0 != (2048 & param0) ? true : false;
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
            GetMissionDebrisVotingChancestep.a(55);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(69, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dwa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "Add condition (Ship on team)";
    }
}
