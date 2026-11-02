/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetGrapplingHookMaxLength extends ConsoleCommand {
    static String field_q;
    static String field_o;
    static int field_p;

    SetGrapplingHookMaxLength(String param0, Class[] param1, String param2) {
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
            SetGrapplingHookMaxLength.e((byte) -121);
          }
          SetMachineGunEnergyUsed.a(197, 62, arguments[0].a(19));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cqa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = -29 / ((14 - param0) / 41);
        field_o = null;
    }

    static {
        field_q = "Password is valid";
        field_o = "Ubercannon";
        field_p = 30;
    }
}
