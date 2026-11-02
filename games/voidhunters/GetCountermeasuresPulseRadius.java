/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetCountermeasuresPulseRadius extends ConsoleCommand {
    static int field_o;
    static int field_p;
    static String[] field_q;

    GetCountermeasuresPulseRadius(String param0, Class[] param1, String param2) {
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
            GetCountermeasuresPulseRadius.a(-28);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(222, 109));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qtb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 16407) {
          GetCountermeasuresPulseRadius.a(68);
          field_q = null;
          return;
        }
        field_q = null;
    }

    static {
        field_o = 0;
        iaa discarded$0 = new iaa();
        field_q = new String[]{"By rating", "By win percentage"};
    }
}
