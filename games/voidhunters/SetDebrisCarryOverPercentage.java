/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetDebrisCarryOverPercentage extends ConsoleCommand {
    static String field_o;
    static int field_p;

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 != 119) {
          SetDebrisCarryOverPercentage.e((byte) 34);
          return false;
        }
        return false;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -96);
          }
          SetMachineGunEnergyUsed.a(35, 62, arguments[0].a(75));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iua.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 > -100) {
          field_p = 70;
          field_o = null;
          return;
        }
        field_o = null;
    }

    SetDebrisCarryOverPercentage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "turret";
    }
}
