/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMachineGunEnergyUsed extends ConsoleCommand {
    static dja field_q;
    static dcb field_o;
    static int field_p;

    GetMachineGunEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        field_o = null;
        if (param0) {
          GetMachineGunEnergyUsed.b(true);
        }
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
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(164, 84));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ag.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_q = (dja) ((Object) new cn());
        field_o = new dcb(0, 0);
    }
}
