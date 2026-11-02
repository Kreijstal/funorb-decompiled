/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBombletSprayRandomness extends ConsoleCommand {
    static String field_o;
    static ef field_p;

    final static int a(int param0, int param1) {
        param0 = (param1 & param0) + (1431655765 & param0 >>> 1);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param2) {
          var3 = param0 >>> 31;
          return -var3 + (param0 + var3) / param1;
        }
        field_p = (ef) null;
        var3Lifetime1 = param0 >>> 31;
        return -var3Lifetime1 + (param0 + var3Lifetime1) / param1;
    }

    SetBombletSprayRandomness(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -612363640) {
          SetBombletSprayRandomness.a(-95, 34);
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
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(75, 62, arguments[0].a(52));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "Quit";
    }
}
