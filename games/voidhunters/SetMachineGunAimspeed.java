/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMachineGunAimspeed extends ConsoleCommand {
    static int field_o;
    static java.applet.Applet field_p;

    SetMachineGunAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        if (param0 != -78) {
          field_o = -126;
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
          SetMachineGunEnergyUsed.a(125, 62, arguments[0].a(67));
          if (obfuscationGuard >= -119) {
            SetMachineGunAimspeed.e((byte) -36);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qv.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = 1;
    }
}
