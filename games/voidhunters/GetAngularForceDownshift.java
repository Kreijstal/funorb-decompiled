/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetAngularForceDownshift extends ConsoleCommand {
    static String field_r;
    static int field_p;
    static String field_o;
    static int field_q;

    GetAngularForceDownshift(String param0, Class[] param1, String param2) {
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
            field_p = 91;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(178, 98));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uh.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
          return;
        }
        field_r = null;
        field_o = null;
    }

    static {
        field_p = 480;
        field_o = "Clan";
        field_r = "Dragon chassis";
        field_q = 64;
    }
}
