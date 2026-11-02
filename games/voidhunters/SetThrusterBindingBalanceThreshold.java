/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetThrusterBindingBalanceThreshold extends ConsoleCommand {
    static boolean field_o;
    static int field_p;
    static dka field_q;
    static String field_r;

    SetThrusterBindingBalanceThreshold(String param0, Class[] param1, String param2) {
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
          SetMachineGunEnergyUsed.a(48, 62, arguments[0].a(93));
          if (obfuscationGuard >= -119) {
            field_o = false;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cha.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = 23 / ((param0 + 46) / 55);
        field_r = null;
        field_q = null;
    }

    static {
        field_o = false;
        field_p = 1024;
        field_q = new dka(0);
        field_r = "Add action (Add body info to custom variable)";
    }
}
