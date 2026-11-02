/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetFightersPerPlayerMaximum extends ConsoleCommand {
    static jra field_o;
    static int field_p;
    static boolean field_r;
    static String field_q;
    static String field_s;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_p = 118;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(42, 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("era.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_q = null;
        field_o = null;
        if (param0 != 42) {
          field_p = -66;
        }
    }

    GetFightersPerPlayerMaximum(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new jra();
        field_p = 1;
        field_q = "Log in / Create account";
        field_s = "Scavengers";
    }
}
