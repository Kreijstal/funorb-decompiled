/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetHealthBarWidth extends ConsoleCommand {
    static ka[] field_p;
    static int field_q;
    static String field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(tu.field_d);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("na.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 != 27358) {
          GetHealthBarWidth.a(-109);
        }
    }

    GetHealthBarWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 80;
        field_o = "Reject";
    }
}
