/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMessageMax extends ConsoleCommand {
    static String field_o;

    public static void a(int param0) {
        if (param0 != 0) {
          field_o = (String) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hb.field_a = arguments[0].a(107);
          if (obfuscationGuard > -119) {
            SetMessageMax.a(-49);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ueb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMessageMax(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "New Game";
    }
}
