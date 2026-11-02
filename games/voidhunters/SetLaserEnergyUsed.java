/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetLaserEnergyUsed extends ConsoleCommand {
    static int[] field_p;
    static String field_o;

    public static void f(byte param0) {
        field_o = null;
        if (param0 < 74) {
          return;
        }
        field_p = null;
    }

    SetLaserEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          SetMachineGunEnergyUsed.a(161, 62, arguments[0].a(43));
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bja.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int e(byte param0) {
        int var1 = 57 % ((param0 - 65) / 52);
        return SetBombletSprayProjectileOndamageParticles.e((byte) 96) - se.a(false) / 2;
    }

    static {
        field_p = new int[5];
        field_o = "Previous condition/action value";
    }
}
