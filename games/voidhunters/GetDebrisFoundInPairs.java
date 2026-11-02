/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetDebrisFoundInPairs extends ConsoleCommand {
    static MouseInputHandler field_q;
    static int field_p;
    static int field_o;

    public static void e(byte param0) {
        field_q = null;
        int var1 = 111 / ((-46 - param0) / 53);
    }

    GetDebrisFoundInPairs(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            GetDebrisFoundInPairs.e((byte) 30);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(18, 91));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = 1;
        field_q = new MouseInputHandler();
        field_o = 5;
    }
}
