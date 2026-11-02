/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseDetailLines extends ConsoleCommand {
    static int field_o;
    static int field_p;

    GetUseDetailLines(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard > -119) {
            field_o = 85;
          }
          stackIn_3_0 = new ConsoleValue(asb.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          return;
        }
        GetCountermeasureLauncherProjectiles.field_o = param4;
        ob.field_j = param3;
        hab.field_i = param0;
        NebulaField.field_c = param1;
    }

    static {
        field_p = 68;
    }
}
