/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBloomThresholdPercentage extends ConsoleCommand {
    static dja field_o;
    static int[] field_p;

    SetBloomThresholdPercentage(String param0, Class[] param1, String param2) {
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
          pab.field_m = arguments[0].a(127);
          if (obfuscationGuard > -119) {
            field_p = (int[]) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uib.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
          return;
        }
        field_p = null;
    }

    static {
        field_o = (dja) ((Object) new nra());
        field_p = new int[12];
    }
}
