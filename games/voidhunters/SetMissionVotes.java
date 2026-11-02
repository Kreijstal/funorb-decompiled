/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissionVotes extends ConsoleCommand {
    static String field_o;
    static String field_p;

    public static void a(int param0) {
        field_o = null;
        int var1 = -125 % ((-30 - param0) / 43);
        field_p = null;
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
          SetMachineGunEnergyUsed.a(57, 62, arguments[0].a(10));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oba.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMissionVotes(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Click here or press R to enter repair mode";
        field_p = "This is <%0>'s RuneScape clan if they have one.";
    }
}
