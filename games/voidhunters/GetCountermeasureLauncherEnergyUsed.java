/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetCountermeasureLauncherEnergyUsed extends ConsoleCommand {
    static int field_o;
    static String field_p;

    GetCountermeasureLauncherEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -46 % ((-15 - param1) / 58);
        return 0 != (2048 & param2) ? true : false;
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
            this.execute((ConsoleValue[]) null, 53);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(167, 115));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lgb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        if (param0) {
          GetCountermeasureLauncherEnergyUsed.a(108, 71, -111);
        }
    }

    static {
        field_p = "Show private chat from my friends and opponents";
    }
}
