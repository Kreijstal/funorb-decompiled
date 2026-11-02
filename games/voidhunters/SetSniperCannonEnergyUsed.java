/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSniperCannonEnergyUsed extends ConsoleCommand {
    static double field_q;
    static int field_o;
    static String field_p;

    SetSniperCannonEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 != -113) {
          field_q = 0.2696625605172165;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(165, 62, arguments[0].a(27));
          if (obfuscationGuard >= -119) {
            field_q = -0.13999182188760953;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oea.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int[] f(byte param0) {
        int var1 = 5 / ((18 - param0) / 54);
        return new int[8];
    }

    static {
        field_q = Math.atan2(1.0, 0.0);
    }
}
