/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetDebrisThrowable extends ConsoleCommand {
    final static boolean a(byte param0, int param1, int param2) {
        if (param0 >= -42) {
          return true;
        }
        return 0 != (param1 & 2048) ? true : false;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(12, 62, arguments[0].a(109));
          if (obfuscationGuard >= -119) {
            SetDebrisThrowable.a((byte) 67, -35, -21);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rfb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetDebrisThrowable(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
