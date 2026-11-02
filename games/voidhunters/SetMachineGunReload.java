/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMachineGunReload extends ConsoleCommand {
    static String field_q;
    static String field_o;
    static int[] field_p;

    public static void e(byte param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != -16) {
          field_p = (int[]) null;
        }
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
            field_p = (int[]) null;
          }
          SetMachineGunEnergyUsed.a(113, 62, arguments[0].a(50));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("job.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMachineGunReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "<%0> exploded";
        field_p = new int[1];
        field_o = "Player";
    }
}
