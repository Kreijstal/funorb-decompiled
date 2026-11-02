/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBombletSprayFireForce extends ConsoleCommand {
    static String field_o;

    GetBombletSprayFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -91) {
          GetBombletSprayFireForce.e((byte) 92);
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
          if (obfuscationGuard > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(101, 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rja.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "(1 player wants to join)";
    }
}
